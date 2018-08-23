package pnunu.chapter03.t01;

/**
 * @Author ipnunu@git
 * @Date 2017/11/12 23:53
 * Whip
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .30 + beverage.cost();
    }
}
