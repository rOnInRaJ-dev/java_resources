package com.raj;

import javax.swing.*;
import java.awt.Canvas;
import java.awt.Dimension;

public class Window extends Canvas {

	private static final long serialVersionUID = -7259108873705494293L;

	public Window (int width, int height, String title, ElevatorMain elevatorMain) {
		JFrame frame = new JFrame(title);

		JPanel panel = new JPanel();
		frame.add(panel);

		frame.setPreferredSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		elevatorMain.setFocusable(true);
		frame.add(elevatorMain);
		frame.setVisible(true);
		elevatorMain.start();
		elevatorMain.requestFocusInWindow();
	}

}
