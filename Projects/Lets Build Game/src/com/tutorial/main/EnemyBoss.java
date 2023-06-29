package com.tutorial.main;

import java.awt.*;
import java.util.Random;

public class EnemyBoss extends GameObject {

	private Handler handler;
	Random r = new Random();

	private int timer = 50;
	private int timer2 = 50;

	public EnemyBoss(int x, int y, ID id, Handler handler) {
		super(x, y, id);

		this.handler = handler;

		velX = 0;
		velY = 5;
	}

	public Rectangle getBounds() {
		return new Rectangle((int)x,(int)y,96,96);
	}

	public void tick() {
		x +=velX;
		y +=velY;

		timer --;
		if (timer <=0){
			velY = 0;
		} else {
			timer --;
		}

		if (timer <= 0) timer2 --;
		if (timer2 <= 0){
			if (velX == 0) velX = 2;
			if (velX > 0)
				velX += 0.01f;
			else if (velX <0)
				velX -= 0.01f;

			velX = Game.clamp(velX,-10,10);

			int spawn = r.nextInt(10);
			if (spawn == 0) handler.addObject(new EnemyBossBullet((int)x + 48,(int)y + 48,ID.BasicEnemy,handler));
		}

		if (x <= 0 || x >= Game.WIDTH - 100) velX *= -1;
	}

	public void render(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect((int)x,(int)y,96,96);
	}
}
