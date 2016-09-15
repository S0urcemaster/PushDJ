package de.sntr.pushdj.dj;

import static de.sntr.pushdj.push.PushAdapter.setColor;
import static de.sntr.pushdj.traktor.TraktorAdapter.send;

import java.util.Timer;

import de.sntr.pushdj.dj.TrackDeck.Colors;
import de.sntr.pushdj.push.Button;
import de.sntr.pushdj.push.MatrixBlink;
import de.sntr.pushdj.push.MatrixButton;
import de.sntr.pushdj.push.TitleButton;
import de.sntr.pushdj.traktor.StepSize;
import de.sntr.pushdj.traktor.TraktorMessage;


public abstract class Deck extends ButtonGroup {

	static final int jogFineRepeatSpeed = 100;
	static final int jogCoarseRepeatSpeed = 200;
	
	static class Colors {
		static final int playOn = MatrixButton.GREEN_BRIGHT;
		static final int playOff = MatrixButton.RED_BRIGHT;
		static final int cueOn = MatrixButton.BLUE2_BRIGHT;
		static final int cueOff = MatrixButton.BLUE2_MEDIUM;
		static final int moveMode = TitleButton.BRIGHT_ON;
		static final int moveOn = MatrixButton.BLUE2_BRIGHT;
		static final int moveOff = MatrixButton.BLUE2_PALE;
		static final int moveSizeOn = MatrixButton.BLUE3_BRIGHT;
		static final int moveSizeOff = MatrixButton.BLUE3_PALE;
		static final int loopActiveOn = MatrixButton.BLUEGREEN_BRIGHT;
		static final int loopActiveOff = MatrixButton.BLUEGREEN_DARK;
		static final int loopSizeOn = MatrixButton.BLUEGREEN_BRIGHT;
		static final int loopSizeOff = MatrixButton.BLUEGREEN_MEDIUM;
		static final int loopInOutOn = MatrixButton.BLUEGREEN_BRIGHT;
		static final int loopInOutOff = MatrixButton.BLUEGREEN_PALE;
		static final int loopInMoveOff = MatrixButton.VIOLET_MEDIUM1;
		static final int loopInMoveOn = MatrixButton.VIOLET_BRIGHT;
		static final int loopOutMoveOff = MatrixButton.VIOLET_MEDIUM1;
		static final int loopOutMoveOn = MatrixButton.VIOLET_BRIGHT;
		static final int loopMoveOff = MatrixButton.VIOLET_DARK2;
		static final int loopMoveOn = MatrixButton.VIOLET_MEDIUM2;
		static final int loopSelectSetOff = MatrixButton.GREEN_DARK;
		static final int loopSelectSetBackwardOff = MatrixButton.GREEN_DARK1;
		static final int jogTurnFineOn = MatrixButton.ORANGE1_BRIGHT;
		static final int jogTurnFineOff = MatrixButton.ORANGE1_MEDIUM;
		static final int jogTurnCoarseOn = MatrixButton.ORANGE_BRIGHT;
		static final int jogTurnCoarseOff = MatrixButton.ORANGE_MEDIUM;
		static final int syncOn = MatrixButton.YELLOW2;
		static final int syncOff = MatrixButton.YELLOW_MEDIUM;
		static final int tempoMasterOn = MatrixButton.BLUE3_BRIGHT;
		static final int tempoMasterOff = MatrixButton.BLUE3_MEDIUM;

	}
	
	boolean active = false;
	int displayColumn = -1;

	Button playControl;
	TraktorMessage playMessage;
	TraktorMessage playReturnMessage;
	TraktorMessage pauseMessage;
	
	Button syncPlayControl;
	//macro message
	
	Button cueControl;
	TraktorMessage cuePressMessage;
	TraktorMessage cueReleaseMessage;

	Button cupControl;
	TraktorMessage cupPressMessage;
	TraktorMessage cupReleaseMessage;

	Button phaseSyncControl;
	TraktorMessage phaseSyncMessage;
	TraktorMessage tempoSyncMessage;
	
	Button syncOnOffControl;
	TraktorMessage syncOnOffMessage;
	TraktorMessage syncOnOffReturnMessage;
	
	Button tempoMasterControl;
	TraktorMessage tempoMasterMessage;
	TraktorMessage tempoMasterReturnMessage;
	
	Button fluxOnOffControl;
	TraktorMessage fluxOnOffMessage;
	TraktorMessage fluxOnOffReturnMessage;
	
