package com.lee.test;

import com.lee.consumer.Consumer;
import com.lee.entity.PCData;
import com.lee.product.Producer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Author:ljq
 * Date: 2018/5/30
 **/
public class TestProducerAndConsumer {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<PCData> queue = new LinkedBlockingQueue<>(10);
        Producer p1 = new Producer(queue);
        Producer p2 = new Producer(queue);
        Producer p3 = new Producer(queue);
        Consumer c1 = new Consumer(queue);
        Consumer c2 = new Consumer(queue);
        Consumer c3 = new Consumer(queue);
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(p1);
        executor.execute(p2);
        executor.execute(p3);
        executor.execute(c1);
        executor.execute(c2);
        executor.execute(c3);
        Thread.sleep(10 * 1000);
        p1.stop();
        p3.stop();
        p2.stop();
        executor.shutdown();
    }


}
