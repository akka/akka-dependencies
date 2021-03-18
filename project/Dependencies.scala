import sbt._

object Dependencies {
  object Versions {
    val AkkaPlatformDependencies = "1.0.0"

    val Scala213           = "2.13.5"
    val CrossScalaVersions = Seq(Scala213)

    val Akka                     = "2.6.13"
    val AkkaHttp                 = "10.2.4"
    val AkkaManagement           = "1.0.10"
    val AkkaProjections          = "1.1.0"
    val AkkaGrpc                 = "1.1.1"
    val AkkaPersistenceCassandra = "1.0.5"
    val AkkaPersistenceJdbc      = "5.0.0"
    val AkkaPersistenceCouchbase = "1.0"
    val AkkaEnhancements         = "1.1.16"
    val Alpakka                  = "2.0.2"
    val AlpakkaKafka             = "2.0.7"
    val Telemetry                = "2.14.6"
  }

  import Versions._

  /**
   * Based on list of supported components
   * https://developer.lightbend.com/docs/introduction/getting-help/build-dependencies.html
   */
  /**
   * Open Source components
   */
  val akka = Seq(
    "com.typesafe.akka" %% "akka-actor"                  % Akka,
    "com.typesafe.akka" %% "akka-actor-testkit-typed"    % Akka,
    "com.typesafe.akka" %% "akka-actor-typed"            % Akka,
    "com.typesafe.akka" %% "akka-coordination"           % Akka,
    "com.typesafe.akka" %% "akka-cluster"                % Akka,
    "com.typesafe.akka" %% "akka-cluster-metrics"        % Akka,
    "com.typesafe.akka" %% "akka-cluster-sharding"       % Akka,
    "com.typesafe.akka" %% "akka-cluster-sharding-typed" % Akka,
    "com.typesafe.akka" %% "akka-cluster-tools"          % Akka,
    "com.typesafe.akka" %% "akka-cluster-typed"          % Akka,
    "com.typesafe.akka" %% "akka-coordination"           % Akka,
    "com.typesafe.akka" %% "akka-discovery"              % Akka,
    "com.typesafe.akka" %% "akka-distributed-data"       % Akka,
    "com.typesafe.akka" %% "akka-serialization-jackson"  % Akka,
    "com.typesafe.akka" %% "akka-multi-node-testkit"     % Akka,
    "com.typesafe.akka" %% "akka-osgi"                   % Akka,
    "com.typesafe.akka" %% "akka-persistence"            % Akka,
    "com.typesafe.akka" %% "akka-persistence-query"      % Akka,
    "com.typesafe.akka" %% "akka-persistence-typed"      % Akka,
    "com.typesafe.akka" %% "akka-persistence-testkit"    % Akka,
    "com.typesafe.akka" %% "akka-protobuf-v3"            % Akka,
    "com.typesafe.akka" %% "akka-pki"                    % Akka,
    "com.typesafe.akka" %% "akka-remote"                 % Akka,
    "com.typesafe.akka" %% "akka-slf4j"                  % Akka,
    "com.typesafe.akka" %% "akka-stream"                 % Akka,
    "com.typesafe.akka" %% "akka-stream-testkit"         % Akka,
    "com.typesafe.akka" %% "akka-stream-typed"           % Akka,
    "com.typesafe.akka" %% "akka-testkit"                % Akka
  )

  val akkaHttp = Seq(
    "com.typesafe.akka" %% "akka-http"            % AkkaHttp,
    "com.typesafe.akka" %% "akka-http-core"       % AkkaHttp,
    "com.typesafe.akka" %% "akka-http-jackson"    % AkkaHttp,
    "com.typesafe.akka" %% "akka-http-spray-json" % AkkaHttp,
    "com.typesafe.akka" %% "akka-http-testkit"    % AkkaHttp,
    "com.typesafe.akka" %% "akka-http-xml"        % AkkaHttp
  )

  val akkaManagement = Seq(
    "com.lightbend.akka.management" %% "akka-management"                   % AkkaManagement,
    "com.lightbend.akka.management" %% "akka-management-cluster-http"      % AkkaManagement,
    "com.lightbend.akka.management" %% "akka-management-cluster-bootstrap" % AkkaManagement,
    "com.lightbend.akka.management" %% "akka-management-loglevels-logback" % AkkaManagement,
    "com.lightbend.akka.management" %% "akka-lease-kubernetes"             % AkkaManagement,
    "com.lightbend.akka.discovery"  %% "akka-discovery-kubernetes-api"     % AkkaManagement
  )

  val akkaProjections = Seq(
    "com.lightbend.akka" %% "akka-projection-core"         % AkkaProjections,
    "com.lightbend.akka" %% "akka-projection-eventsourced" % AkkaProjections,
    "com.lightbend.akka" %% "akka-projection-kafka"        % AkkaProjections,
    "com.lightbend.akka" %% "akka-projection-cassandra"    % AkkaProjections,
    "com.lightbend.akka" %% "akka-projection-jdbc"         % AkkaProjections,
    "com.lightbend.akka" %% "akka-projection-testkit"      % AkkaProjections
  )

