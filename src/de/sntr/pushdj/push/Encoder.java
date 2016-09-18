package de.sntr.pushdj.push;

import java.util.ArrayList;
import java.util.List;


public class Encoder extends Control {

	protected List<EncoderListener> listeners = new ArrayList<>();
	
	public Encoder(String name, int command, int data1) {
		super(name, command, data1);
	}
	
	public void addListener(EncoderListener l) {
		listeners.add(l);
	}

	public void increased() {
		for (EncoderListener l : listeners) {
			l.increased(this);
		}
	}
	
	public void decreased() {
		for (EncoderListener l : listeners) {
			l.decreased(this);
		}
	}

}
