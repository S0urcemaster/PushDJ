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
	
	public static TraktorMessage phaseSyncDeckA;
	public static TraktorMessage tempoSyncDeckA;
	public static TraktorMessage syncOnOffDeckA;
	public static TraktorMessage syncOnOffReturnDeckA;
	public static TraktorMessage tempoMasterDeckA;
	public static TraktorMessage tempoMasterDeckAReturn;
	
	public static TraktorMessage moveModeDeckABeatJump;
	public static TraktorMessage moveModeDeckALoop;
	public static TraktorMessage moveModeDeckALoopIn;
	public static TraktorMessage moveModeDeckALoopOut;

	public static TraktorMessage moveDeckAForwardPress;
	public static TraktorMessage moveDeckABackwardPress;
	public static TraktorMessage moveDeckAForwardRelease;
	public static TraktorMessage moveDeckABackwardRelease;

	public static TraktorMessage beatPhaseReturnDeckA;
	
	public static TraktorMessage loopActiveReturnDeckA;
	public static TraktorMessage loopActiveToggleDeckA;

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
	
	public static TraktorMessage sizeSelectorf32DeckA;
	public static TraktorMessage sizeSelectorf16DeckA;
	public static TraktorMessage sizeSelectorf8DeckA;
	public static TraktorMessage sizeSelectorf4DeckA;
	public static TraktorMessage sizeSelectorf2DeckA;
	public static TraktorMessage sizeSelectori1DeckA;
	public static TraktorMessage sizeSelectori2DeckA;
	public static TraktorMessage sizeSelectori4DeckA;
	public static TraktorMessage sizeSelectori8DeckA;
	public static TraktorMessage sizeSelectori16DeckA;
	public static TraktorMessage sizeSelectori32DeckA;
	
	public static TraktorMessage deckLoadedReturnDeckA;

	// DeckB, channel 2
	public static TraktorMessage playDeckB;
	public static TraktorMessage pauseDeckB;
	public static TraktorMessage playReturnDeckB;
	public static TraktorMessage loadDeckB;
	public static TraktorMessage cueDeckBPress;
	public static TraktorMessage cueDeckBRelease;
	public static TraktorMessage cupDeckBPress;
	public static TraktorMessage cupDeckBRelease;
	public static TraktorMessage fluxOnOffDeckB;
	public static TraktorMessage fluxOnOffDeckBReturn;
	
	public static TraktorMessage phaseSyncDeckB;
	public static TraktorMessage tempoSyncDeckB;
	public static TraktorMessage syncOnOffDeckB;
	public static TraktorMessage syncOnOffReturnDeckB;
	public static TraktorMessage tempoMasterDeckB;
	public static TraktorMessage tempoMasterDeckBReturn;
	
	public static TraktorMessage moveModeDeckBBeatJump;
	public static TraktorMessage moveModeDeckBLoop;
	public static TraktorMessage moveModeDeckBLoopIn;
	public static TraktorMessage moveModeDeckBLoopOut;

	public static TraktorMessage moveDeckBForwardPress;
	public static TraktorMessage moveDeckBBackwardPress;
	public static TraktorMessage moveDeckBForwardRelease;
	public static TraktorMessage moveDeckBBackwardRelease;

	public static TraktorMessage beatPhaseReturnDeckB;
	
	public static TraktorMessage loopActiveReturnDeckB;
	public static TraktorMessage loopActiveToggleDeckB;

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
	
	public static TraktorMessage sizeSelectorf32DeckB;
	public static TraktorMessage sizeSelectorf16DeckB;
	public static TraktorMessage sizeSelectorf8DeckB;
	public static TraktorMessage sizeSelectorf4DeckB;
	public static TraktorMessage sizeSelectorf2DeckB;
	public static TraktorMessage sizeSelectori1DeckB;
	public static TraktorMessage sizeSelectori2DeckB;
	public static TraktorMessage sizeSelectori4DeckB;
	public static TraktorMessage sizeSelectori8DeckB;
	public static TraktorMessage sizeSelectori16DeckB;
	public static TraktorMessage sizeSelectori32DeckB;
	
	public static TraktorMessage deckLoadedReturnDeckB;


	// DeckC, channel 3
	public static TraktorMessage playDeckC;
	public static TraktorMessage pauseDeckC;
	public static TraktorMessage playReturnDeckC;
	public static TraktorMessage loadDeckC;
	public static TraktorMessage cueDeckCPress;
	public static TraktorMessage cueDeckCRelease;
	public static TraktorMessage cupDeckCPress;
	public static TraktorMessage cupDeckCRelease;
	public static TraktorMessage fluxOnOffDeckC;
	public static TraktorMessage fluxOnOffDeckCReturn;
	
	public static TraktorMessage phaseSyncDeckC;
	public static TraktorMessage tempoSyncDeckC;
	public static TraktorMessage syncOnOffDeckC;
	public static TraktorMessage syncOnOffReturnDeckC;
	public static TraktorMessage tempoMasterDeckC;
	public static TraktorMessage tempoMasterDeckCReturn;
	
	public static TraktorMessage moveModeDeckCBeatJump;
	public static TraktorMessage moveModeDeckCLoop;
	public static TraktorMessage moveModeDeckCLoopIn;
	public static TraktorMessage moveModeDeckCLoopOut;

	public static TraktorMessage moveDeckCForwardPress;
	public static TraktorMessage moveDeckCBackwardPress;
	public static TraktorMessage moveDeckCForwardRelease;
	public static TraktorMessage moveDeckCBackwardRelease;

	public static TraktorMessage beatPhaseReturnDeckC;
	
	public static TraktorMessage loopActiveReturnDeckC;
	public static TraktorMessage loopActiveToggleDeckC;

	public static TraktorMessage selectSetHotcueDeckC1Press;
	public static TraktorMessage selectSetHotcueDeckC1Release;
	public static TraktorMessage selectSetHotcueDeckC2Press;
	public static TraktorMessage selectSetHotcueDeckC2Release;
	public static TraktorMessage selectSetHotcueDeckC3Press;
	public static TraktorMessage selectSetHotcueDeckC3Release;
	public static TraktorMessage selectSetHotcueDeckC4Press;
	public static TraktorMessage selectSetHotcueDeckC4Release;
	public static TraktorMessage selectSetHotcueDeckC5Press;
	public static TraktorMessage selectSetHotcueDeckC5Release;
	public static TraktorMessage selectSetHotcueDeckC6Press;
	public static TraktorMessage selectSetHotcueDeckC6Release;
	public static TraktorMessage selectSetHotcueDeckC7Press;
	public static TraktorMessage selectSetHotcueDeckC7Release;
	public static TraktorMessage selectSetHotcueDeckC8Press;
	public static TraktorMessage selectSetHotcueDeckC8Release;
	public static TraktorMessage deleteHotcueDeckC1;
	public static TraktorMessage deleteHotcueDeckC2;
	public static TraktorMessage deleteHotcueDeckC3;
	public static TraktorMessage deleteHotcueDeckC4;
	public static TraktorMessage deleteHotcueDeckC5;
	public static TraktorMessage deleteHotcueDeckC6;
	public static TraktorMessage deleteHotcueDeckC7;
	public static TraktorMessage deleteHotcueDeckC8;
	public static TraktorMessage hotcueTypeDeckC1;
	public static TraktorMessage hotcueTypeDeckC2;
	public static TraktorMessage hotcueTypeDeckC3;
	public static TraktorMessage hotcueTypeDeckC4;
	public static TraktorMessage hotcueTypeDeckC5;
	public static TraktorMessage hotcueTypeDeckC6;
	public static TraktorMessage hotcueTypeDeckC7;
	public static TraktorMessage hotcueTypeDeckC8;
	
	public static TraktorMessage jogTurnDeckCFineForward;
	public static TraktorMessage jogTurnDeckCFineBackward;
	public static TraktorMessage jogTurnDeckCCoarseForward;
	public static TraktorMessage jogTurnDeckCCoarseBackward;
	
	public static TraktorMessage loopSizeSelectSetf32DeckC;
	public static TraktorMessage loopSizeSelectSetf16DeckC;
	public static TraktorMessage loopSizeSelectSetf8DeckC;
	public static TraktorMessage loopSizeSelectSetf4DeckC;
	public static TraktorMessage loopSizeSelectSetf2DeckC;
	public static TraktorMessage loopSizeSelectSeti1DeckC;
	public static TraktorMessage loopSizeSelectSeti2DeckC;
	public static TraktorMessage loopSizeSelectSeti4DeckC;
	public static TraktorMessage loopSizeSelectSeti8DeckC;
	public static TraktorMessage loopSizeSelectSeti16DeckC;
	public static TraktorMessage loopSizeSelectSeti32DeckC;
	public static TraktorMessage loopSizeSelectSetBackwardf32DeckC;
	public static TraktorMessage loopSizeSelectSetBackwardf16DeckC;
	public static TraktorMessage loopSizeSelectSetBackwardf8DeckC;
	public static TraktorMessage loopSizeSelectSetBackwardf4DeckC;
	public static TraktorMessage loopSizeSelectSetBackwardf2DeckC;
	public static TraktorMessage loopSizeSelectSetBackwardi1DeckC;
	public static TraktorMessage loopSizeSelectSetBackwardi2DeckC;
	public static TraktorMessage loopSizeSelectSetBackwardi4DeckC;
	public static TraktorMessage loopSizeSelectSetBackwardi8DeckC;
	public static TraktorMessage loopSizeSelectSetBackwardi16DeckC;
	public static TraktorMessage loopSizeSelectSetBackwardi32DeckC;
	
	public static TraktorMessage sizeSelectorf32DeckC;
	public static TraktorMessage sizeSelectorf16DeckC;
	public static TraktorMessage sizeSelectorf8DeckC;
	public static TraktorMessage sizeSelectorf4DeckC;
	public static TraktorMessage sizeSelectorf2DeckC;
	public static TraktorMessage sizeSelectori1DeckC;
	public static TraktorMessage sizeSelectori2DeckC;
	public static TraktorMessage sizeSelectori4DeckC;
	public static TraktorMessage sizeSelectori8DeckC;
	public static TraktorMessage sizeSelectori16DeckC;
	public static TraktorMessage sizeSelectori32DeckC;
	
	public static TraktorMessage deckLoadedReturnDeckC;

	
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
        deckLoadedReturnDeckA = getMessage("deckLoadedReturnDeckA");
        beatPhaseReturnDeckA = getMessage("beatPhaseReturnDeckA");
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
    	syncOnOffDeckA = getMessage("syncOnOffDeckA");
    	syncOnOffReturnDeckA = getMessage("syncOnOffReturnDeckA");
    	tempoMasterDeckA = getMessage("tempoMasterDeckA");
    	tempoMasterDeckAReturn = getMessage("tempoMasterReturnDeckA");
    	fluxOnOffDeckA = getMessage("fluxDeckA");
        fluxOnOffDeckAReturn = getMessage("fluxReturnDeckA");
        
        loopActiveToggleDeckA = getMessage("loopActiveToggleDeckA");
        loopActiveReturnDeckA = getMessage("loopActiveReturnDeckA");
        
        moveModeDeckABeatJump = getMessage("moveModeDeckABeatJump");
        moveModeDeckALoop = getMessage("moveModeDeckALoop");
        moveModeDeckALoopIn = getMessage("moveModeDeckALoopIn");
        moveModeDeckALoopOut = getMessage("moveModeDeckALoopOut");

        moveDeckAForwardPress = getMessage("moveDeckAForwardPress");
        moveDeckABackwardPress = getMessage("moveDeckABackwardPress");
        moveDeckAForwardRelease = getMessage("moveDeckAForwardRelease");
        moveDeckABackwardRelease = getMessage("moveDeckABackwardRelease");    	
    	
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
    	
    	sizeSelectorf32DeckA = getMessage("sizeSelectorf32DeckA");
    	sizeSelectorf16DeckA = getMessage("sizeSelectorf16DeckA");
    	sizeSelectorf8DeckA = getMessage("sizeSelectorf8DeckA");
    	sizeSelectorf4DeckA = getMessage("sizeSelectorf4DeckA");
    	sizeSelectorf2DeckA = getMessage("sizeSelectorf2DeckA");
    	sizeSelectori1DeckA = getMessage("sizeSelectori1DeckA");
    	sizeSelectori2DeckA = getMessage("sizeSelectori2DeckA");
    	sizeSelectori4DeckA = getMessage("sizeSelectori4DeckA");
    	sizeSelectori8DeckA = getMessage("sizeSelectori8DeckA");
    	sizeSelectori16DeckA = getMessage("sizeSelectori16DeckA");
    	sizeSelectori32DeckA = getMessage("sizeSelectori32DeckA");
    	
    	deckLoadedReturnDeckA = getMessage("deckLoadedReturnDeckA");

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
    	deckLoadedReturnDeckB = getMessage("deckLoadedReturnDeckB");
        beatPhaseReturnDeckB = getMessage("beatPhaseReturnDeckB");
    	loadDeckB = getMessage("loadDeckB");
    	playDeckB = getMessage("playDeckB");
        playReturnDeckB = getMessage("playReturnDeckB");
        pauseDeckB = getMessage("pauseDeckB");
        cueDeckBPress = getMessage("cueDeckBPress");
        cueDeckBRelease = getMessage("cueDeckBRelease");
        cupDeckBPress = getMessage("cupDeckBPress");
        cupDeckBRelease = getMessage("cupDeckBRelease");
    	phaseSyncDeckB = getMessage("phaseSyncDeckB");
    	tempoSyncDeckB = getMessage("tempoSyncDeckB");
    	syncOnOffDeckB = getMessage("syncOnOffDeckB");
    	syncOnOffReturnDeckB = getMessage("syncOnOffReturnDeckB");
    	tempoMasterDeckB = getMessage("tempoMasterDeckB");
    	tempoMasterDeckBReturn = getMessage("tempoMasterReturnDeckB");
    	fluxOnOffDeckB = getMessage("fluxDeckB");
        fluxOnOffDeckBReturn = getMessage("fluxReturnDeckB");
        
        loopActiveToggleDeckB = getMessage("loopActiveToggleDeckB");
        loopActiveReturnDeckB = getMessage("loopActiveReturnDeckB");
        
        moveModeDeckBBeatJump = getMessage("moveModeDeckBBeatJump");
        moveModeDeckBLoop = getMessage("moveModeDeckBLoop");
        moveModeDeckBLoopIn = getMessage("moveModeDeckBLoopIn");
        moveModeDeckBLoopOut = getMessage("moveModeDeckBLoopOut");

        moveDeckBForwardPress = getMessage("moveDeckBForwardPress");
        moveDeckBBackwardPress = getMessage("moveDeckBBackwardPress");
        moveDeckBForwardRelease = getMessage("moveDeckBForwardRelease");
        moveDeckBBackwardRelease = getMessage("moveDeckBBackwardRelease");    	
    	
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
    	
    	sizeSelectorf32DeckB = getMessage("sizeSelectorf32DeckB");
    	sizeSelectorf16DeckB = getMessage("sizeSelectorf16DeckB");
    	sizeSelectorf8DeckB = getMessage("sizeSelectorf8DeckB");
    	sizeSelectorf4DeckB = getMessage("sizeSelectorf4DeckB");
    	sizeSelectorf2DeckB = getMessage("sizeSelectorf2DeckB");
    	sizeSelectori1DeckB = getMessage("sizeSelectori1DeckB");
    	sizeSelectori2DeckB = getMessage("sizeSelectori2DeckB");
    	sizeSelectori4DeckB = getMessage("sizeSelectori4DeckB");
    	sizeSelectori8DeckB = getMessage("sizeSelectori8DeckB");
    	sizeSelectori16DeckB = getMessage("sizeSelectori16DeckB");
    	sizeSelectori32DeckB = getMessage("sizeSelectori32DeckB");
    	
    	deckLoadedReturnDeckB = getMessage("deckLoadedReturnDeckB");

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
    	
    	
    	// C
    	deckLoadedReturnDeckC = getMessage("deckLoadedReturnDeckC");
        beatPhaseReturnDeckC = getMessage("beatPhaseReturnDeckC");
    	loadDeckC = getMessage("loadDeckC");
    	playDeckC = getMessage("playDeckC");
        playReturnDeckC = getMessage("playReturnDeckC");
        pauseDeckC = getMessage("pauseDeckC");
        cueDeckCPress = getMessage("cueDeckCPress");
        cueDeckCRelease = getMessage("cueDeckCRelease");
        cupDeckCPress = getMessage("cupDeckCPress");
        cupDeckCRelease = getMessage("cupDeckCRelease");
    	phaseSyncDeckC = getMessage("phaseSyncDeckC");
    	tempoSyncDeckC = getMessage("tempoSyncDeckC");
    	syncOnOffDeckC = getMessage("syncOnOffDeckC");
    	syncOnOffReturnDeckC = getMessage("syncOnOffReturnDeckC");
    	tempoMasterDeckC = getMessage("tempoMasterDeckC");
    	tempoMasterDeckCReturn = getMessage("tempoMasterReturnDeckC");
    	fluxOnOffDeckC = getMessage("fluxDeckC");
        fluxOnOffDeckCReturn = getMessage("fluxReturnDeckC");
        
        loopActiveToggleDeckC = getMessage("loopActiveToggleDeckC");
        loopActiveReturnDeckC = getMessage("loopActiveReturnDeckC");
        
        moveModeDeckCBeatJump = getMessage("moveModeDeckCBeatJump");
        moveModeDeckCLoop = getMessage("moveModeDeckCLoop");
        moveModeDeckCLoopIn = getMessage("moveModeDeckCLoopIn");
        moveModeDeckCLoopOut = getMessage("moveModeDeckCLoopOut");

        moveDeckCForwardPress = getMessage("moveDeckCForwardPress");
        moveDeckCBackwardPress = getMessage("moveDeckCBackwardPress");
        moveDeckCForwardRelease = getMessage("moveDeckCForwardRelease");
        moveDeckCBackwardRelease = getMessage("moveDeckCBackwardRelease");    	
    	
    	loopSizeSelectSetf32DeckC = getMessage("loopSizeSelectSetf32DeckC");
    	loopSizeSelectSetf16DeckC = getMessage("loopSizeSelectSetf16DeckC");
    	loopSizeSelectSetf8DeckC = getMessage("loopSizeSelectSetf8DeckC");
    	loopSizeSelectSetf4DeckC = getMessage("loopSizeSelectSetf4DeckC");
    	loopSizeSelectSetf2DeckC = getMessage("loopSizeSelectSetf2DeckC");
    	loopSizeSelectSeti1DeckC = getMessage("loopSizeSelectSeti1DeckC");
    	loopSizeSelectSeti2DeckC = getMessage("loopSizeSelectSeti2DeckC");
    	loopSizeSelectSeti4DeckC = getMessage("loopSizeSelectSeti4DeckC");
    	loopSizeSelectSeti8DeckC = getMessage("loopSizeSelectSeti8DeckC");
    	loopSizeSelectSeti16DeckC = getMessage("loopSizeSelectSeti16DeckC");
    	loopSizeSelectSeti32DeckC = getMessage("loopSizeSelectSeti32DeckC");
    	loopSizeSelectSetBackwardf32DeckC = getMessage("loopSizeSelectSetBackwardf32DeckC");
    	loopSizeSelectSetBackwardf16DeckC = getMessage("loopSizeSelectSetBackwardf16DeckC");
    	loopSizeSelectSetBackwardf8DeckC = getMessage("loopSizeSelectSetBackwardf8DeckC");
    	loopSizeSelectSetBackwardf4DeckC = getMessage("loopSizeSelectSetBackwardf4DeckC");
    	loopSizeSelectSetBackwardf2DeckC = getMessage("loopSizeSelectSetBackwardf2DeckC");
    	loopSizeSelectSetBackwardi1DeckC = getMessage("loopSizeSelectSetBackwardi1DeckC");
    	loopSizeSelectSetBackwardi2DeckC = getMessage("loopSizeSelectSetBackwardi2DeckC");
    	loopSizeSelectSetBackwardi4DeckC = getMessage("loopSizeSelectSetBackwardi4DeckC");
    	loopSizeSelectSetBackwardi8DeckC = getMessage("loopSizeSelectSetBackwardi8DeckC");
    	loopSizeSelectSetBackwardi16DeckC = getMessage("loopSizeSelectSetBackwardi16DeckC");
    	loopSizeSelectSetBackwardi32DeckC = getMessage("loopSizeSelectSetBackwardi32DeckC");
    	
    	sizeSelectorf32DeckC = getMessage("sizeSelectorf32DeckC");
    	sizeSelectorf16DeckC = getMessage("sizeSelectorf16DeckC");
    	sizeSelectorf8DeckC = getMessage("sizeSelectorf8DeckC");
    	sizeSelectorf4DeckC = getMessage("sizeSelectorf4DeckC");
    	sizeSelectorf2DeckC = getMessage("sizeSelectorf2DeckC");
    	sizeSelectori1DeckC = getMessage("sizeSelectori1DeckC");
    	sizeSelectori2DeckC = getMessage("sizeSelectori2DeckC");
    	sizeSelectori4DeckC = getMessage("sizeSelectori4DeckC");
    	sizeSelectori8DeckC = getMessage("sizeSelectori8DeckC");
    	sizeSelectori16DeckC = getMessage("sizeSelectori16DeckC");
    	sizeSelectori32DeckC = getMessage("sizeSelectori32DeckC");
    	
    	deckLoadedReturnDeckC = getMessage("deckLoadedReturnDeckC");

        selectSetHotcueDeckC1Press = getMessage("selectSetHotcueDeckC1Press");
    	selectSetHotcueDeckC1Release = getMessage("selectSetHotcueDeckC1Release");
    	selectSetHotcueDeckC2Press = getMessage("selectSetHotcueDeckC2Press");
    	selectSetHotcueDeckC2Release = getMessage("selectSetHotcueDeckC2Release");
    	selectSetHotcueDeckC3Press = getMessage("selectSetHotcueDeckC3Press");
    	selectSetHotcueDeckC3Release = getMessage("selectSetHotcueDeckC3Release");
    	selectSetHotcueDeckC4Press = getMessage("selectSetHotcueDeckC4Press");
    	selectSetHotcueDeckC4Release = getMessage("selectSetHotcueDeckC4Release");
    	selectSetHotcueDeckC5Press = getMessage("selectSetHotcueDeckC5Press");
    	selectSetHotcueDeckC5Release = getMessage("selectSetHotcueDeckC5Release");
    	selectSetHotcueDeckC6Press = getMessage("selectSetHotcueDeckC6Press");
    	selectSetHotcueDeckC6Release = getMessage("selectSetHotcueDeckC6Release");
    	selectSetHotcueDeckC7Press = getMessage("selectSetHotcueDeckC7Press");
    	selectSetHotcueDeckC7Release = getMessage("selectSetHotcueDeckC7Release");
    	selectSetHotcueDeckC8Press = getMessage("selectSetHotcueDeckC8Press");
    	selectSetHotcueDeckC8Release = getMessage("selectSetHotcueDeckC8Release");
    	deleteHotcueDeckC1 = getMessage("deleteHotcueDeckC1");
    	deleteHotcueDeckC2 = getMessage("deleteHotcueDeckC2");
    	deleteHotcueDeckC3 = getMessage("deleteHotcueDeckC3");
    	deleteHotcueDeckC4 = getMessage("deleteHotcueDeckC4");
    	deleteHotcueDeckC5 = getMessage("deleteHotcueDeckC5");
    	deleteHotcueDeckC6 = getMessage("deleteHotcueDeckC6");
    	deleteHotcueDeckC7 = getMessage("deleteHotcueDeckC7");
    	deleteHotcueDeckC8 = getMessage("deleteHotcueDeckC8");
    	hotcueTypeDeckC1 = getMessage("hotcueTypeDeckC1");
    	hotcueTypeDeckC2 = getMessage("hotcueTypeDeckC2");
    	hotcueTypeDeckC3 = getMessage("hotcueTypeDeckC3");
    	hotcueTypeDeckC4 = getMessage("hotcueTypeDeckC4");
    	hotcueTypeDeckC5 = getMessage("hotcueTypeDeckC5");
    	hotcueTypeDeckC6 = getMessage("hotcueTypeDeckC6");
    	hotcueTypeDeckC7 = getMessage("hotcueTypeDeckC7");
    	hotcueTypeDeckC8 = getMessage("hotcueTypeDeckC8");
    	jogTurnDeckCFineForward = getMessage("jogTurnDeckCFineForward");
    	jogTurnDeckCFineBackward = getMessage("jogTurnDeckCFineBackward");
    	jogTurnDeckCCoarseForward = getMessage("jogTurnDeckCCoarseForward");
    	jogTurnDeckCCoarseBackward = getMessage("jogTurnDeckCCoarseBackward");
    	
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
