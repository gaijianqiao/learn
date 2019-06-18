package learn.t.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


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