  val akkaGrpc = Seq(
    // maven plugin brings in Scala dependencies that conflict with current crossVersion of BOM
    // Modules were resolved with conflicting cross-version suffixes in ProjectRef(uri("file:/home/seglo/source/akka-platform-guide/akka-platform-dependencies/"), "akka-platform-dependencies") ...
    ("com.lightbend.akka.grpc" % "akka-grpc-maven-plugin" % AkkaGrpc).withExclusions(Vector(ExclusionRule.everything)),
    "com.lightbend.akka.grpc" %% "akka-grpc-runtime"      % AkkaGrpc,
    "com.lightbend.akka.grpc" %% "akka-grpc-codegen"      % AkkaGrpc
  )

  val akkaPersistencePlugins = Seq(
    "com.typesafe.akka" %% "akka-persistence-cassandra"          % AkkaPersistenceCassandra,
    "com.typesafe.akka" %% "akka-persistence-cassandra-launcher" % AkkaPersistenceCassandra,
    // FIXME: couchbase hasn't been published for a release version of Scala 2.13
    //"com.lightbend.akka" %% "akka-persistence-couchbase" % AkkaPersistenceCouchbase,
    "com.lightbend.akka" %% "akka-persistence-jdbc" % AkkaPersistenceJdbc
  )

  val alpakka = Seq(
    "com.lightbend.akka" %% "akka-stream-alpakka-cassandra" % Alpakka,
    "com.lightbend.akka" %% "akka-stream-alpakka-couchbase" % Alpakka,
    "com.lightbend.akka" %% "akka-stream-alpakka-csv"       % Alpakka,
    "com.typesafe.akka"  %% "akka-stream-kafka"             % AlpakkaKafka
  )

  /**
   * Commercial components
   */

  val akkaResilienceEnhancements = Seq(
    "com.lightbend.akka" %% "akka-diagnostics" % AkkaEnhancements
  )

  val telemetry = Seq(
    "com.lightbend.cinnamon"  % "cinnamon-agent"                            % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-agent-common"                     % Telemetry,
    "com.lightbend.cinnamon" %% "cinnamon-akka"                             % Telemetry,
    "com.lightbend.cinnamon" %% "cinnamon-akka-cluster"                     % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-akka-cluster-spi"                 % Telemetry,
    "com.lightbend.cinnamon" %% "cinnamon-akka-http"                        % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-akka-http-spi"                    % Telemetry,
    "com.lightbend.cinnamon" %% "cinnamon-akka-persistence"                 % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-akka-persistence-spi"             % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-akka-spi"                         % Telemetry,
    "com.lightbend.cinnamon" %% "cinnamon-akka-stream"                      % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-akka-stream-spi"                  % Telemetry,
    "com.lightbend.cinnamon" %% "cinnamon-akka-typed"                       % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-alpakka-kafka-spi"                % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-chmetrics"                        % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-chmetrics3"                       % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-chmetrics3-jvm-metrics"           % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-chmetrics-elasticsearch-reporter" % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-chmetrics-hdrhistogram"           % Telemetry,
    "com.lightbend.cinnamon" %% "cinnamon-chmetrics-http-reporter"          % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-chmetrics-jvm-metrics"            % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-chmetrics-statsd-reporter"        % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-common"                           % Telemetry,
    "com.lightbend.cinnamon" %% "cinnamon-context-propagation"              % Telemetry,
    "com.lightbend.cinnamon" %% "cinnamon-core"                             % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-core-java"                        % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-datadog"                          % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-datadog-socket"                   % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-jmx-importer-hikaricp"            % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-java"                             % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-java-future-spi"                  % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-jmx-importer"                     % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-jvm-metrics-producer"             % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-jmx-importer-kafka-consumer"      % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-jmx-importer-kafka-producer"      % Telemetry,
    "com.lightbend.cinnamon" %% "cinnamon-lagom"                            % Telemetry,
    "com.lightbend.cinnamon" %% "cinnamon-lagom-projection"                 % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-lagom-projection-spi"             % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-newrelic"                         % Telemetry,
    "com.lightbend.cinnamon" %% "cinnamon-opentracing"                      % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-opentracing-datadog"              % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-opentracing-jaeger"               % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-opentracing-tracer"               % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-opentracing-zipkin"               % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-opentracing-zipkin-kafka"         % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-opentracing-zipkin-scribe"        % Telemetry,
    "com.lightbend.cinnamon" %% "cinnamon-play"                             % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-play-spi"                         % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-prometheus"                       % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-prometheus-httpserver"            % Telemetry,
    "com.lightbend.cinnamon" %% "cinnamon-scala"                            % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-scala-future-spi"                 % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-slf4j-events"                     % Telemetry,
    "com.lightbend.cinnamon" %% "cinnamon-slf4j-mdc"                        % Telemetry,
    "com.lightbend.cinnamon"  % "cinnamon-telegraf"                         % Telemetry
  )

}
