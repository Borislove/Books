package headfirstjava.chapter_13;

import javax.swing.*;
import java.awt.*;

public class Panel3 {

    public static void main(String[] args) {
        Panel3 gui = new Panel3();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        //  frame.getContentPane().add(BorderLayout.EAST,panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //вертикальное расположение
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button = new JButton("shock me");
        JButton buttonTwo = new JButton("bliss");
        panel.add(button);
        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.EAST, panel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}




