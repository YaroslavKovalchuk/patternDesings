package com.pattern.decorator;

public abstract class Decorator extends Component{
	
	protected Component component;
	
	@Override
	public void operation() {
		
		if(component != null) {
			component.operation();
		}
		
	}

	protected Component getComponent() {
		return component;
	}

	protected void setComponent(Component component) {
		this.component = component;
	}
	
	/*public void setComponent(Component component) {
		
	}*/
	
	
	
}
