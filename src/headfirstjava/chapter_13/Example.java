package headfirstjava.chapter_13;

import javax.swing.*;
import java.awt.*;

public class Example {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(300,300);


        JButton button = new JButton("click me");
        frame.getContentPane().add(BorderLayout.EAST, button);

        JCheckBox jCheckBox = new JCheckBox("click");
        frame.getContentPane().add(BorderLayout.SOUTH,jCheckBox);

        frame.setVisible(true);
    }
}
