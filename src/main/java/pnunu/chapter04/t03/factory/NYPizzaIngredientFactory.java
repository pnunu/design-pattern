package pnunu.chapter04.t03.factory;

import pnunu.chapter04.t03.material.*;
import pnunu.chapter04.t03.material.cheese.ReggianoCheese;
import pnunu.chapter04.t03.material.clams.FreshClams;
import pnunu.chapter04.t03.material.dough.ThinCrustDough;
import pnunu.chapter04.t03.material.pepperoni.SlicedPepperoni;
import pnunu.chapter04.t03.material.sauce.MarinaraSauce;
import pnunu.chapter04.t03.material.veggies.Garlic;
import pnunu.chapter04.t03.material.veggies.Mushroom;
import pnunu.chapter04.t03.material.veggies.Onion;
import pnunu.chapter04.t03.material.veggies.RedPepper;

/**
 * @Author pnunu@git
 * @Date 2018/3/28 21:43
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    public Clams createClams() {
        return new FreshClams();
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
