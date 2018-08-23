package pnunu.chapter04.t02.Chicago;

import pnunu.chapter04.t01.Pizza;
import pnunu.chapter04.t02.PizzaStroe;

/**
 * @Author pnunu@git
 * @Date 2017/12/2 21:32
 */
public class ChicagoStylePizzaStore extends PizzaStroe {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("greek")) {
            pizza = new ChicagoStyleGreekPizza();
        } else if (type.equals("pepperon")) {
            pizza = new ChicagoStylePepperonPizza();
        }
        return pizza;
    }
}
