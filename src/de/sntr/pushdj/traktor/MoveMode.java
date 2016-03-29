package de.sntr.pushdj.traktor;

public enum MoveMode {
	
	BeatJump("BeatJump"), Loop("Loop"), LoopIn("Loop In"), LoopOut("Loop Out");
	
	String name;
	
	MoveMode(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
