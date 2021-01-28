package headfirstjava.chapter_13;

import javax.swing.*;

//пример JtextArea
public class Example_4 {
    public static void main(String[] args) {


        JFrame frame = new JFrame();

        JTextArea jTextArea = new JTextArea(10, 20); //10строк, 20 столбцов(ширина)

        JPanel panel = new JPanel();
        panel.add(jTextArea);
        frame.add(panel);

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
