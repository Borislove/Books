package headfirstjava.chapter_12;

import javax.swing.*;
import java.awt.*;

//Градиент
public class TestMyGradient extends JPanel{

    public void paintComponent (Graphics g){
        Graphics2D q2d = (Graphics2D)g;
        GradientPaint gradient = new GradientPaint(70,70,Color.blue, 150,150,Color.ORANGE);

        q2d.setPaint(gradient);
        q2d.fillOval(70,70,100,100);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton button = new JButton();
        frame.getContentPane().add(button);

        frame.setSize(300,300);


        TestMyGradient tmg = new TestMyGradient();
        frame.getContentPane().add(tmg);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
