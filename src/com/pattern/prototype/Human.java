package com.pattern.prototype;

public class Human implements Copyable {

	public Object copy() {
		Human copy = new Human(age,name);
		return copy;
	}
	private int age;
	private String name;
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Human is :" + name + " and has " + age;
	}
	
}
