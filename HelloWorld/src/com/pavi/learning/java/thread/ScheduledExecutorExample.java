package com.pavi.learning.java.thread;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ScheduledTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Executing at:" + System.currentTimeMillis() + "on thread" + Thread.currentThread().getName());
    }
}
public class ScheduledExecutorExample {

    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(2);

        scheduledExecutor.scheduleAtFixedRate(new ScheduledTask(),1,2, TimeUnit.SECONDS);

        scheduledExecutor.scheduleWithFixedDelay(new ScheduledTask(),2,3,TimeUnit.SECONDS);

        Executors.newSingleThreadScheduledExecutor().schedule(() -> scheduledExecutor.shutdown(),5,TimeUnit.SECONDS);

    }
}
