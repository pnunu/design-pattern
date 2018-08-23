package pnunu.nested;

/**
 * @Author pnunu@git
 * @Date 2018/3/2 17:50
 */
public class C implements A {
    class N implements B {
        @Override
        public void add(int a) {
            System.out.println(a + " =====");
        }
    }
    @Override
    public void add(int a) {
        new N().add(1);
        System.out.println(a);
    }
}
