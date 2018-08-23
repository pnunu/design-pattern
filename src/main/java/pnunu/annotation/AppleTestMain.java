package pnunu.annotation;

/**
 * @Author pnunu@git
 * @Date 2018/2/26 13:04
 */
public class AppleTestMain {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setAppleColor(FruitColor.Color.GREEN.toString());
        apple.setAppleName("apple");
        apple.displayName();
        System.out.println(apple.getAppleColor());
        System.out.println(apple.getAppleName());
    }
}
