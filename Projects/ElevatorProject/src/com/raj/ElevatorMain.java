package com.raj;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.Random;

public class ElevatorMain extends Canvas implements Runnable {

	public static final int WIDTH = 1920, HEIGHT = 1080;

	private Thread thread;
	private boolean running = false;

	private Random r;
	private Handler handler;
	private FloorLevels floorLevels;

	public ElevatorMain (){
		handler = new Handler();
		floorLevels = new FloorLevels(handler);

		new Window(WIDTH, HEIGHT, "Elevator Project",this);

		handler.addObject(new Elevator(WIDTH/2-32, 250,ID.Elevator, handler));
	}

	public synchronized void start(){
		thread = new Thread(this);
		thread.start();
		running = true;
	}

	public synchronized void stop(){
		try {
			thread.join();
			running = false;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		long lastTime = System.nanoTime();
		double amountOfTicks = 1.0; // "amountofticks" is the number of Frames per Second "F.P.S"
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while (delta >= 1) {
				tick();
				delta--;
			}
			if (running) {
				render();
				frames ++;
			}
			if (System.currentTimeMillis() - timer > 1000){
				timer += 1000;
//				System.out.println("FPS: " + frames);
				frames = 0;
			}
		}
		stop();
	}

	private void tick(){
		handler.tick();
		floorLevels.tick();
	}

	private void render(){
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}

		Graphics g = bs.getDrawGraphics();

		g.setColor(Color.pink);
		g.fillRect(0,0,WIDTH,HEIGHT);

		handler.render(g);

		g.dispose();
		bs.show();
	}

	public static float clamp (float var, float min, float max){
		if (var >= max)
			return var = max;
		else if (var <= min)
			return var = min;
		else
			return var;
	}

	public static void main(String[] args) {
		new ElevatorMain();
	}
}
