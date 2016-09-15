package de.sntr.pushdj.push;

import javax.sound.midi.ShortMessage;

public class TitleButton extends Button {

	public static final int MEDIUM_ON = 1;
	public static final int MEDIUM_BLINK_SLOW = 2;
	public static final int MEDIUM_BLINK_FAST = 3;
	public static final int BRIGHT_ON = 4;
	public static final int BRIGHT_BLINK_SLOW = 5;
	public static final int BRIGHT_BLINK_FAST = 6;
	
	
	protected TitleButton(String name, int data1) {
		super(name, ShortMessage.CONTROL_CHANGE, data1);
	}

}
