package com.leonard.core.concurrent.future;

import java.util.concurrent.*;

public class FutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() {
                return "执行结束";
            }
        });
        System.out.println(future.isDone());
        System.out.println(future.get());


        FutureTask futureTask = new FutureTask(new Callable<String>() {
            @Override
            public String call() {
                return "执行结束1";
            }
        });
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }
}
