package de.sntr.pushdj.dj;

import de.sntr.pushdj.push.Button;
import de.sntr.pushdj.push.PushAdapter;
import static de.sntr.pushdj.traktor.TraktorAdapter.*;

public class DeckInit {

	static final Button b11 = PushAdapter.matrix[0];
	static final Button b12 = PushAdapter.matrix[1];
	static final Button b13 = PushAdapter.matrix[2];
	static final Button b14 = PushAdapter.matrix[3];
	static final Button b15 = PushAdapter.matrix[4];
	static final Button b16 = PushAdapter.matrix[5];
	static final Button b17 = PushAdapter.matrix[6];
	static final Button b18 = PushAdapter.matrix[7];
	static final Button b21 = PushAdapter.matrix[8];
	static final Button b22 = PushAdapter.matrix[9];
	static final Button b23 = PushAdapter.matrix[10];
	static final Button b24 = PushAdapter.matrix[11];
	static final Button b25 = PushAdapter.matrix[12];
	static final Button b26 = PushAdapter.matrix[13];
	static final Button b27 = PushAdapter.matrix[14];
	static final Button b28 = PushAdapter.matrix[15];
	static final Button b31 = PushAdapter.matrix[16];
	static final Button b32 = PushAdapter.matrix[17];
	static final Button b33 = PushAdapter.matrix[18];
	static final Button b34 = PushAdapter.matrix[19];
	static final Button b35 = PushAdapter.matrix[20];
	static final Button b36 = PushAdapter.matrix[21];
	static final Button b37 = PushAdapter.matrix[22];
	static final Button b38 = PushAdapter.matrix[23];
	static final Button b41 = PushAdapter.matrix[24];
	static final Button b42 = PushAdapter.matrix[25];
	static final Button b43 = PushAdapter.matrix[26];
	static final Button b44 = PushAdapter.matrix[27];
	static final Button b45 = PushAdapter.matrix[28];
	static final Button b46 = PushAdapter.matrix[29];
	static final Button b47 = PushAdapter.matrix[30];
	static final Button b48 = PushAdapter.matrix[31];
	static final Button b51 = PushAdapter.matrix[32];
	static final Button b52 = PushAdapter.matrix[33];
	static final Button b53 = PushAdapter.matrix[34];
	static final Button b54 = PushAdapter.matrix[35];
	static final Button b55 = PushAdapter.matrix[36];
	static final Button b56 = PushAdapter.matrix[37];
	static final Button b57 = PushAdapter.matrix[38];
	static final Button b58 = PushAdapter.matrix[39];
	static final Button b61 = PushAdapter.matrix[40];
	static final Button b62 = PushAdapter.matrix[41];
	static final Button b63 = PushAdapter.matrix[42];
	static final Button b64 = PushAdapter.matrix[43];
	static final Button b65 = PushAdapter.matrix[44];
	static final Button b66 = PushAdapter.matrix[45];
	static final Button b67 = PushAdapter.matrix[46];
	static final Button b68 = PushAdapter.matrix[47];
	static final Button b71 = PushAdapter.matrix[48];
	static final Button b72 = PushAdapter.matrix[49];
	static final Button b73 = PushAdapter.matrix[50];
	static final Button b74 = PushAdapter.matrix[51];
	static final Button b75 = PushAdapter.matrix[52];
	static final Button b76 = PushAdapter.matrix[53];
	static final Button b77 = PushAdapter.matrix[54];
	static final Button b78 = PushAdapter.matrix[55];
	static final Button b81 = PushAdapter.matrix[56];
	static final Button b82 = PushAdapter.matrix[57];
	static final Button b83 = PushAdapter.matrix[58];
	static final Button b84 = PushAdapter.matrix[59];
	static final Button b85 = PushAdapter.matrix[60];
	static final Button b86 = PushAdapter.matrix[61];
	static final Button b87 = PushAdapter.matrix[62];
	static final Button b88 = PushAdapter.matrix[63];
	
	public static void initTrackDeckALeft(TrackDeck deck) {
		initTrackDeckButtonsLeft(deck);
		initTrackDeckAMessages(deck);
	}

	public static void initTrackDeckARight(TrackDeck deck) {
		initTrackDeckButtonsRight(deck);
		initTrackDeckAMessages(deck);
	}
	
	public static void initTrackDeckBLeft(TrackDeck deck) {
		initTrackDeckButtonsLeft(deck);
		initTrackDeckBMessages(deck);
	}
	
	public static void initTrackDeckBRight(TrackDeck deck) {
		initTrackDeckButtonsRight(deck);
		initTrackDeckBMessages(deck);
	}
	
