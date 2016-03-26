package de.sntr.pushdj.dj;

import static de.sntr.pushdj.push.PushAdapter.setColor;
import static de.sntr.pushdj.traktor.TraktorAdapter.send;
import de.sntr.pushdj.push.Encoder;
import de.sntr.pushdj.push.MatrixButton;
import de.sntr.pushdj.push.PushAdapter;
import de.sntr.pushdj.push.Button;
import de.sntr.pushdj.push.TitleButton;
import de.sntr.pushdj.push.Display.Graphics;
import de.sntr.pushdj.traktor.TraktorAdapter;
import de.sntr.pushdj.traktor.TraktorMessage;

public class DJController implements ButtonListener, EncoderListener {

	static final int deckActiveColor = MatrixButton.GRAY_DARK;
	static final int deckInactiveColor = MatrixButton.GRAY_BRIGHT;
	
	Button shiftGreenControl, shiftRedControl;
	Button tempoFocusDeckAControl, tempoFocusDeckBControl, tempoFocusDeckCControl, tempoFocusDeckDControl;
	Encoder tempoFineControl, tempoCoarseControl;
	
	Button browserUpControl, browserDownControl;
	TraktorMessage browserUpMessage, browserDownMessage;
	
	Button loadDeckAControl, loadDeckBControl;
	TraktorMessage loadDeckAMessage, loadDeckBMessage;
	
	Button viewLeftDeckAControl, viewLeftDeckBControl, viewLeftDeckCControl, viewLeftDeckDControl;
	Button viewRightDeckAControl, viewRightDeckBControl, viewRightDeckCControl, viewRightDeckDControl;
	
	private TrackDeck deckALeft = new TrackDeck(this);
	private TrackDeck deckARight = new TrackDeck(this);
	private TrackDeck deckB = new TrackDeck(this);

	public boolean shiftGreenDown = false;
	public boolean shiftRedDown = false;

	Focus focus = Focus.Clock;

	public DJController() {

		PushAdapter.display.setColumn(0, Graphics.BigA);
		PushAdapter.display.setColumn(3, Graphics.BigB);
		PushAdapter.display.update();
		
		DeckInit.initTrackDeckALeft(deckALeft);
		DeckInit.initTrackDeckARight(deckARight);
		
		setFocusDeckAButton(PushAdapter.undo);
		setFocusDeckBButton(PushAdapter.delete);
		setFocusDeckCButton(PushAdapter.doubble);
		setFocusDeckDButton(PushAdapter.quantize);
		
		setShiftGreenControl(PushAdapter.play);
		setShiftRedControl(PushAdapter.record);

		setTempoCoarseEncoder(PushAdapter.encoders[0]);
		setTempoFineEncoder(PushAdapter.encoders[1]);
		
		setBrowserUp(PushAdapter.up);
		setBrowserDown(PushAdapter.down);
		setLoadDeckA(PushAdapter.note);
		
		runButtons();
	}
	
	private void runButtons() {

		setColor(shiftGreenControl, TitleButton.MEDIUM_ON);
		setColor(shiftRedControl, TitleButton.MEDIUM_ON);
		
		setColor(browserUpControl, TitleButton.MEDIUM_ON);
		setColor(browserDownControl, TitleButton.MEDIUM_ON);
		setColor(loadDeckAControl, TitleButton.MEDIUM_ON);
		
		deckALeft.activate();
		deckARight.activate();

	}

	/**
	 * Internal Focus
	 * 
	 * @param button
	 */
	public void setFocusDeckAButton(Button button) {
		tempoFocusDeckAControl = button;
		button.addListener(this);
	}

	public void setFocusDeckBButton(Button button) {
		tempoFocusDeckBControl = button;
		button.addListener(this);
	}

	public void setFocusDeckCButton(Button button) {
		tempoFocusDeckCControl = button;
		button.addListener(this);
	}
	
	public void setFocusDeckDButton(Button button) {
		tempoFocusDeckDControl = button;
		button.addListener(this);
	}

	public void setTempoCoarseEncoder(Encoder encoder) {
		tempoCoarseControl = encoder;
		tempoCoarseControl.addListener(this);
	}
	
	public void setTempoFineEncoder(Encoder encoder) {
		tempoFineControl = encoder;
		tempoFineControl.addListener(this);
	}

	public void setBrowserUp(Button button) {
		browserUpControl = button;
		browserUpControl.addListener(this);
	}
	
	public void setBrowserDown(Button button) {
		browserDownControl = button;
		browserDownControl.addListener(this);
	}

