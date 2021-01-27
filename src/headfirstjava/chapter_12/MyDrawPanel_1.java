package headfirstjava.chapter_12;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel_1 extends JPanel {

    public void paintComponent(Graphics g) {

        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(70, 70, 100, 100);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        MyDrawPanel_1 md = new MyDrawPanel_1();

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.getContentPane().add(md); //положить рисунок во фрейм
        frame.setVisible(true);
    }
}