	Button beatJumpBackwardControl;
	TraktorMessage beatJumpBackwardPressMessage;
	TraktorMessage beatJumpBackwardReleaseMessage;
	
	Button beatJumpForwardControl;
	TraktorMessage beatJumpForwardPressMessage;
	TraktorMessage beatJumpForwardReleaseMessage;
	
	Button loopOnOffControl;
	TraktorMessage loopOnOffMessage;
	TraktorMessage loopOnOffReturnMessage;
	
	Button stepi32Control;
	Button stepi16Control;
	Button stepi8Control;
	Button stepi4Control;
	Button stepi2Control;
	Button stepi1Control;

	TraktorMessage loopSizeSelectSetf32Message;
	TraktorMessage loopSizeSelectSetf16Message;
	TraktorMessage loopSizeSelectSetf8Message;
	TraktorMessage loopSizeSelectSetf4Message;
	TraktorMessage loopSizeSelectSetf2Message;
	TraktorMessage loopSizeSelectSeti1Message;
	TraktorMessage loopSizeSelectSeti2Message;
	TraktorMessage loopSizeSelectSeti4Message;
	TraktorMessage loopSizeSelectSeti8Message;
	TraktorMessage loopSizeSelectSeti16Message;
	TraktorMessage loopSizeSelectSeti32Message;
	
	TraktorMessage loopSizeSelectSetBackwardf32Message;
	TraktorMessage loopSizeSelectSetBackwardf16Message;
	TraktorMessage loopSizeSelectSetBackwardf8Message;
	TraktorMessage loopSizeSelectSetBackwardf4Message;
	TraktorMessage loopSizeSelectSetBackwardf2Message;
	TraktorMessage loopSizeSelectSetBackwardi1Message;
	TraktorMessage loopSizeSelectSetBackwardi2Message;
	TraktorMessage loopSizeSelectSetBackwardi4Message;
	TraktorMessage loopSizeSelectSetBackwardi8Message;
	TraktorMessage loopSizeSelectSetBackwardi16Message;
	TraktorMessage loopSizeSelectSetBackwardi32Message;

	Button loopMoveIncControl;
	TraktorMessage loopMoveIncMessage;
	
	Button loopMoveDecControl;
	TraktorMessage loopMoveDecMessage;
	
	Button loopInMoveIncControl;
	TraktorMessage loopInMoveIncMessage;

	Button loopInMoveDecControl;
	TraktorMessage loopInMoveDecMessage;

	Button loopOutMoveIncControl;
	TraktorMessage loopOutMoveIncMessage;

	Button loopOutMoveDecControl;
	TraktorMessage loopOutMoveDecMessage;
	
	Button loopSelectSetControl;
	Button loopSelectSetBackwardControl;

	Button jogTurnFineForwardControl;
	Button jogTurnFineBackwardControl;
	Button jogTurnCoarseForwardControl;
	Button jogTurnCoarseBackwardControl;
	TraktorMessage jogTurnFineForwardMessage;
	TraktorMessage jogTurnFineBackwardMessage;
	TraktorMessage jogTurnCoarseForwardMessage;
	TraktorMessage jogTurnCoarseBackwardMessage;
	
	boolean playing = false;
	boolean sync = false;
	boolean tempoMaster = false;
	boolean loopActive = false;
	

	DJController djc;
	
	Timer jogTurnFineForwardTimer;
	Timer jogTurnFineBackwardTimer;
	Timer jogTurnCoarseForwardTimer;
	Timer jogTurnCoarseBackwardTimer;
	
	MatrixBlink loopActiveBlink;
	
	StepSize stepSize = null;
	
	
	protected Deck(DJController djc) {
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
		send(cuePressMessage);
		if(playing) {
			playing = false;
			setColor(cueControl, Colors.cueOff);
			setColor(playControl, Colors.playOff);
		} else {
			setColor(cueControl, Colors.cueOn);
			setColor(playControl, Colors.playOn);
		}
	}
	
	void cueReleased() {
		send(cueReleaseMessage);
		if (!playing) {
			setColor(playControl, Colors.playOff);
		}
		setColor(cueControl, Colors.cueOff);
	}
	
	void stepi32ButtonPressed() {
		if(!djc.shiftGreenDown) {
			stepSize = StepSize.i32;
		}
		else {
			stepSize = StepSize.f32;
		}
	}
	
