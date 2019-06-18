package learn.t.concurrent;

public class TestAtomicLong implements Runnable{
    private AtomicLongObj count = new AtomicLongObj();

    public TestAtomicLong(AtomicLongObj count) {
        this.count = count;
    }

    public void run() {

        System.out.println(Thread.currentThread().getName()+":"+this.count.increasement());
    }
}
