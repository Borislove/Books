package headfirstjava.chapter_13;

import javax.swing.*;
import java.awt.*;

public class Panel2 {
    public static void main(String[] args) {
        Panel2 gui = new Panel2();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        //  frame.getContentPane().add(BorderLayout.EAST,panel);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JButton button = new JButton("shock me");
        JButton buttonTwo = new JButton("bliss");
        panel.add(button);
        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.EAST,panel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}


