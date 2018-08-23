package pnunu.chapter03.t01;

/**
 * @Author ipnunu@git
 * @Date 2017/11/12 23:46
 * @Test Mocha
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DackRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        System.out.println(1.5 + 0.2 + 0.2 + 0.3);
        double d1 = 1.5 + 0.2 + 0.2 + 0.3;
        double d2 = 2.2;
        if ((1.5 + 0.2 + 0.2 + 0.3) == 2.2)
            System.out.println("yes");
        else
            System.out.println("no");

        if ((1.5 + 0.2 + 0.2 + 0.3) == d1)
            System.out.println("yes");
        else
            System.out.println("no");

        if (d2 == d1)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
