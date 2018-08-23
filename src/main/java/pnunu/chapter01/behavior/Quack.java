package pnunu.chapter01.behavior;

/**
 * 真正的叫的鸭子
 * Created by nunu on 2017/8/6
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("呱呱呱呱【鸭子，不是青蛙】");
    }
}
