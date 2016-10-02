package de.sntr.pushdj.dj;

import static de.sntr.pushdj.push.PushAdapter.setColor;
import static de.sntr.pushdj.traktor.TraktorAdapter.send;

import java.util.Timer;

import de.sntr.pushdj.push.Button;
import de.sntr.pushdj.push.MatrixButton;
import de.sntr.pushdj.push.TitleButton;
import de.sntr.pushdj.traktor.StepSize;
import de.sntr.pushdj.traktor.TraktorMessage;


public abstract class Deck extends ButtonGroup {

	static final int jogFineRepeatSpeed = 100;
	static final int jogCoarseRepeatSpeed = 200;
	
	static class Colors {
		static final int off = MatrixButton.OFF;
		static final int playOn = MatrixButton.GREEN_BRIGHT;
		static final int playOff = MatrixButton.RED_BRIGHT;
		static final int playDark = MatrixButton.GREEN_DARK;
		static final int syncPlayOn = MatrixButton.GREEN_BRIGHT;
		static final int syncPlayOff = MatrixButton.RED_BRIGHT;
		
		static final int syncOn = MatrixButton.YELLOW3;
		static final int syncOff = MatrixButton.YELLOW_BRIGHT2;
		static final int phaseSyncOff = MatrixButton.YELLOW_BRIGHT2;
		
		static final int cueOn = MatrixButton.BLUE2_BRIGHT;
		static final int cueOff = MatrixButton.BLUE2_MEDIUM;
		static final int cupOn = MatrixButton.BLUE2_BRIGHT;
		static final int cupOff = MatrixButton.BLUE2_MEDIUM;

		static final int tempoMasterOn = MatrixButton.BLUE3_BRIGHT;
		static final int tempoMasterOff = MatrixButton.BLUE3_MEDIUM;
		static final int fluxOn = MatrixButton.PINK1_BRIGHT;
		static final int fluxOff = MatrixButton.PINK1_MEDIUM;
		
		static final int beatJumpOn = MatrixButton.BLUE2_BRIGHT;
		static final int beatJumpOff = MatrixButton.BLUE_SOFT_MEDIUM;
		static final int loopInMoveOff = MatrixButton.BLUEGREEN_PALE;
		static final int loopInMoveOn = MatrixButton.VIOLET_BRIGHT;
		static final int loopOutMoveOff = MatrixButton.BLUEGREEN_MEDIUM;
		static final int loopOutMoveOn = MatrixButton.VIOLET_BRIGHT;
		static final int loopMoveOff = MatrixButton.GREEN_PALE1;
		static final int loopMoveOn = MatrixButton.VIOLET_MEDIUM2;
		static final int loopActiveToggleOff = MatrixButton.GREEN_MEDIUM;
		static final int loopOn = MatrixButton.GREEN1_BRIGHT;
		static final int loopSelectSetBackwardOff = MatrixButton.GREEN_DARK;
		static final int loopSelectSetOff = MatrixButton.GREEN_DARK1;
		static final int jogTurnFineOn = MatrixButton.ORANGE1_BRIGHT;
		static final int jogTurnFineOff = MatrixButton.ORANGE1_MEDIUM;
		static final int jogTurnCoarseOn = MatrixButton.ORANGE_BRIGHT;
		static final int jogTurnCoarseOff = MatrixButton.ORANGE_MEDIUM;

	}
	
	boolean active = false;
	int displayColumn = -1;

	
	TraktorMessage deckLoadedReturnMessage;
	
	TraktorMessage beatPhaseReturnMessage;
	
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
	
	Button beatJumpForwardControl;
	Button beatJumpBackwardControl;
	
	Button loopMoveForwardControl;	
	Button loopMoveBackwardControl;
	
	Button loopInMoveForwardControl;
	Button loopInMoveBackwardControl;

	Button loopOutMoveForwardControl;
	Button loopOutMoveBackwardControl;
	
	TraktorMessage moveModeBeatJumpMessage;
	TraktorMessage moveModeLoopMessage;
	TraktorMessage moveModeLoopInMessage;
	TraktorMessage moveModeLoopOutMessage;

	TraktorMessage moveForwardPressMessage;
	TraktorMessage moveForwardReleaseMessage;
	TraktorMessage moveBackwardPressMessage;
	TraktorMessage moveBackwardReleaseMessage;

