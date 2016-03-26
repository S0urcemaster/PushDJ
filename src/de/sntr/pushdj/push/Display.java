package de.sntr.pushdj.push;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Display {

	private static final byte[] prefix = {(byte)240, 71, 127, 21};
	private static final byte[] midfix = {0, 69, 0};
	private static final byte suffix = (byte)247;
	
	public static final Map<Graphics, byte[][]> graphics = new HashMap<>();
	
	public byte[][] characters = new byte[4][68];
	private byte[][] lines = new byte[4][77];
	
	public enum SpecialChars {
		arrowUp(0),
		arrowDown(1),
		barsHorizontal(2),
		leftLimiter(3),
		rightLimiter(4),
		barsVertical(5),
		lineHorizontal(6),
		folderSymbol(7),
		lineVertical(8),
		degreeSign(9),
		triplePoint(28),
		thickBar(29),
		arrowRight(30),
		arrowLeft(31),
		space(32)
		;
		
		byte code;
		SpecialChars(int code) {
			this.code = (byte)code;
		}
	};
	
	public enum Graphics {
		BigA, BigB, BigC, BigD
	}
	
	public Display() {
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 68; i++) {
				characters[j][i] = SpecialChars.space.code;
			}
		}
		int r = 1;
	}
	
	public void writeOnLine(int line, int col, String s) {
		if(col*17 +s.length() > 68) {
			throw new RuntimeException("Text exceeds line");
		}
		for (int i = 0; i < s.length(); i++) {
			characters[line][i+col] = (byte)s.charAt(i);
		}
	}
	
	public void setColumn(int col, Graphics l) {
		for (int i = 0; i < 4; i++) {			
			System.arraycopy(graphics.get(l)[i], 0, characters[i], col*17, 17);
		}
	}
	
//	public void setColumn(int no, byte[][] rows) {
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 17; j++) {
//				lines[i][j+no*17] = rows[i][j];
//				if(rows[i][j] == 35) {
//					lines[i][j+no*17] = SpecialChars.thickBar.code;
//				}
//			}
//		}
//	}
	
	public void update() {
		makeLines();
		for (int i = 0; i < 4; i++) {
			try {
				System.out.write(lines[i]);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println();
			PushAdapter.sysex(lines[i]);
		}
	}
	
	private void makeLines() {
		for (byte i = 0; i < 4; i++) {
			System.arraycopy(prefix, 0, lines[i], 0, prefix.length);
			lines[i][4] = (byte)(i+24);
			System.arraycopy(midfix, 0, lines[i], prefix.length+1, midfix.length);
			System.arraycopy(characters[i], 0, lines[i], 8, 68);
			lines[i][76] = suffix;
		}
	}
	
	public void putGraphics(Graphics g, byte[][] data) {
		graphics.put(g, data);
	}
	
	public void putGraphics(Graphics g, List<String> lines) {
		byte[][] ls = new byte[4][17];
		for (int i = 0; i < 4; i++) {
			char[] line = lines.get(i).toCharArray();
			for (int j = 0; j < 17; j++) {
				ls[i][j] = (byte)line[j];
				if(line[j] == '#') {
					ls[i][j] = SpecialChars.thickBar.code;
				}
			}
		}
		putGraphics(g, ls);
	}
	
	
	private void scratchBackup() {

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
		
		for(byte i = 0; i<33; i++) {
			data[i+13] = i;
		}
		
		data[76] = (byte)247;
	}
	
}
