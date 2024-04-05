# Akka Dependencies

The Akka family of projects is managed by teams at [Lightbend](https://lightbend.com/) with help from the community.

Akka Dependencies is a Maven bill of materials (BOM) that can be referenced to make it easier to reference compatible versions of Akka components in a project.
For a full list of included dependencies see the [`Dependencies`](./project/Dependencies.scala) file.

Usage: 

Add a `dependencyManagement` `dependency` to your `pom.xml`:

```xml
    <properties>
        <!-- use latest version from https://github.com/akka/akka-dependencies/releases !--> 
        <akka-dependencies.version>23.10.0</akka-dependencies.version>
    </properties>
    <repositories>
        <repository>
            <id>akka-repository</id>
            <name>Akka library repository</name>
            <url>https://repo.akka.io/maven</url>
        </repository>
    </repositories>
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>com.lightbend.akka</groupId>
                <artifactId>akka-dependencies_2.13</artifactId>
                <version>${akka-dependencies.version}</version>
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

## License

Akka is licensed under the Business Source License 1.1, please see the [Akka License FAQ](https://www.lightbend.com/akka/license-faq).