	Button loopSelectSetControl;
	Button loopSelectSetBackwardControl;

	TraktorMessage loopActiveReturnMessage;
	
	Button loopActiveToggleControl;
	Button loopActiveToggleControl1;
	
	TraktorMessage loopActiveToggleMessage;
	
	// internal, no message:
	Button step32Control; // 1/32 with shift
	Button step16Control; // ...
	Button step8Control;
	Button step4Control;
	Button step2Control;
	Button step1Control; // no shift

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

	TraktorMessage sizeSelectorf32;
	TraktorMessage sizeSelectorf16;
	TraktorMessage sizeSelectorf8;
	TraktorMessage sizeSelectorf4;
	TraktorMessage sizeSelectorf2;
	TraktorMessage sizeSelectori1;
	TraktorMessage sizeSelectori2;
	TraktorMessage sizeSelectori4;
	TraktorMessage sizeSelectori8;
	TraktorMessage sizeSelectori16;
	TraktorMessage sizeSelectori32;
	
	Button jogTurnFineForwardControl;
	Button jogTurnFineBackwardControl;
	Button jogTurnCoarseForwardControl;
	Button jogTurnCoarseBackwardControl;
	TraktorMessage jogTurnFineForwardMessage;
	TraktorMessage jogTurnFineBackwardMessage;
	TraktorMessage jogTurnCoarseForwardMessage;
	TraktorMessage jogTurnCoarseBackwardMessage;
	
	public Button activeStepButton;
	
	boolean playing = false;
	boolean cuePlaying = false;
	boolean sync = false;
	boolean tempoMaster = false;
	boolean loopActive = false;
	boolean flux = false;
	

	DJController djc;
	
	Timer jogTurnFineForwardTimer;
	Timer jogTurnFineBackwardTimer;
	Timer jogTurnCoarseForwardTimer;
	Timer jogTurnCoarseBackwardTimer;
	
	StepSize stepSize = null;
	
	protected Deck(DJController djc) {
		this.djc = djc;
	}


	@Override
	public void activate() {
		if(active) {
			
		}
		active = true;
		if(playing) {
			setColor(playControl, Colors.playOn);
			setColor(syncPlayControl, Colors.syncPlayOn);
		}
		else {
			setColor(playControl, Colors.playOff);
			setColor(syncPlayControl, Colors.syncPlayOff);
		}
		if(sync) {
			setColor(syncOnOffControl, Colors.syncOn);
		}
		else {
			setColor(syncOnOffControl, Colors.syncOff);
		}
		if(tempoMaster) {
			setColor(tempoMasterControl, Colors.tempoMasterOn);
		}
		else {
			setColor(tempoMasterControl, Colors.tempoMasterOff);
		}
		if (flux) {
			setColor(fluxOnOffControl, Colors.fluxOn);
		}
		else {
			setColor(fluxOnOffControl, Colors.fluxOff);
		}
		setColor(cueControl, Colors.cueOff);
		setColor(cupControl, Colors.cupOff);
		setColor(phaseSyncControl, Colors.phaseSyncOff);
		setColor(beatJumpBackwardControl, Colors.beatJumpOff);
		setColor(beatJumpForwardControl, Colors.beatJumpOff);
		setColor(loopMoveForwardControl, Colors.loopMoveOff);
		setColor(loopMoveBackwardControl, Colors.loopMoveOff);
		setColor(loopInMoveForwardControl, Colors.loopInMoveOff);
		setColor(loopInMoveBackwardControl, Colors.loopInMoveOff);
		setColor(loopOutMoveForwardControl, Colors.loopOutMoveOff);
		setColor(loopOutMoveBackwardControl, Colors.loopOutMoveOff);
		setColor(loopSelectSetControl, Colors.loopSelectSetOff);
		setColor(loopSelectSetBackwardControl, Colors.loopSelectSetBackwardOff);
		setColor(loopActiveToggleControl, Colors.loopActiveToggleOff);
		setColor(loopActiveToggleControl1, Colors.loopActiveToggleOff);
		setColor(jogTurnFineForwardControl, Colors.jogTurnFineOff);
		setColor(jogTurnFineBackwardControl, Colors.jogTurnFineOff);
		setColor(jogTurnCoarseForwardControl, Colors.jogTurnCoarseOff);
		setColor(jogTurnCoarseBackwardControl, Colors.jogTurnCoarseOff);

		stepButtonsOff();
		setColor(activeStepButton, TitleButton.BRIGHT_ON);
	}
	
