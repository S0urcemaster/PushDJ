package de.sntr.pushdj.traktor;

import java.util.HashMap;
import java.util.Map;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.ShortMessage;

import de.tobiaserichsen.tevm.TeVirtualMIDI;

public class TraktorAdapter {

	// global, channel 0
	public static TraktorMessage browserDownPress;
	public static TraktorMessage browserUpPress;
	public static TraktorMessage browserDownRelease;
	public static TraktorMessage browserUpRelease;
	public static TraktorMessage tempoMasterFineIncrease;
	public static TraktorMessage tempoMasterFineDecrease;
	public static TraktorMessage tempoMasterCoarseIncrease;
	public static TraktorMessage tempoMasterCoarseDecrease;
	public static TraktorMessage tempoDeckAFineIncrease;
	public static TraktorMessage tempoDeckAFineDecrease;
	public static TraktorMessage tempoDeckACoarseIncrease;
	public static TraktorMessage tempoDeckACoarseDecrease;
	public static TraktorMessage tempoDeckBFineIncrease;
	public static TraktorMessage tempoDeckBFineDecrease;
	public static TraktorMessage tempoDeckBCoarseIncrease;
	public static TraktorMessage tempoDeckBCoarseDecrease;
	public static TraktorMessage tempoDeckCFineIncrease;
	public static TraktorMessage tempoDeckCFineDecrease;
	public static TraktorMessage tempoDeckCCoarseIncrease;
	public static TraktorMessage tempoDeckCCoarseDecrease;
	public static TraktorMessage tempoDeckDFineIncrease;
	public static TraktorMessage tempoDeckDFineDecrease;
	public static TraktorMessage tempoDeckDCoarseIncrease;
	public static TraktorMessage tempoDeckDCoarseDecrease;
	public static TraktorMessage sendMonitorState; //internal, no button. get all returns (hotcue states...)

	// DeckA, channel 1
	public static TraktorMessage playDeckA;
	public static TraktorMessage pauseDeckA;
	public static TraktorMessage playReturnDeckA;
	public static TraktorMessage loadDeckA;
	public static TraktorMessage cueDeckAPress;
	public static TraktorMessage cueDeckARelease;
	
	public static TraktorMessage moveModeDeckA;
	public static TraktorMessage moveModeDeckAReturn;
	public static TraktorMessage moveSizeDeckAReturn;
	public static TraktorMessage moveSizeDeckAForwardPress;
	public static TraktorMessage moveDeckAForwardPress;
	public static TraktorMessage moveSizeDeckABackwardPress;
	public static TraktorMessage moveDeckABackwardPress;
	public static TraktorMessage moveSizeDeckAForwardRelease;
	public static TraktorMessage moveDeckAForwardRelease;
	public static TraktorMessage moveSizeDeckABackwardRelease;
	public static TraktorMessage moveDeckABackwardRelease;

	public static TraktorMessage loopActiveDeckA;
	public static TraktorMessage loopSizeIncDeckAPress;
	public static TraktorMessage loopSizeDecDeckAPress;
	public static TraktorMessage loopSizeIncDeckARelease;
	public static TraktorMessage loopSizeDecDeckARelease;
	public static TraktorMessage loopInDeckA;
	public static TraktorMessage loopOutDeckA;
	public static TraktorMessage loopActiveReturnDeckA;
	public static TraktorMessage loopSizeReturnDeckA;

