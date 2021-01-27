package headfirstjava.chapter_12;

import javax.swing.*;
import java.awt.*;

//пример внутреннего класса в анимации
public class SimpleAnimation {

    //координаты круга
    int x = 70;
    int y = 70;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel_x = new MyDrawPanel();

        frame.getContentPane().add(drawPanel_x);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        for (int i = 0; i <= 130; i++) {
            x++;
            y++;

            drawPanel_x.repaint();

            try {
                Thread.sleep(30);
            } catch (Exception ex) {
            }

            //EXIT
            if(i ==130){
                System.exit(1);
            }
        }
    }

    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {

            //закрашивает
            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(),this.getHeight());

            //рисует
            g.setColor(Color.green);
            g.fillOval(x, y, 50, 50);
        }
    }
}


