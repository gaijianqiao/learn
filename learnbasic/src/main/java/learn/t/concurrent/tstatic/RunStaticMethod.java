package learn.t.concurrent.tstatic;

import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Class: RunStaticMethod
 * Description: TODO
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/18 13:33
 * Copyright (c) 2018, ZHUNING Technology Corporation,
 * All rights reserved.
 */
public class RunStaticMethod {

    public static void main(String[] args) {

        Vector vector = new Vector();

        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for(int i=0;i<1000;i++)
        {
            UseStaticThread useStaticThread = new UseStaticThread();
            executorService.execute(useStaticThread);
        }
    }
}