	public static TraktorMessage selectSetHotcueDeckA1Press;
	public static TraktorMessage selectSetHotcueDeckA1Release;
	public static TraktorMessage selectSetHotcueDeckA2Press;
	public static TraktorMessage selectSetHotcueDeckA2Release;
	public static TraktorMessage selectSetHotcueDeckA3Press;
	public static TraktorMessage selectSetHotcueDeckA3Release;
	public static TraktorMessage selectSetHotcueDeckA4Press;
	public static TraktorMessage selectSetHotcueDeckA4Release;
	public static TraktorMessage selectSetHotcueDeckA5Press;
	public static TraktorMessage selectSetHotcueDeckA5Release;
	public static TraktorMessage selectSetHotcueDeckA6Press;
	public static TraktorMessage selectSetHotcueDeckA6Release;
	public static TraktorMessage selectSetHotcueDeckA7Press;
	public static TraktorMessage selectSetHotcueDeckA7Release;
	public static TraktorMessage selectSetHotcueDeckA8Press;
	public static TraktorMessage selectSetHotcueDeckA8Release;
	public static TraktorMessage deleteHotcueDeckA1;
	public static TraktorMessage deleteHotcueDeckA2;
	public static TraktorMessage deleteHotcueDeckA3;
	public static TraktorMessage deleteHotcueDeckA4;
	public static TraktorMessage deleteHotcueDeckA5;
	public static TraktorMessage deleteHotcueDeckA6;
	public static TraktorMessage deleteHotcueDeckA7;
	public static TraktorMessage deleteHotcueDeckA8;
	public static TraktorMessage hotcueTypeDeckA1;
	public static TraktorMessage hotcueTypeDeckA2;
	public static TraktorMessage hotcueTypeDeckA3;
	public static TraktorMessage hotcueTypeDeckA4;
	public static TraktorMessage hotcueTypeDeckA5;
	public static TraktorMessage hotcueTypeDeckA6;
	public static TraktorMessage hotcueTypeDeckA7;
	public static TraktorMessage hotcueTypeDeckA8;
	public static TraktorMessage jogTurnDeckAFineForward;
	public static TraktorMessage jogTurnDeckAFineBackward;
	public static TraktorMessage jogTurnDeckACoarseForward;
	public static TraktorMessage jogTurnDeckACoarseBackward;
	public static TraktorMessage phaseSyncDeckA;
	public static TraktorMessage syncOnDeckA;
	public static TraktorMessage syncOnReturnDeckA;
	public static TraktorMessage tempoMasterDeckA;
	public static TraktorMessage tempoMasterDeckAReturn;
	
	// DeckB, channel 2
	public static TraktorMessage playDeckB;
	public static TraktorMessage pauseDeckB;
	public static TraktorMessage playReturnDeckB;
	public static TraktorMessage loadDeckB;
	public static TraktorMessage cueDeckBPress;
	public static TraktorMessage cueDeckBRelease;

	public static TraktorMessage moveModeDeckB;
	public static TraktorMessage moveModeDeckBReturn;
	public static TraktorMessage moveSizeDeckBReturn;
	public static TraktorMessage moveSizeDeckBForwardPress;
	public static TraktorMessage moveDeckBForwardPress;
	public static TraktorMessage moveSizeDeckBBackwardPress;
	public static TraktorMessage moveDeckBBackwardPress;
	public static TraktorMessage moveSizeDeckBForwardRelease;
	public static TraktorMessage moveDeckBForwardRelease;
	public static TraktorMessage moveSizeDeckBBackwardRelease;
	public static TraktorMessage moveDeckBBackwardRelease;

	public static TraktorMessage loopActiveDeckB;
	public static TraktorMessage loopSizeIncDeckBPress;
	public static TraktorMessage loopSizeDecDeckBPress;
	public static TraktorMessage loopSizeIncDeckBRelease;
	public static TraktorMessage loopSizeDecDeckBRelease;
	public static TraktorMessage loopInDeckB;
	public static TraktorMessage loopOutDeckB;
	public static TraktorMessage loopActiveReturnDeckB;
	public static TraktorMessage loopSizeReturnDeckB;
	
