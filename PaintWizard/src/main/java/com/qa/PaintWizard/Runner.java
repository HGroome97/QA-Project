package com.qa.PaintWizard;

public class Runner {

	public static void main(String[] args) {
		
		Paint cm = new Paint("CheapoMax",21, 19.99, 10);
		Paint towtd = new Paint("ThatOneWithTheDog", 40, 34.38, 12);
		Paint aj = new Paint("AverageJoes", 15, 17.99, 11);
		Paint dp = new Paint("DuluxourousPaints", 10, 25, 22);
		
		PaintStorage ps = new PaintStorage();
		ps.setPaintList(cm);
		ps.setPaintList(towtd);
		ps.setPaintList(aj);
		ps.setPaintList(dp);
		
		System.out.println(ps.getPaintList());
		
		ps.wastesLeast(10, ps.getPaintList());
	}

}
