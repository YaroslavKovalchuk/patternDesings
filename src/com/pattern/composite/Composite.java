package com.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
	
	List<Component> nodes = new ArrayList();
	
	public Composite(String name) {
		super(name);
	}

	@Override
	public void operation() {
		System.out.println(name);
		for(Component comp:nodes) {
			comp.operation();
		}
		
	}

	@Override
	public void add(Component component) {
		nodes.add(component);		
	}

	@Override
	public void remove(Component component) {
		nodes.remove(component);
		
	}

	@Override
	public Component getChild(int index) {
		return nodes.get(index);
		
	}

}
