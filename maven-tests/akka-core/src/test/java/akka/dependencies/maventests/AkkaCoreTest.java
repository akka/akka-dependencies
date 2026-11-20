/*
 * Copyright (C) 2026 Lightbend Inc. <https://akka.io>
 */

package akka.dependencies.maventests;

import akka.actor.ActorSystem;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

public class AkkaCoreTest {

  @Test
  public void startActorSystem() throws Exception {
    // fails if Akka modules of different versions end up on the classpath
    ActorSystem system = ActorSystem.create("AkkaCoreTest");
    system.terminate();
    system.getWhenTerminated().toCompletableFuture().get(10, TimeUnit.SECONDS);
  }
}
