package jp.learningdesign.javapractice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Sample {
    public static void main(String[] args) {
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        exec.schedule(() -> {
            System.out.println("finish");
            exec.shutdown();
        }, 1, TimeUnit.SECONDS);

    }
}
