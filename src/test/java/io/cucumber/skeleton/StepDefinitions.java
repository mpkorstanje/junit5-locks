package io.cucumber.skeleton;

import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {
    @When("I wait {int} hour")
    public void iWaitHour(int arg0) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(arg0);
    }
}
