package de.sntr.pushdj.traktor;

import java.util.HashMap;
import java.util.Map;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.ShortMessage;

import de.tobiaserichsen.tevm.TeVirtualMIDI;

public class TraktorAdapter {

	public static TraktorMessage playDeckA;
	public static TraktorMessage pauseDeckA;
	public static TraktorMessage playReturnDeckA;
	public static TraktorMessage loadDeckA;
	public static TraktorMessage cueDeckAPress;
	public static TraktorMessage cueDeckARelease;
//	public static TraktorMessage syncDeckA;
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

	public static TraktorMessage browserDownPress;
	public static TraktorMessage browserUpPress;
	public static TraktorMessage browserDownRelease;
	public static TraktorMessage browserUpRelease;

	public static TraktorMessage beatjumpDeckA1ForwardPress;
	public static TraktorMessage beatjumpDeckA4ForwardPress;
	public static TraktorMessage beatjumpDeckA16ForwardPress;
	public static TraktorMessage beatjumpDeckA32ForwardPress;
	public static TraktorMessage beatjumpDeckA1BackwardPress;
	public static TraktorMessage beatjumpDeckA4BackwardPress;
	public static TraktorMessage beatjumpDeckA16BackwardPress;
	public static TraktorMessage beatjumpDeckA32BackwardPress;
	public static TraktorMessage beatjumpDeckA1ForwardRelease;
	public static TraktorMessage beatjumpDeckA4ForwardRelease;
	public static TraktorMessage beatjumpDeckA16ForwardRelease;
	public static TraktorMessage beatjumpDeckA32ForwardRelease;
	public static TraktorMessage beatjumpDeckA1BackwardRelease;
	public static TraktorMessage beatjumpDeckA4BackwardRelease;
	public static TraktorMessage beatjumpDeckA16BackwardRelease;
	public static TraktorMessage beatjumpDeckA32BackwardRelease;

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

	static Map<String, int[]> mappings = new HashMap<>();

	private static TeVirtualMIDI vMidi;
	
	public TraktorAdapter(Map<String, int[]> mappings) {
        vMidi = new TeVirtualMIDI("PushDJ");
        TraktorAdapter.mappings = mappings;
        playDeckA = new TraktorMessage("playDeckA", mappings.get("playDeckA"));
        playReturnDeckA = getMessage("playReturnDeckA");
        pauseDeckA = new TraktorMessage("pauseDeckA", mappings.get("pauseDeckA"));
        cueDeckAPress = new TraktorMessage("cueDeckAPress", mappings.get("cueDeckAPress"));
        cueDeckARelease = new TraktorMessage("cueDeckARelease", mappings.get("cueDeckARelease"));
//        syncDeckA = getMessage("syncDeckA");
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
        

        beatjumpDeckA1ForwardPress = getMessage("beatjumpDeckA1ForwardPress");
        beatjumpDeckA4ForwardPress = getMessage("beatjumpDeckA4ForwardPress");
        beatjumpDeckA16ForwardPress = getMessage("beatjumpDeckA16ForwardPress");
        beatjumpDeckA32ForwardPress = getMessage("beatjumpDeckA32ForwardPress");
        beatjumpDeckA1BackwardPress = getMessage("beatjumpDeckA1BackwardPress");
        beatjumpDeckA4BackwardPress = getMessage("beatjumpDeckA4BackwardPress");
        beatjumpDeckA16BackwardPress = getMessage("beatjumpDeckA16BackwardPress");
        beatjumpDeckA32BackwardPress = getMessage("beatjumpDeckA32BackwardPress");
        beatjumpDeckA1ForwardRelease = getMessage("beatjumpDeckA1ForwardRelease");
        beatjumpDeckA4ForwardRelease = getMessage("beatjumpDeckA4ForwardRelease");
        beatjumpDeckA16ForwardRelease = getMessage("beatjumpDeckA16ForwardRelease");
        beatjumpDeckA32ForwardRelease = getMessage("beatjumpDeckA32ForwardRelease");
        beatjumpDeckA1BackwardRelease = getMessage("beatjumpDeckA1BackwardRelease");
        beatjumpDeckA4BackwardRelease = getMessage("beatjumpDeckA4BackwardRelease");
        beatjumpDeckA16BackwardRelease = getMessage("beatjumpDeckA16BackwardRelease");
        beatjumpDeckA32BackwardRelease = getMessage("beatjumpDeckA32BackwardRelease");

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
    	
    	browserDownPress = getMessage("BrowserDownPress");
    	browserUpPress = getMessage("BrowserUpPress");
    	browserDownRelease = getMessage("BrowserDownRelease");
    	browserUpRelease = getMessage("BrowserUpRelease");
    	
    	loadDeckA = getMessage("loadDeckA");
    	
    	new VirtualMIDIReceiver(vMidi).start();
	}
	

	public static void send(TraktorMessage message) {
//		int data[] = mappings.get(command);
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
