package com.qa.TheInfiniteTerrainSystem;

import java.util.concurrent.*;

public class Grid {
	private String[][] gameMap = new String[1][1];
	private String[] actions = {"Giant Frog","Swamp","Haunted Shack","Monkey","Shrek","Donkey","Food","Water","Monster","Lake","Adonay"};
	private String treasureMess = "Treasure";
	private int xTreasure = 0;
	private int yTreasure = 0;
	private int xValue = 2;
	private int yValue = 2;
	private int mapSize = 0;
	private int maxSize = 1000;

	public Grid() {
		
		xValue = ThreadLocalRandom.current().nextInt(3, maxSize);
		yValue = ThreadLocalRandom.current().nextInt(3, maxSize);
		mapSize = xValue*yValue;
		gameMap = new String[mapSize][3];
		
		int i = 0;
		int j = 0;
		for(int n = 0; n < mapSize; n++) {
			gameMap[n][0]=Integer.toString(i);
			gameMap[n][1]=Integer.toString(j);
			j++;
			gameMap[n][2] = " ";
			if(n%yValue==yValue-1) {
				i++;
				j=0;
			}
			System.out.println(gameMap[n][0] + " " + gameMap[n][1]);
			
		}
		
		
		xTreasure = ThreadLocalRandom.current().nextInt(1, xValue-1);
		yTreasure = ThreadLocalRandom.current().nextInt(1, yValue-1);
		System.out.println(xValue);
		System.out.println(xTreasure);
		System.out.println(yValue);
		System.out.println(yTreasure);
		setTreasureLocation();
				
		int randomIndex = 0;
		for(int i1 = 0; i1 < mapSize; i1++) {
			if(gameMap[i1][2] != "") {
				randomIndex = ThreadLocalRandom.current().nextInt(1, actions.length);
				gameMap[i1][2] = actions[randomIndex];
			}
		}
		
		System.out.println("This game's map is: "+xValue+"x"+yValue);
		
		
	}
	
	public void setTreasureLocation() {
		
		loop:
		for (int i = 0; i < mapSize-1; i++) {
			if (Integer.toString(xTreasure) == gameMap[i][0]){
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
