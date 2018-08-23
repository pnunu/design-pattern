package pnunu.chapter01.duck;

/**
 * Created by nunu on 2017/8/6
 */
public class ModelDuck extends Duck {
    @Override
    public void swim() {
        System.out.println("swimming");
    }

    @Override
    public void display() {
        System.out.println("model duck");
    }
}
