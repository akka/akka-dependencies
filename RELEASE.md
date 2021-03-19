# Release

This repository will release directly to Sonatype.

1. To initiate a release push a tag prefixed with `v`, i.e. `v1.0.0`.
1. Update example projects referencing this BOM.
  * https://github.com/akka/akka-platform-guide

NOTE: Sean's sonatype tokens are used. Update `SONATYPE_USERNAME` and `SONATYPE_PASSWORD` repository secrets if necessary.