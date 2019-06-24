package learn.t.concurrent.blocking;

import java.util.concurrent.BlockingQueue;

/*
 * Class: Consumer
 * Description: TODO
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/24 14:19
 * All rights reserved.
 */
public class Consumer implements Runnable{
    private BlockingQueue<Product> blockingQueue;

    public Consumer(BlockingQueue<Product> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    public void run() {
        try {

            Thread.sleep(5000);
            Product product = blockingQueue.take();
            System.out.println(Thread.currentThread().getName()+" take a product:"+product.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
