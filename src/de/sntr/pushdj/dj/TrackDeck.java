package de.sntr.pushdj.dj;

import static de.sntr.pushdj.push.PushAdapter.setColor;
import static de.sntr.pushdj.traktor.TraktorAdapter.send;

import java.util.Timer;

import de.sntr.pushdj.push.MatrixButton;
import de.sntr.pushdj.push.Button;
import de.sntr.pushdj.push.PushAdapter;
import de.sntr.pushdj.push.TitleButton;
import de.sntr.pushdj.traktor.HotcueType;
import de.sntr.pushdj.traktor.TraktorMessage;

public class TrackDeck extends Deck {
	
	static final int jogFineRepeatSpeed = 100;
	static final int jogCoarseRepeatSpeed = 200;
	
	static final int playOn = MatrixButton.GREEN_BRIGHT;
	static final int playOff = MatrixButton.RED_BRIGHT;
	static final int cueOn = MatrixButton.BLUE2_BRIGHT;
	static final int cueOff = MatrixButton.BLUE2_MEDIUM;
	static final int beatjumpFineBackwardOn = MatrixButton.BLUEGREEN_BRIGHT;
	static final int beatjumpFineBackwardOff = MatrixButton.BLUEGREEN_PALE;
	static final int beatjumpFineForwardOn = MatrixButton.BLUEGREEN_BRIGHT;
	static final int beatjumpFineForwardOff = MatrixButton.BLUEGREEN_PALE;
	static final int beatjumpCoarseBackwardOn = MatrixButton.BLUEGREEN_BRIGHT;
	static final int beatjumpCoarseBackwardOff = MatrixButton.BLUEGREEN_DARKPALE;
	static final int beatjumpCoarseForwardOn = MatrixButton.BLUEGREEN_BRIGHT;
	static final int beatjumpCoarseForwardOff = MatrixButton.BLUEGREEN_DARKPALE;
	static final int jogTurnFineOn = MatrixButton.ORANGE1_BRIGHT;
	static final int jogTurnFineOff = MatrixButton.ORANGE1_MEDIUM;
	static final int jogTurnCoarseOn = MatrixButton.ORANGE_BRIGHT;
	static final int jogTurnCoarseOff = MatrixButton.ORANGE_MEDIUM;
	static final int syncOn = MatrixButton.YELLOW2;
	static final int syncOff = MatrixButton.YELLOW_MEDIUM;
	static final int tempoMasterOn = MatrixButton.BLUE3_BRIGHT;
	static final int tempoMasterOff = MatrixButton.BLUE3_MEDIUM;

	static final int[] hotcueColors = new int[7];
	static final int hotcuePlay = MatrixButton.YELLOW2;
	
	static {
		hotcueColors[HotcueType.None.ordinal()] = MatrixButton.YELLOW_DARK;
		hotcueColors[HotcueType.Cue.ordinal()] = MatrixButton.CYAN_MEDIUM;
		hotcueColors[HotcueType.FadeIn.ordinal()] = MatrixButton.ORANGE1_MEDIUM;
		hotcueColors[HotcueType.FadeOut.ordinal()] = MatrixButton.ORANGE1_MEDIUM;
		hotcueColors[HotcueType.Load.ordinal()] = MatrixButton.YELLOW_BRIGHT;
		hotcueColors[HotcueType.Grid.ordinal()] = MatrixButton.BLUE1_PALE;
		hotcueColors[HotcueType.Loop.ordinal()] = MatrixButton.GREEN_MEDIUM;
	}
	
	boolean active = false;

	Button playControl;
	TraktorMessage playMessage;
	TraktorMessage playReturnMessage;
	TraktorMessage pauseMessage;
	
	Button cueControl;
	TraktorMessage cuePressedMessage;
	TraktorMessage cueReleasedMessage;

	Button beatjumpFineBackwardControl;
	TraktorMessage beatjumpFineBackwardPressMessage;
	TraktorMessage beatjumpFineBackwardReleaseMessage;
	TraktorMessage beatjumpFineShiftedBackwardPressMessage;
	TraktorMessage beatjumpFineShiftedBackwardReleaseMessage;
	