	void stepi16ButtonPressed() {
		if(!djc.shiftGreenDown) {
			stepSize = StepSize.i16;
		}
		else {
			stepSize = StepSize.f16;
		}
	}
	
	void stepi8ButtonPressed() {
		if(!djc.shiftGreenDown) {
			stepSize = StepSize.i8;
		}
		else {
			stepSize = StepSize.f8;
		}
	}
	
	void stepi4ButtonPressed() {
		if(!djc.shiftGreenDown) {
			stepSize = StepSize.i4;
		}
		else {
			stepSize = StepSize.f4;
		}
	}
	
	void stepi2ButtonPressed() {
		if(!djc.shiftGreenDown) {
			stepSize = StepSize.i2;
		}
		else {
			stepSize = StepSize.f2;
		}
	}
	
	void stepi1ButtonPressed() {
		stepSize = StepSize.i1;
	}
	

	void beatJumpForwardPressed() {
		send(beatJumpForwardPressMessage);
		setColor(beatJumpForwardControl, Colors.moveOn);
	}
	
	void beatJumpForwardReleased() {
		send(beatJumpForwardReleaseMessage);
		setColor(beatJumpForwardControl, Colors.moveOff);
	}
	
	void beatJumpBackwardPressed() {
		send(beatJumpBackwardPressMessage);
		setColor(beatJumpBackwardControl, Colors.moveOn);
	}
	
	void beatJumpBackwardReleased() {
		send(beatJumpBackwardReleaseMessage);
		setColor(beatJumpBackwardControl, Colors.moveOff);
	}

	void loopOnOffToggle() {
		send(loopOnOffMessage);
	}


	void loopMoveIncPressed() {
		send(loopMoveIncMessage);
	}

	void loopMoveDecPressed() {
		send(loopMoveIncMessage);
	}

	void loopInMoveIncPressed() {
		send(loopInMoveIncMessage);
	}

	void loopInMoveDecPressed() {
		send(loopInMoveIncMessage);
	}

	void loopOutMoveIncPressed() {
		send(loopOutMoveIncMessage);
	}

	void loopOutMoveDecPressed() {
		send(loopOutMoveIncMessage);
	}

	void loopSizeSelectSetPressed() {
		switch (stepSize) {
		case f32:
			send(loopSizeSelectSetf32Message);
			break;
		case f16:
			send(loopSizeSelectSetf16Message);
			break;
		case f8:
			send(loopSizeSelectSetf8Message);
			break;
		case f4:
			send(loopSizeSelectSetf4Message);
			break;
		case f2:
			send(loopSizeSelectSetf2Message);
			break;
		case i32:
			send(loopSizeSelectSeti32Message);
			break;
		case i16:
			send(loopSizeSelectSeti16Message);
			break;
		case i8:
			send(loopSizeSelectSeti8Message);
			break;
		case i4:
			send(loopSizeSelectSeti4Message);
			break;
		case i2:
			send(loopSizeSelectSeti2Message);
			break;
		case i1:
			send(loopSizeSelectSeti1Message);
			break;
		default:
			break;
		}
	}
	
	void loopSizeSelectSetBackwardPressed() {
		switch (stepSize) {
		case f32:
			send(loopSizeSelectSetBackwardf32Message);
			break;
		case f16:
			send(loopSizeSelectSetBackwardf16Message);
			break;
		case f8:
			send(loopSizeSelectSetBackwardf8Message);
			break;
		case f4:
			send(loopSizeSelectSetBackwardf4Message);
			break;
		case f2:
			send(loopSizeSelectSetBackwardf2Message);
			break;
		case i32:
			send(loopSizeSelectSetBackwardi32Message);
			break;
		case i16:
			send(loopSizeSelectSetBackwardi16Message);
			break;
		case i8:
			send(loopSizeSelectSetBackwardi8Message);
			break;
		case i4:
			send(loopSizeSelectSetBackwardi4Message);
			break;
		case i2:
			send(loopSizeSelectSetBackwardi2Message);
			break;
		case i1:
			send(loopSizeSelectSetBackwardi1Message);
			break;
		default:
			break;
		}
	}


	void jogTurnFineForwardPressed() {
		jogTurnFineForwardTimer = new Timer(true);
		jogTurnFineForwardTimer.scheduleAtFixedRate(new MessageRepeaterTask(jogTurnFineForwardMessage), 0, 1000/jogFineRepeatSpeed);
		setColor(jogTurnFineForwardControl, Colors.jogTurnFineOn);
	}
	
