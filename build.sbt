import Dependencies._
import com.geirsson.CiReleasePlugin
import sbtdynver.DynVerPlugin.autoImport.dynverSonatypeSnapshots

ThisBuild / resolvers += "Akka library repository".at("https://repo.akka.io/maven")
ThisBuild / resolvers ++= sys.env
  .get("LIGHTBEND_COMMERCIAL_MVN")
  .map { repo =>
    Seq(
      "lightbend-commercial-mvn".at(repo),
      Resolver.url(
        "lightbend-commercial-ivy",
        url(repo)
      )(Resolver.ivyStylePatterns)
    )
  }
  .getOrElse(Seq.empty)

lazy val `akka-dependencies` =
  Project(id = "akka-dependencies", base = file("."))
    .enablePlugins(BillOfMaterialsPlugin)
    .disablePlugins(CiReleasePlugin)
    .settings(
      crossScalaVersions := Versions.CrossScalaVersions,
      scalaVersion := Versions.Scala213,
      organization := "com.lightbend.akka",
      name := "akka-dependencies",
      description := s"${description.value} (depending on Scala ${CrossVersion.binaryScalaVersion(scalaVersion.value)})",
      homepage := Some(url("https://akka.io/")),
      licenses := Seq(
        ("BUSL-1.1", url("https://raw.githubusercontent.com/lightbend/akka-dependencies/v10.22.0/LICENSE"))
      ),
      developers := List(
        Developer(
          "akka-contributors",
          "Akka Contributors",
          "akka.official@gmail.com",
          url("https://github.com/lightbend/akka-dependencies/graphs/contributors")
        )
      ),
      // append -SNAPSHOT to version when isSnapshot
      ThisBuild / dynverSonatypeSnapshots := true,
      bomIncludeModules := akka ++
        akkaHttp ++
        akkaManagement ++
        akkaProjections ++
        akkaGrpc ++
        akkaPersistencePlugins ++
        alpakka ++
        akkaDiagnostics ++
        telemetry,
      resolvers += "Akka library repository".at("https://repo.akka.io/maven"),
      // to check that all dependencies can be pulled and there are no conflicts
      libraryDependencies ++= {
        val bomDeps = bomIncludeModules.value
        if (sys.env.contains("LIGHTBEND_COMMERCIAL_MVN")) {
          bomDeps
        } else {
          // Run the validation for at least the non-commercial dependencies
          bomDeps.filterNot(allCommercialLibs.contains)
        }
      },
      publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true),
      publishM2Configuration := publishM2Configuration.value.withOverwrite(true)
    )

addCommandAlias("checkBom", ";scalafmtSbtCheck;+akka-dependencies/billOfMaterials:publishM2")
addCommandAlias("checkPullBom", ";scalafmtSbtCheck;+update;+akka-dependencies/billOfMaterials:publishM2")
