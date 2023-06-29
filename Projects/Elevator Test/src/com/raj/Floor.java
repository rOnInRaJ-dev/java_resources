package com.raj;


import java.util.Random;

public class Floor {

	public static void main(String[] args) {
		Random r = new Random();

		int startFloor = r.nextInt(9)+1;
		int curFloor = startFloor;

		int floorRequest = r.nextInt(9)+1;
		System.out.println("Current Floor : " + curFloor +"\tFloor Request : " + floorRequest);

		if (curFloor < floorRequest){

			while (curFloor < floorRequest){
				curFloor ++;
				System.out.println("Moving From Floor : " + curFloor +"\tTo Floor : " + floorRequest);
			}
			System.out.println("You moved from : " + startFloor +"\tTo : " + floorRequest);
		}
		else if (curFloor == floorRequest){
			System.out.println("You moved from : " + startFloor +"\tTo : " + floorRequest);
		}
		else {

			while (curFloor > floorRequest){
				curFloor --;
				System.out.println("Moving From Floor : " + curFloor +"\tTo Floor : " + floorRequest);
			}
			System.out.println("You moved from : " + startFloor +"\tTo : " + floorRequest);
		}
	}
}
