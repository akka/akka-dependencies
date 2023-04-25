import sbt._

object Dependencies {
  object Versions {
    val Scala213           = "2.13.10"
    val CrossScalaVersions = Seq(Scala213)

    // To update Cinnamon version, change the plugin version
    // in project/plugins.sbt
    val Akka                     = "2.8.1-M1"
    val AkkaHttp                 = "10.5.1"
    val AkkaManagement           = "1.3.0"
    val AkkaProjections          = "1.4.0-M4"
    val AkkaGrpc                 = "2.3.1"
    val AkkaPersistenceCassandra = "1.1.1"
    val AkkaPersistenceJdbc      = "5.2.1"
    val AkkaPersistenceR2dbc     = "1.1.0-M8"
    val Alpakka                  = "6.0.0"
    val AlpakkaKafka             = "4.0.2"
    val AkkaDiagnostics          = "2.0.0"
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
    "com.typesafe.akka" %% "akka-http-caching"    % AkkaHttp,
    "com.typesafe.akka" %% "akka-http-core"       % AkkaHttp,
    "com.typesafe.akka" %% "akka-http-jackson"    % AkkaHttp,
    "com.typesafe.akka" %% "akka-http-spray-json" % AkkaHttp,
    "com.typesafe.akka" %% "akka-http-testkit"    % AkkaHttp,
    "com.typesafe.akka" %% "akka-http-xml"        % AkkaHttp,
    "com.typesafe.akka" %% "akka-http2-support"   % AkkaHttp,
    "com.typesafe.akka" %% "akka-parsing"         % AkkaHttp
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
    "com.lightbend.akka" %% "akka-projection-core"          % AkkaProjections,
    "com.lightbend.akka" %% "akka-projection-eventsourced"  % AkkaProjections,
    "com.lightbend.akka" %% "akka-projection-durable-state" % AkkaProjections,
    "com.lightbend.akka" %% "akka-projection-kafka"         % AkkaProjections,
    "com.lightbend.akka" %% "akka-projection-cassandra"     % AkkaProjections,
    "com.lightbend.akka" %% "akka-projection-jdbc"          % AkkaProjections,
    "com.lightbend.akka" %% "akka-projection-r2dbc"         % AkkaProjections,
    "com.lightbend.akka" %% "akka-projection-grpc"          % AkkaProjections,
    "com.lightbend.akka" %% "akka-projection-testkit"       % AkkaProjections
  )

  val akkaGrpc = Seq(
    "com.lightbend.akka.grpc" %% "akka-grpc-runtime" % AkkaGrpc
  )

  val akkaPersistencePlugins = Seq(
    "com.typesafe.akka"  %% "akka-persistence-cassandra"          % AkkaPersistenceCassandra,
    "com.typesafe.akka"  %% "akka-persistence-cassandra-launcher" % AkkaPersistenceCassandra,
    "com.lightbend.akka" %% "akka-persistence-jdbc"               % AkkaPersistenceJdbc,
    "com.lightbend.akka" %% "akka-persistence-r2dbc"              % AkkaPersistenceR2dbc
  )

  val alpakka = Seq(
    "com.lightbend.akka" %% "akka-stream-alpakka-cassandra"      % Alpakka,
    "com.lightbend.akka" %% "akka-stream-alpakka-csv"            % Alpakka,
    "com.typesafe.akka"  %% "akka-stream-kafka"                  % AlpakkaKafka,
    "com.typesafe.akka"  %% "akka-stream-kafka-cluster-sharding" % AlpakkaKafka,
    "com.typesafe.akka"  %% "akka-stream-kafka-testkit"          % AlpakkaKafka
  )

  val akkaDiagnostics = Seq(
    "com.lightbend.akka" %% "akka-diagnostics" % AkkaDiagnostics
  )

  /**
   * Commercial components
   */

  // sbt-cinnamon plugin does not have artifacts for Scala 2.13.x
  val telemetry = com.lightbend.cinnamon.sbt.Cinnamon.library.modules.filterNot(_.name.equals("sbt-cinnamon"))

  val allCommercialLibs = telemetry
}
