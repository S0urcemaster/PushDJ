package de.sntr.pushdj.dj;

import javax.sound.midi.MidiMessage;
import javax.sound.midi.Receiver;
import javax.sound.midi.ShortMessage;

import de.sntr.pushdj.push.PushAdapter;

public class PushInputReceiver implements Receiver {
	
    public PushInputReceiver() {
        
    }
    
	@Override//kann man komplett fertig machen
	public void send(MidiMessage message, long timeStamp) {
		if(message instanceof ShortMessage) {
			ShortMessage sm = (ShortMessage) message;
			int command = sm.getCommand();
			if(command == ShortMessage.CONTROL_CHANGE) {
				int cc = sm.getData1();
				int data2 = sm.getData2();
				if(data2 == 1) {
					switch (cc) {
					case 14:
						PushAdapter.encoders[0].increased();
						break;
					case 15:
						PushAdapter.encoders[1].increased();
						break;
					default:
						break;
					}
				}
				else if(data2 == 127) {
					switch (cc) {
					case 14:
						PushAdapter.encoders[0].decreased();
						break;
					case 15:
						PushAdapter.encoders[1].decreased();
						break;
					case 85:
						PushAdapter.play.pressed();
						break;
					case 116:
						PushAdapter.quantize.pressed();
						break;
					case 117:
						PushAdapter.doubble.pressed();
						break;
					case 118:
						PushAdapter.delete.pressed();
						break;
					case 119:
						PushAdapter.undo.pressed();
						break;
					default:
						break;
					}
				}
				else if(data2 == 0) {
					switch (cc) {
					case 85:
						PushAdapter.play.released();
						break;
	
					default:
						break;
					}
				}
				else {
					switch (cc) {
					default:
						System.out.println("PushInputReceiver else default");
						break;
					}
				}
			}
			else if(command == ShortMessage.NOTE_ON) {
				int note = sm.getData1();
				switch (note) {
				//case 0:	state.encoder1Touch(); break;
				case 36: PushAdapter.matrix[0].pressed(); break;
				case 37: PushAdapter.matrix[1].pressed(); break;
				case 38: PushAdapter.matrix[2].pressed(); break;
				case 39: PushAdapter.matrix[3].pressed(); break;
				case 40: PushAdapter.matrix[4].pressed(); break;
				case 41: PushAdapter.matrix[5].pressed(); break;
				case 42: PushAdapter.matrix[6].pressed(); break;
				case 43: PushAdapter.matrix[7].pressed(); break;
				case 44: PushAdapter.matrix[8].pressed(); break;
				case 45: PushAdapter.matrix[9].pressed(); break;
				case 46: PushAdapter.matrix[10].pressed(); break;
				case 47: PushAdapter.matrix[11].pressed(); break;
				case 48: PushAdapter.matrix[12].pressed(); break;
				case 49: PushAdapter.matrix[13].pressed(); break;
				case 50: PushAdapter.matrix[14].pressed(); break;
				case 51: PushAdapter.matrix[15].pressed(); break;
				case 52: PushAdapter.matrix[16].pressed(); break;
				case 53: PushAdapter.matrix[17].pressed(); break;
				case 54: PushAdapter.matrix[18].pressed(); break;
				case 55: PushAdapter.matrix[19].pressed(); break;
				case 56: PushAdapter.matrix[20].pressed(); break;
				case 57: PushAdapter.matrix[21].pressed(); break;
				case 58: PushAdapter.matrix[22].pressed(); break;
				case 59: PushAdapter.matrix[23].pressed(); break;
				case 60: PushAdapter.matrix[24].pressed(); break;
				case 61: PushAdapter.matrix[25].pressed(); break;
				case 62: PushAdapter.matrix[26].pressed(); break;
				case 63: PushAdapter.matrix[27].pressed(); break;
				case 64: PushAdapter.matrix[28].pressed(); break;
				case 65: PushAdapter.matrix[29].pressed(); break;
				case 66: PushAdapter.matrix[30].pressed(); break;
				case 67: PushAdapter.matrix[31].pressed(); break;
				case 68: PushAdapter.matrix[32].pressed(); break;
				case 69: PushAdapter.matrix[33].pressed(); break;
				case 70: PushAdapter.matrix[34].pressed(); break;
				case 71: PushAdapter.matrix[35].pressed(); break;
				case 72: PushAdapter.matrix[36].pressed(); break;
				case 73: PushAdapter.matrix[37].pressed(); break;
				case 74: PushAdapter.matrix[38].pressed(); break;
				case 75: PushAdapter.matrix[39].pressed(); break;
				case 76: PushAdapter.matrix[40].pressed(); break;
				case 77: PushAdapter.matrix[41].pressed(); break;
				case 78: PushAdapter.matrix[42].pressed(); break;
				case 79: PushAdapter.matrix[43].pressed(); break;
				case 80: PushAdapter.matrix[44].pressed(); break;
				case 81: PushAdapter.matrix[45].pressed(); break;
				case 82: PushAdapter.matrix[46].pressed(); break;
				case 83: PushAdapter.matrix[47].pressed(); break;
				case 84: PushAdapter.matrix[48].pressed(); break;
				case 85: PushAdapter.matrix[49].pressed(); break;
				case 86: PushAdapter.matrix[50].pressed(); break;
				case 87: PushAdapter.matrix[51].pressed(); break;
				case 88: PushAdapter.matrix[52].pressed(); break;
				case 89: PushAdapter.matrix[53].pressed(); break;
				case 90: PushAdapter.matrix[54].pressed(); break;
				case 91: PushAdapter.matrix[55].pressed(); break;
				case 92: PushAdapter.matrix[56].pressed(); break;
				case 93: PushAdapter.matrix[57].pressed(); break;
				case 94: PushAdapter.matrix[58].pressed(); break;
				case 95: PushAdapter.matrix[59].pressed(); break;
				case 96: PushAdapter.matrix[60].pressed(); break;
				case 97: PushAdapter.matrix[61].pressed(); break;
				case 98: PushAdapter.matrix[62].pressed(); break;
				case 99: PushAdapter.matrix[63].pressed(); break;
				default:
					break;
				}
			}
			else if(command == ShortMessage.NOTE_OFF) {
				int note = sm.getData1();
				switch (note) {
				//play
				case 37:PushAdapter.matrix[1].released(); break;
				//beatjump
				case 44: PushAdapter.matrix[8].released(); break;
				case 45: PushAdapter.matrix[9].released(); break;
				case 46: PushAdapter.matrix[10].released(); break;
				case 47: PushAdapter.matrix[11].released(); break;
				//hotcues
				case 52: PushAdapter.matrix[16].released(); break;
				case 53: PushAdapter.matrix[17].released(); break;
				case 54: PushAdapter.matrix[18].released(); break;
				case 55: PushAdapter.matrix[19].released(); break;
				case 60: PushAdapter.matrix[24].released(); break;
				case 61: PushAdapter.matrix[25].released(); break;
				case 62: PushAdapter.matrix[26].released(); break;
				case 63: PushAdapter.matrix[27].released(); break;
				
				default:
					break;
				}
			}
		}
printMessage(message);
	}

	@Override
	public void close() {
//		vMidi.shutdown();
	}

	public static void printMessage(MidiMessage message) {
		ShortMessage sm = ((ShortMessage)message);
		System.out.println("PI> Command:" +Integer.toHexString(sm.getCommand()) +" Channel:"+ Integer.toHexString(sm.getChannel()) +" Status:" +Integer.toHexString(sm.getStatus()) +" Data1:" +sm.getData1() +"("+Integer.toHexString(sm.getData1())+ ")" +" Data2:" +sm.getData2() +"("+Integer.toHexString(sm.getData2()) +")");
	}
	
}
