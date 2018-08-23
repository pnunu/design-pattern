package pnunu.chapter04.t02.Chicago;

import pnunu.chapter04.t01.Pizza;

/**
 * @Author pnunu@git
 * @Date 2017/12/2 21:34
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep and Cheese Pizza";
        sauce = "Extra Thick Crust Dough";
        dough = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
