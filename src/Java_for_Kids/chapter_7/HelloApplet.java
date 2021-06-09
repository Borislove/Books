package Java_for_Kids.chapter_7;

import javax.swing.*;

public class HelloApplet extends JApplet {
    public void paint(java.awt.Graphics graphics) {
        graphics.drawString("Привет, Мир!", 70, 40);
    }
}
