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
		
	}
	
	public static void initTrackDeckBRight(TrackDeck deck) {
		
	}
	
	public static void initTrackDeckCLeft(TrackDeck deck) {
		
	}
	
	public static void initTrackDeckCRight(TrackDeck deck) {
		
	}
	
	public static void initTrackDeckDLeft(TrackDeck deck) {
		
	}
	
	public static void initTrackDeckDRight(TrackDeck deck) {
		
	}

	private static void initTrackDeckButtonsLeft(TrackDeck deck) {
		deck.setPlayButton(b11);
		deck.setCueButton(b12);
		deck.setSyncButton(b13);
		deck.setTempoMasterButton(b14);
		deck.setBeatjumpCoarseBackwardButton(b21);
		deck.setBeatjumpFineBackwardButton(b22);
		deck.setBeatjumpFineForwardButton(b23);
		deck.setBeatjumpCoarseForwardButton(b24);
		deck.setCue1Button(b31);
		deck.setCue2Button(b32);
		deck.setCue3Button(b33);
		deck.setCue4Button(b34);
		deck.setCue5Button(b41);
		deck.setCue6Button(b42);
		deck.setCue7Button(b43);
		deck.setCue8Button(b44);
		deck.setJogTurnCoarseBackwardButton(b51);
		deck.setJogTurnFineBackwardButton(b52);
		deck.setJogTurnFineForwardButton(b53);
		deck.setJogTurnCoarseForwardButton(b54);
	}
	
	private static void initTrackDeckButtonsRight(TrackDeck deck) {
		deck.setPlayButton(b15);
		deck.setCueButton(b16);
		deck.setSyncButton(b17);
		deck.setTempoMasterButton(b18);
		deck.setBeatjumpCoarseBackwardButton(b25);
		deck.setBeatjumpFineBackwardButton(b26);
		deck.setBeatjumpFineForwardButton(b27);
		deck.setBeatjumpCoarseForwardButton(b28);
		deck.setCue1Button(b35);
		deck.setCue2Button(b36);
		deck.setCue3Button(b37);
		deck.setCue4Button(b38);
		deck.setCue5Button(b45);
		deck.setCue6Button(b46);
		deck.setCue7Button(b47);
		deck.setCue8Button(b48);
		deck.setJogTurnCoarseBackwardButton(b55);
		deck.setJogTurnFineBackwardButton(b56);
		deck.setJogTurnFineForwardButton(b57);
		deck.setJogTurnCoarseForwardButton(b58);
	}
	
	private static void initTrackDeckAMessages(TrackDeck deck) {		
		deck.setPlayMessage(TraktorAdapter.playDeckA, TraktorAdapter.pauseDeckA);
		deck.setCueMessage(TraktorAdapter.cueDeckAPress, TraktorAdapter.cueDeckARelease);
		deck.setSyncMessage(TraktorAdapter.syncOnDeckA, TraktorAdapter.phaseSyncDeckA, TraktorAdapter.syncOnReturnDeckA);
		deck.setTempoMasterMessage(TraktorAdapter.tempoMasterDeckA, TraktorAdapter.tempoMasterDeckAReturn);
		deck.setBeatjumpCoarseBackwardMessage(TraktorAdapter.beatjumpDeckA16BackwardPress,
				TraktorAdapter.beatjumpDeckA16BackwardRelease, TraktorAdapter.beatjumpDeckA32BackwardPress,
				TraktorAdapter.beatjumpDeckA32BackwardRelease);
		deck.setBeatjumpFineBackwardMessage(TraktorAdapter.beatjumpDeckA1BackwardPress,
				TraktorAdapter.beatjumpDeckA1BackwardRelease, TraktorAdapter.beatjumpDeckA4BackwardPress,
				TraktorAdapter.beatjumpDeckA4BackwardRelease);
		deck.setBeatjumpFineForwardMessage(TraktorAdapter.beatjumpDeckA1ForwardPress,
				TraktorAdapter.beatjumpDeckA1ForwardRelease, TraktorAdapter.beatjumpDeckA4ForwardPress,
				TraktorAdapter.beatjumpDeckA4ForwardRelease);
		deck.setBeatjumpCoarseForwardMessage(TraktorAdapter.beatjumpDeckA16ForwardPress,
				TraktorAdapter.beatjumpDeckA16ForwardRelease, TraktorAdapter.beatjumpDeckA32ForwardPress,
				TraktorAdapter.beatjumpDeckA32ForwardRelease);
		deck.setCue1Message(TraktorAdapter.selectSetHotcueDeckA1Press,
				TraktorAdapter.selectSetHotcueDeckA1Release, TraktorAdapter.deleteHotcueDeckA1);
		deck.setCue2Message(TraktorAdapter.selectSetHotcueDeckA2Press,
				TraktorAdapter.selectSetHotcueDeckA2Release, TraktorAdapter.deleteHotcueDeckA2);
		deck.setCue3Message(TraktorAdapter.selectSetHotcueDeckA3Press,
				TraktorAdapter.selectSetHotcueDeckA3Release, TraktorAdapter.deleteHotcueDeckA3);
		deck.setCue4Message(TraktorAdapter.selectSetHotcueDeckA4Press,
				TraktorAdapter.selectSetHotcueDeckA4Release, TraktorAdapter.deleteHotcueDeckA4);
		deck.setCue5Message(TraktorAdapter.selectSetHotcueDeckA5Press,
				TraktorAdapter.selectSetHotcueDeckA5Release, TraktorAdapter.deleteHotcueDeckA5);
		deck.setCue6Message(TraktorAdapter.selectSetHotcueDeckA6Press,
				TraktorAdapter.selectSetHotcueDeckA6Release, TraktorAdapter.deleteHotcueDeckA6);
		deck.setCue7Message(TraktorAdapter.selectSetHotcueDeckA7Press,
				TraktorAdapter.selectSetHotcueDeckA7Release, TraktorAdapter.deleteHotcueDeckA7);
		deck.setCue8Message(TraktorAdapter.selectSetHotcueDeckA8Press,
				TraktorAdapter.selectSetHotcueDeckA8Release, TraktorAdapter.deleteHotcueDeckA8);

		deck.setPlayReturnMessage(TraktorAdapter.playReturnDeckA);
		deck.setHotcueType1Message(TraktorAdapter.hotcueTypeDeckA1);
		deck.setHotcueType2Message(TraktorAdapter.hotcueTypeDeckA2);
		deck.setHotcueType3Message(TraktorAdapter.hotcueTypeDeckA3);
		deck.setHotcueType4Message(TraktorAdapter.hotcueTypeDeckA4);
		deck.setHotcueType5Message(TraktorAdapter.hotcueTypeDeckA5);
		deck.setHotcueType6Message(TraktorAdapter.hotcueTypeDeckA6);
		deck.setHotcueType7Message(TraktorAdapter.hotcueTypeDeckA7);
		deck.setHotcueType8Message(TraktorAdapter.hotcueTypeDeckA8);
		
		deck.setJogTurnCoarseBackwardMessage(TraktorAdapter.jogTurnDeckACoarseBackward);
		deck.setJogTurnFineBackwardMessage(TraktorAdapter.jogTurnDeckAFineBackward);
		deck.setJogTurnFineForwardMessage(TraktorAdapter.jogTurnDeckAFineForward);
		deck.setJogTurnCoarseForwardMessage(TraktorAdapter.jogTurnDeckACoarseForward);

		
	}
	
	
}
