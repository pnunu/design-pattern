package pnunu.chapter04.t01;

/**
 * @Author pnunu@git
 * @Date 2017/12/2 21:12
 */
public class PizzaStore {
    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }
    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
//
//        pizza.prepare();
//        pizza.bake();
//        pizza.cut();
//        pizza.box();

        return pizza;
    }
}
