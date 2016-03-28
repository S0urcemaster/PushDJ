package de.sntr.pushdj.dj;

import de.sntr.pushdj.push.Button;
import de.sntr.pushdj.push.PushAdapter;
import de.sntr.pushdj.traktor.TraktorAdapter;

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
		deck.setPlayButton(b11);
		deck.setCueButton(b12);
		deck.setSyncButton(b13);
		deck.setTempoMasterButton(b14);
		deck.setHotcue1Button(b21);
		deck.setHotcue2Button(b22);
		deck.setHotcue3Button(b23);
		deck.setHotcue4Button(b24);
		deck.setHotcue5Button(b31);
		deck.setHotcue6Button(b32);
		deck.setHotcue7Button(b33);
		deck.setHotcue8Button(b34);
		deck.setJogTurnCoarseBackwardButton(b41);
		deck.setJogTurnFineBackwardButton(b42);
		deck.setJogTurnFineForwardButton(b43);
		deck.setJogTurnCoarseForwardButton(b44);
		deck.setBeatjumpCoarseBackwardButton(b51);
		deck.setBeatjumpFineBackwardButton(b52);
		deck.setBeatjumpFineForwardButton(b53);
		deck.setBeatjumpCoarseForwardButton(b54);
	}
	
	private static void initTrackDeckButtonsRight(TrackDeck deck) {
		deck.setPlayButton(b15);
		deck.setCueButton(b16);
		deck.setSyncButton(b17);
		deck.setTempoMasterButton(b18);
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
		deck.setBeatjumpCoarseBackwardButton(b55);
		deck.setBeatjumpFineBackwardButton(b56);
		deck.setBeatjumpFineForwardButton(b57);
		deck.setBeatjumpCoarseForwardButton(b58);
	}
	
	private static void initTrackDeckAMessages(TrackDeck deck) {
		deck.setPlayMessage(TraktorAdapter.playDeckA,
				TraktorAdapter.pauseDeckA, TraktorAdapter.playReturnDeckA);
		deck.setCueMessage(TraktorAdapter.cueDeckAPress,
				TraktorAdapter.cueDeckARelease);
		deck.setSyncMessage(TraktorAdapter.syncOnDeckA,
				TraktorAdapter.phaseSyncDeckA, TraktorAdapter.syncOnReturnDeckA);
		deck.setTempoMasterMessage(TraktorAdapter.tempoMasterDeckA,
				TraktorAdapter.tempoMasterDeckAReturn);
		deck.setBeatjumpCoarseBackwardMessage(
				TraktorAdapter.beatjumpDeckA16BackwardPress,
				TraktorAdapter.beatjumpDeckA16BackwardRelease,
				TraktorAdapter.beatjumpDeckA32BackwardPress,
				TraktorAdapter.beatjumpDeckA32BackwardRelease);
		deck.setBeatjumpFineBackwardMessage(
				TraktorAdapter.beatjumpDeckA1BackwardPress,
				TraktorAdapter.beatjumpDeckA1BackwardRelease,
				TraktorAdapter.beatjumpDeckA4BackwardPress,
				TraktorAdapter.beatjumpDeckA4BackwardRelease);
		deck.setBeatjumpFineForwardMessage(
				TraktorAdapter.beatjumpDeckA1ForwardPress,
				TraktorAdapter.beatjumpDeckA1ForwardRelease,
				TraktorAdapter.beatjumpDeckA4ForwardPress,
				TraktorAdapter.beatjumpDeckA4ForwardRelease);
		deck.setBeatjumpCoarseForwardMessage(
				TraktorAdapter.beatjumpDeckA16ForwardPress,
				TraktorAdapter.beatjumpDeckA16ForwardRelease,
				TraktorAdapter.beatjumpDeckA32ForwardPress,
				TraktorAdapter.beatjumpDeckA32ForwardRelease);
		deck.setHotcue1Message(TraktorAdapter.selectSetHotcueDeckA1Press,
				TraktorAdapter.selectSetHotcueDeckA1Release,
				TraktorAdapter.deleteHotcueDeckA1,
				TraktorAdapter.hotcueTypeDeckA1);
		deck.setHotcue2Message(TraktorAdapter.selectSetHotcueDeckA2Press,
				TraktorAdapter.selectSetHotcueDeckA2Release,
				TraktorAdapter.deleteHotcueDeckA2,
				TraktorAdapter.hotcueTypeDeckA2);
		deck.setHotcue3Message(TraktorAdapter.selectSetHotcueDeckA3Press,
				TraktorAdapter.selectSetHotcueDeckA3Release,
				TraktorAdapter.deleteHotcueDeckA3,
				TraktorAdapter.hotcueTypeDeckA3);
		deck.setHotcue4Message(TraktorAdapter.selectSetHotcueDeckA4Press,
				TraktorAdapter.selectSetHotcueDeckA4Release,
				TraktorAdapter.deleteHotcueDeckA4,
				TraktorAdapter.hotcueTypeDeckA4);
		deck.setHotcue5Message(TraktorAdapter.selectSetHotcueDeckA5Press,
				TraktorAdapter.selectSetHotcueDeckA5Release,
				TraktorAdapter.deleteHotcueDeckA5,
				TraktorAdapter.hotcueTypeDeckA5);
		deck.setHotcue6Message(TraktorAdapter.selectSetHotcueDeckA6Press,
				TraktorAdapter.selectSetHotcueDeckA6Release,
				TraktorAdapter.deleteHotcueDeckA6,
				TraktorAdapter.hotcueTypeDeckA6);
		deck.setHotcue7Message(TraktorAdapter.selectSetHotcueDeckA7Press,
				TraktorAdapter.selectSetHotcueDeckA7Release,
				TraktorAdapter.deleteHotcueDeckA7,
				TraktorAdapter.hotcueTypeDeckA7);
		deck.setHotcue8Message(TraktorAdapter.selectSetHotcueDeckA8Press,
				TraktorAdapter.selectSetHotcueDeckA8Release,
				TraktorAdapter.deleteHotcueDeckA8,
				TraktorAdapter.hotcueTypeDeckA8);

		deck.setJogTurnCoarseBackwardMessage(TraktorAdapter.jogTurnDeckACoarseBackward);
		deck.setJogTurnFineBackwardMessage(TraktorAdapter.jogTurnDeckAFineBackward);
		deck.setJogTurnFineForwardMessage(TraktorAdapter.jogTurnDeckAFineForward);
		deck.setJogTurnCoarseForwardMessage(TraktorAdapter.jogTurnDeckACoarseForward);

	}
	
	private static void initTrackDeckBMessages(TrackDeck deck) {
		deck.setPlayMessage(TraktorAdapter.playDeckB,
				TraktorAdapter.pauseDeckB, TraktorAdapter.playReturnDeckB);
		deck.setCueMessage(TraktorAdapter.cueDeckBPress,
				TraktorAdapter.cueDeckBRelease);
		deck.setSyncMessage(TraktorAdapter.syncOnDeckB,
				TraktorAdapter.phaseSyncDeckB, TraktorAdapter.syncOnReturnDeckB);
		deck.setTempoMasterMessage(TraktorAdapter.tempoMasterDeckB,
				TraktorAdapter.tempoMasterDeckBReturn);
		deck.setBeatjumpCoarseBackwardMessage(
				TraktorAdapter.beatjumpDeckB16BackwardPress,
				TraktorAdapter.beatjumpDeckB16BackwardRelease,
				TraktorAdapter.beatjumpDeckB32BackwardPress,
				TraktorAdapter.beatjumpDeckB32BackwardRelease);
		deck.setBeatjumpFineBackwardMessage(
				TraktorAdapter.beatjumpDeckB1BackwardPress,
				TraktorAdapter.beatjumpDeckB1BackwardRelease,
				TraktorAdapter.beatjumpDeckB4BackwardPress,
				TraktorAdapter.beatjumpDeckB4BackwardRelease);
		deck.setBeatjumpFineForwardMessage(
				TraktorAdapter.beatjumpDeckB1ForwardPress,
				TraktorAdapter.beatjumpDeckB1ForwardRelease,
				TraktorAdapter.beatjumpDeckB4ForwardPress,
				TraktorAdapter.beatjumpDeckB4ForwardRelease);
		deck.setBeatjumpCoarseForwardMessage(
				TraktorAdapter.beatjumpDeckB16ForwardPress,
				TraktorAdapter.beatjumpDeckB16ForwardRelease,
				TraktorAdapter.beatjumpDeckB32ForwardPress,
				TraktorAdapter.beatjumpDeckB32ForwardRelease);
		deck.setHotcue1Message(TraktorAdapter.selectSetHotcueDeckB1Press,
				TraktorAdapter.selectSetHotcueDeckB1Release,
				TraktorAdapter.deleteHotcueDeckB1,
				TraktorAdapter.hotcueTypeDeckB1);
		deck.setHotcue2Message(TraktorAdapter.selectSetHotcueDeckB2Press,
				TraktorAdapter.selectSetHotcueDeckB2Release,
				TraktorAdapter.deleteHotcueDeckB2,
				TraktorAdapter.hotcueTypeDeckB2);
		deck.setHotcue3Message(TraktorAdapter.selectSetHotcueDeckB3Press,
				TraktorAdapter.selectSetHotcueDeckB3Release,
				TraktorAdapter.deleteHotcueDeckB3,
				TraktorAdapter.hotcueTypeDeckB3);
		deck.setHotcue4Message(TraktorAdapter.selectSetHotcueDeckB4Press,
				TraktorAdapter.selectSetHotcueDeckB4Release,
				TraktorAdapter.deleteHotcueDeckB4,
				TraktorAdapter.hotcueTypeDeckB4);
		deck.setHotcue5Message(TraktorAdapter.selectSetHotcueDeckB5Press,
				TraktorAdapter.selectSetHotcueDeckB5Release,
				TraktorAdapter.deleteHotcueDeckB5,
				TraktorAdapter.hotcueTypeDeckB5);
		deck.setHotcue6Message(TraktorAdapter.selectSetHotcueDeckB6Press,
				TraktorAdapter.selectSetHotcueDeckB6Release,
				TraktorAdapter.deleteHotcueDeckB6,
				TraktorAdapter.hotcueTypeDeckB6);
		deck.setHotcue7Message(TraktorAdapter.selectSetHotcueDeckB7Press,
				TraktorAdapter.selectSetHotcueDeckB7Release,
				TraktorAdapter.deleteHotcueDeckB7,
				TraktorAdapter.hotcueTypeDeckB7);
		deck.setHotcue8Message(TraktorAdapter.selectSetHotcueDeckB8Press,
				TraktorAdapter.selectSetHotcueDeckB8Release,
				TraktorAdapter.deleteHotcueDeckB8,
				TraktorAdapter.hotcueTypeDeckB8);

		deck.setJogTurnCoarseBackwardMessage(TraktorAdapter.jogTurnDeckBCoarseBackward);
		deck.setJogTurnFineBackwardMessage(TraktorAdapter.jogTurnDeckBFineBackward);
		deck.setJogTurnFineForwardMessage(TraktorAdapter.jogTurnDeckBFineForward);
		deck.setJogTurnCoarseForwardMessage(TraktorAdapter.jogTurnDeckBCoarseForward);

	}
	
	
}