	Button beatjumpFineForwardControl;
	TraktorMessage beatjumpFineForwardPressMessage;
	TraktorMessage beatjumpFineShiftedForwardPressMessage;
	TraktorMessage beatjumpFineForwardReleaseMessage;
	TraktorMessage beatjumpFineShiftedForwardReleaseMessage;
	
	Button beatjumpCoarseBackwardControl;
	TraktorMessage beatjumpCoarseBackwardPressMessage;
	TraktorMessage beatjumpCoarseShiftedBackwardPressMessage;
	TraktorMessage beatjumpCoarseBackwardReleaseMessage;
	TraktorMessage beatjumpCoarseShiftedBackwardReleaseMessage;
	
	Button beatjumpCoarseForwardControl;
	TraktorMessage beatjumpCoarseForwardPressMessage;
	TraktorMessage beatjumpCoarseShiftedForwardPressMessage;
	TraktorMessage beatjumpCoarseForwardReleaseMessage;
	TraktorMessage beatjumpCoarseShiftedForwardReleaseMessage;
	
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
	
	Button jogTurnFineForwardControl;
	Button jogTurnFineBackwardControl;
	Button jogTurnCoarseForwardControl;
	Button jogTurnCoarseBackwardControl;
	TraktorMessage jogTurnFineForwardMessage;
	TraktorMessage jogTurnFineBackwardMessage;
	TraktorMessage jogTurnCoarseForwardMessage;
	TraktorMessage jogTurnCoarseBackwardMessage;
	
	Button syncControl;
	TraktorMessage phaseSyncMessage;
	TraktorMessage syncOnMessage;
	TraktorMessage syncOnReturnMessage;
	
	Button tempoMasterControl;
	TraktorMessage tempoMasterMessage;
	TraktorMessage tempoMasterReturnMessage;
	
	boolean playing = false;
	boolean sync = false;
	boolean tempoMaster = false;
	
	DJController djc;
	
	Timer jogTurnFineForwardTimer;
	Timer jogTurnFineBackwardTimer;
	Timer jogTurnCoarseForwardTimer;
	Timer jogTurnCoarseBackwardTimer;
	
	public TrackDeck(DJController djc) {
		this.djc = djc;
	}
	
	void playPause() {
		if(playing) {
			send(pauseMessage);
		}
		else {
			send(playMessage);
		}
	}
	
	/**
	 * In Traktor cue is mapped as "hold". The released message is mapped as data2 = 0
	 * but has no explicit mapping in Traktor.
	 */
	void cuePressed() {
		send(cuePressedMessage);
		if(playing) {
			playing = false;
			setColor(cueControl, cueOff);
			setColor(playControl, playOff);
		} else {
			setColor(cueControl, cueOn);
			setColor(playControl, playOn);
		}
	}
	
	void cueReleased() {
		send(cueReleasedMessage);
		if (!playing) {
			setColor(playControl, playOff);
		}
		setColor(cueControl, cueOff);
	}
	
	void beatjumpFineForwardPressed() {
		send(beatjumpFineForwardPressMessage);
		setColor(beatjumpFineForwardControl, beatjumpFineForwardOn);
	}
	
	/**
	 * For fast repeat; fast repeat not yet implemented
	 */
	void beatjumpFineForwardReleased() {
		send(beatjumpFineForwardReleaseMessage);
		setColor(beatjumpFineForwardControl, beatjumpFineForwardOff);
	}
	
	void beatjumpFineBackwardPressed() {
		send(beatjumpFineBackwardPressMessage);
		setColor(beatjumpFineBackwardControl, beatjumpFineBackwardOn);
	}
	
	void beatjumpFineBackwardReleased() {
		send(beatjumpFineBackwardReleaseMessage);
		setColor(beatjumpFineBackwardControl, beatjumpFineBackwardOff);
	}
	
	void beatjumpCoarseForwardPressed() {
		send(beatjumpCoarseForwardPressMessage);
		setColor(beatjumpCoarseForwardControl, beatjumpCoarseForwardOn);
	}
	
	void beatjumpCoarseForwardReleased() {
		send(beatjumpCoarseForwardReleaseMessage);
		setColor(beatjumpCoarseForwardControl, beatjumpCoarseForwardOff);
	}
	
