package io.cucumber.skeleton;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.ResourceLock;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.parallel.ResourceAccessMode.READ_WRITE;
import static org.junit.platform.engine.support.hierarchical.ExclusiveResource.GLOBAL_KEY;

public class LockTest {

  @Test
  @ResourceLock(value = GLOBAL_KEY, mode = READ_WRITE)
  void test1() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
  }

  @Test
  @ResourceLock(value = "b", mode = READ_WRITE)
  void test2() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
  }

}
