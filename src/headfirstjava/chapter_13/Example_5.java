package headfirstjava.chapter_13;

import javax.swing.*;

//пример Scroll
public class Example_5 {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JTextArea text = new JTextArea(10,20);

        JPanel panel = new JPanel();
        panel.add(text);
        //frame.add(panel);
        //frame.getContentPane().add(panel);
        frame.setContentPane(panel);

        //полоса прокрутки
        JScrollPane scroller = new JScrollPane(text);
        text.setLineWrap(true); //перенос текста
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scroller);

        text.setText("Не все потерявшиеся - бродяги");
       // text.append("Кнопка нажата");
        text.selectAll(); //выделяем текст в поле
        //text.requestFocus();


        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}
