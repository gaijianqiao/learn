package learn.t.concurrent.tthreadlocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Class: RunThreadLocal
 * Description: TODO
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/19 10:59
 * All rights reserved.
 */
//作用确保每一个线程都有一个独立的副本。
//实验结果是，相同的线程有相同的一个副本。
public class RunThreadLocal implements Runnable {

    private MyThreadLocal myThreadLocal;

    public RunThreadLocal(MyThreadLocal myThreadLocal) {
        this.myThreadLocal = myThreadLocal;
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        MyThreadLocal myThreadLocalIn = new MyThreadLocal();

        int i = 0;
        while (true) {
            RunThreadLocal runThreadLocal = new RunThreadLocal(myThreadLocalIn);
            executorService.execute(runThreadLocal);
            if (i > 10000) {
                break;
            }
            i++;
        }

    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + ":" + this.myThreadLocal.get());
    }
}