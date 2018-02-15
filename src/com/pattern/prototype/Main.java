package com.pattern.prototype;

public class Main {
	public static void main(String[] args) {
		Human origin = new Human(25,"Taras");
		System.out.println(origin);
		
		Human copy = (Human) origin.copy();
		System.out.println(copy);
	}
}
