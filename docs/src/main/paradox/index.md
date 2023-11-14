# Akka module versions $akka-dependencies.major-version$

This table lists all Akka modules that are part of the Akka $akka-dependencies.major-version$ release along with their current versions.

Akka $akka-dependencies.version$ is cross-built for Scala $akka-scala-2.13.version$ and Scala $akka-scala-3.version$. 
Akka is certified for use with certain Java versions, see @ref[Java Versions](java-versions.md).

Some modules in Akka do not live up to the high standards Lightbend requires to fully support them for Akka Licensees. Modules are marked with their @ref[readiness level](support-terminology.md) in the "project info" section of their documentation.

| Module                     | Current version                      | Documentation                                                                                                                                                                                                                                                                                                 |
|----------------------------|--------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Akka Dependencies BOM      | $akka-dependencies.version$          |  |
| Akka (core)                | $akka.version$                       | [Documentation](https://doc.akka.io/docs/akka/current/) [JavaDoc](https://doc.akka.io/japi/akka/current/index.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/)                                                                                                                                        |
| Akka Actors                | $akka.version$                       | [Documentation](https://doc.akka.io/docs/akka/current/typed/index.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/actor/typed/index.html)                                                                       |
| Akka Cluster               | $akka.version$                       | [Documentation](https://doc.akka.io/docs/akka/current/typed/index-cluster.html)                                                                                                                                                                                                                                   |
| Akka Event Sourcing        | $akka.version$                       | [Documentation](https://doc.akka.io/docs/akka/current/typed/index-persistence.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/persistence/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/persistence/index.html)                                                           |
| Akka Durable State         | $akka.version$                       | [Documentation](https://doc.akka.io/docs/akka/current/typed/index-persistence-durable-state.html)                                                                                                                                                                                                                 |
| Akka Streams               | $akka.version$                       | [Documentation](https://doc.akka.io/docs/akka/current/stream/index.html) [Operators](https://doc.akka.io/docs/akka/current/stream/operators/index.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/stream/index.html) |
| Akka gRPC                  | $akka-grpc.version$                  | [Documentation](https://doc.akka.io/docs/akka-grpc/current/)                                                                                                                                                                                                                                                      |
| Akka HTTP                  | $akka-http.version$                  | [Documentation](https://doc.akka.io/docs/akka-http/current/)                                                                                                                                                                                                                                                      |
| Akka Persistence Cassandra | $akka-persistence-cassandra.version$ | [Documentation](https://doc.akka.io/docs/akka-persistence-cassandra/current/)                                                                                                                                                                                                                                     |
| Akka Persistence JDBC      | $akka-persistence-jdbc.version$      | [Documentation](https://doc.akka.io/docs/akka-persistence-jdbc/current/)                                                                                                                                                                                                                                          |
| Akka Persistence R2DBC     | $akka-persistence-r2dbc.version$     | [Documentation](https://doc.akka.io/docs/akka-persistence-r2dbc/current/)                                                                                                                                                                                                                                         |
| Akka Projections           | $akka-projections.version$           | [Documentation](https://doc.akka.io/docs/akka-projection/current/)                                                                                                                                                                                                                                               |
| Akka Management            | $akka-management.version$            | [Documentation](https://doc.akka.io/docs/akka-management/current/)                                                                                                                                                                                                                                                |
| Akka Diagnostics           | $akka-diagnostics.version$           | [Documentation](https://doc.akka.io/docs/akka-diagnostics/current/)                                                                                                                                                                                                                                               |
| Alpakka                    | $alpakka.version$                    | [Documentation](https://doc.akka.io/docs/alpakka/current/)                                                                                                                                                                                                                                                        |
| Alpakka Kafka              | $alpakka-kafka.version$              | [Documentation](https://doc.akka.io/docs/alpakka-kafka/current/)                                                                                                                                                                                                                                                  |

## Akka (core) $akka.version$  
[Documentation](https://doc.akka.io/docs/akka/current/) [JavaDoc](https://doc.akka.io/japi/akka/current/index.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/)

### Akka Actors
The Actor Model provides a higher level of abstraction for writing concurrent and distributed systems. It alleviates the developer from having to deal with explicit locking and thread management, making it easier to write correct concurrent and parallel systems.

[Documentation](https://doc.akka.io/docs/akka/current/typed/index.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/actor/typed/index.html)

### Akka Cluster
Akka Cluster provides a fault-tolerant decentralized peer-to-peer based Cluster Membership Service with no single point of failure or single point of bottleneck. It does this using gossip protocols and an automatic failure detector.

[Documentation](https://doc.akka.io/docs/akka/current/typed/index-cluster.html)

### Akka Event Sourcing
Akka Persistence enables stateful actors to persist their state so that it can be recovered when an actor is either restarted, such as after a JVM crash, by a supervisor or a manual stop-start, or migrated within a cluster.

[Documentation](https://doc.akka.io/docs/akka/current/typed/index-persistence.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/persistence/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/persistence/index.html)

### Akka Durable State
This model of Akka Persistence enables a stateful actor / entity to store the full state after processing each command instead of using event sourcing.

[Documentation](https://doc.akka.io/docs/akka/current/typed/index-persistence-durable-state.html)

### Akka Streams

[Documentation](https://doc.akka.io/docs/akka/current/stream/index.html) [Operators](https://doc.akka.io/docs/akka/current/stream/operators/index.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/stream/index.html)

## Akka gRPC $akka-grpc.version$
Akka gRPC provides support for building streaming gRPC servers and clients on top of Akka Streams and Akka HTTP.

[Documentation](https://doc.akka.io/docs/akka-grpc/current/)

## Akka HTTP $akka-http.version$ 
The Akka HTTP modules implement a full server- and client-side HTTP stack on top of Akka Actors and Akka Streams.

[Documentation](https://doc.akka.io/docs/akka-http/current/)

## Akka Persistence plugin for Cassandra $akka-persistence-cassandra.version$ 
The Akka Persistence Cassandra plugin allows for using Apache Cassandra as a backend for Akka Persistence and Akka Persistence Query.

[Documentation](https://doc.akka.io/docs/akka-persistence-cassandra/current/)

## Akka Persistence plugin for JDBC $akka-persistence-jdbc.version$
The Akka Persistence JDBC plugin allows for using JDBC-compliant databases as backend for Akka Persistence and Akka Persistence Query.

[Documentation](https://doc.akka.io/docs/akka-persistence-jdbc/current/)

## Akka Persistence plugin for R2DBC $akka-persistence-r2dbc.version$ 
The Akka Persistence R2DBC plugin allows for using SQL database with R2DBC as a backend for Akka Persistence.

[Documentation](https://doc.akka.io/docs/akka-persistence-r2dbc/current/)

## Akka Projections $akka-projections.version$
Akka Projections is intended for implementing Command Query Responsibility Segregation (CQRS) and Service to service communication.

[Documentation](https://doc.akka.io/docs/akka-projection/current/)

## Akka Management $akka-management.version$

Akka Management is a suite of tools for operating Akka Clusters.

[Documentation](https://doc.akka.io/docs/akka-management/current/)

## Akka Diagnostics $akka-diagnostics.version$ 
The Akka Thread Starvation Detector is a diagnostic tool that monitors the dispatcher of an ActorSystem and will log a warning if the dispatcher becomes unresponsive. The Config Checker tries to help you by finding potential configuration issues.

[Documentation](https://doc.akka.io/docs/akka-diagnostics/current/)

## Alpakka $alpakka.version$
The Alpakka project is an open source initiative to implement stream-aware and reactive integration pipelines for Java and Scala. It is built on top of Akka Streams.

[Documentation](https://doc.akka.io/docs/alpakka/current/)

### Alpakka Cassandra
Alpakka Cassandra offers an Akka Streams API on top of a `CqlSession` from the Datastax Java Driver version 4.0+.

[Documentation](https://doc.akka.io/docs/alpakka/current/cassandra.html)

### Alpakka Comma-separated files (CSV)
Comma-Separated Values are used as interchange format for tabular data of text.

[Documentation](https://doc.akka.io/docs/alpakka/current/data-transformations/csv.html)

## Alpakka Kafka $alpakka-kafka.version$ 
Alpakka Kafka lets you connect Apache Kafka to Akka Streams.

[Documentation](https://doc.akka.io/docs/alpakka-kafka/current/)

## Akka Insights

[Lightbend Telemetry](https://developer.lightbend.com/docs/telemetry/current/home.html) provides a view into the distributed applications at runtime. This view allows developers and operations to respond quickly to problems, track down unexpected behavior and tune the system.

| Akka | Compatible Akka Insights |
|------|--------------------------|
| Akka 23.10 | Lightbend Telemetry version 2.19 |
| Akka 23.05 | Lightbend Telemetry version 2.18 |
| Akka 22.10 (and older) | Lightbend Telemetry version 2.17 |

## Architecture
      
### Microservices
Tutorial bringing together essential parts of Akka to build resilient and scalable microservices. [Akka Guide](https://developer.lightbend.com/docs/akka-guide/microservices-tutorial/index.html)

### Distributed Cluster

Connect Akka services across geographical locations for lower latency and higher availability. [Akka Distributed Cluster](https://doc.akka.io/docs/akka-distributed-cluster/current/index.html)

### Edge

Move your endpoints to the edge of the cloud for lower latency and higher availability. [Akka Edge](https://doc.akka.io/docs/akka-edge/current/index.html)


@@@ index

* [java-version](java-versions.md)
* [support-terminology](support-terminology.md)

@@@
