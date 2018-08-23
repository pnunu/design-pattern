package pnunu.multithreading.t02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @Author pnunu@git
 * @Date 2017/12/5 21:01
 */
public class TestMain {

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        //创建一个线程池
        ExecutorService executor = Executors.newFixedThreadPool(4);
        // 创建多个有返回值的任务.。 这里使用list是一样的结果
        Map<String, FutureTask<String>> tasks = new HashMap<String, FutureTask<String>>();
        for (int i = 0; i < 5000; i++) {
            MyCallable myCallable = new MyCallable("xxx" + i);
            FutureTask<String> task = new FutureTask<String>(myCallable);
            tasks.put("i" + i, task);
            if (!executor.isShutdown()) {
                executor.submit(task);
            }
        }
        // 关闭线程池
        executor.shutdown();
        // 获取所有并发任务的运行结果
        Set<String> keys = tasks.keySet();
        for (String para : keys) {
            FutureTask<String> futureTask = tasks.get(para);
            String ret = futureTask.get();
            System.out.println(ret);
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
