/*
 * Copyright (C) 2026 Lightbend Inc. <https://akka.io>
 */

package akka.dependencies.maventests;

import static org.junit.Assert.assertTrue;

import akka.actor.ActorSystem;
import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import java.net.ConnectException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import reactor.core.publisher.Mono;

public class PersistenceR2dbcTest {

  @Test
  public void startActorSystem() throws Exception {
    // fails if Akka modules of different versions end up on the classpath
    ActorSystem system = ActorSystem.create("PersistenceR2dbcTest");
    system.terminate();
    system.getWhenTerminated().toCompletableFuture().get(10, TimeUnit.SECONDS);
  }

  @Test
  public void connectThroughDriver() {
    // Mismatched Netty native jars fail with a linkage error on Linux x86_64, where Netty uses epoll.
    // The enforcer doesn't see them, because it ignores classifiers.
    PostgresqlConnectionFactory factory =
        new PostgresqlConnectionFactory(
            PostgresqlConnectionConfiguration.builder()
                // nothing listens here, the connection gets through the driver and Netty and fails
                .host("localhost")
                .port(1)
                .username("x")
                .build());
    try {
      Mono.from(factory.create()).block(Duration.ofSeconds(20));
    } catch (RuntimeException e) {
      Throwable cause = e;
      while (cause.getCause() != null) cause = cause.getCause();
      assertTrue("Unexpected failure: " + cause, cause instanceof ConnectException);
      return;
    }
    throw new AssertionError("Expected the connection to fail");
  }
}
