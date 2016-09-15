package de.sntr.pushdj.push;

public class Control {

	protected String name;
	protected int command;
	protected int data1 = -1;

	protected Control(String name, int command, int data1) {
		this.name = name;
		this.command = command;
		this.data1 = data1;
	}
	
	public int getData1() {
		return data1;
	}
}
