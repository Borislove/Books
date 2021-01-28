package headfirstjava.chapter_13;

import javax.swing.*;
import java.awt.*;

//Пример JtextField
public class Example_3 {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        //JTextField field = new JTextField(20);
        JTextField field = new JTextField("Ваше имя");

        JPanel panel = new JPanel();
        panel.add(field);
        frame.add(panel);
        //field.setText("123");
        //System.out.println(field.getText());

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

