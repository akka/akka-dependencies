# Akka module versions $akka-dependencies.major-version$

This table lists all Akka modules that are part of the Akka $akka-dependencies.major-version$ release along with their current versions.

Akka $akka-dependencies.version$ is cross-built for Scala $akka-scala-2.13.version$ and Scala $akka-scala-3.version$. 
Akka is certified for use with certain Java versions, see @ref[Java Versions](java-versions.md).

Some modules in Akka do not live up to the high standards Lightbend requires to fully support them for Akka Licensees. Modules are marked with their @ref[readiness level](support-terminology.md) in the "project info" section of their documentation.

Akka is licensed under the Business Source License 1.1, please see [Akka License FAQ](https://www.lightbend.com/akka/license-faq).

| Module                                | Current version                      | Documentation                                                                                                                                                                                                                                                                                                          |
|---------------------------------------|--------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Akka Dependencies BOM                 | $akka-dependencies.version$          |                                                                                                                                                                                                                                                                                                                        |
| Akka (core)                           | $akka.version$                       | [Documentation](https://doc.akka.io/docs/akka/current/) [JavaDoc](https://doc.akka.io/japi/akka/current/index.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/)                                                                                                                                             |
| Akka Actors                           | $akka.version$                       | [Documentation](https://doc.akka.io/docs/akka/current/typed/index.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/actor/typed/index.html)                                                                            |
| Akka Cluster                          | $akka.version$                       | [Documentation](https://doc.akka.io/docs/akka/current/typed/index-cluster.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/cluster/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/cluster/index.html)                                                                            |
| Akka Event Sourcing                   | $akka.version$                       | [Documentation](https://doc.akka.io/docs/akka/current/typed/index-persistence.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/persistence/typed/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/persistence/typed/index.html)                                                    |
| Akka Durable State                    | $akka.version$                       | [Documentation](https://doc.akka.io/docs/akka/current/typed/index-persistence-durable-state.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/persistence/typed/state/scaladsl/index.html)         |
| Akka Streams                          | $akka.version$                       | [Documentation](https://doc.akka.io/docs/akka/current/stream/index.html) [Operators](https://doc.akka.io/docs/akka/current/stream/operators/index.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/stream/index.html)      |
| Akka gRPC                             | $akka-grpc.version$                  | [Documentation](https://doc.akka.io/docs/akka-grpc/current/) [ScalaDoc](https://doc.akka.io/api/akka-grpc/current/akka/grpc/)                                                                                                                                                                                          |
| Akka HTTP                             | $akka-http.version$                  | [Documentation](https://doc.akka.io/docs/akka-http/current/) [Predefined Directives](https://doc.akka.io/docs/akka-http/current/routing-dsl/directives/alphabetically.html) [JavaDoc](https://doc.akka.io/japi/akka-http/current/) [ScalaDoc](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html) |
| Akka Persistence plugin for Cassandra | $akka-persistence-cassandra.version$ | [Documentation](https://doc.akka.io/docs/akka-persistence-cassandra/current/)                                                                                                                                                                                                                                          |
| Akka Persistence plugin for JDBC      | $akka-persistence-jdbc.version$      | [Documentation](https://doc.akka.io/docs/akka-persistence-jdbc/current/)                                                                                                                                                                                                                                               |
| Akka Persistence plugin for R2DBC     | $akka-persistence-r2dbc.version$     | [Documentation](https://doc.akka.io/docs/akka-persistence-r2dbc/current/)                                                                                                                                                                                                                                              |
| Akka Projections                      | $akka-projections.version$           | [Documentation](https://doc.akka.io/docs/akka-projection/current/)                                                                                                                                                                                                                                                     |
| Akka Management                       | $akka-management.version$            | [Documentation](https://doc.akka.io/docs/akka-management/current/)                                                                                                                                                                                                                                                     |
| Akka Diagnostics                      | $akka-diagnostics.version$           | [Documentation](https://doc.akka.io/docs/akka-diagnostics/current/)                                                                                                                                                                                                                                                    |
| Alpakka                               | $alpakka.version$                    | [Documentation](https://doc.akka.io/docs/alpakka/current/)                                                                                                                                                                                                                                                             |
| Alpakka Kafka                         | $alpakka-kafka.version$              | [Documentation](https://doc.akka.io/docs/alpakka-kafka/current/)                                                                                                                                                                                                                                                       |
| Akka Edge Rust                        | $akka-edge-rust.version$             | [Guide](https://doc.akka.io/docs/akka-edge/current/guide-rs.html) [API](https://doc.akka.io/api/akka-edge-rs/current/)                                                                                                                                                                                                 |

## Repository

The Akka dependencies are available from Akka's library repository. To access them there, you need to configure the URL for this repository.

@@repository [Maven,sbt,Gradle] {
id="akka-repository"
name="Akka library repository"
url="https://repo.akka.io/maven"
}

## Akka (core) $akka.version$  
At the core of Akka: A model for concurrency and distribution without all the pain of threading primitives.

[Documentation](https://doc.akka.io/docs/akka/current/) [JavaDoc](https://doc.akka.io/japi/akka/current/index.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/)

#### Complete dependency listing of Akka core modules

Check the [documentation](https://doc.akka.io/docs/akka/current/) to learn which dependencies you require. 

@@dependency [Maven,sbt,Gradle] {
symbol1=AkkaVersion
value1="$akka.version$"
group1="com.typesafe.akka" artifact1="akka-actor_$scala.binary.version$"               version1=AkkaVersion
group2="com.typesafe.akka" artifact2="akka-actor-testkit-typed_$scala.binary.version$" version2=AkkaVersion scope2=test
group3="com.typesafe.akka" artifact3="akka-actor-typed_$scala.binary.version$"         version3=AkkaVersion
group4="com.typesafe.akka" artifact4="akka-coordination_$scala.binary.version$"        version4=AkkaVersion
group5="com.typesafe.akka" artifact5="akka-cluster_$scala.binary.version$"             version5=AkkaVersion
group6="com.typesafe.akka" artifact6="akka-cluster-typed_$scala.binary.version$"       version6=AkkaVersion
group7="com.typesafe.akka" artifact7="akka-cluster-metrics_$scala.binary.version$"     version7=AkkaVersion
group8="com.typesafe.akka" artifact8="akka-cluster-sharding_$scala.binary.version$"    version8=AkkaVersion
group9="com.typesafe.akka" artifact9="akka-cluster-sharding-typed_$scala.binary.version$" version9=AkkaVersion
group10="com.typesafe.akka" artifact10="akka-cluster-tools_$scala.binary.version$"        version10=AkkaVersion
group11="com.typesafe.akka" artifact11="akka-discovery_$scala.binary.version$"            version11=AkkaVersion
group12="com.typesafe.akka" artifact12="akka-distributed-data_$scala.binary.version$"     version12=AkkaVersion
group13="com.typesafe.akka" artifact13="akka-multi-node-testkit_$scala.binary.version$"   version13=AkkaVersion scope13=test
group14="com.typesafe.akka" artifact14="akka-persistence_$scala.binary.version$"          version14=AkkaVersion
group15="com.typesafe.akka" artifact15="akka-persistence-typed_$scala.binary.version$"    version15=AkkaVersion
group16="com.typesafe.akka" artifact16="akka-persistence-query_$scala.binary.version$"    version16=AkkaVersion
group17="com.typesafe.akka" artifact17="akka-protobuf-v3_$scala.binary.version$"          version17=AkkaVersion
group18="com.typesafe.akka" artifact18="akka-remote_$scala.binary.version$"               version18=AkkaVersion
group19="com.typesafe.akka" artifact19="akka-slf4j_$scala.binary.version$"                version19=AkkaVersion
group20="com.typesafe.akka" artifact20="akka-stream_$scala.binary.version$"               version20=AkkaVersion
group21="com.typesafe.akka" artifact21="akka-stream-testkit_$scala.binary.version$"       version21=AkkaVersion scope21=test
group22="com.typesafe.akka" artifact22="akka-stream-typed_$scala.binary.version$"         version22=AkkaVersion
group23="com.typesafe.akka" artifact23="akka-testkit_$scala.binary.version$"              version23=AkkaVersion scope21=test
}


### Akka Actors
The Actor Model provides a higher level of abstraction for writing concurrent and distributed systems. It alleviates the developer from having to deal with explicit locking and thread management, making it easier to write correct concurrent and parallel systems.

[Documentation](https://doc.akka.io/docs/akka/current/typed/index.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/actor/typed/index.html)

### Akka Cluster
Akka Cluster provides a fault-tolerant decentralized peer-to-peer based Cluster Membership Service with no single point of failure or single point of bottleneck. It does this using gossip protocols and an automatic failure detector.

[Documentation](https://doc.akka.io/docs/akka/current/typed/index-cluster.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/cluster/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/cluster/index.html)

### Akka Event Sourcing
Akka Persistence enables stateful actors to persist their state so that it can be recovered when an actor is either restarted, such as after a JVM crash, by a supervisor or a manual stop-start, or migrated within a cluster.

[Documentation](https://doc.akka.io/docs/akka/current/typed/index-persistence.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/persistence/typed/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/persistence/typed/index.html)

### Akka Durable State
Enables stateful actors to persist their latest state, so that it can be recovered when an actor is restarted.

[Documentation](https://doc.akka.io/docs/akka/current/typed/index-persistence-durable-state.html) [JavaDoc](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/persistence/typed/state/scaladsl/index.html)

### Akka Streams
An intuitive and safe way to do asynchronous, non-blocking backpressured stream processing.

[Documentation](https://doc.akka.io/docs/akka/current/stream/index.html) [Operators](https://doc.akka.io/docs/akka/current/stream/operators/index.html) 

[JavaDoc](https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html) [ScalaDoc](https://doc.akka.io/api/akka/current/akka/stream/index.html)

## Akka gRPC $akka-grpc.version$
Akka gRPC provides support for building streaming gRPC servers and clients on top of Akka Streams and Akka HTTP.

[Documentation](https://doc.akka.io/docs/akka-grpc/current/) [ScalaDoc](https://doc.akka.io/api/akka-grpc/current/akka/grpc/)

Maven
:   @@@vars
    ```xml
    <project>
      <modelVersion>4.0.0</modelVersion>
      <name>Project name</name>
      <groupId>com.example</groupId>
      <artifactId>my-grpc-app</artifactId>
      <version>0.1-SNAPSHOT</version>
      <properties>
        <akka.grpc.version>$akka-grpc.version$</akka.grpc.version>
        <project.encoding>UTF-8</project.encoding>
      </properties>
      <repositories>
        <repository>
          <id>akka-repository</id>
          <name>Akka library repository</name>
          <url>https://repo.akka.io/maven</url>
        </repository>
      </repositories>
      <pluginRepositories>
        <pluginRepository>
          <id>akka-repository</id>
          <name>Akka library repository</name>
          <url>https://repo.akka.io/maven</url>
        </pluginRepository>
      </pluginRepositories>
      <dependencies>
        <dependency>
          <groupId>com.lightbend.akka.grpc</groupId>
          <artifactId>akka-grpc-runtime_$scala.binary.version$</artifactId>
          <version>${akka.grpc.version}</version>
        </dependency>
      </dependencies>
      <build>
        <plugins>
          <plugin>
            <groupId>com.lightbend.akka.grpc</groupId>
            <artifactId>akka-grpc-maven-plugin</artifactId>
            <version>${akka.grpc.version}</version>
            <executions>
              <execution>
                <goals>
                  <goal>generate</goal>
                </goals>
              </execution>
            </executions>
          </plugin>
        </plugins>
      </build>
    </project>
    ```
    @@@

sbt
:   @@@vars
    ```scala
    // in project/plugins.sbt:
    resolvers += "Akka library repository".at("https://repo.akka.io/maven")
    addSbtPlugin("com.lightbend.akka.grpc" % "sbt-akka-grpc" % "$akka-grpc.version$")
    //
    // in build.sbt:
    resolvers += "Akka library repository".at("https://repo.akka.io/maven")
    enablePlugins(AkkaGrpcPlugin)
    ```
@@@

Gradle
:   @@@vars
    ```gradle
    buildscript {
      repositories {
        gradlePluginPortal()
        maven {
          url "https://repo.akka.io/maven"
        }
      }
    }
    plugins {
      id 'java'
      id 'application'
      id 'com.lightbend.akka.grpc.gradle' version '$akka-grpc.version$'
    }
    repositories {
      mavenCentral()
      maven {
        url "https://repo.akka.io/maven"
      }
    }
    ```
@@@

## Akka HTTP $akka-http.version$ 
The Akka HTTP modules implement a full server- and client-side HTTP stack on top of Akka Actors and Akka Streams.

[Documentation](https://doc.akka.io/docs/akka-http/current/) [Predefined Directives](https://doc.akka.io/docs/akka-http/current/routing-dsl/directives/alphabetically.html) 

[JavaDoc](https://doc.akka.io/japi/akka-http/current/) [ScalaDoc](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html)

#### Complete dependency listing of Akka HTTP modules

Check the [documentation](https://doc.akka.io/docs/akka-http/current/) to learn which dependencies you require.

@@dependency [Maven,sbt,Gradle] {
    symbol1=AkkaHttpVersion
    value1="$akka-http.version$"
    group1="com.typesafe.akka" artifact1="akka-http_$scala.binary.version$"               version1=AkkaHttpVersion
    group2="com.typesafe.akka" artifact2="akka-http-core_$scala.binary.version$"          version2=AkkaHttpVersion
    group3="com.typesafe.akka" artifact3="akka-http-jackson_$scala.binary.version$"       version3=AkkaHttpVersion
    group4="com.typesafe.akka" artifact4="akka-http-spray-json_$scala.binary.version$"    version4=AkkaHttpVersion
    group5="com.typesafe.akka" artifact5="akka-http-testkit_$scala.binary.version$"       version5=AkkaHttpVersion scope5=test
    group6="com.typesafe.akka" artifact6="akka-http-xml_$scala.binary.version$"           version6=AkkaHttpVersion
}

## Akka Persistence plugin for Cassandra $akka-persistence-cassandra.version$ 
The Akka Persistence Cassandra plugin allows for using Apache Cassandra as a backend for [Akka Persistence](https://doc.akka.io/docs/akka/current/typed/index-persistence.html) and [Akka Persistence Query](https://doc.akka.io/docs/akka/current/persistence-query.html).

[Documentation](https://doc.akka.io/docs/akka-persistence-cassandra/current/)

@@dependency [Maven,sbt,Gradle] {
    group=com.typesafe.akka
    artifact=akka-persistence-cassandra_$scala.binary.version$
    version=$akka-persistence-cassandra.version$
}

## Akka Persistence plugin for JDBC $akka-persistence-jdbc.version$
The Akka Persistence JDBC plugin allows for using JDBC-compliant databases as backend for [Akka Persistence](https://doc.akka.io/docs/akka/current/typed/index-persistence.html) and [Akka Persistence Query](https://doc.akka.io/docs/akka/current/persistence-query.html).

[Documentation](https://doc.akka.io/docs/akka-persistence-jdbc/current/)

@@dependency [Maven,sbt,Gradle] {
    group=com.lightbend.akka
    artifact=akka-persistence-jdbc_$scala.binary.version$
    version=$akka-persistence-jdbc.version$
}

## Akka Persistence plugin for R2DBC $akka-persistence-r2dbc.version$ 
The Akka Persistence R2DBC plugin allows for using SQL database with R2DBC as a backend for [Akka Persistence](https://doc.akka.io/docs/akka/current/typed/index-persistence.html) and [Akka Persistence Query](https://doc.akka.io/docs/akka/current/persistence-query.html).

[Documentation](https://doc.akka.io/docs/akka-persistence-r2dbc/current/)

@@dependency [Maven,sbt,Gradle] {
    group=com.lightbend.akka
    artifact=akka-persistence-r2dbc_$scala.binary.version$
    version=$akka-persistence-r2dbc.version$
}

## Akka Projections $akka-projections.version$
Akka Projections is intended for implementing Command Query Responsibility Segregation (CQRS) and Service to service communication.

[Documentation](https://doc.akka.io/docs/akka-projection/current/)

@@dependency [Maven,sbt,Gradle] {
    group=com.lightbend.akka
    artifact=akka-projection-core_$scala.binary.version$
    version=$akka-projections.version$
}

## Akka Management $akka-management.version$
Akka Management is a suite of tools for operating Akka Clusters.

[Documentation](https://doc.akka.io/docs/akka-management/current/)

#### Complete dependency listing of Akka Management modules

Check the [documentation](https://doc.akka.io/docs/akka-management/current/) to learn which dependencies you require.

@@dependency[Maven,sbt,Gradle] {
    symbol1=AkkaManagementVersion
    value1=$akka-management.version$
    group=com.lightbend.akka.management  artifact="akka-management_$scala.binary.version$"                   version=AkkaManagementVersion
    group2=com.lightbend.akka.management artifact2=akka-management-cluster-http_$scala.binary.version$       version2=AkkaManagementVersion
    group3=com.lightbend.akka.management artifact3=akka-management-cluster-bootstrap_$scala.binary.version$  version3=AkkaManagementVersion
    group4=com.lightbend.akka.management artifact4=akka-rolling-update-kubernetes_$scala.binary.version$     version4=AkkaManagementVersion
    group5=com.lightbend.akka.discovery  artifact5=akka-discovery-kubernetes-api_$scala.binary.version$      version5=AkkaManagementVersion
}

## Akka Diagnostics $akka-diagnostics.version$ 
The Akka Thread Starvation Detector is a diagnostic tool that monitors the dispatcher of an ActorSystem and will log a warning if the dispatcher becomes unresponsive. The Config Checker tries to help you by finding potential configuration issues.

[Documentation](https://doc.akka.io/docs/akka-diagnostics/current/)

@@dependency [Maven,sbt,Gradle] {
group=com.lightbend.akka
artifact=akka-diagnostics_$scala.binary.version$
version=$akka-diagnostics.version$
}

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

@@dependency [Maven,sbt,Gradle] {
    group=com.typesafe.akka
    artifact=akka-stream-kafka_$scala.binary.version$
    version=$alpakka-kafka.version$
}

## Akka Edge Rust $akka-edge-rust.version$ 

*@ref[Incubating](support-terminology.md#incubating)*

*Extending the power of Akka’s event-driven model to resource-constrained devices.*

Akka Edge support in Rust is designed to empower Akka developers at the edge. Recognizing the resource constraints present at the edge, Akka Edge Rust enables event-driven solutions for developers familiar with Akka Persistence and Projections.

[Guide](https://doc.akka.io/docs/akka-edge/current/guide-rs.html)

[API](https://doc.akka.io/api/akka-edge-rs/current/)

## Akka Insights

[Lightbend Telemetry](https://developer.lightbend.com/docs/telemetry/current/home.html) provides a view into the distributed applications at runtime. This view allows developers and operations to respond quickly to problems, track down unexpected behavior and tune the system.

| Akka | Compatible Akka Insights |
|------|--------------------------|
| Akka 23.10 | Lightbend Telemetry version 2.19 |
| Akka 23.05 | Lightbend Telemetry version 2.18 |
| Akka 22.10 (and older) | Lightbend Telemetry version 2.17 |

## Architecture
      
### Microservices
Tutorial bringing together essential parts of Akka to build resilient and scalable microservices. [Akka Guide](https://doc.akka.io/guide/microservices-tutorial/index.html )

### Distributed Cluster

Connect Akka services across geographical locations for lower latency and higher availability. [Akka Distributed Cluster](https://doc.akka.io/docs/akka-distributed-cluster/current/index.html)

### Edge

Move your endpoints to the edge of the cloud for lower latency and higher availability. *Akka Edge Rust* extends the power of Akka’s event-driven model to resource-constrained devices. [Akka Edge](https://doc.akka.io/docs/akka-edge/current/index.html)


@@@ index

* [java-version](java-versions.md)
* [support-terminology](support-terminology.md)

@@@
