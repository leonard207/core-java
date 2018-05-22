package com.leonard.core.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

    private static final int MAX_THRED_NUM = 10;

    private static CountDownLatch countDownLatch = new CountDownLatch(MAX_THRED_NUM);

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    countDownLatch.countDown();
                }
            };
            runnable.run();
        }
        System.out.println(countDownLatch.getCount());
        try {
            countDownLatch.await();
            System.out.println("finish");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
