package Java_for_Kids.chapter_6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorEngine implements ActionListener {

    Calculator parent; // ссылка на Calculator

    // Конструктор сохраняет ссылку на окно калькулятора
    // в переменной класса “parent”
    CalculatorEngine(Calculator parent) {
        this.parent = parent;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // Если этот метод можно оставить пустым, ничего не
        // произойдет, когда JVM вызовет его

        /*JOptionPane.showConfirmDialog(null,
                "Something happened...", "Just a test",
                JOptionPane.PLAIN_MESSAGE);*/


        // Получаем источник события
       /* JButton clickedButton= (JButton)e.getSource();
        // Получаем надпись на кнопке
        String clickedButtonLabel = clickedButton.getText();
        // Добавляем надпись на кнопке к тексту окна сообщения
        JOptionPane.showConfirmDialog(null,"You pressed " +
                        clickedButtonLabel,
                "Just a test", JOptionPane.PLAIN_MESSAGE);*/
//---------------------------------------------------------------------------------


     /*   JTextField myDisplayField=null;
        JButton clickedButton= null;
        Object eventSource = e.getSource();
        if (eventSource instanceof JButton){
            clickedButton = (JButton) eventSource;
        }else if (eventSource instanceof JTextField){
            myDisplayField = (JTextField)eventSource;
        }*/
//---------------------------------------------------------------------------------

        // Получить источник текущего действия
        JButton clickedButton = (JButton) e.getSource();
        // Получить текущий текст из поля вывода (“дисплея”)
        // калькулятора
        String dispFieldText = parent.displayField.getText();
        // Получить надпись на кнопке
        String clickedButtonLabel = clickedButton.getText();
        parent.displayField.setText(dispFieldText +
                clickedButtonLabel);
    }
}

