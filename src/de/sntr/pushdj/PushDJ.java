package de.sntr.pushdj;

import java.awt.EventQueue;

import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiDevice.Info;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.Transmitter;
import javax.swing.JFrame;

import org.apache.commons.io.FileUtils;

import de.sntr.pushdj.dj.DJController;
import de.sntr.pushdj.push.Display.Graphics;
import de.sntr.pushdj.push.PushAdapter;
import de.sntr.pushdj.push.PushInputReceiver;
import de.sntr.pushdj.traktor.TraktorAdapter;
import de.sntr.pushdj.traktor.VirtualMIDIReceiver;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PushDJ {
	
	JFrame frmPushdj;
	MidiDevice pushIn;
	MidiDevice pushOut;
	DJController djc;
	
	static Map<String, int[]> mappings = new HashMap<>();
	private JTextField textField;
	private JTextField textField_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		File mappingsFile = new File("traktor.mappings");
		List<String> lines = null;
		try {
			lines = FileUtils.readLines(mappingsFile);
		} catch (IOException e1) {
			throw new RuntimeException("Could not read mappings file");
		}
		if(lines == null) {
			throw new RuntimeException("Could not read mappings file");
		}
		Pattern p = Pattern.compile(",");
		for (String line : lines) {
			if(line.startsWith("#") || line.isEmpty() || line.startsWith(" ")) {
				continue;
			}
			String[] split = p.split(line);
			int command = Integer.parseInt(split[1]);
			int channel = Integer.parseInt(split[2]);
			int data1 = Integer.parseInt(split[3]);
			int data2 = Integer.parseInt(split[4]);
			mappings.put(split[0], new int[]{command, channel, data1, data2});
		}
		
		for (Graphics graphics : Graphics.values()) {
			File gf = new File("graphics/" +graphics.name() +".ascii");
			if(!gf.exists()) {
				throw new RuntimeException("Could not read graphics file: " +gf.getPath());
			}
			try {
				lines = FileUtils.readLines(gf);
			} catch (IOException e) {
				throw new RuntimeException("Could not read graphics file: " +gf.getPath());
			}
			
			PushAdapter.display.putGraphics(graphics, lines);
			
		}
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					PushDJ window = new PushDJ();
					window.frmPushdj.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PushDJ() {
		initialize();
		Info[] devicesInfo = MidiSystem.getMidiDeviceInfo();
		PushInputReceiver inputReceiver = new PushInputReceiver();
		Receiver outputReceiver = null;
		
		try {
			for (Info info : devicesInfo) {
				System.out.println(info.getName());
				if(info.getName().equals("MIDIIN2 (Ableton Push)")) {
					System.out.print("Push in found: ");
					System.out.println(info.getDescription());
					pushIn = MidiSystem.getMidiDevice(info);
					List<Transmitter> transmitters = pushIn.getTransmitters();
					for (Transmitter transmitter : transmitters) {
						System.out.println("Adding transmitter: " +pushIn.getDeviceInfo().toString());
						transmitter.setReceiver(inputReceiver);
					}
					pushIn.open();
					Transmitter trans = pushIn.getTransmitter();
		            trans.setReceiver(inputReceiver);
				}
				if(info.getName().equals("MIDIOUT2 (Ableton Push)")) {
					System.out.print("Push out found: ");
					System.out.println(info.getDescription());
					pushOut = MidiSystem.getMidiDevice(info);
					pushOut.open();
					outputReceiver = pushOut.getReceiver();
				}
			}
		} catch (MidiUnavailableException e) {
			e.printStackTrace();
		}
		new TraktorAdapter(mappings);
		PushAdapter.outReceiver = outputReceiver;
		new PushAdapter();
		djc = new DJController();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPushdj = new JFrame();
		frmPushdj.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				shutdown();
			}
		});
		frmPushdj.setTitle("PushDJ");
		frmPushdj.setBounds(100, 100, 450, 300);
		frmPushdj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.setText("1");
		frmPushdj.getContentPane().add(textField, BorderLayout.WEST);
		textField.setColumns(10);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(Integer.toString((Integer.parseInt(textField_1.getText()) -1)));
				
			}
		});
		frmPushdj.getContentPane().add(button, BorderLayout.CENTER);
		
		JButton button_1 = new JButton("+");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(Integer.toString((Integer.parseInt(textField_1.getText()) +1)));
			}
		});
		frmPushdj.getContentPane().add(button_1, BorderLayout.EAST);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		frmPushdj.getContentPane().add(textField_1, BorderLayout.NORTH);
		textField_1.setColumns(10);
	}
	
	void shutdown() {
		System.out.println("Shutting down");
		VirtualMIDIReceiver.running = false;
		try {
			//pushIn.getTransmitter().getReceiver().close();
			pushIn.getTransmitter().close();
		} catch (MidiUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pushIn.close();
	}

}
