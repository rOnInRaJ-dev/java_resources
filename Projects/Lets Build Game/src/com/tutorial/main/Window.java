package com.tutorial.main;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Dimension;

public class Window extends Canvas {

	private static final long serialVersionUID = -7259108873705494293L;

	public Window (int width, int height, String title, Game game) {
		JFrame frame = new JFrame(title);

		frame.setPreferredSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		game.setFocusable(true);
		frame.add(game);
		frame.setVisible(true);
		game.start();
		game.requestFocusInWindow();
	}

}
