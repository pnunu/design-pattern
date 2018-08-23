package pnunu.chapter04.t02;

import pnunu.chapter04.t01.Pizza;

/**
 * @Author pnunu@git
 * @Date 2017/12/2 21:24
 */
public abstract class PizzaStroe {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
