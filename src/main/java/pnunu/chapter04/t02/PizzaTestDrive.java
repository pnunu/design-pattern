package pnunu.chapter04.t02;

import pnunu.chapter04.t01.Pizza;
import pnunu.chapter04.t02.Chicago.ChicagoStylePizzaStore;
import pnunu.chapter04.t02.NY.NYStylePizzaStore;

/**
 * @Author pnunu@git
 * @Date 2017/12/2 22:05
 * 测试类
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStroe nyStore = new NYStylePizzaStore();
        PizzaStroe chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("=== JPN orderd a " + pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("=== WP order a " + pizza.getName());
    }
}
