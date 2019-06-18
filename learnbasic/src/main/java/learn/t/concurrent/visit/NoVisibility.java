package learn.t.concurrent.visit;


public class NoVisibility {
    private static boolean ready;
    private static int number;

    public static void main(String[] args) {

        new ReaderThread().start();
        number = 2;
        ready = true;
    }

    private static class ReaderThread extends Thread {
        public void run() {
            while (!ready) {
                Thread.yield();
            }
        }
    }

}
