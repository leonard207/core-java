package com.leonard.core.object;

import sun.misc.Unsafe;

public class Test {

    private static final Unsafe unsafe = Unsafe.getUnsafe();


    public static void main(String[] args) throws InterruptedException {
        unsafe.park(true,0L);
        System.out.println("start...");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000L);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"子线程");
        thread.start();
        thread.join();
        thread.wait();
        System.out.println("end...");
    }
}
