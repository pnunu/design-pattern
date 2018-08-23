package pnunu.chapter04.t03.factory;

import pnunu.chapter04.t03.material.*;

/**
 * @Desc
 * @Author pnunu@git
 * @Date 2018/3/28 21:29
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Clams createClams();
    Pepperoni createPepperoni();
}
