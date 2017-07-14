package com.leonard.core.concurrent.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Leonard on 2017/7/13.
 */
public class BlockingQueueExample {

    public static void main(String[] args) throws Exception {

        BlockingQueue queue = new ArrayBlockingQueue(1024);

        BlockingQueueProducer producer = new BlockingQueueProducer(queue);
        BlockingQueueConsumer consumer = new BlockingQueueConsumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();

        Thread.sleep(4000);
    }
}
