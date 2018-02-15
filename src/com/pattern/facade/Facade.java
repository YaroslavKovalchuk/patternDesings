package com.pattern.facade;

public class Facade {
	
	private SubSystemOne one = new SubSystemOne();
	private SubSystemTwo two = new SubSystemTwo();
	private SubSystemThree three = new SubSystemThree();
	private SubSytemFour four = new SubSytemFour();
	
	public Facade() {}
	
	public void methodA() {
		one.methodOne();
		two.methodTwo();
	}
	public void methodB() {
		three.methodThree();
		four.methodFour();
	}
	
			

}
