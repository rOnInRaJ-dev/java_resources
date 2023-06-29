package com.raj;

import com.raj.ElevatorObjects;

import java.util.LinkedList;
import java.awt.*;

public class Handler {

	LinkedList<ElevatorObjects> object = new LinkedList<ElevatorObjects>();

	public void tick(){
		for (int i = 0; i < object.size(); i++) {
			ElevatorObjects tempObject = object.get(i);

			tempObject.tick();
		}
	}

	public void render(Graphics g){
		for (int i = 0; i < object.size(); i++) {
			ElevatorObjects tempObject = object.get(i);

			tempObject.render(g);
		}
	}

	public void addObject(ElevatorObjects object){
		this.object.add(object);
	}
	public void removeObject(ElevatorObjects object){
		this.object.remove(object);
	}
}
