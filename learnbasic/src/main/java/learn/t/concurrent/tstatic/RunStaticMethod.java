package learn.t.concurrent.tstatic;

import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


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
