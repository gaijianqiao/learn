package learn.t.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

/*
 * Class: TestAtomicLong
 * Description: TODO
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/18 11:32
 * Copyright (c) 2018, ZHUNING Technology Corporation,
 * All rights reserved.
 */
public class TestAtomicLong implements Runnable{
    private AtomicLongObj count = new AtomicLongObj();

    public TestAtomicLong(AtomicLongObj count) {
        this.count = count;
    }

    public void run() {

        System.out.println(Thread.currentThread().getName()+":"+this.count.increasement());
    }
}
