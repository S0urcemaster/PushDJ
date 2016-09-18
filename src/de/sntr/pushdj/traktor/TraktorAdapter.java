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
	public static TraktorMessage cupDeckAPress;
	public static TraktorMessage cupDeckARelease;
	public static TraktorMessage fluxOnOffDeckA;
	public static TraktorMessage fluxOnOffDeckAReturn;
	
	public static TraktorMessage beatJumpDeckAForwardPress;
	public static TraktorMessage beatJumpDeckABackwardPress;
	public static TraktorMessage beatJumpDeckAForwardRelease;
	public static TraktorMessage beatJumpDeckABackwardRelease;

	public static TraktorMessage beatPhaseReturnDeckA;
	
	public static TraktorMessage loopActiveDeckA;
	public static TraktorMessage loopActiveReturnDeckA;

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
	public static TraktorMessage tempoSyncDeckA;
	public static TraktorMessage syncOnOffDeckA;
	public static TraktorMessage syncOnOffReturnDeckA;
	public static TraktorMessage tempoMasterDeckA;
	public static TraktorMessage tempoMasterDeckAReturn;
	
	// DeckB, channel 2
	public static TraktorMessage playDeckB;
	public static TraktorMessage pauseDeckB;
	public static TraktorMessage playReturnDeckB;
	public static TraktorMessage loadDeckB;
	public static TraktorMessage cueDeckBPress;
	public static TraktorMessage cueDeckBRelease;

	public static TraktorMessage moveDeckBForwardPress;
	public static TraktorMessage moveDeckBBackwardPress;
	public static TraktorMessage moveDeckBForwardRelease;
	public static TraktorMessage moveDeckBBackwardRelease;

	public static TraktorMessage loopActiveDeckB;
	public static TraktorMessage loopActiveReturnDeckB;

	public static TraktorMessage loopSizeSelectSetf32DeckA;
	public static TraktorMessage loopSizeSelectSetf16DeckA;
	public static TraktorMessage loopSizeSelectSetf8DeckA;
	public static TraktorMessage loopSizeSelectSetf4DeckA;
	public static TraktorMessage loopSizeSelectSetf2DeckA;
	public static TraktorMessage loopSizeSelectSeti1DeckA;
	public static TraktorMessage loopSizeSelectSeti2DeckA;
	public static TraktorMessage loopSizeSelectSeti4DeckA;
	public static TraktorMessage loopSizeSelectSeti8DeckA;
	public static TraktorMessage loopSizeSelectSeti16DeckA;
	public static TraktorMessage loopSizeSelectSeti32DeckA;
	public static TraktorMessage loopSizeSelectSetBackwardf32DeckA;
	public static TraktorMessage loopSizeSelectSetBackwardf16DeckA;
	public static TraktorMessage loopSizeSelectSetBackwardf8DeckA;
	public static TraktorMessage loopSizeSelectSetBackwardf4DeckA;
	public static TraktorMessage loopSizeSelectSetBackwardf2DeckA;
	public static TraktorMessage loopSizeSelectSetBackwardi1DeckA;
	public static TraktorMessage loopSizeSelectSetBackwardi2DeckA;
	public static TraktorMessage loopSizeSelectSetBackwardi4DeckA;
	public static TraktorMessage loopSizeSelectSetBackwardi8DeckA;
	public static TraktorMessage loopSizeSelectSetBackwardi16DeckA;
	public static TraktorMessage loopSizeSelectSetBackwardi32DeckA;

	public static TraktorMessage loopMoveForwardDeckA;
	public static TraktorMessage loopMoveBackwardDeckA;
	public static TraktorMessage loopInMoveForwardDeckA;
	public static TraktorMessage loopInMoveBackwardDeckA;
	public static TraktorMessage loopOutMoveForwardDeckA;
	public static TraktorMessage loopOutMoveBackwardDeckA;
	
	public static TraktorMessage loopSizeSelectSetf32DeckB;
	public static TraktorMessage loopSizeSelectSetf16DeckB;
	public static TraktorMessage loopSizeSelectSetf8DeckB;
	public static TraktorMessage loopSizeSelectSetf4DeckB;
	public static TraktorMessage loopSizeSelectSetf2DeckB;
	public static TraktorMessage loopSizeSelectSeti1DeckB;
	public static TraktorMessage loopSizeSelectSeti2DeckB;
	public static TraktorMessage loopSizeSelectSeti4DeckB;
	public static TraktorMessage loopSizeSelectSeti8DeckB;
	public static TraktorMessage loopSizeSelectSeti16DeckB;
	public static TraktorMessage loopSizeSelectSeti32DeckB;
	public static TraktorMessage loopSizeSelectSetBackwardf32DeckB;
	public static TraktorMessage loopSizeSelectSetBackwardf16DeckB;
	public static TraktorMessage loopSizeSelectSetBackwardf8DeckB;
	public static TraktorMessage loopSizeSelectSetBackwardf4DeckB;
	public static TraktorMessage loopSizeSelectSetBackwardf2DeckB;
	public static TraktorMessage loopSizeSelectSetBackwardi1DeckB;
	public static TraktorMessage loopSizeSelectSetBackwardi2DeckB;
	public static TraktorMessage loopSizeSelectSetBackwardi4DeckB;
	public static TraktorMessage loopSizeSelectSetBackwardi8DeckB;
	public static TraktorMessage loopSizeSelectSetBackwardi16DeckB;
	public static TraktorMessage loopSizeSelectSetBackwardi32DeckB;

	public static TraktorMessage loopMoveForwardDeckB;
	public static TraktorMessage loopMoveBackwardDeckB;
	public static TraktorMessage loopInMoveForwardDeckB;
	public static TraktorMessage loopInMoveBackwardDeckB;
	public static TraktorMessage loopOutMoveForwardDeckB;
	public static TraktorMessage loopOutMoveBackwardDeckB;

	
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
	public static TraktorMessage tempoSyncDeckB;
	public static TraktorMessage syncOnOffDeckB;
	public static TraktorMessage syncOnOffReturnDeckB;
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
        cupDeckAPress = getMessage("cupDeckAPress");
        cupDeckARelease = getMessage("cupDeckARelease");
    	phaseSyncDeckA = getMessage("phaseSyncDeckA");
    	tempoSyncDeckA = getMessage("tempoSyncDeckA");
    	syncOnOffDeckA = getMessage("syncOnDeckA");
    	syncOnOffReturnDeckA = getMessage("syncOnReturnDeckA");
    	tempoMasterDeckA = getMessage("tempoMasterDeckA");
    	tempoMasterDeckAReturn = getMessage("tempoMasterReturnDeckA");
    	fluxOnOffDeckA = getMessage("fluxDeckA");
        fluxOnOffDeckAReturn = getMessage("fluxReturnDeckA");
        
        beatJumpDeckAForwardPress = getMessage("beatjumpDeckAForwardPress");
        beatJumpDeckABackwardPress = getMessage("beatjumpDeckABackwardPress");
        beatJumpDeckAForwardRelease = getMessage("beatjumpDeckAForwardRelease");
        beatJumpDeckABackwardRelease = getMessage("beatjumpDeckABackwardRelease");
    	
        beatPhaseReturnDeckA = getMessage("beatPhaseReturnDeckA");
        
        loopActiveDeckA = getMessage("loopActiveDeckA");
    	loopActiveReturnDeckA = getMessage("loopActiveReturnDeckA");
    	
    	loopSizeSelectSetf32DeckA = getMessage("loopSizeSelectSetf32DeckA");
    	loopSizeSelectSetf16DeckA = getMessage("loopSizeSelectSetf16DeckA");
    	loopSizeSelectSetf8DeckA = getMessage("loopSizeSelectSetf8DeckA");
    	loopSizeSelectSetf4DeckA = getMessage("loopSizeSelectSetf4DeckA");
    	loopSizeSelectSetf2DeckA = getMessage("loopSizeSelectSetf2DeckA");
    	loopSizeSelectSeti1DeckA = getMessage("loopSizeSelectSeti1DeckA");
    	loopSizeSelectSeti2DeckA = getMessage("loopSizeSelectSeti2DeckA");
    	loopSizeSelectSeti4DeckA = getMessage("loopSizeSelectSeti4DeckA");
    	loopSizeSelectSeti8DeckA = getMessage("loopSizeSelectSeti8DeckA");
    	loopSizeSelectSeti16DeckA = getMessage("loopSizeSelectSeti16DeckA");
    	loopSizeSelectSeti32DeckA = getMessage("loopSizeSelectSeti32DeckA");
    	loopSizeSelectSetBackwardf32DeckA = getMessage("loopSizeSelectSetBackwardf32DeckA");
    	loopSizeSelectSetBackwardf16DeckA = getMessage("loopSizeSelectSetBackwardf16DeckA");
    	loopSizeSelectSetBackwardf8DeckA = getMessage("loopSizeSelectSetBackwardf8DeckA");
    	loopSizeSelectSetBackwardf4DeckA = getMessage("loopSizeSelectSetBackwardf4DeckA");
    	loopSizeSelectSetBackwardf2DeckA = getMessage("loopSizeSelectSetBackwardf2DeckA");
    	loopSizeSelectSetBackwardi1DeckA = getMessage("loopSizeSelectSetBackwardi1DeckA");
    	loopSizeSelectSetBackwardi2DeckA = getMessage("loopSizeSelectSetBackwardi2DeckA");
    	loopSizeSelectSetBackwardi4DeckA = getMessage("loopSizeSelectSetBackwardi4DeckA");
    	loopSizeSelectSetBackwardi8DeckA = getMessage("loopSizeSelectSetBackwardi8DeckA");
    	loopSizeSelectSetBackwardi16DeckA = getMessage("loopSizeSelectSetBackwardi16DeckA");
    	loopSizeSelectSetBackwardi32DeckA = getMessage("loopSizeSelectSetBackwardi32DeckA");
    	
    	loopMoveForwardDeckA = getMessage("loopMoveIncDeckA");
    	loopMoveBackwardDeckA = getMessage("loopMoveDecDeckA");
    	loopInMoveForwardDeckA = getMessage("loopInMoveIncDeckA");
    	loopInMoveBackwardDeckA = getMessage("loopInMoveDecDeckA");
    	loopOutMoveForwardDeckA = getMessage("loopOutMoveIncDeckA");
    	loopOutMoveBackwardDeckA = getMessage("loopOutMoveDecDeckA");
    	
    	loopSizeSelectSetf32DeckB = getMessage("loopSizeSelectSetf32DeckB");
    	loopSizeSelectSetf16DeckB = getMessage("loopSizeSelectSetf16DeckB");
    	loopSizeSelectSetf8DeckB = getMessage("loopSizeSelectSetf8DeckB");
    	loopSizeSelectSetf4DeckB = getMessage("loopSizeSelectSetf4DeckB");
    	loopSizeSelectSetf2DeckB = getMessage("loopSizeSelectSetf2DeckB");
    	loopSizeSelectSeti1DeckB = getMessage("loopSizeSelectSeti1DeckB");
    	loopSizeSelectSeti2DeckB = getMessage("loopSizeSelectSeti2DeckB");
    	loopSizeSelectSeti4DeckB = getMessage("loopSizeSelectSeti4DeckB");
    	loopSizeSelectSeti8DeckB = getMessage("loopSizeSelectSeti8DeckB");
    	loopSizeSelectSeti16DeckB = getMessage("loopSizeSelectSeti16DeckB");
    	loopSizeSelectSeti32DeckB = getMessage("loopSizeSelectSeti32DeckB");
    	loopSizeSelectSetBackwardf32DeckB = getMessage("loopSizeSelectSetBackwardf32DeckB");
    	loopSizeSelectSetBackwardf16DeckB = getMessage("loopSizeSelectSetBackwardf16DeckB");
    	loopSizeSelectSetBackwardf8DeckB = getMessage("loopSizeSelectSetBackwardf8DeckB");
    	loopSizeSelectSetBackwardf4DeckB = getMessage("loopSizeSelectSetBackwardf4DeckB");
    	loopSizeSelectSetBackwardf2DeckB = getMessage("loopSizeSelectSetBackwardf2DeckB");
    	loopSizeSelectSetBackwardi1DeckB = getMessage("loopSizeSelectSetBackwardi1DeckB");
    	loopSizeSelectSetBackwardi2DeckB = getMessage("loopSizeSelectSetBackwardi2DeckB");
    	loopSizeSelectSetBackwardi4DeckB = getMessage("loopSizeSelectSetBackwardi4DeckB");
    	loopSizeSelectSetBackwardi8DeckB = getMessage("loopSizeSelectSetBackwardi8DeckB");
    	loopSizeSelectSetBackwardi16DeckB = getMessage("loopSizeSelectSetBackwardi16DeckB");
    	loopSizeSelectSetBackwardi32DeckB = getMessage("loopSizeSelectSetBackwardi32DeckB");
    	
    	loopMoveForwardDeckB = getMessage("loopMoveIncDeckB");
    	loopMoveBackwardDeckB = getMessage("loopMoveDecDeckB");
    	loopInMoveForwardDeckB = getMessage("loopInMoveIncDeckB");
    	loopInMoveBackwardDeckB = getMessage("loopInMoveDecDeckB");
    	loopOutMoveForwardDeckB = getMessage("loopOutMoveIncDeckB");
    	loopOutMoveBackwardDeckB = getMessage("loopOutMoveDecDeckB");

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
    	
    	// B
    	loadDeckB = getMessage("loadDeckB");
    	playDeckB = getMessage("playDeckB");
        playReturnDeckB = getMessage("playReturnDeckB");
        pauseDeckB = getMessage("pauseDeckB");
        cueDeckBPress = getMessage("cueDeckBPress");
        cueDeckBRelease = getMessage("cueDeckBRelease");
        moveDeckBForwardPress = getMessage("moveDeckBForwardPress");
        moveDeckBBackwardPress = getMessage("moveDeckBBackwardPress");
        moveDeckBForwardRelease = getMessage("moveDeckBForwardRelease");
        moveDeckBBackwardRelease = getMessage("moveDeckBBackwardRelease");
    	loopActiveDeckB = getMessage("loopActiveDeckB");
    	loopActiveReturnDeckB = getMessage("loopActiveReturnDeckB");
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
    	syncOnOffDeckB = getMessage("syncOnDeckB");
    	syncOnOffReturnDeckB = getMessage("syncOnReturnDeckB");
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