	void jogTurnFineForwardReleased() {
		jogTurnFineForwardTimer.cancel();
		setColor(jogTurnFineForwardControl, Colors.jogTurnFineOff);
	}
	
	void jogTurnFineBackwardPressed() {
		jogTurnFineBackwardTimer = new Timer(true);
		jogTurnFineBackwardTimer.scheduleAtFixedRate(new MessageRepeaterTask(jogTurnFineBackwardMessage), 0, 1000/jogFineRepeatSpeed);
		setColor(jogTurnFineBackwardControl, Colors.jogTurnFineOn);
	}
	
	void jogTurnFineBackwardReleased() {
		jogTurnFineBackwardTimer.cancel();
		setColor(jogTurnFineBackwardControl, Colors.jogTurnFineOff);
	}
	
	void jogTurnCoarseForwardPressed() {
		jogTurnCoarseForwardTimer = new Timer(true);
		jogTurnCoarseForwardTimer.scheduleAtFixedRate(new MessageRepeaterTask(jogTurnCoarseForwardMessage), 0, 1000/jogFineRepeatSpeed);
		setColor(jogTurnCoarseForwardControl, Colors.jogTurnCoarseOn);
	}
	
	void jogTurnCoarseForwardReleased() {
		jogTurnCoarseForwardTimer.cancel();
		setColor(jogTurnCoarseForwardControl, Colors.jogTurnCoarseOff);
	}
	
	void jogTurnCoarseBackwardPressed() {
		jogTurnCoarseBackwardTimer = new Timer(true);
		jogTurnCoarseBackwardTimer.scheduleAtFixedRate(new MessageRepeaterTask(jogTurnCoarseBackwardMessage), 0, 1000/jogFineRepeatSpeed);
		setColor(jogTurnCoarseBackwardControl, Colors.jogTurnCoarseOn);
	}
	
	void jogTurnCoarseBackwardReleased() {
		jogTurnCoarseBackwardTimer.cancel();
		setColor(jogTurnCoarseBackwardControl, Colors.jogTurnCoarseOff);
	}
	
	void syncPressed() {
		if(djc.shiftGreenDown) {
			send(syncOnOffMessage);
		}
		else {
			send(phaseSyncMessage);
		}
	}
	
	void tempoMasterPressed() {
		send(tempoMasterMessage);
	}
	
