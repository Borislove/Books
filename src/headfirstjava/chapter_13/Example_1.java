package headfirstjava.chapter_13;

import javax.swing.*;
import java.awt.*;

public class Example_1 {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(300, 300);


        JPanel panelA = new JPanel();
        JPanel panelB= new JPanel();

        panelA.add(new JButton("Кнопка 1"));
        panelA.add(new JButton("Кнопка 2"));
        panelA.add(new JButton("Кнопка 3"));

        panelA.add(panelB);

        frame.getContentPane().add(BorderLayout.SOUTH,panelA);
        frame.setVisible(true);
    }
}