	public static void initTrackDeckCLeft(TrackDeck deck) {
		initTrackDeckButtonsLeft(deck);
		
	}
	
	public static void initTrackDeckCRight(TrackDeck deck) {
		initTrackDeckButtonsRight(deck);
		
	}
	
	public static void initTrackDeckDLeft(TrackDeck deck) {
		initTrackDeckButtonsLeft(deck);
		
	}
	
	public static void initTrackDeckDRight(TrackDeck deck) {
		initTrackDeckButtonsRight(deck);
		
	}

	private static void initTrackDeckButtonsLeft(TrackDeck deck) {
		deck.displayColumn = 1;
		deck.setPlayButton(b11);
		deck.setCueButton(b12);
		deck.setPhaseSyncButton(b13);
		deck.setFluxOnOffButton(b14);
		
		deck.setSyncPlayButton(b21);
		deck.setCupButton(b22);
		deck.setSyncOnOffButton(b23);
		deck.setTempoMasterButton(b24);
		
		deck.setHotcue1Button(b31);
		deck.setHotcue2Button(b32);
		deck.setHotcue3Button(b33);
		deck.setHotcue4Button(b34);
		
		deck.setHotcue5Button(b41);
		deck.setHotcue6Button(b42);
		deck.setHotcue7Button(b43);
		deck.setHotcue8Button(b44);
		
		deck.setJogTurnCoarseBackwardButton(b51);
		deck.setJogTurnFineBackwardButton(b52);
		deck.setJogTurnFineForwardButton(b53);
		deck.setJogTurnCoarseForwardButton(b54);
		
		deck.setBeatJumpForwardButton(b62);
		deck.setBeatJumpBackwardButton(b61);
		deck.setLoopMoveForwardButton(b63);
		deck.setLoopMoveBackwardButton(b64);
		
		deck.setLoopInMoveForwardButton(b71);
		deck.setLoopInMoveBackwardButton(b72);
		deck.setLoopOutMoveForwardButton(b73);
		deck.setLoopOutMoveBackwardButton(b74);

		deck.setLoopActiveButton(b81);
		deck.setLoopActiveButton(b81);
		deck.setLoopSelectSetButton(b83);
		deck.setLoopSelectSetBackwardButton(b84);
		
		deck.setStep32Button(PushAdapter.scales);
		deck.setStep16Button(PushAdapter.repeat);
		deck.setStep8Button(PushAdapter.octaveDown);
		deck.setStep4Button(PushAdapter.addEffect);
		deck.setStep2Button(PushAdapter.note);
		deck.setStep1Button(PushAdapter.select);
	}
	
	private static void initTrackDeckButtonsRight(TrackDeck deck) {
		deck.displayColumn = 2;
		deck.setPlayButton(b15);
		deck.setCueButton(b16);
		deck.setPhaseSyncButton(b17);
		deck.setFluxOnOffButton(b18);
		deck.setTempoMasterButton(b28);
		deck.setHotcue1Button(b25);
		deck.setHotcue2Button(b26);
		deck.setHotcue3Button(b27);
		deck.setHotcue4Button(b28);
		deck.setHotcue5Button(b35);
		deck.setHotcue6Button(b36);
		deck.setHotcue7Button(b37);
		deck.setHotcue8Button(b38);
		deck.setJogTurnCoarseBackwardButton(b45);
		deck.setJogTurnFineBackwardButton(b46);
		deck.setJogTurnFineForwardButton(b47);
		deck.setJogTurnCoarseForwardButton(b48);
		deck.setBeatJumpBackwardButton(b57);
		deck.setBeatJumpForwardButton(b58);
		deck.setLoopActiveButton(b85);
		deck.setLoopMoveForwardButton(b87);
		deck.setLoopMoveBackwardButton(b88);
		deck.setLoopInMoveForwardButton(b75);
		deck.setLoopInMoveBackwardButton(b76);
		deck.setLoopOutMoveForwardButton(b77);
		deck.setLoopOutMoveBackwardButton(b78);
	}
	
