package com.pattern.composite;

public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
	}
	
	@Override
	public void operation() {
		System.out.println(name);
	}

	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Component getChild(int index) {
		return null;
		
	}
	
	
	
}
