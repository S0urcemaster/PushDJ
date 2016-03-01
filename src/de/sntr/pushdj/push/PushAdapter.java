package de.sntr.pushdj.push;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.Receiver;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.SysexMessage;

public class PushAdapter {

	public static MatrixButton[] matrix = new MatrixButton[64];
	public static ResolutionButton[] trackTop = new ResolutionButton[8]; //Small top row same colors like resolution
	public static MatrixButton[] trackBottom = new MatrixButton[8]; //Small bottom row colored like matrix buttons
	public static ResolutionButton[] resolution = new ResolutionButton[8]; // 1/4, 1/4t ... 1/32t
	public static TitleButton play = new TitleButton(85);
	public static TitleButton record = new TitleButton(86);
	public static TitleButton nnew = new TitleButton(87);
	public static TitleButton duplicate = new TitleButton(88);
	public static TitleButton automation = new TitleButton(89);
	public static TitleButton fixedLength = new TitleButton(90);
	public static TitleButton quantize = new TitleButton(116);
	public static TitleButton doubble = new TitleButton(117);
	public static TitleButton delete = new TitleButton(118);
	public static TitleButton undo = new TitleButton(119);
	public static TitleButton metronome = new TitleButton(9);
	public static TitleButton tapTempo = new TitleButton(3);
	public static TitleButton stop = new TitleButton(29); //Track Stop
	public static TitleButton master = new TitleButton(28);
	public static TitleButton left = new TitleButton(44);
	public static TitleButton up = new TitleButton(46);
	public static TitleButton right = new TitleButton(45);
	public static TitleButton down = new TitleButton(47);
	public static TitleButton select = new TitleButton(48);
	public static TitleButton shift = new TitleButton(49);
	public static TitleButton note = new TitleButton(50);
	public static TitleButton session = new TitleButton(51);
	public static TitleButton addEffect = new TitleButton(52);// Add Device
	public static TitleButton addTrack = new TitleButton(53);
	public static TitleButton octaveDown = new TitleButton(54);
	public static TitleButton octaveUp = new TitleButton(55);
	public static TitleButton repeat = new TitleButton(56);
	public static TitleButton accent = new TitleButton(57);
	public static TitleButton scales = new TitleButton(58);
	public static TitleButton user = new TitleButton(59);
	public static TitleButton mute = new TitleButton(60);
	public static TitleButton solo = new TitleButton(61);
	public static TitleButton in = new TitleButton(62);
	public static TitleButton out = new TitleButton(63);
	public static TitleButton device = new TitleButton(110);
	public static TitleButton browse = new TitleButton(111);
	public static TitleButton tracck = new TitleButton(112);
	public static TitleButton clip = new TitleButton(113);
	public static TitleButton volume = new TitleButton(114);
	public static TitleButton panSend = new TitleButton(115);
	
	public static Encoder[] encoders = new Encoder[11];

	public static Receiver outReceiver;

	public List<Button> buttonControls = new ArrayList<>();
	
	
	public PushAdapter() {
		for(int i = 0; i < 64; i++) {
			matrix[i] = new MatrixButton(ShortMessage.NOTE_ON, i +36);
			buttonControls.add(matrix[i]);
		}
		for (int i = 0; i < 8; i++) {
			trackTop[i] = new ResolutionButton(i +20);
			buttonControls.add(trackTop[i]);
		}
		for (int i = 0; i < 8; i++) {
			trackBottom[i] = new MatrixButton(ShortMessage.CONTROL_CHANGE, i +102);
			buttonControls.add(trackBottom[i]);
		}
		for (int i = 0; i < 8; i++) {
			resolution[i] = new ResolutionButton(i +36);
			buttonControls.add(resolution[i]);
		}

		encoders[0] = new Encoder(ShortMessage.CONTROL_CHANGE, 14);
		encoders[1] = new Encoder(ShortMessage.CONTROL_CHANGE, 15);
		encoders[2] = new Encoder(ShortMessage.CONTROL_CHANGE, 71);
		encoders[3] = new Encoder(ShortMessage.CONTROL_CHANGE, 72);
		encoders[4] = new Encoder(ShortMessage.CONTROL_CHANGE, 73);
		encoders[5] = new Encoder(ShortMessage.CONTROL_CHANGE, 74);
		encoders[6] = new Encoder(ShortMessage.CONTROL_CHANGE, 75);
		encoders[7] = new Encoder(ShortMessage.CONTROL_CHANGE, 76);
		encoders[8] = new Encoder(ShortMessage.CONTROL_CHANGE, 77);
		encoders[9] = new Encoder(ShortMessage.CONTROL_CHANGE, 78);
		encoders[10] = new Encoder(ShortMessage.CONTROL_CHANGE, 88);
		
		buttonControls.add(accent);
		buttonControls.add(addEffect);
		buttonControls.add(browse);
		buttonControls.add(delete);
		buttonControls.add(device);
		buttonControls.add(doubble);
		buttonControls.add(duplicate);
		buttonControls.add(fixedLength);
		buttonControls.add(left);
		buttonControls.add(master);
		buttonControls.add(metronome);
		buttonControls.add(mute);
		buttonControls.add(nnew);
		buttonControls.add(note);
		buttonControls.add(octaveDown);
		buttonControls.add(octaveUp);
		buttonControls.add(panSend);
		buttonControls.add(quantize);
		buttonControls.add(record);
		buttonControls.add(repeat);
		buttonControls.add(scales);
		buttonControls.add(select);
		buttonControls.add(session);
		buttonControls.add(tapTempo);
		buttonControls.add(user);
		buttonControls.add(volume);
		buttonControls.add(addTrack);
		buttonControls.add(automation);
		buttonControls.add(clip);
		buttonControls.add(down);
		buttonControls.add(in);
		buttonControls.add(out);
		buttonControls.add(play);
		buttonControls.add(right);
		buttonControls.add(shift);
		buttonControls.add(solo);
		buttonControls.add(stop);
		buttonControls.add(tracck);
		buttonControls.add(undo);
		buttonControls.add(up);

		for(Button control : buttonControls) {
			setColor(control, Button.OFF);
		}
		
	}
	
	public static void setColor(Button control, int color) {
		try {
			ShortMessage m = new ShortMessage(control.command, 0, control.data1, color);
			outReceiver.send(m, 0);
		} catch (InvalidMidiDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void sysex() {
		byte[] data = new byte[77];
		data[0] = (byte)240;
		data[1] = 71;
		data[2] = 127;
		data[3] = 21;
		data[4] = 24;
		data[5] = 0;
		data[6] = 69;
		data[7] = 0;
		data[8] = 'H';
		data[9] = 'E';
		data[10] = 'L';
		data[11] = 'L';
		data[12] = 'O';
		data[76] = (byte)247;
		try {
			SysexMessage s = new SysexMessage(data, 77);
			outReceiver.send(s, 0);
		} catch (InvalidMidiDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
