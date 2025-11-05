resolvers += "Akka library repository".at("https://repo.akka.io/maven/github_actions")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.2")
addSbtPlugin("com.lightbend.sbt" % "sbt-bill-of-materials" % "1.0.2")
addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.12")
addSbtPlugin("com.lightbend.cinnamon" % "sbt-cinnamon" % "2.22.0")
// docs
addSbtPlugin("io.akka" % "sbt-paradox-akka" % "25.10.2")
addSbtPlugin("com.lightbend.sbt" % "sbt-publish-rsync" % "0.3")
addSbtPlugin("com.github.sbt" % "sbt-site-paradox" % "1.5.0")
