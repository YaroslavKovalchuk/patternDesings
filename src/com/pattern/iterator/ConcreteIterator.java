package com.pattern.iterator;

public class ConcreteIterator extends Iterator{
	
	private Aggregate aggregate;
	
	private int current = 0;
	
	public ConcreteIterator(ConcreteAggregate concreteAggregate) {
		this.aggregate = concreteAggregate;
	}

	@Override
	public Object currentItem() {
		return aggregate.getObject(current);
	}

	@Override
	public Object first() {
		
		return aggregate.getObject(0);
	}

	@Override
	public boolean isDone() {
		if(current < aggregate.getCount()) {
			return false;
		}else
			current = 0;
		return true;
	}

	@Override
	public Object next() {
		
		if(current++ < aggregate.getCount() - 1) {
			return aggregate.getObject(current);
		}else return null;
	}
	
	

}