	public void setLoadDeckA(Button button) {
		loadDeckAControl = button;
		loadDeckAControl.addListener(this);
	}
	
	public void setShiftGreenControl(Button button) {
		shiftGreenControl = button;
		button.addListener(this);
	}
	
	public void setShiftRedControl(Button button) {
		shiftRedControl = button;
		button.addListener(this);
	}
	
	@Override
	public void buttonPressed(Button control) {
		if(control == shiftGreenControl) {
			shiftGreenPressed();
		}
		else if(control == shiftRedControl) {
			shiftRedPressed();
		}
		else if (control == tempoFocusDeckAControl) {
			focusDeckAPressed();
		} else if (control == tempoFocusDeckBControl) {
			focusDeckBPressed();
		} else if (control == tempoFocusDeckCControl) {
			focusDeckCPressed();
		} else if (control == tempoFocusDeckDControl) {
			focusDeckDPressed();
		}
		else if(control == browserUpControl) {
			browserUpPressed();
		}
		else if(control == browserDownControl) {
			browserDownPressed();
		}
		else if(control == loadDeckAControl) {
			loadDeckAPressed();
		}
	}

	@Override
	public void buttonReleased(Button control) {
		if (control == shiftGreenControl) {
			shiftGreenReleased();
		}
		else if (control == shiftRedControl) {
			shiftRedReleased();
		}
		else if(control == browserDownControl) {
			browserDownReleased();
		}
		else if(control == browserUpControl) {
			browserUpReleased();
		}
	}

	@Override
	public void increased(Encoder encoder) {
		if (encoder == tempoFineControl) {
			switch (focus) {
			case Clock:
				tempoMasterFineIncreased();
				break;
			case DeckA:
				tempoDeckAFineIncreased();
				break;
			case DeckB:
				tempoDeckBFineIncreased();
				break;
			case DeckC:
				tempoDeckCFineIncreased();
				break;
			case DeckD:
				tempoDeckDFineIncreased();
				break;
			}
		} else if (encoder == tempoCoarseControl) {
			switch (focus) {
			case Clock:
				tempoMasterCoarseIncreased();
				break;
			case DeckA:
				tempoDeckACoarseIncreased();
				break;
			case DeckB:
				tempoDeckBCoarseIncreased();
				break;
			case DeckC:
				tempoDeckCCoarseIncreased();
				break;
			case DeckD:
				tempoDeckDCoarseIncreased();
				break;
			}
		}
	}

	@Override
	public void decreased(Encoder control) {
		if (control == tempoFineControl) {
			switch (focus) {
			case Clock:
				tempoMasterFineDecreased();
				break;
			case DeckA:
				tempoDeckAFineDecreased();
				break;
			case DeckB:
				tempoDeckBFineDecreased();
				break;
			case DeckC:
				tempoDeckCFineDecreased();
				break;
			case DeckD:
				tempoDeckDFineDecreased();
				break;
			}
		} else if (control == tempoCoarseControl) {
			switch (focus) {
			case Clock:
				tempoMasterCoarseDecreased();
				break;
			case DeckA:
				tempoDeckACoarseDecreased();
				break;
			case DeckB:
				tempoDeckBCoarseDecreased();
				break;
			case DeckC:
				tempoDeckCCoarseDecreased();
				break;
			case DeckD:
				tempoDeckDCoarseDecreased();
				break;
			}
		}
	}

	void focusDeckAPressed() {
		if (focus == Focus.DeckA) {
			focus = Focus.Clock;
			setColor(tempoFocusDeckAControl, TitleButton.OFF);
		} else {
			focus = Focus.DeckA;
			tempoFocusAllOff();
			setColor(tempoFocusDeckAControl, TitleButton.BRIGHT_ON);
		}
	}

	void focusDeckBPressed() {
		if (focus == Focus.DeckB) {
			focus = Focus.Clock;
			setColor(tempoFocusDeckBControl, TitleButton.OFF);
		} else {
			focus = Focus.DeckB;
			tempoFocusAllOff();
			setColor(tempoFocusDeckBControl, TitleButton.BRIGHT_ON);
		}
	}

	void focusDeckCPressed() {
		if (focus == Focus.DeckC) {
			focus = Focus.Clock;
			setColor(tempoFocusDeckCControl, TitleButton.OFF);
		} else {
			focus = Focus.DeckC;
			tempoFocusAllOff();
			setColor(tempoFocusDeckCControl, TitleButton.BRIGHT_ON);
		}
	}

