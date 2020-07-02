package com.company;

import javax.swing.*;
import java.awt.*;


public class GUI extends JFrame {
    private JTextField inputField = new JTextField();
    private JLabel answerLabel = new JLabel();

    GUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(600, 200);
        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(3, 2));
        myPanel.add(new JLabel("Исходное число : "));
        myPanel.add(inputField);
        myPanel.add(new JLabel("Ответ : "));
        myPanel.add(answerLabel);
        JButton randomButton = new JButton("рандомное число");
        myPanel.add(randomButton);
        JButton button = new JButton("выполнить");
        myPanel.add(button);
        add(myPanel);
        pack();
        setVisible(true);

        button.addActionListener(e -> answerLabel.setText(Integer.toString(Logic.logic(Integer.parseInt(inputField.getText())))));
        randomButton.addActionListener(e -> inputField.setText(Integer.toString((int) (Math.random() * 1000000000))));
    }
}