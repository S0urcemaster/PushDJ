package de.sntr.pushdj.dj;

import static de.sntr.pushdj.push.PushAdapter.setColor;
import static de.sntr.pushdj.traktor.TraktorAdapter.send;


import de.sntr.pushdj.dj.Deck.Colors;
import de.sntr.pushdj.push.MatrixBlink;
import de.sntr.pushdj.push.MatrixButton;
import de.sntr.pushdj.push.Button;
import de.sntr.pushdj.push.TitleButton;
import de.sntr.pushdj.traktor.HotcueType;
import de.sntr.pushdj.traktor.TraktorMessage;

public final class TrackDeck extends Deck {
	
	static class Colors extends Deck.Colors {
		static final int[] hotcueColors = new int[7];
		static final int hotcuePlay = MatrixButton.YELLOW2;
	}
	
	static {
		Colors.hotcueColors[HotcueType.None.ordinal()] = MatrixButton.YELLOW_MEDIUM;
		Colors.hotcueColors[HotcueType.Cue.ordinal()] = MatrixButton.CYAN_PALE1;
		Colors.hotcueColors[HotcueType.FadeIn.ordinal()] = MatrixButton.ORANGE1_MEDIUM;
		Colors.hotcueColors[HotcueType.FadeOut.ordinal()] = MatrixButton.ORANGE1_MEDIUM;
		Colors.hotcueColors[HotcueType.Load.ordinal()] = MatrixButton.YELLOW_BRIGHT;
		Colors.hotcueColors[HotcueType.Grid.ordinal()] = MatrixButton.YELLOW_WHITE1;
		Colors.hotcueColors[HotcueType.Loop.ordinal()] = MatrixButton.GREEN_MEDIUM;
	}
	

	Button hotcue1Control;
	TraktorMessage hotcue1PressedMessage;
	TraktorMessage hotcue1ReleasedMessage;
	TraktorMessage hotcue1DeleteMessage;
	TraktorMessage hotcue1TypeReturnMessage;

	Button hotcue2Control;
	TraktorMessage hotcue2PressedMessage;
	TraktorMessage hotcue2ReleasedMessage;
	TraktorMessage hotcue2DeleteMessage;
	TraktorMessage hotcue2TypeReturnMessage;

	Button hotcue3Control;
	TraktorMessage hotcue3PressedMessage;
	TraktorMessage hotcue3ReleasedMessage;
	TraktorMessage hotcue3DeleteMessage;
	TraktorMessage hotcue3TypeReturnMessage;

	Button hotcue4Control;
	TraktorMessage hotcue4PressedMessage;
	TraktorMessage hotcue4ReleasedMessage;
	TraktorMessage hotcue4DeleteMessage;
	TraktorMessage hotcue4TypeReturnMessage;

	Button hotcue5Control;
	TraktorMessage hotcue5PressedMessage;
	TraktorMessage hotcue5ReleasedMessage;
	TraktorMessage hotcue5DeleteMessage;
	TraktorMessage hotcue5TypeReturnMessage;

	Button hotcue6Control;
	TraktorMessage hotcue6PressedMessage;
	TraktorMessage hotcue6ReleasedMessage;
	TraktorMessage hotcue6DeleteMessage;
	TraktorMessage hotcue6TypeReturnMessage;

	Button hotcue7Control;
	TraktorMessage hotcue7PressedMessage;
	TraktorMessage hotcue7ReleasedMessage;
	TraktorMessage hotcue7DeleteMessage;
	TraktorMessage hotcue7TypeReturnMessage;

	Button hotcue8Control;
	TraktorMessage hotcue8PressedMessage;
	TraktorMessage hotcue8ReleasedMessage;
	TraktorMessage hotcue8DeleteMessage;
	TraktorMessage hotcue8TypeReturnMessage;
	
	HotcueType hotcue1Type = HotcueType.None;
	HotcueType hotcue2Type = HotcueType.None;
	HotcueType hotcue3Type = HotcueType.None;
	HotcueType hotcue4Type = HotcueType.None;
	HotcueType hotcue5Type = HotcueType.None;
	HotcueType hotcue6Type = HotcueType.None;
	HotcueType hotcue7Type = HotcueType.None;
	HotcueType hotcue8Type = HotcueType.None;
	
	
	public TrackDeck(DJController djc) {
		super(djc);
	}

	
	@Override
	public void activate() {
		super.activate();
		setColor(hotcue1Control, Colors.hotcueColors[hotcue1Type.ordinal()]);
		setColor(hotcue2Control, Colors.hotcueColors[hotcue2Type.ordinal()]);
		setColor(hotcue3Control, Colors.hotcueColors[hotcue3Type.ordinal()]);
		setColor(hotcue4Control, Colors.hotcueColors[hotcue4Type.ordinal()]);
		setColor(hotcue5Control, Colors.hotcueColors[hotcue5Type.ordinal()]);
		setColor(hotcue6Control, Colors.hotcueColors[hotcue6Type.ordinal()]);
		setColor(hotcue7Control, Colors.hotcueColors[hotcue7Type.ordinal()]);
		setColor(hotcue8Control, Colors.hotcueColors[hotcue8Type.ordinal()]);
	}


