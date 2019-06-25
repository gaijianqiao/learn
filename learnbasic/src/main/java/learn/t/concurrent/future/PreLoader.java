package learn.t.concurrent.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
 * Class: PreLoader
 * Description: TODO
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/25 10:45
 * All rights reserved.
 */
public class PreLoader {
    private final FutureTask<ProductInfo> future = new FutureTask<ProductInfo>(new Callable<ProductInfo>() {
        @Override
        public ProductInfo call() throws Exception {
            return null;
        }
    });

    private final Thread thread = new Thread(future);

    public void start() {
        thread.start();
    }

    public ProductInfo get() throws Exception {
        try {
            return future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new Exception();
        } catch (ExecutionException e) {
            e.printStackTrace();
            throw new Exception();
        }
    }
}
