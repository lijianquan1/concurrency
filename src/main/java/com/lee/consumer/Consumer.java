package com.lee.consumer;

import com.lee.entity.PCData;
import org.omg.CORBA.PRIVATE_MEMBER;

import java.text.MessageFormat;
import java.util.Random;
import java.util.concurrent.BlockingQueue;


/**
 * Author:ljq
 * Date: 2018/5/30
 **/
public class Consumer implements Runnable {

    private BlockingQueue<PCData> queue;
    private static final int SLEEPTIME = 1000;

    public Consumer(BlockingQueue<PCData> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("start consumer id : " + Thread.currentThread().getId());
        Random random = new Random();
        while (true) {
            try {
                PCData data = queue.take();
                if (data != null) {
                    int re = data.getIntData() * data.getIntData();
                    System.out.println(MessageFormat.format("{0} * {1} = {2}", data.getIntData(), data.getIntData(), re));
                    Thread.sleep(random.nextInt(SLEEPTIME));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
}
