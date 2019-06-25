package learn.t.concurrent.latch;

/*
 * Class: RunHarness
 * Description: TODO
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/25 9:48
 * All rights reserved.
 */
public class RunHarness {
    public static void main(String[] args) {
        TestHarness testHarness = new TestHarness();
        long time = testHarness.timeTasks(10,new HrnessThread());
        System.out.println(time);

    }
}
