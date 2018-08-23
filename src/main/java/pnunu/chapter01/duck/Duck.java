package pnunu.chapter01.duck;

import pnunu.chapter01.behavior.FlyBehavior;
import pnunu.chapter01.behavior.QuackBehavior;

/**
 * Created by nunu on 2017/8/6
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    //实现叫的动作
    public void performQuack() {
        quackBehavior.quack();
    }
    //实现飞的动作
    public void performFly() {
        flyBehavior.fly();
    }

    public abstract void swim();
    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
