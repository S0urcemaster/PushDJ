package de.sntr.pushdj.push;

public class Control {

	protected int command;
	protected int data1 = -1;

	protected Control(int command, int data1) {
		this.command = command;
		this.data1 = data1;
	}
	
	public int getData1() {
		return data1;
	}
}
