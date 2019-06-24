package learn.t.concurrent.delegateother;

/*
 * Class: SafePoint
 * Description: TODO
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/21 10:38
 * All rights reserved.
 */
public class SafePoint {
    private int x, y;

    public SafePoint(int[] a) {
        this(a[0], a[1]);
    }

    public SafePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public SafePoint(SafePoint safePoint) {
        this(safePoint.get());
    }

    public synchronized int[] get() {
        return new int[]{this.x, this.y};
    }

    public synchronized void set(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
