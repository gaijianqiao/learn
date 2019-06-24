package learn.t.concurrent.blocking;

import java.util.Date;
import java.util.concurrent.BlockingQueue;

/*
 * Class: Productor
 * Description: TODO
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/24 13:18
 * All rights reserved.
 */
public class Productor implements Runnable{

    private BlockingQueue<Product> blockingQueue;

    private Product make()
    {
        return new Product("a"+System.nanoTime(),10);
    }


    public Productor(BlockingQueue<Product> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    public void run() {

        try {
            Thread.sleep(10);
            Product product = make();
            this.blockingQueue.put(product);
            System.out.println(Thread.currentThread().getName()+" put a product:"+product.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
