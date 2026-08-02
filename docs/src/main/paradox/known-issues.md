# Known issues

## Scala 3: conflict between Lightbend Telemetry and Jackson

Lightbend Telemetry's `cinnamon-opentracing-datadog` module (up to and including `2.22.3`) is
published as a plain Java artifact but declares a compile-scope dependency on the Scala 2.13 build
of Jackson, `com.fasterxml.jackson.module:jackson-module-scala_2.13`. Because that suffix is fixed
in the artifact's POM, it is pulled regardless of the Scala version your project builds with.

On **Scala 3**, any project that also depends on `akka-serialization-jackson` (directly or
transitively) pulls `jackson-module-scala_3`, so both cross-version variants of the module end up on
the classpath:

* with **sbt**, resolution fails with
  `Conflicting cross-version suffixes in: com.fasterxml.jackson.module:jackson-module-scala (_3, _2.13)`;
* with **Maven** and **Gradle**, the build succeeds but ships both `jackson-module-scala_2.13` and
  `jackson-module-scala_3`, which is a latent runtime hazard.

Only the `cinnamon-opentracing-datadog` module is affected — every other Lightbend Telemetry module
resolves cleanly on Scala 3. A fix is being tracked in Lightbend Telemetry.

### Workaround

Until a fixed Lightbend Telemetry release is available, exclude the Scala 2.13 Jackson module from
`cinnamon-opentracing-datadog` in your own build. This is safe on Scala 3: `akka-serialization-jackson`
already provides `jackson-module-scala_3`.

sbt
:   ```scala
    ("com.lightbend.cinnamon" % "cinnamon-opentracing-datadog" % cinnamonVersion)
      .exclude("com.fasterxml.jackson.module", "jackson-module-scala_2.13")
    ```

Maven
:   ```xml
    <dependency>
      <groupId>com.lightbend.cinnamon</groupId>
      <artifactId>cinnamon-opentracing-datadog</artifactId>
      <version>${cinnamon.version}</version>
      <exclusions>
        <exclusion>
          <groupId>com.fasterxml.jackson.module</groupId>
          <artifactId>jackson-module-scala_2.13</artifactId>
        </exclusion>
      </exclusions>
    </dependency>
    ```

Gradle
:   ```gradle
    implementation("com.lightbend.cinnamon:cinnamon-opentracing-datadog:${cinnamonVersion}") {
        exclude group: "com.fasterxml.jackson.module", module: "jackson-module-scala_2.13"
    }
    ```
