package pnunu.chapter01.test;

import pnunu.chapter01.duck.MallardDuck;

/**
 * Created by nunu on 2017/8/6
 */
public class MallardDuckTest {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.swim();
    }
}
