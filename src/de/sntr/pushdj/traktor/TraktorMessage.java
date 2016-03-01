package de.sntr.pushdj.traktor;

import java.util.ArrayList;
import java.util.List;

import de.sntr.pushdj.dj.TraktorMessageListener;

public class TraktorMessage {

	public String name;
	public int command;
	public int channel;
	public int data1;
	public int data2;
	
	public List<TraktorMessageListener> listeners = new ArrayList<>();
	
	public TraktorMessage(String name, int[] values) {
		this.name = name;
		this.command = values[0];
		this.channel = values[1];
		this.data1 = values[2];
		this.data2 = values[3];
	}
	
	public void addListener(TraktorMessageListener l) {
		listeners.add(l);
	}
	
	public void sent() {
		for (TraktorMessageListener l : listeners) {
			l.outSent(this);
		}
	}
}
