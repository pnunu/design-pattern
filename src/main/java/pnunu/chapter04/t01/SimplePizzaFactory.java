package pnunu.chapter04.t01;

/**
 * @Author pnunu@git
 * @Date 2017/12/2 21:05
 * @doc 简单工厂。 把大量的 if - else 先提出来。这样不至于每增加一种 Pizza 都去用到new的地方修改。
 * 这样只需要修改工厂类。
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperon")) {
            pizza = new PepperonPizza();
        }
        return pizza;
    }
}