	@Override
	public void buttonPressed(Button control) {
		if(active) {
			if(control == playControl) {
				playPause();
			}
			else if(control == cueControl) {
				cuePressed();
			}
			else if(control == beatJumpBackwardControl) {
				beatJumpBackwardPressed();
			}
			else if(control == beatJumpForwardControl) {
				beatJumpForwardPressed();
			}
			else if(control == loopOnOffControl) {
				loopOnOffToggle();
			}
			else if(control == loopMoveIncControl) {
				loopMoveIncPressed();
			}
			else if(control == loopMoveDecControl) {
				loopMoveDecPressed();
			}
			else if(control == loopInMoveIncControl) {
				loopInMoveIncPressed();
			}
			else if(control == loopInMoveDecControl) {
				loopInMoveDecPressed();
			}
			else if(control == loopOutMoveIncControl) {
				loopOutMoveIncPressed();
			}
			else if(control == loopOutMoveDecControl) {
				loopOutMoveDecPressed();
			}
			else if (control == stepi32Control) {
				stepi32ButtonPressed();
			}
			else if (control == stepi16Control) {
				stepi16ButtonPressed();
			}
			else if (control == stepi8Control) {
				stepi8ButtonPressed();
			}
			else if (control == stepi4Control) {
				stepi4ButtonPressed();
			}
			else if (control == stepi2Control) {
				stepi2ButtonPressed();
			}
			else if (control == stepi1Control) {
				stepi1ButtonPressed();
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
			else if(control == phaseSyncControl) {
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
			else if(control == beatJumpBackwardControl) {
				beatJumpBackwardReleased();
			}
			else if(control == beatJumpForwardControl) {
				beatJumpForwardReleased();
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
	public void traktorMessageSent(TraktorMessage message) {
		if(!active) {
			return;
		}if(message == playReturnMessage) {
			if(message.data2 == 0) {
				playing = false;
				setColor(playControl, Colors.playOff);
			}
			else {
				playing = true;
				setColor(playControl, Colors.playOn);
			}
		}
		else if(message == syncOnOffReturnMessage) {
			if(message.data2 == 0) {
				sync = false;
				setColor(phaseSyncControl, Colors.syncOff);
			}
			else {
				sync = true;
				setColor(phaseSyncControl, Colors.syncOn);
			}
		}
		else if(message == tempoMasterReturnMessage) {
			if(message.data2 == 0) {
				tempoMaster = false;
				setColor(tempoMasterControl, Colors.tempoMasterOff);
			}
			else {
				tempoMaster = true;
				setColor(tempoMasterControl, Colors.tempoMasterOn);
			}
		}
		else if(message == loopOnOffReturnMessage) {
			if(message.data2 == 0) {
				loopActive = false;
				if(loopActiveBlink != null) {
					loopActiveBlink.running = false;
				}
			}
			else {
				loopActive = true;
				loopActiveBlink = new MatrixBlink(loopOnOffControl, Colors.loopActiveOn, Colors.loopActiveOff, 200, 300);
				loopActiveBlink.start();
			}
		}
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
		this.cuePressMessage = cuePress;
		this.cueReleaseMessage = cueRelease;
		
	}

	public void setPhaseSyncButton(Button control) {
		control.addListener(this);
		phaseSyncControl = control;
	}
	
	public void setPhaseSyncMessage(TraktorMessage phaseSyncMessage, TraktorMessage tempoSyncMessage) {
		this.phaseSyncMessage = phaseSyncMessage;
		this.tempoSyncMessage = tempoSyncMessage;
	}
	
	public void setSyncOnOffButton(Button control) {
		control.addListener(this);
		syncOnOffControl = control;
	}
	
	public void setSyncOnOffMessage(TraktorMessage syncOnOffMessage, TraktorMessage syncOnOffReturnMessage) {
		this.syncOnOffMessage = syncOnOffMessage;
		this.syncOnOffReturnMessage = syncOnOffReturnMessage;
		this.syncOnOffReturnMessage.addListener(this);
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
	
	public void setFluxOnOffButton(Button control) {
		control.addListener(this);
		fluxOnOffControl = control;
	}
	
	public void setFluxOnOffMessage(TraktorMessage message, TraktorMessage returnMessage) {
		fluxOnOffMessage = message;
		fluxOnOffReturnMessage = returnMessage;
	}
	
	public void setSyncPlayButton(Button control) {
		control.addListener(this);
		syncPlayControl = control;
	}

	/**
	 * Internal
	 * Uses play + sync
	 */
	@SuppressWarnings("unused")
	private void setSyncPlayMessage() {}
	
	public void setCupButton(Button control) {
		control.addListener(this);
		cupControl = control;
	}
	
	public void setCupMessage(TraktorMessage pressMessage, TraktorMessage releaseMessage) {
		cupPressMessage = pressMessage;
		cupReleaseMessage = releaseMessage;
	}
	
	public void setBeatJumpBackwardButton(Button control) {
		control.addListener(this);
		beatJumpBackwardControl = control;		
	}
	
	public void setMoveBackwardMessage(TraktorMessage pressMessage, TraktorMessage releaseMessage) {
		beatJumpBackwardPressMessage = pressMessage;
		beatJumpBackwardReleaseMessage = releaseMessage;
	}

	public void setBeatJumpForwardButton(Button control) {
		control.addListener(this);
		beatJumpForwardControl = control;
	}

	public void setMoveForwardMessage(TraktorMessage pressMessage, TraktorMessage releaseMessage) {
		beatJumpForwardPressMessage = pressMessage;
		beatJumpForwardReleaseMessage = releaseMessage;
	}
	
	public void setLoopActiveButton(Button control) {
		control.addListener(this);
		loopOnOffControl = control;
	}
	
	public void setLoopActiveMessage(TraktorMessage message, TraktorMessage returnMessage) {
		loopOnOffMessage = message;
		returnMessage.addListener(this);
		loopOnOffReturnMessage = returnMessage;
	}

	public void setLoopMoveForwardButton(Button control) {
		control.addListener(this);
		loopMoveIncControl = control;
	}
	
	public void setLoopMoveBackwardButton(Button control) {
		control.addListener(this);
		loopMoveDecControl = control;
	}
	

	public void setLoopInMoveForwardButton(Button control) {
		control.addListener(this);
		loopInMoveIncControl = control;
	}
	
	public void setLoopInMoveBackwardButton(Button control) {
		control.addListener(this);
		loopInMoveDecControl = control;
	}
	

	public void setLoopOutMoveForwardButton(Button control) {
		control.addListener(this);
		loopOutMoveIncControl = control;
	}
	
	public void setLoopOutMoveBackwardButton(Button control) {
		control.addListener(this);
		loopOutMoveDecControl = control;
	}
	
	public void setLoopMoveIncMessage(TraktorMessage message) {
		loopMoveIncMessage = message;
	}
	
	public void setLoopMoveDecMessage(TraktorMessage message) {
		loopMoveDecMessage = message;
	}
	
	public void setLoopInMoveIncMessage(TraktorMessage message) {
		loopInMoveIncMessage = message;
	}
	
	public void setLoopInMoveDecMessage(TraktorMessage message) {
		loopInMoveDecMessage = message;
	}
	
	public void setLoopOutMoveIncMessage(TraktorMessage message) {
		loopOutMoveIncMessage = message;
	}
	
	public void setLoopOutMoveDecMessage(TraktorMessage message) {
		loopOutMoveDecMessage = message;
	}

	public void setStepi32Button(Button control) {
		control.addListener(this);
		stepi32Control = control;
	}

	public void setStepi16Button(Button control) {
		control.addListener(this);
		stepi16Control = control;
	}

	public void setStepi8Button(Button control) {
		control.addListener(this);
		stepi8Control = control;
	}

	public void setStepi4Button(Button control) {
		control.addListener(this);
		stepi4Control = control;
	}

	public void setStepi2Button(Button control) {
		control.addListener(this);
		stepi2Control = control;
	}

	public void setStepi1Button(Button control) {
		control.addListener(this);
		stepi1Control = control;
	}

	public void setLoopSelectSetButton(Button control) {
		control.addListener(this);
		loopSelectSetControl = control;
	}
	// message internal
	
	public void setLoopSelectSetBackwardButton(Button control) {
		control.addListener(this);
		loopSelectSetBackwardControl = control;
	}
	
	
	public void setLoopSizeSelectSetMessage(TraktorMessage f32Message, 
			TraktorMessage f16Message,
			TraktorMessage f8Message,
			TraktorMessage f4Message,
			TraktorMessage f2Message,
			TraktorMessage i32Message,
			TraktorMessage i16Message,
			TraktorMessage i8Message,
			TraktorMessage i4Message,
			TraktorMessage i2Message,
			TraktorMessage i1Message
			) {
		loopSizeSelectSetf32Message = f32Message;
		loopSizeSelectSetf16Message = f16Message;
		loopSizeSelectSetf8Message = f8Message;
		loopSizeSelectSetf4Message = f4Message;
		loopSizeSelectSetf2Message = f2Message;
		loopSizeSelectSeti32Message = i32Message;
		loopSizeSelectSeti16Message = i16Message;
		loopSizeSelectSeti8Message = i8Message;
		loopSizeSelectSeti4Message = i4Message;
		loopSizeSelectSeti2Message = i2Message;
		loopSizeSelectSeti1Message = i1Message;
	}
	
	public void setLoopSizeSelectSetBackwardMessage(TraktorMessage f32Message, 
			TraktorMessage f16Message,
			TraktorMessage f8Message,
			TraktorMessage f4Message,
			TraktorMessage f2Message,
			TraktorMessage i32Message,
			TraktorMessage i16Message,
			TraktorMessage i8Message,
			TraktorMessage i4Message,
			TraktorMessage i2Message,
			TraktorMessage i1Message
			) {
		loopSizeSelectSetBackwardf32Message = f32Message;
		loopSizeSelectSetBackwardf16Message = f16Message;
		loopSizeSelectSetBackwardf8Message = f8Message;
		loopSizeSelectSetBackwardf4Message = f4Message;
		loopSizeSelectSetBackwardf2Message = f2Message;
		loopSizeSelectSetBackwardi32Message = i32Message;
		loopSizeSelectSetBackwardi16Message = i16Message;
		loopSizeSelectSetBackwardi8Message = i8Message;
		loopSizeSelectSetBackwardi4Message = i4Message;
		loopSizeSelectSetBackwardi2Message = i2Message;
		loopSizeSelectSetBackwardi1Message = i1Message;
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
	

}
