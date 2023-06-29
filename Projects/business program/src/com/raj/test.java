package com.raj;

import javax.swing.*;

public class test {
	private JPanel testpanel;
	private JButton clickButton;

	public static void main(String[] args) {
		JFrame frame = new JFrame("test");
		frame.setContentPane(new test().testpanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
