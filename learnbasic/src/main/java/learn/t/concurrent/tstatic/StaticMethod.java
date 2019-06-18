package learn.t.concurrent.tstatic;

/*
 * Class: StaticMethod
 * Description: TODO
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/18 13:31
 * Copyright (c) 2018, ZHUNING Technology Corporation,
 * All rights reserved.
 */
public class StaticMethod {

    public synchronized static void oneMethod()
    {
        try {
            Thread.sleep(2000);
            System.out.println("process "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
