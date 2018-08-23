package pnunu.chapter01.behavior;

/**
 * Created by nunu on 2017/8/6
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.print("不会叫");
    }
}
