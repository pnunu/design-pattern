package pnunu.log4j;

//import org.apache.log4j.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4JMain {

    //    public static Logger log = Logger.getLogger(Log4JMain.class);
    public static Logger log = LoggerFactory.getLogger(Log4JMain.class);

    /**
     * @创建时间： 2016年2月22日
     * @相关参数：
     * @功能描述： 定义一个输出日志的方法
     * <p>
     * trace→debug→info→warn→error→fatal→off
     * 级别依次升高，级别高的level会屏蔽级别低的level。
     * </p>
     */
    public static void logTest() {
        log.trace("trace级别的日志输出");
        log.info("info级别的日志输出");
        log.debug("debug级别的日志输出");
        log.warn("warn级别的日志输出");
        log.error("error级别的日志输出");
        log.info("你好 {} ", "nihao");
//        log.fatal("fatal级别的日志输出");
        try {
            System.out.println(9 / 0);
        } catch (RuntimeException e) {
            log.error(e.getMessage());
        }
    }

    public static void main(String[] args) {
        logTest();
//        log1000Debug();
//        log1000SysOut();
    }

    private static int cout = 100000;

    private static void log1000SysOut() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < cout; i++) {
            System.out.println(" i  .. " + i);
        }
        long end = System.currentTimeMillis();
        System.out.println("sout:" + (end - start));
    }

    private static void log1000Debug() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < cout; i++) {
            log.debug(" i  .. " + i);
        }
        long end = System.currentTimeMillis();
        System.out.println("loger:" + (end - start));
    }

}