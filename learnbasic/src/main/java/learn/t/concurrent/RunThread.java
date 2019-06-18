package learn.t.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Class: RunThread
 * Description: TODO
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/18 11:35
 * Copyright (c) 2018, ZHUNING Technology Corporation,
 * All rights reserved.
 */
public class RunThread  {

    public static void main(String[] args) {
        AtomicLongObj atomicLongObj = new AtomicLongObj();


        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for(int i=0;i<100000;i++)
        {
            TestAtomicLong testAtomicLong = new TestAtomicLong(atomicLongObj);
            executorService.execute(testAtomicLong);
        }

    }


}
