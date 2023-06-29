package com.tutorial.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

	private Handler handler;
	private boolean [] keyDown = new boolean [4];

	public KeyInput(Handler handler) {
		this.handler = handler;

		keyDown [0] = false;
		keyDown [1] = false;
		keyDown [2] = false;
		keyDown [3] = false;
	}

	public void keyPressed (KeyEvent e){
		int key = e.getKeyCode();

		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);

			if (tempObject.getId() == ID.Player){
				// Key events for Player 1
				if (key == KeyEvent.VK_W) { tempObject.setvelY(-5); keyDown[0] = true; }	//GO UP
				if (key == KeyEvent.VK_S) { tempObject.setvelY(5); keyDown[1] = true; } 	//GO DOWN
				if (key == KeyEvent.VK_D) { tempObject.setvelX(5); keyDown[2] = true; }		//GO RIGHT
				if (key == KeyEvent.VK_A) { tempObject.setvelX(-5); keyDown[3] = true; }	//GO LEFT
			}
		}

		if (key == KeyEvent.VK_ESCAPE) System.exit(1);
	}

	public void keyReleased (KeyEvent e){
		int key = e.getKeyCode();

		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);

			if (tempObject.getId() == ID.Player){
				// Key events for Player 1

				if (key == KeyEvent.VK_W) keyDown[0] = false;
				if (key == KeyEvent.VK_S) keyDown[1] = false;
				if (key == KeyEvent.VK_D) keyDown[2] = false;
				if (key == KeyEvent.VK_A) keyDown[3] = false;

				//Vertical Movement
				if(!keyDown[0] && !keyDown[1]) tempObject.setvelY(0);
				//Horizontal Movement
				if(!keyDown[2] && !keyDown[3]) tempObject.setvelX(0);
			}
		}
	}

}
