package de.sntr.pushdj.push;

import javax.sound.midi.ShortMessage;

public class ResolutionButton extends Button {


	public static final int RED_MEDIUM_ON = 1;
	public static final int RED_MEDIUM_BLINK_SLOW = 2;
	public static final int RED_MEDIUM_BLINK_FAST = 3;
	public static final int RED_BRIGHT_ON = 4;
	public static final int RED_BRIGHT_BLINK_SLOW = 5;
	public static final int RED_BRIGHT_BLINK_FAST = 6;
	
	public static final int ORANGE_MEDIUM_ON = 7;
	public static final int ORANGE_MEDIUM_BLINK_SLOW = 8;
	public static final int ORANGE_MEDIUM_BLINK_FAST = 9;
	public static final int ORANGE_BRIGHT_ON = 10;
	public static final int ORANGE_BRIGHT_BLINK_SLOW = 11;
	public static final int ORANGE_BRIGHT_BLINK_FAST = 12;

	public static final int PINK_MEDIUM_ON = 13;
	public static final int PINK_MEDIUM_BLINK_SLOW = 14;
	public static final int PINK_MEDIUM_BLINK_FAST = 15;
	public static final int PINK_BRIGHT_ON = 16;
	public static final int PINK_BRIGHT_BLINK_SLOW = 17;
	public static final int PINK_BRIGHT_BLINK_FAST = 18;

	public static final int GREEN_MEDIUM_ON = 19;
	public static final int GREEN_MEDIUM_BLINK_SLOW = 20;
	public static final int GREEN_MEDIUM_BLINK_FAST = 21;
	public static final int GREEN_BRIGHT_ON = 22;
	public static final int GREEN_BRIGHT_BLINK_SLOW = 23;
	public static final int GREEN_BRIGHT_BLINK_FAST = 24;
	
	protected ResolutionButton(int data1) {
		super(ShortMessage.CONTROL_CHANGE, data1);
	}

}
