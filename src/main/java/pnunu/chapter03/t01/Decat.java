package pnunu.chapter03.t01;

/**
 * @Author ipnunu@git
 * @Date 2017/11/12 23:40
 * 猫屎咖啡
 */
public class Decat extends Beverage {
    public Decat() {
        description = "Decat coffee";
    }

    @Override
    public double cost() {
        return 0.01;
    }
}
