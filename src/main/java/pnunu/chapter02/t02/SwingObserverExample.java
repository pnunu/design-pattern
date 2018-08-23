package pnunu.chapter0201;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by nunu on 2017/8/20
 */
public class SwingObserverExample {
    JFrame frame;
    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }
    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngeListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);
        System.out.println(".................................");
    }
    class AngeListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you might regret it!!!!!");
        }
    }
    class DevilListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, do it......");
        }
    }
}
