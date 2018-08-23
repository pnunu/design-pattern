package pnunu.equal;

/**
 * @Author pnunu@git
 * @Date 2018/3/15 14:14
 */
public class TestMain {
    public static void main(String[] args) {
        test01();
        test02();
        test03();
        test04();
        test05();
        test06();
        test07();
        test08();
    }
    private static void test01() {
        int a = 1;
        int b = 1;
        System.out.println(a == b);
    }
    private static void test02() {
        Integer a = 1;
        Integer b = 1;
        System.out.println(a == b);
    }
    private static void test03() {
        Double a = 1.0;
        Double b = 1.0;
        System.out.println(a == b);
    }
    private static void test04() {
        double a = 1;
        double b = 1;
        System.out.println(a == b);
    }
    private static void test05() {
        int a = 1;
        double b = 1;
        System.out.println(a == b);
    }
    private static void test06() {
        String a = "1";
        String b = "1";
        System.out.println(a == b);
    }
    private static void test07() {
        StringBuffer a = new StringBuffer("1");
        StringBuffer b = new StringBuffer("1");
        System.out.println(a == b);
    }
    private static void test08() {
        StringBuilder a = new StringBuilder("1");
        StringBuilder b = new StringBuilder("1");;
        System.out.println(a == b);
    }
}