	void focusDeckDPressed() {
		if (focus == Focus.DeckD) {
			focus = Focus.Clock;
			setColor(tempoFocusDeckDControl, TitleButton.OFF);
		} else {
			focus = Focus.DeckD;
			tempoFocusAllOff();
			setColor(tempoFocusDeckDControl, TitleButton.BRIGHT_ON);
		}
	}

	void tempoMasterFineIncreased() {
		send(TraktorAdapter.tempoMasterFineIncrease);
	}

	void tempoMasterFineDecreased() {
		send(TraktorAdapter.tempoMasterFineDecrease);
	}

	void tempoMasterCoarseIncreased() {
		send(TraktorAdapter.tempoMasterCoarseIncrease);
	}

	void tempoMasterCoarseDecreased() {
		send(TraktorAdapter.tempoMasterCoarseDecrease);
	}

	void tempoDeckAFineIncreased() {
		send(TraktorAdapter.tempoDeckAFineIncrease);
	}

	void tempoDeckAFineDecreased() {
		send(TraktorAdapter.tempoDeckAFineDecrease);
	}

	void tempoDeckACoarseIncreased() {
		send(TraktorAdapter.tempoDeckACoarseIncrease);
	}

	void tempoDeckACoarseDecreased() {
		send(TraktorAdapter.tempoDeckACoarseDecrease);
	}

	void tempoDeckBFineIncreased() {
		send(TraktorAdapter.tempoDeckBFineIncrease);
	}

	void tempoDeckBFineDecreased() {
		send(TraktorAdapter.tempoDeckBFineDecrease);
	}

	void tempoDeckBCoarseIncreased() {
		send(TraktorAdapter.tempoDeckBCoarseIncrease);
	}

	void tempoDeckBCoarseDecreased() {
		send(TraktorAdapter.tempoDeckBCoarseDecrease);
	}

	void tempoDeckCFineIncreased() {
		send(TraktorAdapter.tempoDeckCFineIncrease);
	}

	void tempoDeckCFineDecreased() {
		send(TraktorAdapter.tempoDeckCFineDecrease);
	}

	void tempoDeckCCoarseIncreased() {
		send(TraktorAdapter.tempoDeckCCoarseIncrease);
	}

	void tempoDeckCCoarseDecreased() {
		send(TraktorAdapter.tempoDeckCCoarseDecrease);
	}

	void tempoDeckDFineIncreased() {
		send(TraktorAdapter.tempoDeckDFineIncrease);
	}

	void tempoDeckDFineDecreased() {
		send(TraktorAdapter.tempoDeckDFineDecrease);
	}

	void tempoDeckDCoarseIncreased() {
		send(TraktorAdapter.tempoDeckDCoarseIncrease);
	}

	void tempoDeckDCoarseDecreased() {
		send(TraktorAdapter.tempoDeckDCoarseDecrease);
	}
	
	private void tempoFocusAllOff() {
		setColor(tempoFocusDeckAControl, TitleButton.OFF);
		setColor(tempoFocusDeckBControl, TitleButton.OFF);
		setColor(tempoFocusDeckCControl, TitleButton.OFF);
		setColor(tempoFocusDeckDControl, TitleButton.OFF);
	}

	void browserUpPressed() {
		send(TraktorAdapter.browserUpPress);
	}
	
	void browserDownPressed() {
		send(TraktorAdapter.browserDownPress);
	}
	
	void browserUpReleased() {
		send(TraktorAdapter.browserUpRelease);
	}
	
	void browserDownReleased() {
		send(TraktorAdapter.browserDownRelease);
	}
	
	void loadDeckAPressed() {
		send(TraktorAdapter.loadDeckA);
	}
	
	void loadDeckBPressed() {
//		send(TraktorAdapter.loa)
	}

	void loadDeckCPressed() {
		
	}
	
	void loadDeckDPressed() {
		
	}

	void viewLeftDeckAPressed() {
		
	}
	
	void viewLeftDeckBPressed() {
		
	}
	
	



	void shiftGreenPressed() {
		shiftGreenDown = true;
		setColor(shiftGreenControl, TitleButton.BRIGHT_ON);
	}
	
	void shiftGreenReleased() {
		shiftGreenDown = false;
		setColor(shiftGreenControl, TitleButton.MEDIUM_ON);
	}
	
	void shiftRedPressed() {
		shiftRedDown = true;
		setColor(shiftRedControl, TitleButton.BRIGHT_ON);
	}
	
	void shiftRedReleased() {
		shiftRedDown = false;
		setColor(shiftRedControl, TitleButton.MEDIUM_ON);
	}
}
