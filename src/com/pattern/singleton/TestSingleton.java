package com.pattern.singleton;
/**
 * The class must be only one instance
 * and method getInstance has global dot available
 * 
 * */
public class TestSingleton {
	private static TestSingleton instance;
	
	public static TestSingleton getInstance() {
		if(instance == null) {
			instance = new TestSingleton();
		}
			return instance;
	}
	
	private TestSingleton() {}
	
	public void print() {
		System.out.print(this);
	}
}
