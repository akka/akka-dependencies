/*
 * Copyright (C) 2026 Lightbend Inc. <https://akka.io>
 */

package akka.dependencies.maventests;

import akka.actor.ActorSystem;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

public class LoglevelsLog4j2Test {

  @Test
  public void startActorSystem() throws Exception {
    // fails if Akka modules of different versions end up on the classpath
    ActorSystem system = ActorSystem.create("LoglevelsLog4j2Test");
    system.terminate();
    system.getWhenTerminated().toCompletableFuture().get(10, TimeUnit.SECONDS);
  }
}
