package headfirstjava.chapter_12;

import javax.swing.*;
import java.awt.*;

//рисуем
public class MyImage  extends JPanel{

    public void paintComponent(Graphics g){
        g.setColor(Color.ORANGE);
        g.fillRect(30,30,100,100);
    }

    public static void main(String[] args) {

        JFrame jFrame = new JFrame();

        jFrame.setSize(300,300);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

        MyImage image = new MyImage();
        jFrame.getContentPane().add(image);
    }
}

