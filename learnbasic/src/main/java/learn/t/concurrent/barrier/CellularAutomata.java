package learn.t.concurrent.barrier;


import java.util.concurrent.CyclicBarrier;

/*
 * Class: CellularAutomata
 * Description: TODO
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/25 15:03
 * All rights reserved.
 */
public class CellularAutomata {
    private final Board mainBoard;
    private final CyclicBarrier barrier;
    private final Worker[] workers;

    public CellularAutomata(Board mainBoard) {
        this.mainBoard = mainBoard;

        int count = Runtime.getRuntime().availableProcessors();

        this.barrier = new CyclicBarrier(count, new Runnable() {
            @Override
            public void run() {
                mainBoard.commitNewValues();
            }
        });
        this.workers = new Worker[count];
        for(int i=0;i<count;i++)
        {
//            workers[i] = new Worker() {
//            }
        }
    }


}

class Worker implements Runnable{

    private final Board board;

    public Worker(Board board) {
        this.board = board;
    }

    @Override
    public void run() {

    }
}