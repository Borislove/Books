package headfirstjava.chapter_13;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

//пример Jlidy
public class Example_Jlist {


    public void go() {
        String[] listEntries = {"alpha", "beta", "gamma", "delta", "epsilon", "zeta", "eta", "theta"};
        JList list = new JList(listEntries);

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        //list = new JList();

        //scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        //scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        panel.add(list);
        frame.add(panel);
        JScrollPane scroller = new JScrollPane(list);
        panel.add(scroller);

        list.setVisibleRowCount(4); //кол-во строк для прокрутки
        list.addListSelectionListener(new ListSelectionListener() {
                                          public void valueChanged(ListSelectionEvent lse) {
                                              if (!lse.getValueIsAdjusting()) {
                                                  String selection = (String) list.getSelectedValue();
                                                  System.out.println(selection);
                                              }
                                          }
                                      }
        );

        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new Example_Jlist().go();
    }
}
