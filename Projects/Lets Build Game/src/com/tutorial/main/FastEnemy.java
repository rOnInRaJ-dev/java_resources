package com.tutorial.main;

import java.awt.*;

public class FastEnemy extends GameObject {

	private Handler handler;

	public FastEnemy(int x, int y, ID id, Handler handler) {
		super(x, y, id);

		this.handler = handler;

		velX = 2;
		velY = 9;
	}

	public Rectangle getBounds() {
		return new Rectangle((int)x,(int)y,16,16);
	}

	public void tick() {
		x +=velX;
		y +=velY;

		if (y <= 0 || y >= Game.HEIGHT - 54) velY *= -1;
		if (x <= 0 || x >= Game.WIDTH - 20) velX *= -1;

		handler.addObject(new Trail(x,y,ID.Trail, Color.CYAN,16,16,0.02f, handler));
	}

	public void render(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect((int)x,(int)y,16,16);
	}
}