package learn.t.concurrent;

import java.util.concurrent.atomic.AtomicLong;


public class AtomicLongObj {
    private AtomicLong count = new AtomicLong(0);

    public long increasement()
    {
        return count.addAndGet(1);
    }

}