	void hotcue1Pressed() {
		if(djc.shiftRedDown) {
			send(hotcue1DeleteMessage);
			return;
		}
		send(hotcue1PressedMessage);
		if(playing) {
			setColor(hotcue1Control, Colors.hotcuePlay);
		} else {
			cuePlaying = true;
			setColor(hotcue1Control, Colors.hotcuePlay);
			setColor(playControl, Colors.playOn);
			setColor(syncPlayControl, Colors.syncPlayOn);
		}
	}
	void hotcue1Released() {
		cuePlaying = false;
		send(hotcue1ReleasedMessage);
		if (!playing) {
			setColor(playControl, Colors.playOff);
			setColor(syncPlayControl, Colors.syncPlayOff);
		}
		setColor(hotcue1Control, Colors.hotcueColors[hotcue1Type.ordinal()]);
	}

	void hotcue2Pressed() {
		if(djc.shiftRedDown) {
			send(hotcue2DeleteMessage);
			return;
		}
		send(hotcue2PressedMessage);
		if(playing) {
			setColor(hotcue2Control, Colors.hotcuePlay);
		} else {
			cuePlaying = true;
			setColor(hotcue2Control, Colors.hotcuePlay);
			setColor(playControl, Colors.playOn);
			setColor(syncPlayControl, Colors.syncPlayOn);
		}
	}
	void hotcue2Released() {
		cuePlaying = false;
		send(hotcue2ReleasedMessage);
		if (!playing) {
			setColor(playControl, Colors.playOff);
			setColor(syncPlayControl, Colors.syncPlayOff);
		}
		setColor(hotcue2Control, Colors.hotcueColors[hotcue2Type.ordinal()]);
	}

	void hotcue3Pressed() {
		if(djc.shiftRedDown) {
			send(hotcue3DeleteMessage);
			return;
		}
		send(hotcue3PressedMessage);
		if(playing) {
			setColor(hotcue3Control, Colors.hotcuePlay);
		} else {
			cuePlaying = true;
			setColor(hotcue3Control, Colors.hotcuePlay);
			setColor(playControl, Colors.playOn);
			setColor(syncPlayControl, Colors.syncPlayOn);
		}
	}
	
	void hotcue3Released() {
		cuePlaying = false;
		send(hotcue3ReleasedMessage);
		if (!playing) {
			setColor(playControl, Colors.playOff);
			setColor(syncPlayControl, Colors.syncPlayOff);
		}
		setColor(hotcue3Control, Colors.hotcueColors[hotcue3Type.ordinal()]);
	}

	void hotcue4Pressed() {
		if(djc.shiftRedDown) {
			send(hotcue4DeleteMessage);
			return;
		}
		send(hotcue4PressedMessage);
		if(playing) {
			setColor(hotcue4Control, Colors.hotcuePlay);
		} else {
			cuePlaying = true;
			setColor(hotcue4Control, Colors.hotcuePlay);
			setColor(playControl, Colors.playOn);
			setColor(syncPlayControl, Colors.syncPlayOn);
		}
	}
	void hotcue4Released() {
		cuePlaying = false;
		send(hotcue4ReleasedMessage);
		if (!playing) {
			setColor(playControl, Colors.playOff);
			setColor(syncPlayControl, Colors.syncPlayOff);
		}
		setColor(hotcue4Control, Colors.hotcueColors[hotcue4Type.ordinal()]);
	}

	void hotcue5Pressed() {
		if(djc.shiftRedDown) {
			send(hotcue5DeleteMessage);
			return;
		}
		send(hotcue5PressedMessage);
		if(playing) {
			setColor(hotcue5Control, Colors.hotcuePlay);
		} else {
			cuePlaying = true;
			setColor(hotcue5Control, Colors.hotcuePlay);
			setColor(playControl, Colors.playOn);
			setColor(syncPlayControl, Colors.syncPlayOn);
		}
	}
	void hotcue5Released() {
		cuePlaying = false;
		send(hotcue5ReleasedMessage);
		if (!playing) {
			setColor(playControl, Colors.playOff);
			setColor(syncPlayControl, Colors.syncPlayOff);
		}
		setColor(hotcue5Control, Colors.hotcueColors[hotcue5Type.ordinal()]);
	}

