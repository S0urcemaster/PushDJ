package de.sntr.pushdj.dj;

import static de.sntr.pushdj.push.PushAdapter.setColor;
import static de.sntr.pushdj.traktor.TraktorAdapter.send;

import java.util.Timer;

import de.sntr.pushdj.dj.TrackDeck.Colors;
import de.sntr.pushdj.push.Button;
import de.sntr.pushdj.push.MatrixBlink;
import de.sntr.pushdj.traktor.LoopSize;
import de.sntr.pushdj.traktor.TraktorMessage;


public abstract class Deck extends ButtonGroup {

	static final int jogFineRepeatSpeed = 100;
	static final int jogCoarseRepeatSpeed = 200;
	
	boolean active = false;
	int displayColumn = -1;

	Button playControl;
	TraktorMessage playMessage;
	TraktorMessage playReturnMessage;
	TraktorMessage pauseMessage;
	
	Button cueControl;
	TraktorMessage cuePressedMessage;
	TraktorMessage cueReleasedMessage;

	
	Button beatJumpBackwardControl;
	TraktorMessage beatJumpBackwardPressMessage;
	TraktorMessage beatJumpBackwardReleaseMessage;
	
	Button beatJumpForwardControl;
	TraktorMessage beatJumpForwardPressMessage;
	TraktorMessage beatJumpForwardReleaseMessage;
	
	Button loopOnOffControl;
	TraktorMessage loopOnOffMessage;
	TraktorMessage loopOnOffReturnMessage;
	
	
	Button loopSizeSelectSetControl;
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
	
	Button loopSizeSelectSetBackwardControl;
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
	boolean loopActive = false;
	

	DJController djc;
	
	Timer jogTurnFineForwardTimer;
	Timer jogTurnFineBackwardTimer;
	Timer jogTurnCoarseForwardTimer;
	Timer jogTurnCoarseBackwardTimer;
	
	MatrixBlink loopActiveBlink;
	
	LoopSize loopSize = null;
	
	
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
		send(cuePressedMessage);
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
		send(cueReleasedMessage);
		if (!playing) {
			setColor(playControl, Colors.playOff);
		}
		setColor(cueControl, Colors.cueOff);
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
		switch (loopSize) {
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
		switch (loopSize) {
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
			send(syncOnMessage);
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
			else if(control == loopSizeSelectSetControl) {
				loopSizeSelectSetPressed();
			}
			else if(control == loopSizeSelectSetBackwardControl) {
				loopSizeSelectSetBackwardPressed();
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
	public void outSent(TraktorMessage message) {
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
		else if(message == syncOnReturnMessage) {
			if(message.data2 == 0) {
				sync = false;
				setColor(syncControl, Colors.syncOff);
			}
			else {
				sync = true;
				setColor(syncControl, Colors.syncOn);
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
	
}
