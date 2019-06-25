package learn.t.concurrent.latch;

import java.util.concurrent.CountDownLatch;

/*
 * Class: TestHarness
 * Description: 闭锁 latch ,使用闭锁latch实现了一个线程多线程执行时间的统计计算方法
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/25 9:32
 * All rights reserved.
 */
public class TestHarness {
    public long timeTasks(int nThreads, final Runnable task) {
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate = new CountDownLatch(nThreads);

        for (int i = 0; i < nThreads; i++) {
            Thread t = new Thread() {
                public void run() {
                    try {
                        startGate.await();//等待中，在线程都创建好之前，等待其他线程都完成创建的过程
                        try {
                            task.run();//执行任务，每次执行后都要把锁的数量释放一次
                        } finally {
                            endGate.countDown();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            };

            t.start();
        }
        long start = System.nanoTime();//开始计时
        startGate.countDown();//释放锁，让多线程开始运行
        try {
            endGate.await();//等待结束锁打开
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.nanoTime();//获取结束时间

        return end - start;//计算多个线程完成操作所使用的时间

    }
}
