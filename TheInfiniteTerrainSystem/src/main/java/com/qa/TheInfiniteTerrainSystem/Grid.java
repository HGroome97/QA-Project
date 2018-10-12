package com.qa.TheInfiniteTerrainSystem;

import java.util.concurrent.*;

public class Grid {
	private String[][] gameMap = new String[1][1];
	private String[] actions = {"Giant Frog","Swamp","Haunted Shack","Monkey","Shrek","Donkey","Food","Water","Monster","Lake","Adonay"};
	private String treasureMess = "Treasure";
	private int xTreasure = 0;
	private int yTreasure = 0;
	private int xValue = 0;
	private int yValue = 0;
	private int mapSize = 0;
	private int maxSize = 10;

	public Grid() {
		xValue = ThreadLocalRandom.current().nextInt(1, maxSize);
		yValue = ThreadLocalRandom.current().nextInt(1, maxSize);
		mapSize = xValue*yValue;
		gameMap = new String[mapSize][3];
		

		for(int i = 0; i < xValue; i++) {
			for(int j = 0; j < yValue; j++) {
				gameMap[i][0] = Integer.toString(i);
				gameMap[i][1] = Integer.toString(j);
				gameMap[i][2] = "";
				System.out.println(gameMap[i][0] + " " + gameMap[i][1]);
			}
		}
		
		xTreasure = ThreadLocalRandom.current().nextInt(1, maxSize);
		yTreasure = ThreadLocalRandom.current().nextInt(1, maxSize);
		setTreasureLocation();
				
		int randomIndex = 0;
		for(int i = 0; i < mapSize; i++) {
			if(gameMap[i][2] != "") {
				randomIndex = ThreadLocalRandom.current().nextInt(1, actions.length);
				gameMap[i][2] = actions[randomIndex];
			}
		}
		
		System.out.println("This game's map is: "+xValue+"x"+yValue);
		
		
	}
	
	public void setTreasureLocation() {
		
		loop:
		for (int i = 0; i < mapSize; i++) {
			System.out.println("wsd");
			if (xTreasure == Integer.valueOf(gameMap[i][0].trim())){
				System.out.println("sluight");
					if(yTreasure == Integer.valueOf(gameMap[i][1].trim())) {
						gameMap[i][2] = treasureMess;
						System.out.println("treasure at:"+xTreasure+" "+yTreasure);
						break loop;
					}
			}
		}
	}
	public String[][] getGameMap() {
		return gameMap;
	}
	public void setGameMap(String[][] gameMap) {
		this.gameMap = gameMap;
	}
	
	public void distanceToTreasure(int currentX, int currentY) {
		int xSq = (currentX-xTreasure)*(currentX-xTreasure);
		int ySq = (currentY-yTreasure)*(currentY-yTreasure);
		double d = (double) xSq+ySq; 
		System.out.println("Unit distance to treasure: " + Math.sqrt(d));
	}

	public int getXValue() {
		return xValue;
	}
	public int getYValue() {
		return yValue;
	}
	public int getXTreasure() {
		return xTreasure;
	}
	public int getYTreasure() {
		return yTreasure;
	}
	public int getMapSize() {
		return mapSize;
	}
}
