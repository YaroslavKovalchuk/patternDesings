package com.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate{
	
	private List item = new ArrayList();

	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	@Override
	public int getCount() {
		return item.size();
	}

	@Override
	public Object getObject(int index) {
		return item.get(index);
	}

	@Override
	public void setObject(Object object) {
		item.add(object);
		
	}
	
}