	void hotcue6Pressed() {
		if(djc.shiftRedDown) {
			send(hotcue6DeleteMessage);
			return;
		}
		send(hotcue6PressedMessage);
		if(playing) {
			setColor(hotcue6Control, Colors.hotcuePlay);
		} else {
			cuePlaying = true;
			setColor(hotcue6Control, Colors.hotcuePlay);
			setColor(playControl, Colors.playOn);
			setColor(syncPlayControl, Colors.syncPlayOn);
		}
	}
	void hotcue6Released() {
		cuePlaying = false;
		send(hotcue6ReleasedMessage);
		if (!playing) {
			setColor(playControl, Colors.playOff);
			setColor(syncPlayControl, Colors.syncPlayOff);
		}
		setColor(hotcue6Control, Colors.hotcueColors[hotcue6Type.ordinal()]);
	}

	void hotcue7Pressed() {
		if(djc.shiftRedDown) {
			send(hotcue7DeleteMessage);
			return;
		}
		send(hotcue7PressedMessage);
		if(playing) {
			setColor(hotcue7Control, Colors.hotcuePlay);
		} else {
			cuePlaying = true;
			setColor(hotcue7Control, Colors.hotcuePlay);
			setColor(playControl, Colors.playOn);
			setColor(syncPlayControl, Colors.syncPlayOn);
		}
	}
	void hotcue7Released() {
		cuePlaying = false;
		send(hotcue7ReleasedMessage);
		if (!playing) {
			setColor(playControl, Colors.playOff);
			setColor(syncPlayControl, Colors.syncPlayOff);
		}
		setColor(hotcue7Control, Colors.hotcueColors[hotcue7Type.ordinal()]);
	}

	void hotcue8Pressed() {
		if(djc.shiftRedDown) {
			send(hotcue8DeleteMessage);
			return;
		}
		send(hotcue8PressedMessage);
		if(playing) {
			setColor(hotcue8Control, Colors.hotcuePlay);
		} else {
			cuePlaying = true;
			setColor(hotcue8Control, Colors.hotcuePlay);
			setColor(playControl, Colors.playOn);
			setColor(syncPlayControl, Colors.syncPlayOn);
		}
	}
	void hotcue8Released() {
		cuePlaying = false;
		send(hotcue8ReleasedMessage);
		if (!playing) {
			setColor(playControl, Colors.playOff);
			setColor(syncPlayControl, Colors.syncPlayOff);
		}
		setColor(hotcue8Control, Colors.hotcueColors[hotcue8Type.ordinal()]);
	}
	

	@Override
	public void buttonPressed(Button control) {
		super.buttonPressed(control);
		if(active) {
			if(control == hotcue1Control) {
				hotcue1Pressed();
			}
			else if(control == hotcue2Control) {
				hotcue2Pressed();
			}
			else if(control == hotcue3Control) {
				hotcue3Pressed();
			}
			else if(control == hotcue4Control) {
				hotcue4Pressed();
			}
			else if(control == hotcue5Control) {
				hotcue5Pressed();
			}
			else if(control == hotcue6Control) {
				hotcue6Pressed();
			}
			else if(control == hotcue7Control) {
				hotcue7Pressed();
			}
			else if(control == hotcue8Control) {
				hotcue8Pressed();
			}
		}
	}

	@Override
	public void buttonReleased(Button control) {
		super.buttonReleased(control);
		if(active) {
			if(control == hotcue1Control) {
				hotcue1Released();
			}
			else if(control == hotcue2Control) {
				hotcue2Released();
			}
			else if(control == hotcue3Control) {
				hotcue3Released();
			}
			else if(control == hotcue4Control) {
				hotcue4Released();
			}
			else if(control == hotcue5Control) {
				hotcue5Released();
			}
			else if(control == hotcue6Control) {
				hotcue6Released();
			}
			else if(control == hotcue7Control) {
				hotcue7Released();
			}
			else if(control == hotcue8Control) {
				hotcue8Released();
			}
		}
	}

	@Override
	public void traktorMessageSent(TraktorMessage message) {
		if(!active) {
			return;
		}
		super.traktorMessageSent(message);
		if (message == hotcue1TypeReturnMessage) {
			hotcue1Type = HotcueType.values()[message.data2];
			setColor(hotcue1Control, Colors.hotcueColors[hotcue1Type.ordinal()]);
		}
		else if(message == hotcue2TypeReturnMessage) {
			hotcue2Type = HotcueType.values()[message.data2];
			setColor(hotcue2Control, Colors.hotcueColors[hotcue2Type.ordinal()]);
		}
		else if(message == hotcue3TypeReturnMessage) {
			hotcue3Type = HotcueType.values()[message.data2];
			setColor(hotcue3Control, Colors.hotcueColors[hotcue3Type.ordinal()]);
		}
		else if(message == hotcue4TypeReturnMessage) {
			hotcue4Type = HotcueType.values()[message.data2];
			setColor(hotcue4Control, Colors.hotcueColors[hotcue4Type.ordinal()]);
		}
		else if(message == hotcue5TypeReturnMessage) {
			hotcue5Type = HotcueType.values()[message.data2];
			setColor(hotcue5Control, Colors.hotcueColors[hotcue5Type.ordinal()]);
		}
		else if(message == hotcue6TypeReturnMessage) {
			hotcue6Type = HotcueType.values()[message.data2];
			setColor(hotcue6Control, Colors.hotcueColors[hotcue6Type.ordinal()]);
		}
		else if(message == hotcue7TypeReturnMessage) {
			hotcue7Type = HotcueType.values()[message.data2];
			setColor(hotcue7Control, Colors.hotcueColors[hotcue7Type.ordinal()]);
		}
		else if(message == hotcue8TypeReturnMessage) {
			hotcue8Type = HotcueType.values()[message.data2];
			setColor(hotcue8Control, Colors.hotcueColors[hotcue8Type.ordinal()]);
		}
	}
	