	private static void initTrackDeckAMessages(TrackDeck deck) {
		deck.setPlayMessage(playDeckA, pauseDeckA, playReturnDeckA);
		deck.setCueMessage(cueDeckAPress, cueDeckARelease);
		deck.setCupMessage(cupDeckAPress, cupDeckARelease);
		deck.setPhaseSyncMessage(phaseSyncDeckA, tempoSyncDeckA);
		deck.setSyncOnOffMessage(syncOnOffDeckA, syncOnOffReturnDeckA);
		deck.setFluxOnOffMessage(fluxOnOffDeckA, fluxOnOffDeckAReturn);
		deck.setTempoMasterMessage(tempoMasterDeckA, tempoMasterDeckAReturn);
		deck.setBeatPhaseReturnMessage(beatPhaseReturnDeckA);
		deck.setBeatJumpBackwardMessage(beatJumpDeckABackwardPress,	beatJumpDeckABackwardRelease);
		deck.setBeatJumpForwardMessage(beatJumpDeckAForwardPress, beatJumpDeckAForwardRelease);
		deck.setLoopActiveMessage(loopActiveDeckA, loopActiveReturnDeckA);
		deck.setLoopMoveForwardMessage(loopMoveForwardDeckA);
		deck.setLoopMoveBackwardMessage(loopMoveBackwardDeckA);
		deck.setLoopInMoveForwardMessage(loopInMoveForwardDeckA);
		deck.setLoopInMoveBackwardMessage(loopInMoveBackwardDeckA);
		deck.setLoopOutMoveForwardMessage(loopOutMoveForwardDeckA);
		deck.setLoopOutMoveBackwardMessage(loopOutMoveBackwardDeckA);
		deck.setLoopSelectSetMessage(loopSizeSelectSetf32DeckA, 
				loopSizeSelectSetf16DeckA, 
				loopSizeSelectSetf8DeckA, 
				loopSizeSelectSetf4DeckA, 
				loopSizeSelectSetf2DeckA, 
				loopSizeSelectSeti32DeckA, 
				loopSizeSelectSeti16DeckA, 
				loopSizeSelectSeti8DeckA, 
				loopSizeSelectSeti4DeckA, 
				loopSizeSelectSeti2DeckA, 
				loopSizeSelectSeti1DeckA);
		deck.setLoopSelectSetBackwardMessage(loopSizeSelectSetBackwardf32DeckA, 
				loopSizeSelectSetBackwardf16DeckA, 
				loopSizeSelectSetBackwardf8DeckA, 
				loopSizeSelectSetBackwardf4DeckA, 
				loopSizeSelectSetBackwardf2DeckA, 
				loopSizeSelectSetBackwardi32DeckA, 
				loopSizeSelectSetBackwardi16DeckA, 
				loopSizeSelectSetBackwardi8DeckA, 
				loopSizeSelectSetBackwardi4DeckA, 
				loopSizeSelectSetBackwardi2DeckA, 
				loopSizeSelectSetBackwardi1DeckA);
		deck.setSizeSelectorMessage(sizeSelectorf32DeckA, 
				sizeSelectorf16DeckA, 
				sizeSelectorf8DeckA, 
				sizeSelectorf4DeckA, 
				sizeSelectorf2DeckA, 
				sizeSelectori32DeckA, 
				sizeSelectori16DeckA, 
				sizeSelectori8DeckA, 
				sizeSelectori4DeckA, 
				sizeSelectori2DeckA, 
				sizeSelectori1DeckA,
				sizeSelectorReturnDeckA);
		
		deck.setHotcue1Message(selectSetHotcueDeckA1Press, selectSetHotcueDeckA1Release, deleteHotcueDeckA1, hotcueTypeDeckA1);
		deck.setHotcue2Message(selectSetHotcueDeckA2Press, selectSetHotcueDeckA2Release, deleteHotcueDeckA2, hotcueTypeDeckA2);
		deck.setHotcue3Message(selectSetHotcueDeckA3Press, selectSetHotcueDeckA3Release, deleteHotcueDeckA3, hotcueTypeDeckA3);
		deck.setHotcue4Message(selectSetHotcueDeckA4Press, selectSetHotcueDeckA4Release, deleteHotcueDeckA4, hotcueTypeDeckA4);
		deck.setHotcue5Message(selectSetHotcueDeckA5Press, selectSetHotcueDeckA5Release, deleteHotcueDeckA5, hotcueTypeDeckA5);
		deck.setHotcue6Message(selectSetHotcueDeckA6Press, selectSetHotcueDeckA6Release, deleteHotcueDeckA6, hotcueTypeDeckA6);
		deck.setHotcue7Message(selectSetHotcueDeckA7Press, selectSetHotcueDeckA7Release, deleteHotcueDeckA7, hotcueTypeDeckA7);
		deck.setHotcue8Message(selectSetHotcueDeckA8Press, selectSetHotcueDeckA8Release, deleteHotcueDeckA8, hotcueTypeDeckA8);

		deck.setJogTurnCoarseBackwardMessage(jogTurnDeckACoarseBackward);
		deck.setJogTurnFineBackwardMessage(jogTurnDeckAFineBackward);
		deck.setJogTurnFineForwardMessage(jogTurnDeckAFineForward);
		deck.setJogTurnCoarseForwardMessage(jogTurnDeckACoarseForward);

	}
	
