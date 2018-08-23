package pnunu.chapter01.test;

import pnunu.chapter01.behavior.FlyRocketPowerd;
import pnunu.chapter01.duck.Duck;
import pnunu.chapter01.duck.ModelDuck;

/**
 * Created by nunu on 2017/8/6
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyRocketPowerd());
        modelDuck.performFly();
    }
}
