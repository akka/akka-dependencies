# Release

This repository will release to https://repo.akka.io/maven.

1. Check the `AkkaDependenciesMinor` version in `project/Dependencies.scala`
1. To initiate a release push a tag prefixed with `v`, i.e. `v22.10.0`.
1. Update the "current" link on Gustav. `ln -snf ${VERSION} current`
1. Update example projects referencing this BOM.
  * https://github.com/lightbend/akka-guide
  * If the recent release of this BOM does bump akka, make sure to align all akka versions in `akka-guide`.

NOTE: User sonatype tokens are used. Update `PUBLISH_USER` and `PUBLISH_PASSWORD` repository secrets if necessary.
