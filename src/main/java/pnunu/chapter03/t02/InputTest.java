package pnunu.chapter03.t02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Author pnunu@git
 * @Date 2017/11/26 23:19
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(new FileInputStream(("D:\\chapter03test.txt"))));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
