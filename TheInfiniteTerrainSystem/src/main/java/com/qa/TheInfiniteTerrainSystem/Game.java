package com.qa.TheInfiniteTerrainSystem;

import java.util.Scanner;
import java.util.concurrent.*;

public class Game {
	private Scanner scanner;
	private String[][] gameMap = new String[1][1];
		
	private int[] currentPosition = new int[2];

	private Grid grid = new Grid();
	
	public Game() {
		int randomX;
		int randomY;
		loop: for (int i = 0; i < 100; i++) {
			randomX = ThreadLocalRandom.current().nextInt(0, grid.getXValue());
			randomY = ThreadLocalRandom.current().nextInt(0, grid.getYValue());
			if (randomX != grid.getXTreasure() && randomY != grid.getYTreasure()) {
				currentPosition[0] = randomX;
				currentPosition[1] = randomY;
				break loop;
			}
		}
		gameMap = new String[grid.getMapSize()][3];
		gameMap = grid.getGameMap();
		moveInput();
	}

	public void moveInput() {
		scanner = new Scanner(System.in);
		System.out.println("Current Position: x: " + currentPosition[0] + ", y: " + currentPosition[1]);
		grid.distanceToTreasure(currentPosition[0], currentPosition[1]);
		System.out.print("Enter your next move:");
		String move = scanner.nextLine();
		move(move);
	}

	public void move(String moveInput) {
		switch (moveInput.trim().toLowerCase()) {
		case "north":
			if(currentPosition[0]!=0) {
				currentPosition[0]--;
				break;
			}
		case "south":
			if(currentPosition[0]!=grid.getYValue()) {
				currentPosition[0]++;
				break;
			}
		case "west":
			if(currentPosition[1]!=0) {
				currentPosition[1]--;
				break;
			}
		case "east":
			if(currentPosition[1]!=0) {
				currentPosition[1]++;
				break;
			}
		default:
			System.out.println("Invalid Move");
			break;
		}
		updateDetails();
	}

	public void updateDetails() {
		for(int i = 0; i < grid.getXValue(); i++) {
			for(int j = 0; j < grid.getYValue(); j++) {
				System.out.println(Integer.valueOf(gameMap[i][0].trim()) + " " + Integer.valueOf(gameMap[i][1].trim()));
			}
		}
		
		for (int i = 0; i < grid.getMapSize(); i++) {
			if (currentPosition[0] == Integer.valueOf(gameMap[i][0].trim())){
					if(currentPosition[1] == Integer.valueOf(gameMap[i][1].trim())) {
						System.out.println(gameMap[i][2]);
					}
			}
		}
		moveInput();
	}

}
