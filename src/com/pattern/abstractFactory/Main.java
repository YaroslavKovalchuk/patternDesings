package com.pattern.abstractFactory;

public class Main {

	public static void main(String[] args) {
		
		Client cocaCola = new Client(new CocaColaFactory());
		Client pepsiCola = new Client(new PepsiColaFactory());
	}

}
