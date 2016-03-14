package de.sntr.pushdj.dj;

import java.util.TimerTask;

import de.sntr.pushdj.traktor.TraktorAdapter;
import de.sntr.pushdj.traktor.TraktorMessage;

public class MessageRepeaterTask extends TimerTask {

	TraktorMessage message;
	
	public MessageRepeaterTask() {
		super();
	}
	
	public MessageRepeaterTask(TraktorMessage message) {
		this();
		this.message = message;
	}
	
	@Override
	public void run() {
		TraktorAdapter.send(message);
		System.out.println("sent");
	}

}
