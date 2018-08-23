package pnunu.lambda;

import org.junit.Test;

/**
 * @Author pnunu@git
 * @Date 2018/4/2 17:55
 */
public class LambdaMain {
    @Test
    public void test01() {
//        MyLamdba aBlockOfCode = (s)->System.out.println(s);
//        aBlockOfCode.doSomeThing("nihao");
        encat(s -> System.out.println(s), "nihao");
    }
    public static void encat(MyLamdba aBlockOfCode, String s) {
        aBlockOfCode.doSomeThing(s);
    }
}
