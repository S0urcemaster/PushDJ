package de.sntr.pushdj.traktor;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.ShortMessage;

import de.tobiaserichsen.tevm.TeVirtualMIDI;
import de.tobiaserichsen.tevm.TeVirtualMIDITest;

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
					if(sm.getChannel() == 1) { //deckA
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

						default:
							break;
						}
							
					}
				}
				System.out.println("C> " +TeVirtualMIDITest.byteArrayToString(message));
			}
		}
		
	}
	
}
