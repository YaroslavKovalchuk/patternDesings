package com.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class ControlUnit {

	private List<Command> commands = new ArrayList();
	
	private int current = 0;
	
	public void executeCommand() {
		commands.get(current).execute();
		current++;
	}
	
	public void storeCommand(Command command) {
		commands.add(command);
	}
	
	public void Redo(int levels) {

	for(int i = 0; i < levels;i++) {
		if(current>0) {
			commands.get(--current).unExecute();
		}
	}

}
	
	public void undo(int levels) {
		
		for(int i = 0; i < levels;i++) {
			if(current < commands.size()-1) {
				commands.get(--current).unExecute();
			}
		}
		
	}
}