	void beatjumpCoarseBackwardPressed() {
		send(beatjumpCoarseBackwardPressMessage);
		setColor(beatjumpCoarseBackwardControl, beatjumpCoarseBackwardOn);
	}
	
	void beatjumpCoarseBackwardReleased() {
		send(beatjumpCoarseBackwardReleaseMessage);
		setColor(beatjumpCoarseBackwardControl, beatjumpCoarseBackwardOff);
	}

	void hotcue1Pressed() {
		if(djc.shiftRedDown) {
			send(hotcue1DeleteMessage);
			return;
		}
		send(hotcue1PressedMessage);
		if(playing) {
			setColor(hotcue1Control, hotcuePlay);
		} else {
			setColor(hotcue1Control, hotcuePlay);
			setColor(playControl, playOn);
		}
	}
	void hotcue1Released() {
		send(hotcue1ReleasedMessage);
		if (!playing) {
			setColor(playControl, playOff);
		}
		setColor(hotcue1Control, hotcueColors[hotcue1Type.ordinal()]);
	}

	void hotcue2Pressed() {
		if(djc.shiftRedDown) {
			send(hotcue2DeleteMessage);
			return;
		}
		send(hotcue2PressedMessage);
		if(playing) {
			setColor(hotcue2Control, hotcuePlay);
		} else {
			setColor(hotcue2Control, hotcuePlay);
			setColor(playControl, playOn);
		}
	}
	void hotcue2Released() {
		send(hotcue2ReleasedMessage);
		if (!playing) {
			setColor(playControl, playOff);
		}
		setColor(hotcue2Control, hotcueColors[hotcue2Type.ordinal()]);
	}

	void hotcue3Pressed() {
		if(djc.shiftRedDown) {
			send(hotcue3DeleteMessage);
			return;
		}
		send(hotcue3PressedMessage);
		if(playing) {
			setColor(hotcue3Control, hotcuePlay);
		} else {
			setColor(hotcue3Control, hotcuePlay);
			setColor(playControl, playOn);
		}
	}
	void hotcue3Released() {
		send(hotcue3ReleasedMessage);
		if (!playing) {
			setColor(playControl, playOff);
		}
		setColor(hotcue3Control, hotcueColors[hotcue3Type.ordinal()]);
	}

	void hotcue4Pressed() {
		if(djc.shiftRedDown) {
			send(hotcue4DeleteMessage);
			return;
		}
		send(hotcue4PressedMessage);
		if(playing) {
			setColor(hotcue4Control, hotcuePlay);
		} else {
			setColor(hotcue4Control, hotcuePlay);
			setColor(playControl, playOn);
		}
	}
	void hotcue4Released() {
		send(hotcue4ReleasedMessage);
		if (!playing) {
			setColor(playControl, playOff);
		}
		setColor(hotcue4Control, hotcueColors[hotcue4Type.ordinal()]);
	}

	void hotcue5Pressed() {
		if(djc.shiftRedDown) {
			send(hotcue5DeleteMessage);
			return;
		}
		send(hotcue5PressedMessage);
		if(playing) {
			setColor(hotcue5Control, hotcuePlay);
		} else {
			setColor(hotcue5Control, hotcuePlay);
			setColor(playControl, playOn);
		}
	}
	void hotcue5Released() {
		send(hotcue5ReleasedMessage);
		if (!playing) {
			setColor(playControl, playOff);
		}
		setColor(hotcue5Control, hotcueColors[hotcue5Type.ordinal()]);
	}

	void hotcue6Pressed() {
		if(djc.shiftRedDown) {
			send(hotcue6DeleteMessage);
			return;
		}
		send(hotcue6PressedMessage);
		if(playing) {
			setColor(hotcue6Control, hotcuePlay);
		} else {
			setColor(hotcue6Control, hotcuePlay);
			setColor(playControl, playOn);
		}
	}
	void hotcue6Released() {
		send(hotcue6ReleasedMessage);
		if (!playing) {
			setColor(playControl, playOff);
		}
		setColor(hotcue6Control, hotcueColors[hotcue6Type.ordinal()]);
	}

