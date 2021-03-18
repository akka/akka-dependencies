import Dependencies._

lazy val `akka-platform-dependencies` =
  Project(id = "akka-platform-dependencies", base = file("."))
    .enablePlugins(BillOfMaterialsPlugin)
    .settings(
      crossScalaVersions := Versions.CrossScalaVersions,
      scalaVersion := Versions.Scala213,
      organization := "com.lightbend.akka",
      name := "akka-platform-dependencies",
      homepage := Some(url("https://akka.io/")),
      version := Versions.AkkaPlatformDependencies,
      bomIncludeModules := akka ++
        akkaHttp ++
        akkaManagement ++
        akkaProjections ++
        akkaGrpc ++
        akkaPersistencePlugins ++
        akkaResilienceEnhancements ++
        alpakka ++
        telemetry,
      // to check that all dependencies can be pulled and there are no conflicts
      libraryDependencies := bomIncludeModules.value,
      description := s"${description.value} (depending on Scala ${CrossVersion.binaryScalaVersion(scalaVersion.value)})",
      publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true),
      publishM2Configuration := publishM2Configuration.value.withOverwrite(true)
    )

addCommandAlias("checkBom", ";scalafmtSbt;+update;+akka-platform-dependencies/billOfMaterials:publishM2")
