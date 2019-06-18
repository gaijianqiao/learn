package learn.t.concurrent.tstatic;

/*
 * Class: UseStaticThread
 * Description: TODO
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/18 13:33
 * Copyright (c) 2018, ZHUNING Technology Corporation,
 * All rights reserved.
 */
public class UseStaticThread implements Runnable {



    public void run() {

        StaticMethod.oneMethod();

    }
}
