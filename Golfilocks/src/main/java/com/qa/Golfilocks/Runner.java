package com.qa.Golfilocks;

public class Runner {

	public static void main(String[] args) {

		int[][] seat = { { 297, 90, 54 }, { 66, 110, 78 }, { 257, 113, 98 }, { 276, 191, 12 }, { 280, 129, 22 },
				{ 219, 163, 12 }, { 254, 193, 45 }, { 86, 153, 65 }, { 206, 107, 71 }, { 71, 137, 87 }, { 94, 40, 98 },
				{ 238, 127, 45 }, { 52, 146, 98 }, { 129, 197, 10 }, { 144, 59, 100 }, { 157, 124, 12 },
				{ 210, 59, 54 }, { 110, 54, 98 }, { 268, 119, 87 }, { 261, 121, 32 }, { 12, 189, 65 }, { 186, 108, 97 },
				{ 174, 21, 64 }, { 112, 18, 31 }, { 54, 90, 54 }, { 174, 52, 65 }, { 16, 129, 87 }, { 59, 181, 98 },
				{ 290, 123, 65 }, { 248, 132, 21 } };
		int[] constraints = { 100, 120, 70 };

		chairPorridge(constraints, seat);

	}

	public static void chairPorridge(int[] constraints, int[][] seat) {
		int i;
		for (i = 0; i < seat.length; i++) {
			if (constraints[0] < seat[i][0] && constraints[1] > seat[i][1] && constraints[2] < seat[i][2])
				System.out.println(i + 1);
		}

	}

}
