package pnunu.chapter03.t01;

import pnunu.chapter03.t01.Beverage;

/**
 * @Author ipnunu@git
 * @Date 2017/11/12 23:29
 * 浓缩咖啡
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
