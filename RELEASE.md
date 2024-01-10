# Release

This repository will release to https://repo.akka.io/maven.

1. To initiate a release push a tag prefixed with `v`, i.e. `v22.10.0`.
1. Update the "current" link on Gustav. `ln -snf ${VERSION} current`
1. Update example projects referencing this BOM.
  * https://github.com/akka/akka-platform-guide

NOTE: User sonatype tokens are used. Update `PUBLISH_USER` and `PUBLISH_PASSWORD` repository secrets if necessary.
