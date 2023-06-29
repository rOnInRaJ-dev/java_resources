package com.tutorial.main;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Menu extends MouseAdapter {

	private Game game;
	private Handler handler;
	private Random r = new Random();

	public Menu(Game game, Handler handler){
		this.game = game;
		this.handler = handler;
	}

	public void mousePressed (MouseEvent e){
		int mx = e.getX();
		int my = e.getY();

		//Play Button
		if (mouseOver(mx,my,Game.WIDTH / 2 - 100,100,200,64)){
			game.gameState = Game.STATE.Game;
			handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32,ID.Player, handler));
			handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
		}

		//Help Button
		if (mouseOver(mx,my,Game.WIDTH / 2 - 100,200,200,64)){
			game.gameState = Game.STATE.Help;
		}

		//Back In Help Button
		if (game.gameState == Game.STATE.Help){
			if (mouseOver(mx,my,50,30,100,32)){
				game.gameState = Game.STATE.Menu;
				return;
			}
		}

		//Quit Button
		if (mouseOver(mx,my,Game.WIDTH / 2 - 100,300,200,64)){
			System.exit(1);
		}
	}

	public void mouseReleased(MouseEvent e){

	}

	private boolean mouseOver(int mx, int my, int x, int y, int width, int height){
		if (mx > x && mx < x + width){
			if (my > y && my < y + height){
				return true;
			}else return false;
		}else return false;
	}

	public void tick(){

	}

	public void render (Graphics g){
		if (game.gameState == Game.STATE.Menu){
			Font fnt = new Font("arial",1,50);
			Font fnt2 = new Font("arial",1,30);

			g.setFont(fnt);
			g.setColor(Color.WHITE);
			g.drawString("Menu", Game.WIDTH / 2 - 70,50);

			g.setFont(fnt2);
			g.drawRect(Game.WIDTH / 2 - 100,100,200,64);
			g.drawString("Play",Game.WIDTH / 2 - 35,140);

			g.drawRect(Game.WIDTH / 2 - 100,200,200,64);
			g.drawString("Help",Game.WIDTH / 2 - 35,240);

			g.drawRect(Game.WIDTH / 2 - 100,300,200,64);
			g.drawString("Quit",Game.WIDTH / 2 - 35,340);
		} else if (game.gameState == Game.STATE.Help){
			Font fnt = new Font("arial",1,50);
			Font fnt2 = new Font("arial",1,20);

			g.setFont(fnt);
			g.setColor(Color.WHITE);
			g.drawString("Help ", Game.WIDTH / 2 - 70,50);

			g.setFont(fnt2);
			g.drawRect(50,30,100,32);
			g.drawString("Back",70,53);


			g.drawString("Use WASD keys to move the player and \ndodge enemies.",80,200);

		}
	}
}
