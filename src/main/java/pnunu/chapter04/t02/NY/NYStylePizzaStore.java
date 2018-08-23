package pnunu.chapter04.t02.NY;

import pnunu.chapter04.t01.Pizza;
import pnunu.chapter04.t02.PizzaStroe;

/**
 * @Author pnunu@git
 * @Date 2017/12/2 21:26
 */
public class NYStylePizzaStore extends PizzaStroe {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("greek")) {
            pizza = new NYStyleGreekPizza();
        } else if (type.equals("pepperon")) {
            pizza = new NYStylePepperonPizza();
        }
        return pizza;
    }
}
