package headfirstjava.chapter_12;

import javax.swing.*;
import java.awt.*;

public class TestMyGradient2 extends JPanel {

    public void paintComponent(Graphics g) {

        Graphics2D q2d = (Graphics2D) g;

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);

        q2d.setPaint(gradient);
        q2d.fillOval(70, 70, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton button = new JButton();
        frame.getContentPane().add(button);

        frame.setSize(300, 300);


        TestMyGradient2 tmg = new TestMyGradient2();
        frame.getContentPane().add(tmg);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}


