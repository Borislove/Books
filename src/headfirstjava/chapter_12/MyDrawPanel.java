package headfirstjava.chapter_12;

import javax.swing.*;
import java.awt.*;

final class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g){
        g.setColor(Color.ORANGE);
        g.fillRect(20,50,100,100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MyDrawPanel md = new MyDrawPanel();
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(md); //положить рисунок во фрейм
        frame.setVisible(true);
    }
}
