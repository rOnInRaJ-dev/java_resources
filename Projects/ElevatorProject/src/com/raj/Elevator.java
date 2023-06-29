package com.raj;

import java.awt.*;
import java.util.Random;

public class Elevator extends ElevatorObjects {

	private Handler handler;
	private int currentFloor;
	private int curFloor = 0;
	private int requestedFloor;
	private int timer;
	private int timerValue;

	private Random r = new Random();

	Elevator(int x, int y, ID id, Handler handler) {
		super(x, y, id);

		this.handler = handler;

		start();
	}

	void start(){
		if(curFloor == 0) {
			curFloor = r.nextInt(10) + 1;
		}
		assignYCords(curFloor);
		requestedFloor = r.nextInt(10) + 1;
		timerValue = 50;
		timer = 100;
	}
	public Rectangle getBounds() {
		return null;
	}

	private void move(){
		if (curFloor < requestedFloor){
			curFloor ++;
			assignYCords(curFloor);
			if (curFloor == requestedFloor -1){
				timerValue = 100;
			}
		}else if (curFloor > requestedFloor){
			curFloor --;
			assignYCords(curFloor);
			if (curFloor == requestedFloor -1){
				timerValue = 100;
			}
		}else if (curFloor == requestedFloor){
			start();
		}
	}

	public void tick() {
		move();
	}

	private void assignYCords(int curFloor){
		switch (curFloor){
			case 1:
				this.currentFloor = 900;
				break;
			case 2:
				this.currentFloor = 800;
				break;
			case 3:
				this.currentFloor = 700;
				break;
			case 4:
				this.currentFloor = 600;
				break;
			case 5:
				this.currentFloor = 500;
				break;
			case 6:
				this.currentFloor = 400;
				break;
			case 7:
				this.currentFloor = 300;
				break;
			case 8:
				this.currentFloor = 200;
				break;
			case 9:
				this.currentFloor = 100;
				break;
			case 10:
				this.currentFloor = 0;
				break;

		}
	}


	public void render(Graphics g) {
		Font fnt = new Font("Arial",1,20);

		g.setFont(fnt);
		g.setColor(Color.BLACK);
		g.drawString("Current floor :" +Integer.toString(curFloor)+ "Requested floor :" + requestedFloor,1000,100);

		g.setColor(Color.BLUE);
		g.fillRect(220,this.currentFloor,80,100);
	}
}