	private void stepButtonsOff() {
		setColor(step1Control, TitleButton.OFF);
		setColor(step2Control, TitleButton.OFF);
		setColor(step4Control, TitleButton.OFF);
		setColor(step8Control, TitleButton.OFF);
		setColor(step16Control, TitleButton.OFF);
		setColor(step32Control, TitleButton.OFF);
	}

	@Override
	public void deactivate() {
		active = false;
	}
	void playPressed() {
		if(playing) {
			send(pauseMessage);
		}
		else {
			send(playMessage);
		}
	}
	
	void syncPlayPressed() {
		// first macro
		if (playing) {
			send(pauseMessage);
		}
		else {
			send(playMessage);
			send(phaseSyncMessage);
		}
	}
	

	/**
	 * Cue press does not produce a playReleased message like Cup does
	 */
	void cuePressed() {
		send(cuePressMessage);
		if(playing) {
			playing = false;
			setColor(cueControl, Colors.cueOff);
		} else {
			cuePlaying = true;
			setColor(cueControl, Colors.cueOn);
			setColor(playControl, Colors.playOn);
			setColor(syncPlayControl, Colors.syncPlayOn);
		}
	}
	
	void cueReleased() {
		cuePlaying = false;
		send(cueReleaseMessage);
		if (!playing) {
			setColor(playControl, Colors.playOff);
			setColor(syncPlayControl, Colors.syncPlayOff);
		}
		setColor(cueControl, Colors.cueOff);
	}
	
	void cupPressed() {
		send(cupPressMessage);
		setColor(cupControl, Colors.cupOn);
	}
	
	void cupReleased() {
		send(cupReleaseMessage);
		setColor(cupControl, Colors.cupOff);
	}
	
	void phaseSyncPressed() {
		if(djc.shiftGreenDown) {
			send(tempoSyncMessage);
		}
		else {
			send(phaseSyncMessage);
		}
	}
	
	void syncOnOffPressed() {
		send(syncOnOffMessage);
	}
	
	void tempoMasterPressed() {
		send(tempoMasterMessage);
	}
	
	void fluxOnOffPressed() {
		send(fluxOnOffMessage);
	}
	
	void step32ButtonPressed() {
		if(!djc.shiftGreenDown) {
			stepSize = StepSize.i32;
			setColor(activeStepButton, TitleButton.OFF);
			djc.setActiveStepButton(this, step32Control);
			setColor(activeStepButton, TitleButton.BRIGHT_ON);
			send(sizeSelectori32);
		}
		else {
			stepSize = StepSize.f32;
			setColor(activeStepButton, TitleButton.OFF);
			djc.setActiveStepButton(this, step32Control);
			setColor(activeStepButton, TitleButton.BRIGHT_BLINK_FAST);
			send(sizeSelectorf32);
		}
	}
	
	void step16ButtonPressed() {
		if(!djc.shiftGreenDown) {
			stepSize = StepSize.i16;
			setColor(activeStepButton, TitleButton.OFF);
			djc.setActiveStepButton(this, step16Control);
			setColor(activeStepButton, TitleButton.BRIGHT_ON);
			send(sizeSelectori16);
		}
		else {
			stepSize = StepSize.f16;
			setColor(activeStepButton, TitleButton.OFF);
			djc.setActiveStepButton(this, step16Control);
			setColor(activeStepButton, TitleButton.BRIGHT_BLINK_FAST);
			send(sizeSelectorf16);
		}
	}
	
	void step8ButtonPressed() {
		if(!djc.shiftGreenDown) {
			stepSize = StepSize.i8;
			setColor(activeStepButton, TitleButton.OFF);
			djc.setActiveStepButton(this, step8Control);
			setColor(activeStepButton, TitleButton.BRIGHT_ON);
			send(sizeSelectori8);
		}
		else {
			stepSize = StepSize.f8;
			setColor(activeStepButton, TitleButton.OFF);
			djc.setActiveStepButton(this, step8Control);
			setColor(activeStepButton, TitleButton.BRIGHT_BLINK_FAST);
			send(sizeSelectorf8);
		}
	}
	
