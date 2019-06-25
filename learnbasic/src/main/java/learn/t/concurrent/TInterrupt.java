package learn.t.concurrent;

import java.util.Date;

/*
 * Class: TInterrupt
 * Description: TODO
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/24 17:14
 * All rights reserved.
 */
public class TInterrupt {

    public static void main(String[] args) {

        Thread task1 = new Thread(new Task());
        task1.start();


        task1.interrupt();
        System.out.println("##############################");
    }

    static class Task implements Runnable{

        @Override
        public void run() {
            while(true)
            {
                System.out.println(System.nanoTime());
            }
        }
    }
}
