package com.pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class House {
	
	private List<Object> partsHouse = new ArrayList<Object>();
	
	public void add(Object parts) {
		partsHouse.add(parts);
	}
	
}