	void hotcue7Pressed() {
		if(djc.shiftRedDown) {
			send(hotcue7DeleteMessage);
			return;
		}
		send(hotcue7PressedMessage);
		if(playing) {
			setColor(hotcue7Control, hotcuePlay);
		} else {
			setColor(hotcue7Control, hotcuePlay);
			setColor(playControl, playOn);
		}
	}
	void hotcue7Released() {
		send(hotcue7ReleasedMessage);
		if (!playing) {
			setColor(playControl, playOff);
		}
		setColor(hotcue7Control, hotcueColors[hotcue7Type.ordinal()]);
	}

	void hotcue8Pressed() {
		if(djc.shiftRedDown) {
			send(hotcue8DeleteMessage);
			return;
		}
		send(hotcue8PressedMessage);
		if(playing) {
			setColor(hotcue8Control, hotcuePlay);
		} else {
			setColor(hotcue8Control, hotcuePlay);
			setColor(playControl, playOn);
		}
	}
	void hotcue8Released() {
		send(hotcue8ReleasedMessage);
		if (!playing) {
			setColor(playControl, playOff);
		}
		setColor(hotcue8Control, hotcueColors[hotcue8Type.ordinal()]);
	}
	
	void jogTurnFineForwardPressed() {
		jogTurnFineForwardTimer = new Timer(true);
		jogTurnFineForwardTimer.scheduleAtFixedRate(new MessageRepeaterTask(jogTurnFineForwardMessage), 0, 1000/jogFineRepeatSpeed);
		setColor(jogTurnFineForwardControl, jogTurnFineOn);
	}
	
	void jogTurnFineForwardReleased() {
		jogTurnFineForwardTimer.cancel();
		setColor(jogTurnFineForwardControl, jogTurnFineOff);
	}
	
	void jogTurnFineBackwardPressed() {
		jogTurnFineBackwardTimer = new Timer(true);
		jogTurnFineBackwardTimer.scheduleAtFixedRate(new MessageRepeaterTask(jogTurnFineBackwardMessage), 0, 1000/jogFineRepeatSpeed);
		setColor(jogTurnFineBackwardControl, jogTurnFineOn);
	}
	
	void jogTurnFineBackwardReleased() {
		jogTurnFineBackwardTimer.cancel();
		setColor(jogTurnFineBackwardControl, jogTurnFineOff);
	}
	
	void jogTurnCoarseForwardPressed() {
		jogTurnCoarseForwardTimer = new Timer(true);
		jogTurnCoarseForwardTimer.scheduleAtFixedRate(new MessageRepeaterTask(jogTurnCoarseForwardMessage), 0, 1000/jogFineRepeatSpeed);
		setColor(jogTurnCoarseForwardControl, jogTurnCoarseOn);
	}
	
	void jogTurnCoarseForwardReleased() {
		jogTurnCoarseForwardTimer.cancel();
		setColor(jogTurnCoarseForwardControl, jogTurnCoarseOff);
	}
	
	void jogTurnCoarseBackwardPressed() {
		jogTurnCoarseBackwardTimer = new Timer(true);
		jogTurnCoarseBackwardTimer.scheduleAtFixedRate(new MessageRepeaterTask(jogTurnCoarseBackwardMessage), 0, 1000/jogFineRepeatSpeed);
		setColor(jogTurnCoarseBackwardControl, jogTurnCoarseOn);
	}
	
	void jogTurnCoarseBackwardReleased() {
		jogTurnCoarseBackwardTimer.cancel();
		setColor(jogTurnCoarseBackwardControl, jogTurnCoarseOff);
	}
	
	void syncPressed() {
		if(djc.shiftGreenDown) {
			send(syncOnMessage);
		}
		else {
			send(phaseSyncMessage);
		}
	}
	
