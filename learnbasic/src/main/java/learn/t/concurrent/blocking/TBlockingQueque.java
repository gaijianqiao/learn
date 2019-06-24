package learn.t.concurrent.blocking;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Class: TBlockingQueque
 * Description: TODO
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/24 13:16
 * All rights reserved.
 */
public class TBlockingQueque {

    public static void main(String[] args) {
        BlockingQueue<Product> blockingQueue = new ArrayBlockingQueue<Product>(20);
        ExecutorService executorServiceProductor = Executors.newFixedThreadPool(30);
        ExecutorService executorServiceConsumer = Executors.newFixedThreadPool(30);
        while(true)
        {
            executorServiceProductor.execute(new Productor(blockingQueue));
            executorServiceConsumer.execute(new Consumer(blockingQueue));
        }
    }
}
