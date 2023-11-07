package com.example.java8features.concurrency;

import java.util.concurrent.*;

public class Basics {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> runnable = () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return Thread.currentThread().getName();
        };

        ExecutorService service = Executors.newFixedThreadPool(6);

        for (int i = 0; i < 10; i++) {
            Future<String> submit = service.submit(runnable);
            String s = submit.get();
            System.out.println(s);
        }
        service.shutdown();
    }
}
