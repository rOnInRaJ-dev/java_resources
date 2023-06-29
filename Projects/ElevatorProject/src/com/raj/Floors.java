package com.raj;

import java.awt.*;

public class Floors extends ElevatorObjects {

	private Handler handler;

	public Floors(int x, int y, ID id, Handler handler) {
		super(x, y, id);

		this.handler = handler;

	}

	public Rectangle getBounds() {
		return new Rectangle((int)x,(int)y,16,16);
	}

	public void tick() {

	}

	public void render(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawLine(300,0,920,0);
		g.drawLine(300,100,920,100);
		g.drawLine(300,200,920,200);
		g.drawLine(300,300,920,300);
		g.drawLine(300,400,920,400);
		g.drawLine(300,500,920,500);
		g.drawLine(300,600,920,600);
		g.drawLine(300,700,920,700);
		g.drawLine(300,800,920,800);
		g.drawLine(300,900,920,900);
		g.drawLine(300,1000,1920,1000);
		g.drawLine(320,1020,1920,1020);
	}
}