	public static TraktorMessage selectSetHotcueDeckB1Press;
	public static TraktorMessage selectSetHotcueDeckB1Release;
	public static TraktorMessage selectSetHotcueDeckB2Press;
	public static TraktorMessage selectSetHotcueDeckB2Release;
	public static TraktorMessage selectSetHotcueDeckB3Press;
	public static TraktorMessage selectSetHotcueDeckB3Release;
	public static TraktorMessage selectSetHotcueDeckB4Press;
	public static TraktorMessage selectSetHotcueDeckB4Release;
	public static TraktorMessage selectSetHotcueDeckB5Press;
	public static TraktorMessage selectSetHotcueDeckB5Release;
	public static TraktorMessage selectSetHotcueDeckB6Press;
	public static TraktorMessage selectSetHotcueDeckB6Release;
	public static TraktorMessage selectSetHotcueDeckB7Press;
	public static TraktorMessage selectSetHotcueDeckB7Release;
	public static TraktorMessage selectSetHotcueDeckB8Press;
	public static TraktorMessage selectSetHotcueDeckB8Release;
	public static TraktorMessage deleteHotcueDeckB1;
	public static TraktorMessage deleteHotcueDeckB2;
	public static TraktorMessage deleteHotcueDeckB3;
	public static TraktorMessage deleteHotcueDeckB4;
	public static TraktorMessage deleteHotcueDeckB5;
	public static TraktorMessage deleteHotcueDeckB6;
	public static TraktorMessage deleteHotcueDeckB7;
	public static TraktorMessage deleteHotcueDeckB8;
	public static TraktorMessage hotcueTypeDeckB1;
	public static TraktorMessage hotcueTypeDeckB2;
	public static TraktorMessage hotcueTypeDeckB3;
	public static TraktorMessage hotcueTypeDeckB4;
	public static TraktorMessage hotcueTypeDeckB5;
	public static TraktorMessage hotcueTypeDeckB6;
	public static TraktorMessage hotcueTypeDeckB7;
	public static TraktorMessage hotcueTypeDeckB8;
	public static TraktorMessage jogTurnDeckBFineForward;
	public static TraktorMessage jogTurnDeckBFineBackward;
	public static TraktorMessage jogTurnDeckBCoarseForward;
	public static TraktorMessage jogTurnDeckBCoarseBackward;
	public static TraktorMessage phaseSyncDeckB;
	public static TraktorMessage syncOnDeckB;
	public static TraktorMessage syncOnReturnDeckB;
	public static TraktorMessage tempoMasterDeckB;
	public static TraktorMessage tempoMasterDeckBReturn;

	static Map<String, int[]> mappings = new HashMap<>();

	private static TeVirtualMIDI vMidi;
	
