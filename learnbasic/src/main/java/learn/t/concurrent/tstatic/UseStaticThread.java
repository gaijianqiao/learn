package learn.t.concurrent.tstatic;


public class UseStaticThread implements Runnable {



    public void run() {

        StaticMethod.oneMethod();

    }
}
