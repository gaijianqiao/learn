package learn.t.concurrent;

import java.util.concurrent.atomic.AtomicLong;

/*
 * Class: AtomicLongObj
 * Description: TODO
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/18 11:30
 * Copyright (c) 2018, ZHUNING Technology Corporation,
 * All rights reserved.
 */
public class AtomicLongObj {
    private AtomicLong count = new AtomicLong(0);

    public long increasement()
    {
        return count.addAndGet(1);
    }

}