	void step4ButtonPressed() {
		if(!djc.shiftGreenDown) {
			stepSize = StepSize.i4;
			setColor(activeStepButton, TitleButton.OFF);
			djc.setActiveStepButton(this, step4Control);
			setColor(activeStepButton, TitleButton.BRIGHT_ON);
			send(sizeSelectori4);
		}
		else {
			stepSize = StepSize.f4;
			setColor(activeStepButton, TitleButton.OFF);
			djc.setActiveStepButton(this, step4Control);
			setColor(activeStepButton, TitleButton.BRIGHT_BLINK_FAST);
			send(sizeSelectorf4);
		}
	}
	
	void step2ButtonPressed() {
		if(!djc.shiftGreenDown) {
			stepSize = StepSize.i2;
			setColor(activeStepButton, TitleButton.OFF);
			djc.setActiveStepButton(this, step2Control);
			setColor(activeStepButton, TitleButton.BRIGHT_ON);
			send(sizeSelectori2);
		}
		else {
			stepSize = StepSize.f2;
			setColor(activeStepButton, TitleButton.OFF);
			djc.setActiveStepButton(this, step2Control);
			setColor(activeStepButton, TitleButton.BRIGHT_BLINK_FAST);
			send(sizeSelectorf2);
		}
	}
	
	void step1ButtonPressed() {
		stepSize = StepSize.i1;
		setColor(activeStepButton, TitleButton.OFF);
		djc.setActiveStepButton(this, step1Control);
		setColor(activeStepButton, TitleButton.BRIGHT_ON);
		send(sizeSelectori1);
	}
	

	void beatJumpForwardPressed() {
		send(moveModeBeatJumpMessage);
		send(moveForwardPressMessage);
		setColor(beatJumpForwardControl, Colors.beatJumpOn);
	}
	
	void beatJumpForwardReleased() {
		send(moveForwardReleaseMessage);
		setColor(beatJumpForwardControl, Colors.beatJumpOff);
	}
	
	void beatJumpBackwardPressed() {
		send(moveModeBeatJumpMessage);
		send(moveBackwardPressMessage);
		setColor(beatJumpBackwardControl, Colors.beatJumpOn);
	}
	
	void beatJumpBackwardReleased() {
		send(moveBackwardReleaseMessage);
		setColor(beatJumpBackwardControl, Colors.beatJumpOff);
	}

	void loopMoveForwardPressed() {
		send(moveModeLoopMessage);
		send(moveForwardPressMessage);
	}

	void loopMoveBackwardPressed() {
		send(moveModeLoopMessage);
		send(moveBackwardPressMessage);
	}

	void loopInMoveForwardPressed() {
		send(moveModeLoopInMessage);
		send(moveForwardPressMessage);
	}

	void loopInMoveBackwardPressed() {
		send(moveModeLoopInMessage);
		send(moveBackwardPressMessage);
	}

	void loopOutMoveForwardPressed() {
		send(moveModeLoopOutMessage);
		send(moveForwardPressMessage);
	}

	void loopOutMoveBackwardPressed() {
		send(moveModeLoopOutMessage);
		send(moveBackwardPressMessage);
	}

	void loopActiveTogglePressed() {
		send(loopActiveToggleMessage);
	}
	
