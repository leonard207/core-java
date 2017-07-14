package com.leonard.core.concurrent.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by Leonard on 2017/7/13.
 */
public class BlockingQueueProducer implements Runnable {

    protected BlockingQueue queue = null;

    public BlockingQueueProducer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                queue.put(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
