# Akka Platform Dependencies

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.lightbend.akka/akka-platform-dependencies_2.13/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.lightbend.akka/akka-platform-dependencies_2.13)
![Check](https://github.com/github/docs/actions/workflows/check.yml/badge.svg)

Akka Platform Dependencies is a Maven bill of materials (BOM) that can be referenced to make it easier to reference compatible versions of Akka open source and commercial components in a project.
For a full list of included dependencies see the [`Dependencies`](./project/Dependencies.scala) file.

Usage: 

Add a `dependencyManagement` `dependency` to your `pom.xml`:

```xml
    <properties>
        <akka-platform.version>1.0.0</akka-platform.version>
    </properties>
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>com.lightbend.akka</groupId>
                <artifactId>akka-platform-dependencies_2.13</artifactId>
                <version>${akka-platform.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
```

Reference one or more Akka components by their organization and artifact name only in your Maven or Gradle dependencies. 

Maven Ex)

```xml
        <dependency>
            <groupId>com.typesafe.akka</groupId>
            <artifactId>akka-cluster-typed_2.13</artifactId>
        </dependency>
        <dependency>
            <groupId>com.typesafe.akka</groupId>
            <artifactId>akka-cluster-sharding-typed_2.13</artifactId>
        </dependency>
```
