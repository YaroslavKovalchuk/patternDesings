package com.pattern.iterator;

public class Main {

	public static void main(String[] args) {
	
		Aggregate a = new ConcreteAggregate();
		
		a.setObject("Element A");
		a.setObject("Element B");
		a.setObject("Element C");
		
		Iterator i =  a.createIterator();
		
		for(Object o = i.first(); !i.isDone(); o = i.next()) {
			System.out.println(o);
		}

	}

}
