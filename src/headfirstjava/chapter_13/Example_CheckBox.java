package headfirstjava.chapter_13;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Example_CheckBox {

    JCheckBox check;

    public void go() {

        JFrame frame = new JFrame();
        check = new JCheckBox("test");

        //check.addItemListener((ItemListener) this);
        check.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ev) {
                String onOrOff = "off";
                if (check.isSelected()) onOrOff = "on";
                System.out.println("Check box is " + onOrOff);
            }
        });

        check.setSelected(false);
        frame.add(check);

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Example_CheckBox().go();
    }


}