	void loopSelectSetPressed() {
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
	
	void loopSelectSetBackwardPressed() {
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
	
	@Override
	public void buttonPressed(Button control) {
		if(active) {
			if(control == playControl) {
				playPressed();
			}
			else if (control == syncPlayControl) {
				syncPlayPressed();
			}
			else if(control == cueControl) {
				cuePressed();
			}
			else if(control == cupControl) {
				cupPressed();
			}
			else if(control == fluxOnOffControl) {
				fluxOnOffPressed();
			}
			else if(control == phaseSyncControl) {
				phaseSyncPressed();
			}
			else if(control == tempoMasterControl) {
				tempoMasterPressed();
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
			else if(control == beatJumpBackwardControl) {
				beatJumpBackwardPressed();
			}
			else if(control == beatJumpForwardControl) {
				beatJumpForwardPressed();
			}
			else if(control == loopMoveForwardControl) {
				loopMoveForwardPressed();
			}
			else if(control == loopMoveBackwardControl) {
				loopMoveBackwardPressed();
			}
			else if(control == loopInMoveForwardControl) {
				loopInMoveForwardPressed();
			}
			else if(control == loopInMoveBackwardControl) {
				loopInMoveBackwardPressed();
			}
			else if(control == loopOutMoveForwardControl) {
				loopOutMoveForwardPressed();
			}
			else if(control == loopOutMoveBackwardControl) {
				loopOutMoveBackwardPressed();
			}
			else if (control == loopSelectSetBackwardControl) {
				loopSelectSetBackwardPressed();
			}
			else if (control == loopSelectSetControl) {
				loopSelectSetPressed();
			}
			else if (control == loopActiveToggleControl || control == loopActiveToggleControl1) {
				loopActiveTogglePressed();
			}
			else if (control == step32Control) {
				step32ButtonPressed();
			}
			else if (control == step16Control) {
				step16ButtonPressed();
			}
			else if (control == step8Control) {
				step8ButtonPressed();
			}
			else if (control == step4Control) {
				step4ButtonPressed();
			}
			else if (control == step2Control) {
				step2ButtonPressed();
			}
			else if (control == step1Control) {
				step1ButtonPressed();
			}
			
		}
	}

	@Override
	public void buttonReleased(Button control) {
		if(active) {
			if (control == cueControl) {
				cueReleased();
			}
			else if (control == cupControl) {
				cupReleased();
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
	
	
	private boolean loopLight = true;
	private boolean fluxLight = true;
	/**
	 * 
	 */
	@Override
	public void traktorMessageSent(TraktorMessage message) {
		if(!active) {
			return;
		}
		if (message == deckLoadedReturnMessage) {
			if (message.data2 == 1) {
				if (stepSize == null) {
					send(sizeSelectori16);
					stepSize = StepSize.i16;
					activeStepButton = step16Control;
					setColor(step16Control, TitleButton.BRIGHT_ON);
				}
			}
		}
		else if (message == beatPhaseReturnMessage) {
			if(message.data2 == 0) {
				setColor(syncPlayControl, Colors.playDark);
			}
			else {
				if (flux) {
					if (fluxLight) {
						setColor(fluxOnOffControl, Colors.fluxOn);
						fluxLight = false;
					}
					else {
						setColor(fluxOnOffControl, Colors.fluxOff);
						fluxLight = true;
					}
				}
				if (loopActive) {
					if (loopLight) {
						setColor(loopActiveToggleControl, Colors.loopOn);
						setColor(loopActiveToggleControl1, Colors.loopOn);
						loopLight = false;
					}
					else {
						setColor(loopActiveToggleControl, Colors.loopActiveToggleOff);
						setColor(loopActiveToggleControl1, Colors.loopActiveToggleOff);
						loopLight = true;
					}
				}
				if (playing || cuePlaying) {
					setColor(syncPlayControl, Colors.syncPlayOn);
				}
			}
		}
		else if(message == playReturnMessage) {
			if(message.data2 == 0) {
				playing = false;
				setColor(playControl, Colors.playOff);
				setColor(syncPlayControl, Colors.playOff);
			}
			else {
				playing = true;
				setColor(playControl, Colors.playOn);
				setColor(syncPlayControl, Colors.playOn);
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
		else if(message == fluxOnOffReturnMessage) {
			if(message.data2 == 0) {
				flux = false;
				setColor(fluxOnOffControl, Colors.fluxOff);
			}
			else {
				flux = true;
				fluxLight = true;
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
		else if(message == loopActiveReturnMessage) {
			if(message.data2 == 0) {
				loopActive = false;
				setColor(loopSelectSetControl, Colors.loopSelectSetOff);
				setColor(loopActiveToggleControl, Colors.loopActiveToggleOff);
				setColor(loopActiveToggleControl1, Colors.loopActiveToggleOff);
			}
			else {
				loopActive = true;
				loopLight = true;
			}
		}
	}


	public void setDeckLoadedReturnMessage(TraktorMessage message) {
		message.addListener(this);
		deckLoadedReturnMessage = message;
	}
	
	public void setBeatPhaseReturnMessage(TraktorMessage message) {
		message.addListener(this);
		beatPhaseReturnMessage = message;
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
		fluxOnOffReturnMessage.addListener(this);
	}
	
	public void setSyncPlayButton(Button control) {
		control.addListener(this);
		syncPlayControl = control;
	}

	public void setCupButton(Button control) {
		control.addListener(this);
		cupControl = control;
	}
	
	public void setCupMessage(TraktorMessage pressMessage, TraktorMessage releaseMessage) {
		cupPressMessage = pressMessage;
		cupReleaseMessage = releaseMessage;
	}

	public void setMoveModeMessage(TraktorMessage beatJump, TraktorMessage loop, TraktorMessage loopIn, TraktorMessage loopOut) {
		moveModeBeatJumpMessage = beatJump;
		moveModeLoopMessage = loop;
		moveModeLoopInMessage = loopIn;
		moveModeLoopOutMessage = loopOut;
	}
	
	public void setMoveForwardMessage(TraktorMessage pressMessage, TraktorMessage releaseMessage) {
		moveForwardPressMessage = pressMessage;
		moveForwardReleaseMessage = releaseMessage;
	}
	
	public void setMoveBackwardMessage(TraktorMessage pressMessage, TraktorMessage releaseMessage) {
		moveBackwardPressMessage = pressMessage;
		moveBackwardReleaseMessage = releaseMessage;
	}

	public void setBeatJumpForwardButton(Button control) {
		control.addListener(this);
		beatJumpForwardControl = control;
	}
	
	public void setBeatJumpBackwardButton(Button control) {
		control.addListener(this);
		beatJumpBackwardControl = control;		
	}

	public void setLoopMoveForwardButton(Button control) {
		control.addListener(this);
		loopMoveForwardControl = control;
	}
	
	public void setLoopMoveBackwardButton(Button control) {
		control.addListener(this);
		loopMoveBackwardControl = control;
	}

	public void setLoopInMoveForwardButton(Button control) {
		control.addListener(this);
		loopInMoveForwardControl = control;
	}
	
	public void setLoopInMoveBackwardButton(Button control) {
		control.addListener(this);
		loopInMoveBackwardControl = control;
	}

	public void setLoopOutMoveForwardButton(Button control) {
		control.addListener(this);
		loopOutMoveForwardControl = control;
	}
	
	public void setLoopOutMoveBackwardButton(Button control) {
		control.addListener(this);
		loopOutMoveBackwardControl = control;
	}
	
	
	public void setStep32Button(Button control) {
		control.addListener(this);
		step32Control = control;
	}

	public void setStep16Button(Button control) {
		control.addListener(this);
		step16Control = control;
	}

	public void setStep8Button(Button control) {
		control.addListener(this);
		step8Control = control;
	}

	public void setStep4Button(Button control) {
		control.addListener(this);
		step4Control = control;
	}

	public void setStep2Button(Button control) {
		control.addListener(this);
		step2Control = control;
	}

	public void setStep1Button(Button control) {
		control.addListener(this);
		step1Control = control;
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
	
	public void setLoopActiveReturnMessage(TraktorMessage message) {
		message.addListener(this);
		loopActiveReturnMessage = message;
	}
	
	public void setLoopActiveToggleControl(Button control, Button control1) {
		control.addListener(this);
		control1.addListener(this);
		loopActiveToggleControl = control;
		loopActiveToggleControl1 = control1;
	}
	
	public void setLoopActiveToggleMessage(TraktorMessage message) {
		loopActiveToggleMessage = message;
	}
	
	
	public void setLoopSelectSetMessage(TraktorMessage f32Message, 
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
	
	public void setLoopSelectSetBackwardMessage(TraktorMessage f32Message, 
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
	
	public void setSizeSelectorMessage(TraktorMessage f32,
			TraktorMessage f16,
			TraktorMessage f8,
			TraktorMessage f4,
			TraktorMessage f2,
			TraktorMessage i32,
			TraktorMessage i16,
			TraktorMessage i8,
			TraktorMessage i4,
			TraktorMessage i2,
			TraktorMessage i1
			){
		sizeSelectorf32 = f32;
		sizeSelectorf16 = f16;
		sizeSelectorf8 = f8;
		sizeSelectorf4 = f4;
		sizeSelectorf2 = f2;
		sizeSelectori32 = i32;
		sizeSelectori16 = i16;
		sizeSelectori8 = i8;
		sizeSelectori4 = i4;
		sizeSelectori2 = i2;
		sizeSelectori1 = i1;
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
