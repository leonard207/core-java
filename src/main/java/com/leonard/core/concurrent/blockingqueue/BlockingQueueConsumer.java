package com.leonard.core.concurrent.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by Leonard on 2017/7/13.
 */
public class BlockingQueueConsumer implements Runnable {

    protected BlockingQueue queue = null;

    public BlockingQueueConsumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true){
                System.out.println(queue.take());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
