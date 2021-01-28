package headfirstjava.chapter_13;

import javax.swing.*;
import java.awt.*;

public class Button1 {
    public static void main(String[] args) {
        Button1 gui = new Button1();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();

        //1
        /*JButton button = new JButton("click me click me click me"); //займет ширину
        frame.getContentPane().add(BorderLayout.EAST, button);*/

        //2
        /*JButton button = new JButton("click me click me click me"); //займет ширину
        frame.getContentPane().add(BorderLayout.NORTH, button);*/

        JButton button = new JButton("Click This!"); //займет ширину
        Font bigFont = new Font("serif",Font.BOLD,28);
        button.setFont(bigFont);
        frame.getContentPane().add(BorderLayout.NORTH, button);

        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
