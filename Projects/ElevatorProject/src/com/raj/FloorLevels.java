package com.raj;

import java.awt.*;
import java.util.Random;

public class FloorLevels {

	private Handler handler;
	private FloorNumberDisplay floorNumberDisplay;

	public FloorLevels(Handler handler) {
		this.handler = handler;
	}

	public void tick() {
		handler.addObject(new Floors(200, 500,ID.Floors, handler));
		handler.addObject(new FloorNumberDisplay(2500,90,ID.FloorNumberDisplay,handler));
	}
}