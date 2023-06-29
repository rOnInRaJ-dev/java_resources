package com.raj;

import java.awt.*;

public class FloorNumberDisplay extends ElevatorObjects {

	public FloorNumberDisplay(float x, float y, ID id, Handler handler) {
		super(x, y, id);
	}

	public Rectangle getBounds() {
		return null;
	}

	public void tick() {

	}

	public void render (Graphics g) {
		Font fnt2 = new Font("arial",1,30);

		//Floor 10
		g.setFont(fnt2);
		g.setColor(Color.BLACK);
		g.drawString("Floor 10",400,60);

		//Floor 09
		g.setFont(fnt2);
		g.setColor(Color.BLACK);
		g.drawString("Floor 09",400,160);

		//Floor 08
		g.setFont(fnt2);
		g.setColor(Color.BLACK);
		g.drawString("Floor 08",400,260);

		//Floor 07
		g.setFont(fnt2);
		g.setColor(Color.BLACK);
		g.drawString("Floor 07",400,360);

		//Floor 06
		g.setFont(fnt2);
		g.setColor(Color.BLACK);
		g.drawString("Floor 06",400,460);

		//Floor 05
		g.setFont(fnt2);
		g.setColor(Color.BLACK);
		g.drawString("Floor 05",400,560);

		//Floor 04
		g.setFont(fnt2);
		g.setColor(Color.BLACK);
		g.drawString("Floor 04",400,660);

		//Floor 03
		g.setFont(fnt2);
		g.setColor(Color.BLACK);
		g.drawString("Floor 03",400,760);

		//Floor 02
		g.setFont(fnt2);
		g.setColor(Color.BLACK);
		g.drawString("Floor 02",400,860);

		//Floor 01
		g.setFont(fnt2);
		g.setColor(Color.BLACK);
		g.drawString("Floor 01",400,960);
	}
}
