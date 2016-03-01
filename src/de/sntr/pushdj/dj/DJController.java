package de.sntr.pushdj.dj;

import static de.sntr.pushdj.push.PushAdapter.setColor;
import static de.sntr.pushdj.traktor.TraktorAdapter.send;
import de.sntr.pushdj.push.Encoder;
import de.sntr.pushdj.push.PushAdapter;
import de.sntr.pushdj.push.Button;
import de.sntr.pushdj.push.TitleButton;
import de.sntr.pushdj.traktor.TraktorAdapter;

public class DJController implements ButtonListener, EncoderListener {

	Button shiftGreenControl, shiftRedControl;
	Button focusDeckAControl, focusDeckBControl, focusDeckCControl, focusDeckDControl;
	Encoder tempoFineControl, tempoCoarseControl;

	private TrackDeck deckA = new TrackDeck(this);
	private TrackDeck deckB = new TrackDeck(this);

	public boolean shiftGreenDown = false;
	public boolean shiftRedDown = false;

	Focus focus = Focus.Clock;

	public DJController() {

		deckA.setPlay(PushAdapter.matrix[0], TraktorAdapter.playDeckA, TraktorAdapter.pauseDeckA);
		deckA.setCueButton(PushAdapter.matrix[1], TraktorAdapter.cueDeckAPress, TraktorAdapter.cueDeckARelease);
		deckA.setBeatjumpCoarseBackwardButton(PushAdapter.matrix[8], TraktorAdapter.beatjumpDeckA16BackwardPress,
				TraktorAdapter.beatjumpDeckA16BackwardRelease, TraktorAdapter.beatjumpDeckA32BackwardPress,
				TraktorAdapter.beatjumpDeckA32BackwardRelease);
		deckA.setBeatjumpFineBackwardButton(PushAdapter.matrix[9], TraktorAdapter.beatjumpDeckA1BackwardPress,
				TraktorAdapter.beatjumpDeckA1BackwardRelease, TraktorAdapter.beatjumpDeckA4BackwardPress,
				TraktorAdapter.beatjumpDeckA4BackwardRelease);
		deckA.setBeatjumpFineForwardButton(PushAdapter.matrix[10], TraktorAdapter.beatjumpDeckA1ForwardPress,
				TraktorAdapter.beatjumpDeckA1ForwardRelease, TraktorAdapter.beatjumpDeckA4ForwardPress,
				TraktorAdapter.beatjumpDeckA4ForwardRelease);
		deckA.setBeatjumpCoarseForwardButton(PushAdapter.matrix[11], TraktorAdapter.beatjumpDeckA16ForwardPress,
				TraktorAdapter.beatjumpDeckA16ForwardRelease, TraktorAdapter.beatjumpDeckA32ForwardPress,
				TraktorAdapter.beatjumpDeckA32ForwardRelease);
		deckA.setCue1Button(PushAdapter.matrix[16], TraktorAdapter.selectSetHotcueDeckA1Press,
				TraktorAdapter.selectSetHotcueDeckA1Release, TraktorAdapter.deleteHotcueDeckA1);
		deckA.setCue2Button(PushAdapter.matrix[17], TraktorAdapter.selectSetHotcueDeckA2Press,
				TraktorAdapter.selectSetHotcueDeckA2Release, TraktorAdapter.deleteHotcueDeckA2);
		deckA.setCue3Button(PushAdapter.matrix[18], TraktorAdapter.selectSetHotcueDeckA3Press,
				TraktorAdapter.selectSetHotcueDeckA3Release, TraktorAdapter.deleteHotcueDeckA3);
		deckA.setCue4Button(PushAdapter.matrix[19], TraktorAdapter.selectSetHotcueDeckA4Press,
				TraktorAdapter.selectSetHotcueDeckA4Release, TraktorAdapter.deleteHotcueDeckA4);
		deckA.setCue5Button(PushAdapter.matrix[24], TraktorAdapter.selectSetHotcueDeckA5Press,
				TraktorAdapter.selectSetHotcueDeckA5Release, TraktorAdapter.deleteHotcueDeckA5);
		deckA.setCue6Button(PushAdapter.matrix[25], TraktorAdapter.selectSetHotcueDeckA6Press,
				TraktorAdapter.selectSetHotcueDeckA6Release, TraktorAdapter.deleteHotcueDeckA6);
		deckA.setCue7Button(PushAdapter.matrix[26], TraktorAdapter.selectSetHotcueDeckA7Press,
				TraktorAdapter.selectSetHotcueDeckA7Release, TraktorAdapter.deleteHotcueDeckA7);
		deckA.setCue8Button(PushAdapter.matrix[27], TraktorAdapter.selectSetHotcueDeckA8Press,
				TraktorAdapter.selectSetHotcueDeckA8Release, TraktorAdapter.deleteHotcueDeckA8);
		deckA.setShiftButton(PushAdapter.play);

		deckA.setHotcueType1Message(TraktorAdapter.hotcueTypeDeckA1);
		deckA.setHotcueType2Message(TraktorAdapter.hotcueTypeDeckA2);
		deckA.setHotcueType3Message(TraktorAdapter.hotcueTypeDeckA3);
		deckA.setHotcueType4Message(TraktorAdapter.hotcueTypeDeckA4);
		deckA.setHotcueType5Message(TraktorAdapter.hotcueTypeDeckA5);
		deckA.setHotcueType6Message(TraktorAdapter.hotcueTypeDeckA6);
		deckA.setHotcueType7Message(TraktorAdapter.hotcueTypeDeckA7);
		deckA.setHotcueType8Message(TraktorAdapter.hotcueTypeDeckA8);

		deckA.activate();
		// deckB.activate();

		setFocusDeckAButton(PushAdapter.undo);
		setFocusDeckBButton(PushAdapter.delete);
		setFocusDeckCButton(PushAdapter.doubble);
		setFocusDeckDButton(PushAdapter.quantize);
		
		setShiftGreenControl(PushAdapter.play);
		setShiftRedControl(PushAdapter.record);

		setTempoCoarseEncoder(PushAdapter.encoders[0]);
		setTempoFineEncoder(PushAdapter.encoders[1]);
	}

