package pnunu.chapter02.t01;

/**
 * Created by nunu on 2017/8/20
 */
public interface Subject {
    /** 注册 */
    void registerObserver(Observer o);
    /** 移除 */
    void removeObserver(Observer o);
    /** 通知其他的观察者 */
    void notifyObserver();
}
