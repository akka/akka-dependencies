# Akka libraries overview

Akka provides a set of libraries for building and running responsive applications. Key libraries and resources are outlined to help you get started.

> **TIP:** Find the latest Akka library versions at @ref[Akka library versions](index.md).

## Start Learning

* [First example](https://doc.akka.io/libraries/akka-core/current/typed/actors.html#first-example): Create a simple "Hello world!" example.

* [Get started guide](https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial.html): Learn Akka fundamentals with an IoT project.

* [Microservices guide](https://doc.akka.io/libraries/guide/microservices-tutorial/index.html): Build resilient and scalable microservices.

## Foundations

* [Actors](https://doc.akka.io/libraries/akka-core/current/typed/index.html): A model for concurrency and distribution without all the pain of threading primitives.

* [Streams](https://doc.akka.io/libraries/akka-core/current/stream/index.html): An intuitive and safe way to do asynchronous, non-blocking, backpressured stream processing.

* [Event Sourcing](https://doc.akka.io/libraries/akka-core/current/typed/persistence.html): Enables stateful actors to persist their state changes, so that the state can be recovered when an actor is restarted.

* [Durable State](https://doc.akka.io/libraries/akka-core/current/typed/index-persistence-durable-state.html): Enables stateful actors to persist their latest state, so that it can be recovered when an actor is restarted.

* [Projections](https://doc.akka.io/libraries/akka-projection/current/): Build a projected model out of streams of events.

## Communication and Integrations

* [HTTP](https://doc.akka.io/libraries/akka-http/current/introduction.html): Modern, fast, asynchronous, streaming-first HTTP server and client.

* [gRPC](https://doc.akka.io/libraries/akka-grpc/current/whygrpc.html): Build typed, streaming gRPC services.

* [Alpakka](https://doc.akka.io/libraries/alpakka/current/): Streaming integrations with [Kafka](https://doc.akka.io/libraries/alpakka-kafka/current/) and other technologies.

* [Akka Persistence R2DBC](https://doc.akka.io/libraries/akka-persistence-r2dbc/current/getting-started.html): Use Postgres-compatible databases with Akka Persistence.

* [Cassandra Persistence](https://doc.akka.io/libraries/akka-persistence-cassandra/current/overview.html): Use Cassandra databases with Akka Persistence.

## Resilience and Distribution

* [Cluster](https://doc.akka.io/libraries/akka-core/current/typed/cluster.html): Boost resilience with distribution across multiple nodes.

* [Cluster Sharding](https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding.html): Distribute actors across your cluster.

* [Distributed Data](https://doc.akka.io/libraries/akka-core/current/typed/distributed-data.html): Eventually consistent, low latency data.

## Architecture

* [Distributed Cluster](https://doc.akka.io/libraries/akka-distributed-cluster/current/index.html): Connect Akka services built on Akka libraries across geographical locations for lower latency and higher availability.

* [Edge](https://doc.akka.io/libraries/akka-edge/current/index.html): Move your endpoints to the edge of the cloud for lower latency and higher availability. Akka Edge Rust extends the power of Akka's event-driven model to resource-constrained devices.

## Operations and Observability

* [Management](https://doc.akka.io/libraries/akka-management/current/): Extensions for operating Akka on cloud providers and Kubernetes.

* [Diagnostics](https://doc.akka.io/libraries/akka-diagnostics/current/): Identify configuration and operational issues in your Akka application.

* [Insights](https://doc.akka.io/libraries/akka-insights/current/): Intelligent monitoring and observability purpose-built for Akka.