	/**
	 * Internal Focus
	 * 
	 * @param button
	 */
	public void setFocusDeckAButton(Button button) {
		focusDeckAControl = button;
		button.addListener(this);
	}

	public void setFocusDeckBButton(Button button) {
		focusDeckBControl = button;
		button.addListener(this);
	}

	public void setFocusDeckCButton(Button button) {
		focusDeckCControl = button;
		button.addListener(this);
	}
	
	public void setFocusDeckDButton(Button button) {
		focusDeckDControl = button;
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
	
	public void setShiftGreenControl(Button button) {
		shiftGreenControl = button;
		button.addListener(this);
	}
	
	public void setShiftRedControl(Button button) {
		shiftRedControl = button;
		button.addListener(this);
	}
	
	@Override
	public void buttonPressed(Button button) {
		if(button == shiftGreenControl) {
			shiftGreenPressed();
		}
		else if(button == shiftRedControl) {
			shiftRedPressed();
		}
		else if (button == focusDeckAControl) {
			focusDeckAPressed();
		} else if (button == focusDeckBControl) {
			focusDeckBPressed();
		} else if (button == focusDeckCControl) {
			focusDeckCPressed();
		} else if (button == focusDeckDControl) {
			focusDeckDPressed();
		}
	}

	@Override
	public void buttonReleased(Button button) {
		if (button == shiftGreenControl) {
			shiftGreenReleased();
		}
		else if (button == shiftRedControl) {
			shiftRedReleased();
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
			setColor(focusDeckAControl, TitleButton.OFF);
		} else {
			focus = Focus.DeckA;
			focusAllOff();
			setColor(focusDeckAControl, TitleButton.BRIGHT_ON);
		}
	}

	void focusDeckBPressed() {
		if (focus == Focus.DeckB) {
			focus = Focus.Clock;
			setColor(focusDeckBControl, TitleButton.OFF);
		} else {
			focus = Focus.DeckB;
			focusAllOff();
			setColor(focusDeckBControl, TitleButton.BRIGHT_ON);
		}
	}

	void focusDeckCPressed() {
		if (focus == Focus.DeckC) {
			focus = Focus.Clock;
			setColor(focusDeckCControl, TitleButton.OFF);
		} else {
			focus = Focus.DeckC;
			focusAllOff();
			setColor(focusDeckCControl, TitleButton.BRIGHT_ON);
		}
	}

	void focusDeckDPressed() {
		if (focus == Focus.DeckD) {
			focus = Focus.Clock;
			setColor(focusDeckDControl, TitleButton.OFF);
		} else {
			focus = Focus.DeckD;
			focusAllOff();
			setColor(focusDeckDControl, TitleButton.BRIGHT_ON);
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

	private void focusAllOff() {
		setColor(focusDeckAControl, TitleButton.OFF);
		setColor(focusDeckBControl, TitleButton.OFF);
		setColor(focusDeckCControl, TitleButton.OFF);
		setColor(focusDeckDControl, TitleButton.OFF);
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
