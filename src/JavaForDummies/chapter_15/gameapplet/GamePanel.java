package JavaForDummies.chapter_15.gameapplet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

    private static final long serialVersionUID = 1L;
    int randomNumber = new Random().nextInt(10) + 1;
    int numGuesses = 0;
    JTextField textField = new JTextField(5);
    JButton button = new JButton("Сделать попытку");
    JLabel label = new JLabel(numGuesses + " попыток");

    GamePanel() {
        setBackground(Color.WHITE);
        add(textField);
        add(button);
        add(label);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String textFieldText = textField.getText();
        if (Integer.parseInt(textFieldText) == randomNumber) {
            button.setEnabled(false);
            textField.setText(textField.getText() + " Угадал!");
            textField.setEnabled(false);
        } else {
            textField.setText("");
            textField.requestFocus();
        }

        numGuesses++;
        String guessWord = (numGuesses == 1) ? " попытка" : "попыток";
        label.setText(numGuesses + guessWord);
    }
}
