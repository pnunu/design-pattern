package pnunu.multithreading.t02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * @Author pnunu@git
 * @Date 2017/12/5 18:11
 */
public class MyCallable implements Callable<String> {
    public static Logger log = LoggerFactory.getLogger(MyCallable.class);
    private String taskNum;

    public MyCallable(String taskNum) {
        this.taskNum = taskNum;
    }

    public String call() throws Exception {
        log.info(">>>" + taskNum + "任务启动");
        Date dateTmp1 = new Date();
//        Thread.sleep(1000);
        Date dateTmp2 = new Date();
        long time = dateTmp2.getTime() - dateTmp1.getTime();
        log.info(">>>" + taskNum + "任务终止");
        return taskNum + "任务返回运行结果,当前任务时间【" + time + "毫秒】";
    }
}
