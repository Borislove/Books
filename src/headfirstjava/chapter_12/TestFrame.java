package headfirstjava.chapter_12;

import javax.swing.*;

public class TestFrame {
    public static void main(String[] args) {

        //создаем фрейм
        JFrame frame = new JFrame();

        JButton button = new JButton();
        frame.getContentPane().add(button);

        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
