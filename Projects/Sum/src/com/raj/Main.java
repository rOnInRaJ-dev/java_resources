package com.raj;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("P.O.S");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        placecomponents(panel);

        frame.setVisible(true);

    }

    public static void placecomponents(JPanel panel) {

        panel.setLayout(null);

        JLabel firstNumLabel = new JLabel("Enter First Number");
        firstNumLabel.setBounds(10, 20, 200, 25);
        firstNumLabel.setFont(new java.awt.Font("Arial", 1, 20));
        panel.add(firstNumLabel);

        JTextField firstNumTextField = new JTextField(20);
        firstNumTextField.setBounds(250, 20, 70, 25);
        firstNumTextField.setFont(new java.awt.Font("Arial", 1, 20));
        panel.add(firstNumTextField);

        JLabel secondNumLabel = new JLabel("Enter Second Number");
        secondNumLabel.setBounds(10, 50, 240, 25);
        secondNumLabel.setFont(new java.awt.Font("Arial", 1, 20));
        panel.add(secondNumLabel);

        JTextField secondNumTextField = new JTextField(20);
        secondNumTextField.setBounds(250, 50, 70, 25);
        secondNumTextField.setFont(new java.awt.Font("Arial", 1, 20));
        panel.add(secondNumTextField);

        JLabel sumLabel = new JLabel("The Sum is :");
        sumLabel.setBounds(10, 80, 150, 25);
        sumLabel.setFont(new java.awt.Font("Arial", 1, 20));
        panel.add(sumLabel);

        JLabel answerLabel = new JLabel();
        answerLabel.setBounds(160, 80, 100, 25);
        answerLabel.setFont(new java.awt.Font("Arial", 1, 20));
        panel.add(answerLabel);

        JButton addButton = new JButton("Add");
        addButton.setBounds(80, 110, 100, 25);
        addButton.setFont(new java.awt.Font("Arial", 1, 20));
        panel.add(addButton);
        addButton.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            float a, b, c;
                                            a = Float.parseFloat(firstNumTextField.getText().trim());
                                            b = Float.parseFloat(secondNumTextField.getText().trim());
                                            c = a + b;
                                            answerLabel.setText(Float.toString(c));
                                        }
                                    }
        );

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(180, 110, 100, 25);
        clearButton.setFont(new java.awt.Font("Arial", 1, 20));
        panel.add(clearButton);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumTextField.setText(null);
                secondNumTextField.setText(null);
                answerLabel.setText(null);
            }
        });
    }
}