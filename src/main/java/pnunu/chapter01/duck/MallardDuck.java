package pnunu.chapter01.duck;

import pnunu.chapter01.behavior.FlyWithWings;
import pnunu.chapter01.behavior.Quack;

/**
 * Created by nunu on 2017/8/6
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void swim() {

    }

    @Override
    public void display() {
        System.out.println("Mallard [绿头鸭]");
    }
}
