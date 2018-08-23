package pnunu.multithreading.t01;

/**
 * @Author pnunu@git
 * @Date 2017/12/5 18:11
 * main
 */
public class MyThreadMain {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();
    }
}
