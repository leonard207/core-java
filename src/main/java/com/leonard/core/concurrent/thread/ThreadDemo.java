package com.leonard.core.concurrent.thread;

public class ThreadDemo {

    public static void main(String [] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;){
                    try {
                        Thread.sleep(1000L);
                        System.out.println(Thread.currentThread().getName() + "运行中...");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        },"线程A");
        thread.start();

        thread.wait();
        System.out.println("执行" + thread.getName() + "中断...");
        thread.interrupt();
        System.out.println("主线程休眠！");
    }
}
