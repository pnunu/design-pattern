package pnunu.chapter03.t01;

/**
 * @Author ipnunu@git
 * @Date 2017/11/12 23:32
 * 星巴克首选咖啡
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
