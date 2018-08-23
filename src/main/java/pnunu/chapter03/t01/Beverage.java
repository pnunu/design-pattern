package pnunu.chapter03.t01;

/**
 * @Author ipnunu@git
 * @Date 2017/11/12 22:50
 */
public abstract class Beverage {
    String description = "Unkown Beverage";
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
