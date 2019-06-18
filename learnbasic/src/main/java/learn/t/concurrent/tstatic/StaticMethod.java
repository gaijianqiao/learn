package learn.t.concurrent.tstatic;

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
