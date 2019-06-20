package learn.t.concurrent.visit;


public class NoVisibility {
    private static boolean ready;
    private static int number;

    public static void main(String[] args) {

        new ReaderThread().start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        number = 2;
        ready = true;
        System.out.println(number);
        System.out.println(ready);
    }

    private static class ReaderThread extends Thread {
        public void run() {
            System.out.println("thread:"+ready);
            while (!ready) {

                System.out.println("loop log");
            }
        }
    }

}