	private static void initTrackDeckBMessages(TrackDeck deck) {
		deck.setPlayMessage(playDeckB, pauseDeckB, playReturnDeckB);
		deck.setCueMessage(cueDeckBPress, cueDeckBRelease);
		deck.setPhaseSyncMessage(phaseSyncDeckB, tempoSyncDeckB);
		deck.setSyncOnOffMessage(syncOnOffDeckB, syncOnOffReturnDeckB);
		deck.setTempoMasterMessage(tempoMasterDeckB, tempoMasterDeckBReturn);
		deck.setBeatJumpBackwardMessage(moveDeckBBackwardPress,	moveDeckBBackwardRelease);
		deck.setBeatJumpForwardMessage(moveDeckBForwardPress, moveDeckBForwardRelease);
		deck.setLoopActiveMessage(loopActiveDeckB, loopActiveReturnDeckB);
		deck.setLoopMoveForwardMessage(loopMoveForwardDeckB);
		deck.setLoopMoveBackwardMessage(loopMoveBackwardDeckB);
		deck.setLoopInMoveForwardMessage(loopInMoveForwardDeckB);
		deck.setLoopInMoveBackwardMessage(loopInMoveBackwardDeckB);
		deck.setLoopOutMoveForwardMessage(loopOutMoveForwardDeckB);
		deck.setLoopOutMoveBackwardMessage(loopOutMoveBackwardDeckB);
		deck.setLoopSelectSetMessage(loopSizeSelectSetf32DeckB, 
				loopSizeSelectSetf16DeckB, 
				loopSizeSelectSetf8DeckB, 
				loopSizeSelectSetf4DeckB, 
				loopSizeSelectSetf2DeckB, 
				loopSizeSelectSeti32DeckB, 
				loopSizeSelectSeti16DeckB, 
				loopSizeSelectSeti8DeckB, 
				loopSizeSelectSeti4DeckB, 
				loopSizeSelectSeti2DeckB, 
				loopSizeSelectSeti1DeckB);
		deck.setLoopSelectSetBackwardMessage(loopSizeSelectSetBackwardf32DeckB, 
				loopSizeSelectSetBackwardf16DeckB, 
				loopSizeSelectSetBackwardf8DeckB, 
				loopSizeSelectSetBackwardf4DeckB, 
				loopSizeSelectSetBackwardf2DeckB, 
				loopSizeSelectSetBackwardi32DeckB, 
				loopSizeSelectSetBackwardi16DeckB, 
				loopSizeSelectSetBackwardi8DeckB, 
				loopSizeSelectSetBackwardi4DeckB, 
				loopSizeSelectSetBackwardi2DeckB, 
				loopSizeSelectSetBackwardi1DeckB);
		deck.setHotcue1Message(selectSetHotcueDeckB1Press, selectSetHotcueDeckB1Release, deleteHotcueDeckB1, hotcueTypeDeckB1);
		deck.setHotcue2Message(selectSetHotcueDeckB2Press, selectSetHotcueDeckB2Release, deleteHotcueDeckB2, hotcueTypeDeckB2);
		deck.setHotcue3Message(selectSetHotcueDeckB3Press, selectSetHotcueDeckB3Release, deleteHotcueDeckB3, hotcueTypeDeckB3);
		deck.setHotcue4Message(selectSetHotcueDeckB4Press, selectSetHotcueDeckB4Release, deleteHotcueDeckB4, hotcueTypeDeckB4);
		deck.setHotcue5Message(selectSetHotcueDeckB5Press, selectSetHotcueDeckB5Release, deleteHotcueDeckB5, hotcueTypeDeckB5);
		deck.setHotcue6Message(selectSetHotcueDeckB6Press, selectSetHotcueDeckB6Release, deleteHotcueDeckB6, hotcueTypeDeckB6);
		deck.setHotcue7Message(selectSetHotcueDeckB7Press, selectSetHotcueDeckB7Release, deleteHotcueDeckB7, hotcueTypeDeckB7);
		deck.setHotcue8Message(selectSetHotcueDeckB8Press, selectSetHotcueDeckB8Release, deleteHotcueDeckB8, hotcueTypeDeckB8);

		deck.setJogTurnCoarseBackwardMessage(jogTurnDeckBCoarseBackward);
		deck.setJogTurnFineBackwardMessage(jogTurnDeckBFineBackward);
		deck.setJogTurnFineForwardMessage(jogTurnDeckBFineForward);
		deck.setJogTurnCoarseForwardMessage(jogTurnDeckBCoarseForward);

	}
	
	
}
