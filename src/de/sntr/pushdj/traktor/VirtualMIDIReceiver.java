package de.sntr.pushdj.traktor;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.ShortMessage;

import de.tobiaserichsen.tevm.TeVirtualMIDI;
import de.tobiaserichsen.tevm.TeVirtualMIDITest;

/**
 * Receives Traktor Messages
 * @author sntrAdmin
 *
 */
public class VirtualMIDIReceiver extends Thread {

	public static volatile boolean running = true;
	
	private TeVirtualMIDI vMidi;
	
	public VirtualMIDIReceiver(TeVirtualMIDI vMidi) {
		this.vMidi = vMidi;
	}
	
	@Override
	public void run() {
		byte[] message;
		
		while(running) {
			message = vMidi.getCommand();
			if(message != null) {
				byte status = message[0];
				byte data1 = message[1];
				byte data2 = message[2];
				ShortMessage sm = null;
				try {
					sm = new ShortMessage(status, data1, data2);
				} catch (InvalidMidiDataException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int command = sm.getCommand();
				if(command == 0xb0) {
					if(sm.getChannel() == 0) { //Global
						switch (sm.getData1()) {
						case 32:
							
							break;

						default:
							break;
						}
					}
					else if(sm.getChannel() == 1) { //deckA
						switch (sm.getData1()) {
						case 29:
							TraktorAdapter.hotcueTypeDeckA1.data2 = sm.getData2();
							TraktorAdapter.hotcueTypeDeckA1.sent();
							break;
						case 30:
							TraktorAdapter.hotcueTypeDeckA2.data2 = sm.getData2();
							TraktorAdapter.hotcueTypeDeckA2.sent();
							break;
						case 31:
							TraktorAdapter.hotcueTypeDeckA3.data2 = sm.getData2();
							TraktorAdapter.hotcueTypeDeckA3.sent();
							break;
						case 32:
							TraktorAdapter.hotcueTypeDeckA4.data2 = sm.getData2();
							TraktorAdapter.hotcueTypeDeckA4.sent();
							break;
						case 33:
							TraktorAdapter.hotcueTypeDeckA5.data2 = sm.getData2();
							TraktorAdapter.hotcueTypeDeckA5.sent();
							break;
						case 34:
							TraktorAdapter.hotcueTypeDeckA6.data2 = sm.getData2();
							TraktorAdapter.hotcueTypeDeckA6.sent();
							break;
						case 35:
							TraktorAdapter.hotcueTypeDeckA7.data2 = sm.getData2();
							TraktorAdapter.hotcueTypeDeckA7.sent();
							break;
						case 36:
							TraktorAdapter.hotcueTypeDeckA8.data2 = sm.getData2();
							TraktorAdapter.hotcueTypeDeckA8.sent();
							break;
						case 37:
							TraktorAdapter.playReturnDeckA.data2 = sm.getData2();
							TraktorAdapter.playReturnDeckA.sent();
							break;
						case 44:
							TraktorAdapter.syncOnReturnDeckA.data2 = sm.getData2();
							TraktorAdapter.syncOnReturnDeckA.sent();
							break;
						case 46:
							TraktorAdapter.tempoMasterDeckAReturn.data2 = sm.getData2();
							TraktorAdapter.tempoMasterDeckAReturn.sent();
							break;
						case 47:
							TraktorAdapter.moveModeDeckAReturn.data2 = sm.getData2();
							TraktorAdapter.moveModeDeckAReturn.sent();
							break;
						case 48:
							TraktorAdapter.moveSizeDeckAReturn.data2 = sm.getData2();
							TraktorAdapter.moveSizeDeckAReturn.sent();
							break;
						default:
							break;
						}
							
					}
					else if(sm.getChannel() == 2) { //deckB
						switch (sm.getData1()) {
						case 29:
							TraktorAdapter.hotcueTypeDeckB1.data2 = sm.getData2();
							TraktorAdapter.hotcueTypeDeckB1.sent();
							break;
						case 30:
							TraktorAdapter.hotcueTypeDeckB2.data2 = sm.getData2();
							TraktorAdapter.hotcueTypeDeckB2.sent();
							break;
						case 31:
							TraktorAdapter.hotcueTypeDeckB3.data2 = sm.getData2();
							TraktorAdapter.hotcueTypeDeckB3.sent();
							break;
						case 32:
							TraktorAdapter.hotcueTypeDeckB4.data2 = sm.getData2();
							TraktorAdapter.hotcueTypeDeckB4.sent();
							break;
						case 33:
							TraktorAdapter.hotcueTypeDeckB5.data2 = sm.getData2();
							TraktorAdapter.hotcueTypeDeckB5.sent();
							break;
						case 34:
							TraktorAdapter.hotcueTypeDeckB6.data2 = sm.getData2();
							TraktorAdapter.hotcueTypeDeckB6.sent();
							break;
						case 35:
							TraktorAdapter.hotcueTypeDeckB7.data2 = sm.getData2();
							TraktorAdapter.hotcueTypeDeckB7.sent();
							break;
						case 36:
							TraktorAdapter.hotcueTypeDeckB8.data2 = sm.getData2();
							TraktorAdapter.hotcueTypeDeckB8.sent();
							break;
						case 37:
							TraktorAdapter.playReturnDeckB.data2 = sm.getData2();
							TraktorAdapter.playReturnDeckB.sent();
							break;
						case 44:
							TraktorAdapter.syncOnReturnDeckB.data2 = sm.getData2();
							TraktorAdapter.syncOnReturnDeckB.sent();
							break;
						case 46:
							TraktorAdapter.tempoMasterDeckBReturn.data2 = sm.getData2();
							TraktorAdapter.tempoMasterDeckBReturn.sent();
							break;
						case 47:
							TraktorAdapter.moveModeDeckBReturn.data2 = sm.getData2();
							TraktorAdapter.moveModeDeckBReturn.sent();
							break;
						case 48:
							TraktorAdapter.moveSizeDeckBReturn.data2 = sm.getData2();
							TraktorAdapter.moveSizeDeckBReturn.sent();
							break;
						default:
							break;
						}
							
					}
				}
				System.out.println("VMR> " +TeVirtualMIDITest.byteArrayToString(message));
			}
		}
		
	}
	
}
