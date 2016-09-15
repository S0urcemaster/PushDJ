package de.sntr.pushdj.push;

import java.util.ArrayList;
import java.util.List;

import de.sntr.pushdj.dj.ButtonListener;

public abstract class Button extends Control {

	public static final int OFF = 0;

	protected int color = OFF;

	protected List<ButtonListener> listeners = new ArrayList<>();
	
	protected Button(String name, int command, int data1) {
		super(name, command, data1);
	}

	public void addListener(ButtonListener listener) {
		listeners.add(listener);
	}
	
	public void pressed() {
		for (ButtonListener listener : listeners) {
			listener.buttonPressed(this);
		}
	}
	
	public void released() {
		for (ButtonListener listener : listeners) {
			listener.buttonReleased(this);
		}
	}
	
}