	public void setHotcue1Button(Button control) {
		control.addListener(this);
		hotcue1Control = control;
	}

	public void setHotcue1Message(TraktorMessage press, TraktorMessage release, TraktorMessage delete, TraktorMessage typeReturn) {
		hotcue1PressedMessage = press;
		hotcue1ReleasedMessage = release;
		hotcue1DeleteMessage = delete;
		typeReturn.addListener(this);
		hotcue1TypeReturnMessage = typeReturn;
	}

	public void setHotcue2Button(Button control) {
		control.addListener(this);
		hotcue2Control = control;
	}

	public void setHotcue2Message(TraktorMessage press, TraktorMessage release, TraktorMessage delete, TraktorMessage typeReturn) {
		hotcue2PressedMessage = press;
		hotcue2ReleasedMessage = release;
		hotcue2DeleteMessage = delete;
		typeReturn.addListener(this);
		hotcue2TypeReturnMessage = typeReturn;
	}

	public void setHotcue3Button(Button control) {
		control.addListener(this);
		hotcue3Control = control;
	}

	public void setHotcue3Message(TraktorMessage press, TraktorMessage release, TraktorMessage delete, TraktorMessage typeReturn) {
		hotcue3PressedMessage = press;
		hotcue3ReleasedMessage = release;
		hotcue3DeleteMessage = delete;
		typeReturn.addListener(this);
		hotcue3TypeReturnMessage = typeReturn;
	}

	public void setHotcue4Button(Button control) {
		control.addListener(this);
		hotcue4Control = control;
	}

	public void setHotcue4Message(TraktorMessage press, TraktorMessage release, TraktorMessage delete, TraktorMessage typeReturn) {
		hotcue4PressedMessage = press;
		hotcue4ReleasedMessage = release;
		hotcue4DeleteMessage = delete;
		typeReturn.addListener(this);
		hotcue4TypeReturnMessage = typeReturn;
	}

	public void setHotcue5Button(Button control) {
		control.addListener(this);
		hotcue5Control = control;
	}

	public void setHotcue5Message(TraktorMessage press, TraktorMessage release, TraktorMessage delete, TraktorMessage typeReturn) {
		hotcue5PressedMessage = press;
		hotcue5ReleasedMessage = release;
		hotcue5DeleteMessage = delete;
		typeReturn.addListener(this);
		hotcue5TypeReturnMessage = typeReturn;
	}

	public void setHotcue6Button(Button control) {
		control.addListener(this);
		hotcue6Control = control;
	}

	public void setHotcue6Message(TraktorMessage press, TraktorMessage release, TraktorMessage delete, TraktorMessage typeReturn) {
		hotcue6PressedMessage = press;
		hotcue6ReleasedMessage = release;
		hotcue6DeleteMessage = delete;
		typeReturn.addListener(this);
		hotcue6TypeReturnMessage = typeReturn;
	}

	public void setHotcue7Button(Button control) {
		control.addListener(this);
		hotcue7Control = control;
	}

	public void setHotcue7Message(TraktorMessage press, TraktorMessage release, TraktorMessage delete, TraktorMessage typeReturn) {
		hotcue7PressedMessage = press;
		hotcue7ReleasedMessage = release;
		hotcue7DeleteMessage = delete;
		typeReturn.addListener(this);
		hotcue7TypeReturnMessage = typeReturn;
	}

	public void setHotcue8Button(Button control) {
		control.addListener(this);
		hotcue8Control = control;
	}

	public void setHotcue8Message(TraktorMessage press, TraktorMessage release, TraktorMessage delete, TraktorMessage typeReturn) {
		hotcue8PressedMessage = press;
		hotcue8ReleasedMessage = release;
		hotcue8DeleteMessage = delete;
		typeReturn.addListener(this);
		hotcue8TypeReturnMessage = typeReturn;
	}
	
}
