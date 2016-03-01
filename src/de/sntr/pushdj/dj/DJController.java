package de.sntr.pushdj.dj;


import static de.sntr.pushdj.push.PushAdapter.setColor;
import static de.sntr.pushdj.traktor.TraktorAdapter.send;
import de.sntr.pushdj.push.Encoder;
import de.sntr.pushdj.push.PushAdapter;
import de.sntr.pushdj.push.Button;
import de.sntr.pushdj.push.TitleButton;
import de.sntr.pushdj.traktor.TraktorAdapter;

public class DJController implements ButtonListener, EncoderListener {

	// static final int focusDeckAOn = TitleButton.

	Button focusDeckA, focusDeckB, focusDeckC, focusDeckD;
	Encoder tempoFine, tempoCoarse;

	private TrackDeck deckA = new TrackDeck();
	private TrackDeck deckB = new TrackDeck();

	public boolean shiftDown = false;

	Focus focus = Focus.Clock;

	public DJController() {

		deckA.setPlay(PushAdapter.matrix[0], TraktorAdapter.playDeckA,
				TraktorAdapter.pauseDeckA);
		deckA.setCueButton(PushAdapter.matrix[1], TraktorAdapter.cueDeckAPress,
				TraktorAdapter.cueDeckARelease);
		deckA.setBeatjumpCoarseBackwardButton(PushAdapter.matrix[8],
				TraktorAdapter.beatjumpDeckA16BackwardPress,
				TraktorAdapter.beatjumpDeckA16BackwardRelease,
				TraktorAdapter.beatjumpDeckA32BackwardPress,
				TraktorAdapter.beatjumpDeckA32BackwardRelease);
		deckA.setBeatjumpFineBackwardButton(PushAdapter.matrix[9],
				TraktorAdapter.beatjumpDeckA1BackwardPress,
				TraktorAdapter.beatjumpDeckA1BackwardRelease,
				TraktorAdapter.beatjumpDeckA4BackwardPress,
				TraktorAdapter.beatjumpDeckA4BackwardRelease);
		deckA.setBeatjumpFineForwardButton(PushAdapter.matrix[10],
				TraktorAdapter.beatjumpDeckA1ForwardPress,
				TraktorAdapter.beatjumpDeckA1ForwardRelease,
				TraktorAdapter.beatjumpDeckA4ForwardPress,
				TraktorAdapter.beatjumpDeckA4ForwardRelease);
		deckA.setBeatjumpCoarseForwardButton(PushAdapter.matrix[11],
				TraktorAdapter.beatjumpDeckA16ForwardPress,
				TraktorAdapter.beatjumpDeckA16ForwardRelease,
				TraktorAdapter.beatjumpDeckA32ForwardPress,
				TraktorAdapter.beatjumpDeckA32ForwardRelease);
		deckA.setCue1Button(PushAdapter.matrix[16],
				TraktorAdapter.selectSetHotcueDeckA1Press,
				TraktorAdapter.selectSetHotcueDeckA1Release,
				TraktorAdapter.deleteHotcueDeckA1);
		deckA.setCue2Button(PushAdapter.matrix[17],
				TraktorAdapter.selectSetHotcueDeckA2Press,
				TraktorAdapter.selectSetHotcueDeckA2Release,
				TraktorAdapter.deleteHotcueDeckA2);
		deckA.setCue3Button(PushAdapter.matrix[18],
				TraktorAdapter.selectSetHotcueDeckA3Press,
				TraktorAdapter.selectSetHotcueDeckA3Release,
				TraktorAdapter.deleteHotcueDeckA3);
		deckA.setCue4Button(PushAdapter.matrix[19],
				TraktorAdapter.selectSetHotcueDeckA4Press,
				TraktorAdapter.selectSetHotcueDeckA4Release,
				TraktorAdapter.deleteHotcueDeckA4);
		deckA.setCue5Button(PushAdapter.matrix[24],
				TraktorAdapter.selectSetHotcueDeckA5Press,
				TraktorAdapter.selectSetHotcueDeckA5Release,
				TraktorAdapter.deleteHotcueDeckA5);
		deckA.setCue6Button(PushAdapter.matrix[25],
				TraktorAdapter.selectSetHotcueDeckA6Press,
				TraktorAdapter.selectSetHotcueDeckA6Release,
				TraktorAdapter.deleteHotcueDeckA6);
		deckA.setCue7Button(PushAdapter.matrix[26],
				TraktorAdapter.selectSetHotcueDeckA7Press,
				TraktorAdapter.selectSetHotcueDeckA7Release,
				TraktorAdapter.deleteHotcueDeckA7);
		deckA.setCue8Button(PushAdapter.matrix[27],
				TraktorAdapter.selectSetHotcueDeckA8Press,
				TraktorAdapter.selectSetHotcueDeckA8Release,
				TraktorAdapter.deleteHotcueDeckA8);
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

		tempoCoarse = PushAdapter.encoders[0];
		tempoCoarse.addListener(this);
		tempoFine = PushAdapter.encoders[1];
		tempoFine.addListener(this);
	}

	/**
	 * Internal Focus
	 * 
	 * @param control
	 */
	public void setFocusDeckAButton(Button control) {
		focusDeckA = control;
		control.addListener(this);
	}

	public void setFocusDeckBButton(Button control) {
		focusDeckB = control;
		control.addListener(this);
	}

	public void setFocusDeckCButton(Button control) {
		focusDeckC = control;
		control.addListener(this);
	}

	public void setFocusDeckDButton(Button control) {
		focusDeckD = control;
		control.addListener(this);
	}

	@Override
	public void buttonPressed(Button control) {
		if (control == focusDeckA) {
			focusDeckAPressed();
		} else if (control == focusDeckB) {
			focusDeckBPressed();
		} else if (control == focusDeckC) {
			focusDeckCPressed();
		} else if (control == focusDeckD) {
			focusDeckDPressed();
		}
	}

	@Override
	public void buttonReleased(Button control) {
		// TODO Auto-generated method stub

	}

	@Override
	public void increased(Encoder control) {
		if(control == tempoFine) {
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
		}
		else if(control == tempoCoarse) {
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
		if(control == tempoFine) {
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
		}
		else if(control == tempoCoarse) {
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
			setColor(focusDeckA, TitleButton.OFF);
		} else {
			focus = Focus.DeckA;
			focusAllOff();
			setColor(focusDeckA, TitleButton.BRIGHT_ON);
		}
	}

	void focusDeckBPressed() {
		if (focus == Focus.DeckB) {
			focus = Focus.Clock;
			setColor(focusDeckB, TitleButton.OFF);
		} else {
			focus = Focus.DeckB;
			focusAllOff();
			setColor(focusDeckB, TitleButton.BRIGHT_ON);
		}
	}

	void focusDeckCPressed() {
		if (focus == Focus.DeckC) {
			focus = Focus.Clock;
			setColor(focusDeckC, TitleButton.OFF);
		} else {
			focus = Focus.DeckC;
			focusAllOff();
			setColor(focusDeckC, TitleButton.BRIGHT_ON);
		}
	}

	void focusDeckDPressed() {
		if (focus == Focus.DeckD) {
			focus = Focus.Clock;
			setColor(focusDeckD, TitleButton.OFF);
		} else {
			focus = Focus.DeckD;
			focusAllOff();
			setColor(focusDeckD, TitleButton.BRIGHT_ON);
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
		setColor(focusDeckA, TitleButton.OFF);
		setColor(focusDeckB, TitleButton.OFF);
		setColor(focusDeckC, TitleButton.OFF);
		setColor(focusDeckD, TitleButton.OFF);
	}

}
