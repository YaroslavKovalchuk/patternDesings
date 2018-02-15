package com.pattern.composite;

public class Main {

	public static void main(String[] args) {
		
		Component root = new Composite("ROOT");
		Component brach1 = new Composite("brach1");
		Component brach2 = new Composite("brach2");
		Component leaf1 = new Leaf("leaf1");
		Component leaf2 = new Leaf("leaf2");
		
		root.add(brach1);
		root.add(brach2);
		brach1.add(leaf1);
		brach2.add(leaf2);
		root.operation();

	}

}
