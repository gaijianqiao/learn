package learn.t.concurrent.latch;

/*
 * Class: HrnessThread
 * Description: TODO
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/25 9:47
 * All rights reserved.
 */
public class HrnessThread implements Runnable{
    @Override
    public void run() {

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
