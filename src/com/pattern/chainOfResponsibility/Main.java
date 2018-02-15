package com.pattern.chainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		
		Handler h1 = new ConcreteHandler1(); 
		Handler h2 = new ConcreteHandler2();
		
		h1.succesor = h2;
		
		h1.handleRequest(1);
		h1.handleRequest(2);
		
	}

}