	void tempoMasterPressed() {
		send(tempoMasterMessage);
	}
	
	
	/**
	 * Will be executed if 'active' is true
	 */
	@Override
	public void buttonPressed(Button control) {
		if(active) {
			if(control == playControl) {
				playPause();
			}
			else if(control == cueControl) {
				cuePressed();
			}
			else if(control == beatjumpCoarseBackwardControl) {
				beatjumpCoarseBackwardPressed();
			}
			else if(control == beatjumpCoarseForwardControl) {
				beatjumpCoarseForwardPressed();
			}
			else if(control == beatjumpFineBackwardControl) {
				beatjumpFineBackwardPressed();
			}
			else if(control == beatjumpFineForwardControl) {
				beatjumpFineForwardPressed();
			}
			else if(control == hotcue1Control) {
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
			else if(control == jogTurnFineForwardControl) {
				jogTurnFineForwardPressed();
			}
			else if(control == jogTurnFineBackwardControl) {
				jogTurnFineBackwardPressed();
			}
			else if(control == jogTurnCoarseForwardControl) {
				jogTurnCoarseForwardPressed();
			}
			else if(control == jogTurnCoarseBackwardControl) {
				jogTurnCoarseBackwardPressed();
			}
			else if(control == syncControl) {
				syncPressed();
			}
			else if(control == tempoMasterControl) {
				tempoMasterPressed();
			}
			
		}
	}

	@Override
	public void buttonReleased(Button control) {
		if(active) {
			if (control == cueControl) {
				cueReleased();
			}
			else if(control == beatjumpCoarseBackwardControl) {
				beatjumpCoarseBackwardReleased();
			}
			else if(control == beatjumpCoarseForwardControl) {
				beatjumpCoarseForwardReleased();
			}
			else if(control == beatjumpFineBackwardControl) {
				beatjumpFineBackwardReleased();
			}
			else if(control == beatjumpFineForwardControl) {
				beatjumpFineForwardReleased();
			}
			else if(control == hotcue1Control) {
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
			else if(control == jogTurnFineForwardControl) {
				jogTurnFineForwardReleased();
			}
			else if(control == jogTurnFineBackwardControl) {
				jogTurnFineBackwardReleased();
			}
			else if(control == jogTurnCoarseForwardControl) {
				jogTurnCoarseForwardReleased();
			}
			else if(control == jogTurnCoarseBackwardControl) {
				jogTurnCoarseBackwardReleased();
			}
		}
	}

	@Override
	public void outSent(TraktorMessage message) {
		if(!active) {
			return;
		}
		if (message == hotcue1TypeReturnMessage) {
			hotcue1Type = HotcueType.values()[message.data2];
			setColor(hotcue1Control, hotcueColors[hotcue1Type.ordinal()]);
		}
		else if(message == hotcue2TypeReturnMessage) {
			hotcue2Type = HotcueType.values()[message.data2];
			setColor(hotcue2Control, hotcueColors[hotcue2Type.ordinal()]);
		}
		else if(message == hotcue3TypeReturnMessage) {
			hotcue3Type = HotcueType.values()[message.data2];
			setColor(hotcue3Control, hotcueColors[hotcue3Type.ordinal()]);
		}
		else if(message == hotcue4TypeReturnMessage) {
			hotcue4Type = HotcueType.values()[message.data2];
			setColor(hotcue4Control, hotcueColors[hotcue4Type.ordinal()]);
		}
		else if(message == hotcue5TypeReturnMessage) {
			hotcue5Type = HotcueType.values()[message.data2];
			setColor(hotcue5Control, hotcueColors[hotcue5Type.ordinal()]);
		}
		else if(message == hotcue6TypeReturnMessage) {
			hotcue6Type = HotcueType.values()[message.data2];
			setColor(hotcue6Control, hotcueColors[hotcue6Type.ordinal()]);
		}
		else if(message == hotcue7TypeReturnMessage) {
			hotcue7Type = HotcueType.values()[message.data2];
			setColor(hotcue7Control, hotcueColors[hotcue7Type.ordinal()]);
		}
		else if(message == hotcue8TypeReturnMessage) {
			hotcue8Type = HotcueType.values()[message.data2];
			setColor(hotcue8Control, hotcueColors[hotcue8Type.ordinal()]);
		}
		else if(message == playReturnMessage) {
			if(message.data2 == 0) {
				playing = false;
				setColor(playControl, playOff);
			}
			else {
				playing = true;
				setColor(playControl, playOn);
			}
		}
		else if(message == syncOnReturnMessage) {
			if(message.data2 == 0) {
				sync = false;
				setColor(syncControl, syncOff);
			}
			else {
				sync = true;
				setColor(syncControl, syncOn);
			}
		}
		else if(message == tempoMasterReturnMessage) {
			if(message.data2 == 0) {
				tempoMaster = false;
				setColor(tempoMasterControl, tempoMasterOff);
			}
			else {
				tempoMaster = true;
				setColor(tempoMasterControl, tempoMasterOn);
			}
		}
	}
	
	@Override
	public void activate() {
		if(active) {
System.out.println("Deck already active");
		}
		active = true;
		if(playing) {
			setColor(playControl, playOn);
		}
		else {
			setColor(playControl, playOff);
		}
		setColor(cueControl, cueOff);
		setColor(beatjumpFineBackwardControl, beatjumpFineBackwardOff);
		setColor(beatjumpFineForwardControl, beatjumpFineForwardOff);
		setColor(beatjumpCoarseBackwardControl, beatjumpCoarseBackwardOff);
		setColor(beatjumpCoarseForwardControl, beatjumpCoarseForwardOff);
		setColor(hotcue1Control, hotcueColors[hotcue1Type.ordinal()]);
		setColor(hotcue2Control, hotcueColors[hotcue2Type.ordinal()]);
		setColor(hotcue3Control, hotcueColors[hotcue3Type.ordinal()]);
		setColor(hotcue4Control, hotcueColors[hotcue4Type.ordinal()]);
		setColor(hotcue5Control, hotcueColors[hotcue5Type.ordinal()]);
		setColor(hotcue6Control, hotcueColors[hotcue6Type.ordinal()]);
		setColor(hotcue7Control, hotcueColors[hotcue7Type.ordinal()]);
		setColor(hotcue8Control, hotcueColors[hotcue8Type.ordinal()]);
		setColor(jogTurnFineForwardControl, jogTurnFineOff);
		setColor(jogTurnFineBackwardControl, jogTurnFineOff);
		setColor(jogTurnCoarseForwardControl, jogTurnCoarseOff);
		setColor(jogTurnCoarseBackwardControl, jogTurnCoarseOff);
		if(sync) {
			setColor(syncControl, syncOn);
		}
		else {
			setColor(syncControl, syncOff);
		}
		if(tempoMaster) {
			setColor(tempoMasterControl, tempoMasterOn);
		}
		else {
			setColor(tempoMasterControl, tempoMasterOff);
		}
		PushAdapter.display.writeOnLine(0, 1, "Move BeatJump");
		PushAdapter.display.writeOnLine(1, 1, "Size 32");
		PushAdapter.display.writeOnLine(2, 1, "Loop Loop");
		PushAdapter.display.update();
	}

	@Override
	public void deactivate() {
		active = false;
	}

	public void setPlayButton(Button control) {
		control.addListener(this);
		playControl = control;
		
	}
	public void setPlayMessage(TraktorMessage playMessage, TraktorMessage pauseMessage, TraktorMessage playReturn) {
		this.playMessage = playMessage;
		this.pauseMessage = pauseMessage;
		playReturn.addListener(this);
		playReturnMessage = playReturn;
		
	}
	public void setCueButton(Button control) {
		control.addListener(this);
		cueControl = control;
	}

	public void setCueMessage(TraktorMessage cuePress, TraktorMessage cueRelease) {
		this.cuePressedMessage = cuePress;
		this.cueReleasedMessage = cueRelease;
		
	}

	public void setBeatjumpCoarseBackwardButton(Button control) {
		control.addListener(this);
		beatjumpCoarseBackwardControl = control;		
	}
	
	public void setBeatjumpCoarseBackwardMessage(TraktorMessage pressMessage, TraktorMessage releaseMessage, TraktorMessage shiftPressMessage, TraktorMessage shiftReleaseMessage) {
		beatjumpCoarseBackwardPressMessage = pressMessage;
		beatjumpCoarseShiftedBackwardPressMessage = shiftPressMessage;
		beatjumpCoarseBackwardReleaseMessage = releaseMessage;
		beatjumpCoarseShiftedBackwardReleaseMessage = shiftReleaseMessage;	
	}
	
	public void setBeatjumpCoarseForwardButton(Button control) {
		control.addListener(this);
		beatjumpCoarseForwardControl = control;		
	}
	
	public void setBeatjumpCoarseForwardMessage(TraktorMessage pressMessage, TraktorMessage releaseMessage, TraktorMessage shiftPressMessage, TraktorMessage shiftReleaseMessage) {
		beatjumpCoarseForwardPressMessage = pressMessage;
		beatjumpCoarseShiftedForwardPressMessage = shiftPressMessage;
		beatjumpCoarseForwardReleaseMessage = releaseMessage;
		beatjumpCoarseShiftedForwardReleaseMessage = shiftReleaseMessage;		
	}
	
	public void setBeatjumpFineBackwardButton(Button control) {
		control.addListener(this);
		beatjumpFineBackwardControl = control;		
	}
	
	public void setBeatjumpFineBackwardMessage(TraktorMessage pressMessage, TraktorMessage releaseMessage, TraktorMessage shiftPressMessage, TraktorMessage shiftReleaseMessage) {
		beatjumpFineBackwardPressMessage = pressMessage;
		beatjumpFineShiftedBackwardPressMessage = shiftPressMessage;
		beatjumpFineBackwardReleaseMessage = releaseMessage;
		beatjumpFineShiftedBackwardReleaseMessage = shiftReleaseMessage;
		
	}
	public void setBeatjumpFineForwardButton(Button control) {
		control.addListener(this);
		beatjumpFineForwardControl = control;
	}

	public void setBeatjumpFineForwardMessage(TraktorMessage pressMessage, TraktorMessage releaseMessage, TraktorMessage shiftPressMessage, TraktorMessage shiftReleaseMessage) {
		beatjumpFineForwardPressMessage = pressMessage;
		beatjumpFineShiftedForwardPressMessage = shiftPressMessage;
		beatjumpFineForwardReleaseMessage = releaseMessage;
		beatjumpFineShiftedForwardReleaseMessage = shiftReleaseMessage;
		
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
	
	public void setJogTurnFineForwardButton(Button control) {
		control.addListener(this);
		jogTurnFineForwardControl = control;
	}

	public void setJogTurnFineForwardMessage(TraktorMessage message) {
		jogTurnFineForwardMessage = message;
	}

	public void setJogTurnFineBackwardButton(Button control) {
		control.addListener(this);
		jogTurnFineBackwardControl = control;
	}

	public void setJogTurnFineBackwardMessage(TraktorMessage message) {
		jogTurnFineBackwardMessage = message;
	}

	public void setJogTurnCoarseForwardButton(Button control) {
		control.addListener(this);
		jogTurnCoarseForwardControl = control;
	}

	public void setJogTurnCoarseForwardMessage(TraktorMessage message) {
		jogTurnCoarseForwardMessage = message;
	}

	public void setJogTurnCoarseBackwardButton(Button control) {
		control.addListener(this);
		jogTurnCoarseBackwardControl = control;
	}

	public void setJogTurnCoarseBackwardMessage(TraktorMessage message) {
		jogTurnCoarseBackwardMessage = message;
	}
	
	public void setSyncButton(Button control) {
		control.addListener(this);
		syncControl = control;
	}
	
	public void setSyncMessage(TraktorMessage syncOnMessage, TraktorMessage phaseSyncMessage, TraktorMessage syncReturnMessage) {
		this.syncOnMessage = syncOnMessage;
		this.phaseSyncMessage = phaseSyncMessage;
		this.syncOnReturnMessage = syncReturnMessage;
		this.syncOnReturnMessage.addListener(this);
	}
	
	public void setTempoMasterButton(Button control) {
		control.addListener(this);
		tempoMasterControl = control;
	}
	
	public void setTempoMasterMessage(TraktorMessage message, TraktorMessage returnMessage) {
		tempoMasterMessage = message;
		tempoMasterReturnMessage = returnMessage;
		tempoMasterReturnMessage.addListener(this);
	}
	
}