	public TraktorAdapter(Map<String, int[]> mappings) {
        vMidi = new TeVirtualMIDI("PushDJ");
        TraktorAdapter.mappings = mappings;
        
        // global
    	browserDownPress = getMessage("BrowserDownPress");
    	browserUpPress = getMessage("BrowserUpPress");
    	browserDownRelease = getMessage("BrowserDownRelease");
    	browserUpRelease = getMessage("BrowserUpRelease");
        tempoMasterFineIncrease = getMessage("TempoMasterFineInc");
        tempoMasterFineDecrease = getMessage("TempoMasterFineDec");
        tempoMasterCoarseIncrease = getMessage("TempoMasterCoarseInc");
        tempoMasterCoarseDecrease = getMessage("TempoMasterCoarseDec");
        tempoDeckAFineIncrease = getMessage("TempoDeckAFineInc");
        tempoDeckAFineDecrease = getMessage("TempoDeckAFineDec");
        tempoDeckACoarseIncrease = getMessage("TempoDeckACoarseInc");
        tempoDeckACoarseDecrease = getMessage("TempoDeckACoarseDec");
        tempoDeckBFineIncrease = getMessage("TempoDeckBFineInc");
        tempoDeckBFineDecrease = getMessage("TempoDeckBFineDec");
        tempoDeckBCoarseIncrease = getMessage("TempoDeckBCoarseInc");
        tempoDeckBCoarseDecrease = getMessage("TempoDeckBCoarseDec");
        tempoDeckCFineIncrease = getMessage("TempoDeckCFineInc");
        tempoDeckCFineDecrease = getMessage("TempoDeckCFineDec");
        tempoDeckCCoarseIncrease = getMessage("TempoDeckCCoarseInc");
        tempoDeckCCoarseDecrease = getMessage("TempoDeckCCoarseDec");
        tempoDeckDFineIncrease = getMessage("TempoDeckDFineInc");
        tempoDeckDFineDecrease = getMessage("TempoDeckDFineDec");
        tempoDeckDCoarseIncrease = getMessage("TempoDeckDCoarseInc");
        tempoDeckDCoarseDecrease = getMessage("TempoDeckDCoarseDec");
        sendMonitorState = getMessage("SendMonitorState");

        // A
    	loadDeckA = getMessage("loadDeckA");
    	playDeckA = getMessage("playDeckA");
        playReturnDeckA = getMessage("playReturnDeckA");
        pauseDeckA = getMessage("pauseDeckA");
        cueDeckAPress = getMessage("cueDeckAPress");
        cueDeckARelease = getMessage("cueDeckARelease");
        moveModeDeckA = getMessage("moveModeDeckA");
        moveModeDeckAReturn = getMessage("moveModeDeckAReturn");
        moveSizeDeckAReturn = getMessage("moveSizeDeckAReturn");
        moveDeckAForwardPress = getMessage("moveDeckAForwardPress");
        moveDeckABackwardPress = getMessage("moveDeckABackwardPress");
        moveSizeDeckAForwardPress = getMessage("moveSizeDeckAForwardPress");
        moveSizeDeckABackwardPress = getMessage("moveSizeDeckABackwardPress");
        moveDeckAForwardRelease = getMessage("moveDeckAForwardRelease");
        moveDeckABackwardRelease = getMessage("moveDeckABackwardRelease");
        moveSizeDeckAForwardRelease = getMessage("moveSizeDeckAForwardRelease");
        moveSizeDeckABackwardRelease = getMessage("moveSizeDeckABackwardRelease");
    	loopActiveDeckA = getMessage("loopActiveDeckA");
    	loopSizeIncDeckAPress = getMessage("loopSizeIncDeckAPress");
    	loopSizeDecDeckAPress = getMessage("loopSizeDecDeckAPress");
    	loopSizeIncDeckARelease = getMessage("loopSizeIncDeckARelease");
    	loopSizeDecDeckARelease = getMessage("loopSizeDecDeckARelease");
    	loopInDeckA = getMessage("loopInDeckA");
    	loopOutDeckA = getMessage("loopOutDeckA");
    	loopActiveReturnDeckA = getMessage("loopActiveReturnDeckA");
    	loopSizeReturnDeckA = getMessage("loopSizeReturnDeckA");
        selectSetHotcueDeckA1Press = getMessage("selectSetHotcueDeckA1Press");
    	selectSetHotcueDeckA1Release = getMessage("selectSetHotcueDeckA1Release");
    	selectSetHotcueDeckA2Press = getMessage("selectSetHotcueDeckA2Press");
    	selectSetHotcueDeckA2Release = getMessage("selectSetHotcueDeckA2Release");
    	selectSetHotcueDeckA3Press = getMessage("selectSetHotcueDeckA3Press");
    	selectSetHotcueDeckA3Release = getMessage("selectSetHotcueDeckA3Release");
    	selectSetHotcueDeckA4Press = getMessage("selectSetHotcueDeckA4Press");
    	selectSetHotcueDeckA4Release = getMessage("selectSetHotcueDeckA4Release");
    	selectSetHotcueDeckA5Press = getMessage("selectSetHotcueDeckA5Press");
    	selectSetHotcueDeckA5Release = getMessage("selectSetHotcueDeckA5Release");
    	selectSetHotcueDeckA6Press = getMessage("selectSetHotcueDeckA6Press");
    	selectSetHotcueDeckA6Release = getMessage("selectSetHotcueDeckA6Release");
    	selectSetHotcueDeckA7Press = getMessage("selectSetHotcueDeckA7Press");
    	selectSetHotcueDeckA7Release = getMessage("selectSetHotcueDeckA7Release");
    	selectSetHotcueDeckA8Press = getMessage("selectSetHotcueDeckA8Press");
    	selectSetHotcueDeckA8Release = getMessage("selectSetHotcueDeckA8Release");
    	deleteHotcueDeckA1 = getMessage("deleteHotcueDeckA1");
    	deleteHotcueDeckA2 = getMessage("deleteHotcueDeckA2");
    	deleteHotcueDeckA3 = getMessage("deleteHotcueDeckA3");
    	deleteHotcueDeckA4 = getMessage("deleteHotcueDeckA4");
    	deleteHotcueDeckA5 = getMessage("deleteHotcueDeckA5");
    	deleteHotcueDeckA6 = getMessage("deleteHotcueDeckA6");
    	deleteHotcueDeckA7 = getMessage("deleteHotcueDeckA7");
    	deleteHotcueDeckA8 = getMessage("deleteHotcueDeckA8");
    	hotcueTypeDeckA1 = getMessage("hotcueTypeDeckA1");
    	hotcueTypeDeckA2 = getMessage("hotcueTypeDeckA2");
    	hotcueTypeDeckA3 = getMessage("hotcueTypeDeckA3");
    	hotcueTypeDeckA4 = getMessage("hotcueTypeDeckA4");
    	hotcueTypeDeckA5 = getMessage("hotcueTypeDeckA5");
    	hotcueTypeDeckA6 = getMessage("hotcueTypeDeckA6");
    	hotcueTypeDeckA7 = getMessage("hotcueTypeDeckA7");
    	hotcueTypeDeckA8 = getMessage("hotcueTypeDeckA8");
    	jogTurnDeckAFineForward = getMessage("jogTurnDeckAFineForward");
    	jogTurnDeckAFineBackward = getMessage("jogTurnDeckAFineBackward");
    	jogTurnDeckACoarseForward = getMessage("jogTurnDeckACoarseForward");
    	jogTurnDeckACoarseBackward = getMessage("jogTurnDeckACoarseBackward");
    	phaseSyncDeckA = getMessage("phaseSyncDeckA");
    	syncOnDeckA = getMessage("syncOnDeckA");
    	syncOnReturnDeckA = getMessage("syncOnReturnDeckA");
    	tempoMasterDeckA = getMessage("tempoMasterDeckA");
    	tempoMasterDeckAReturn = getMessage("tempoMasterReturnDeckA");
    	
    	// B
    	loadDeckB = getMessage("loadDeckB");
    	playDeckB = getMessage("playDeckB");
        playReturnDeckB = getMessage("playReturnDeckB");
        pauseDeckB = getMessage("pauseDeckB");
        cueDeckBPress = getMessage("cueDeckBPress");
        cueDeckBRelease = getMessage("cueDeckBRelease");
        moveModeDeckB = getMessage("moveModeDeckB");
        moveModeDeckBReturn = getMessage("moveModeDeckBReturn");
        moveSizeDeckBReturn = getMessage("moveSizeDeckBReturn");
        moveDeckBForwardPress = getMessage("moveDeckBForwardPress");
        moveDeckBBackwardPress = getMessage("moveDeckBBackwardPress");
        moveSizeDeckBForwardPress = getMessage("moveSizeDeckBForwardPress");
        moveSizeDeckBBackwardPress = getMessage("moveSizeDeckBBackwardPress");
        moveDeckBForwardRelease = getMessage("moveDeckBForwardRelease");
        moveDeckBBackwardRelease = getMessage("moveDeckBBackwardRelease");
        moveSizeDeckBForwardRelease = getMessage("moveSizeDeckBForwardRelease");
        moveSizeDeckBBackwardRelease = getMessage("moveSizeDeckBBackwardRelease");
    	loopActiveDeckB = getMessage("loopActiveDeckB");
    	loopSizeIncDeckBPress = getMessage("loopSizeIncDeckBPress");
    	loopSizeDecDeckBPress = getMessage("loopSizeDecDeckBPress");
    	loopSizeIncDeckBRelease = getMessage("loopSizeIncDeckBRelease");
    	loopSizeDecDeckBRelease = getMessage("loopSizeDecDeckBRelease");
    	loopInDeckB = getMessage("loopInDeckB");
    	loopOutDeckB = getMessage("loopOutDeckB");
    	loopActiveReturnDeckB = getMessage("loopActiveReturnDeckB");
    	loopSizeReturnDeckB = getMessage("loopSizeReturnDeckB");
        selectSetHotcueDeckB1Press = getMessage("selectSetHotcueDeckB1Press");
    	selectSetHotcueDeckB1Release = getMessage("selectSetHotcueDeckB1Release");
    	selectSetHotcueDeckB2Press = getMessage("selectSetHotcueDeckB2Press");
    	selectSetHotcueDeckB2Release = getMessage("selectSetHotcueDeckB2Release");
    	selectSetHotcueDeckB3Press = getMessage("selectSetHotcueDeckB3Press");
    	selectSetHotcueDeckB3Release = getMessage("selectSetHotcueDeckB3Release");
    	selectSetHotcueDeckB4Press = getMessage("selectSetHotcueDeckB4Press");
    	selectSetHotcueDeckB4Release = getMessage("selectSetHotcueDeckB4Release");
    	selectSetHotcueDeckB5Press = getMessage("selectSetHotcueDeckB5Press");
    	selectSetHotcueDeckB5Release = getMessage("selectSetHotcueDeckB5Release");
    	selectSetHotcueDeckB6Press = getMessage("selectSetHotcueDeckB6Press");
    	selectSetHotcueDeckB6Release = getMessage("selectSetHotcueDeckB6Release");
    	selectSetHotcueDeckB7Press = getMessage("selectSetHotcueDeckB7Press");
    	selectSetHotcueDeckB7Release = getMessage("selectSetHotcueDeckB7Release");
    	selectSetHotcueDeckB8Press = getMessage("selectSetHotcueDeckB8Press");
    	selectSetHotcueDeckB8Release = getMessage("selectSetHotcueDeckB8Release");
    	deleteHotcueDeckB1 = getMessage("deleteHotcueDeckB1");
    	deleteHotcueDeckB2 = getMessage("deleteHotcueDeckB2");
    	deleteHotcueDeckB3 = getMessage("deleteHotcueDeckB3");
    	deleteHotcueDeckB4 = getMessage("deleteHotcueDeckB4");
    	deleteHotcueDeckB5 = getMessage("deleteHotcueDeckB5");
    	deleteHotcueDeckB6 = getMessage("deleteHotcueDeckB6");
    	deleteHotcueDeckB7 = getMessage("deleteHotcueDeckB7");
    	deleteHotcueDeckB8 = getMessage("deleteHotcueDeckB8");
    	hotcueTypeDeckB1 = getMessage("hotcueTypeDeckB1");
    	hotcueTypeDeckB2 = getMessage("hotcueTypeDeckB2");
    	hotcueTypeDeckB3 = getMessage("hotcueTypeDeckB3");
    	hotcueTypeDeckB4 = getMessage("hotcueTypeDeckB4");
    	hotcueTypeDeckB5 = getMessage("hotcueTypeDeckB5");
    	hotcueTypeDeckB6 = getMessage("hotcueTypeDeckB6");
    	hotcueTypeDeckB7 = getMessage("hotcueTypeDeckB7");
    	hotcueTypeDeckB8 = getMessage("hotcueTypeDeckB8");
    	jogTurnDeckBFineForward = getMessage("jogTurnDeckBFineForward");
    	jogTurnDeckBFineBackward = getMessage("jogTurnDeckBFineBackward");
    	jogTurnDeckBCoarseForward = getMessage("jogTurnDeckBCoarseForward");
    	jogTurnDeckBCoarseBackward = getMessage("jogTurnDeckBCoarseBackward");
    	phaseSyncDeckB = getMessage("phaseSyncDeckB");
    	syncOnDeckB = getMessage("syncOnDeckB");
    	syncOnReturnDeckB = getMessage("syncOnReturnDeckB");
    	tempoMasterDeckB = getMessage("tempoMasterDeckB");
    	tempoMasterDeckBReturn = getMessage("tempoMasterReturnDeckB");
    	
    	
    	
    	new VirtualMIDIReceiver(vMidi).start();
	}
	

	public static void send(TraktorMessage message) {
		try {
			ShortMessage m = new ShortMessage(message.command, message.channel, message.data1, message.data2);
System.out.println("TRout> " +message.command +":"+message.channel+","+message.data1+","+message.data2);
			vMidi.sendCommand(m.getMessage());
		} catch (InvalidMidiDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static TraktorMessage getMessage(String name) {
		int[] mapping = mappings.get(name);
		if(mapping == null) {
			throw new RuntimeException("Mapping not found: " +name);
		}
		return new TraktorMessage(name, mapping);
	}
}
