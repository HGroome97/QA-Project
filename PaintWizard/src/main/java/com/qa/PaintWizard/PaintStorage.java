package com.qa.PaintWizard;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PaintStorage {
	private List<Object> paintList;

	public PaintStorage() {
		paintList = new ArrayList<>();
	}

	public List<Object> getPaintList() {
		return paintList;
	}
	public void setPaintList(Object paint) {
		this.paintList.add(paint);
	}

	public Object wastesLeast(int roomSize, List<Paint> paintList) {
		//List<Paint> tempList = new ArrayList<>();
		List<Paint> tempList = paintList.stream().map(p -> new Paint(p.getName(), 0 , 0 , roomSize%p.getCoverage())).collect(Collectors.toList());
		System.out.println(tempList);
		//paintList = paintList.stream().collect(Collectors.toList());
		
		return 0;
	}

}
