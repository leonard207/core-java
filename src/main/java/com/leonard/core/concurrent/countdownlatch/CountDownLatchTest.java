package com.leonard.core.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

    private static final int MAX_THRED_NUM = 10;

    private static CountDownLatch countDownLatch = new CountDownLatch(MAX_THRED_NUM);

    public static void main(String[] args) {

        countDownLatch.countDown();
        try {

            for (int i = 0; i < MAX_THRED_NUM; i++){

            }
                countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(countDownLatch.getCount());

    }
}
