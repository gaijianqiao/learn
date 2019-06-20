package learn.t.concurrent.tthreadlocal;

/*
 * Class: MyThreadLocal
 * Description: TODO
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/19 10:54
 * All rights reserved.
 */
public class MyThreadLocal extends ThreadLocal<MyModel> {

    protected MyModel initialValue()
    {
        return new MyModel();
    }
}
