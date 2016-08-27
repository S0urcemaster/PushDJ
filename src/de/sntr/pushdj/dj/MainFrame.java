package de.sntr.pushdj.dj;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JToggleButton;
import java.awt.Insets;
import java.awt.Dimension;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnM = new JButton("M11");
		btnM.setBounds(130, 700, 80, 50);
		contentPane.add(btnM);
		
		JButton button = new JButton("M11");
		button.setBounds(130, 639, 80, 50);
		contentPane.add(button);
		
		JButton button_1 = new JButton("M11");
		button_1.setBounds(130, 517, 80, 50);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("M11");
		button_2.setBounds(130, 578, 80, 50);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("M11");
		button_3.setBounds(130, 273, 80, 50);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("M11");
		button_4.setBounds(130, 334, 80, 50);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("M11");
		button_5.setBounds(130, 395, 80, 50);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("M11");
		button_6.setBounds(130, 456, 80, 50);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("M11");
		button_7.setBounds(130, 237, 80, 25);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("M11");
		button_8.setBounds(130, 201, 80, 25);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("M11");
		button_9.setBounds(220, 700, 80, 50);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("M11");
		button_10.setBounds(220, 639, 80, 50);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("M11");
		button_11.setBounds(220, 517, 80, 50);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("M11");
		button_12.setBounds(220, 578, 80, 50);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("M11");
		button_13.setBounds(220, 273, 80, 50);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("M11");
		button_14.setBounds(220, 334, 80, 50);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("M11");
		button_15.setBounds(220, 395, 80, 50);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("M11");
		button_16.setBounds(220, 456, 80, 50);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton("M11");
		button_17.setBounds(220, 237, 80, 25);
		contentPane.add(button_17);
		
		JButton button_18 = new JButton("M11");
		button_18.setBounds(220, 201, 80, 25);
		contentPane.add(button_18);
		
		JButton button_19 = new JButton("M11");
		button_19.setBounds(310, 700, 80, 50);
		contentPane.add(button_19);
		
		JButton button_20 = new JButton("M11");
		button_20.setBounds(310, 639, 80, 50);
		contentPane.add(button_20);
		
		JButton button_21 = new JButton("M11");
		button_21.setBounds(310, 517, 80, 50);
		contentPane.add(button_21);
		
		JButton button_22 = new JButton("M11");
		button_22.setBounds(310, 578, 80, 50);
		contentPane.add(button_22);
		
		JButton button_23 = new JButton("M11");
		button_23.setBounds(310, 273, 80, 50);
		contentPane.add(button_23);
		
		JButton button_24 = new JButton("M11");
		button_24.setBounds(310, 334, 80, 50);
		contentPane.add(button_24);
		
		JButton button_25 = new JButton("M11");
		button_25.setBounds(310, 395, 80, 50);
		contentPane.add(button_25);
		
		JButton button_26 = new JButton("M11");
		button_26.setBounds(310, 456, 80, 50);
		contentPane.add(button_26);
		
		JButton button_27 = new JButton("M11");
		button_27.setBounds(310, 237, 80, 25);
		contentPane.add(button_27);
		
		JButton button_28 = new JButton("M11");
		button_28.setBounds(310, 201, 80, 25);
		contentPane.add(button_28);
		
		JButton button_29 = new JButton("M11");
		button_29.setBounds(400, 700, 80, 50);
		contentPane.add(button_29);
		
		JButton button_30 = new JButton("M11");
		button_30.setBounds(400, 639, 80, 50);
		contentPane.add(button_30);
		
		JButton button_31 = new JButton("M11");
		button_31.setBounds(400, 517, 80, 50);
		contentPane.add(button_31);
		
		JButton button_32 = new JButton("M11");
		button_32.setBounds(400, 578, 80, 50);
		contentPane.add(button_32);
		
		JButton button_33 = new JButton("M11");
		button_33.setBounds(400, 273, 80, 50);
		contentPane.add(button_33);
		
		JButton button_34 = new JButton("M11");
		button_34.setBounds(400, 334, 80, 50);
		contentPane.add(button_34);
		
		JButton button_35 = new JButton("M11");
		button_35.setBounds(400, 395, 80, 50);
		contentPane.add(button_35);
		
		JButton button_36 = new JButton("M11");
		button_36.setBounds(400, 456, 80, 50);
		contentPane.add(button_36);
		
		JButton button_37 = new JButton("M11");
		button_37.setBounds(400, 237, 80, 25);
		contentPane.add(button_37);
		
		JButton button_38 = new JButton("M11");
		button_38.setBounds(400, 201, 80, 25);
		contentPane.add(button_38);
		
		JButton button_39 = new JButton("M11");
		button_39.setBounds(490, 700, 80, 50);
		contentPane.add(button_39);
		
		JButton button_40 = new JButton("M11");
		button_40.setBounds(490, 639, 80, 50);
		contentPane.add(button_40);
		
		JButton button_41 = new JButton("M11");
		button_41.setBounds(490, 517, 80, 50);
		contentPane.add(button_41);
		
		JButton button_42 = new JButton("M11");
		button_42.setBounds(490, 578, 80, 50);
		contentPane.add(button_42);
		
		JButton button_43 = new JButton("M11");
		button_43.setBounds(490, 273, 80, 50);
		contentPane.add(button_43);
		
		JButton button_44 = new JButton("M11");
		button_44.setBounds(490, 334, 80, 50);
		contentPane.add(button_44);
		
		JButton button_45 = new JButton("M11");
		button_45.setBounds(490, 395, 80, 50);
		contentPane.add(button_45);
		
		JButton button_46 = new JButton("M11");
		button_46.setBounds(490, 456, 80, 50);
		contentPane.add(button_46);
		
		JButton button_47 = new JButton("M11");
		button_47.setBounds(490, 237, 80, 25);
		contentPane.add(button_47);
		
		JButton button_48 = new JButton("M11");
		button_48.setBounds(490, 201, 80, 25);
		contentPane.add(button_48);
		
		JButton button_49 = new JButton("M11");
		button_49.setBounds(580, 700, 80, 50);
		contentPane.add(button_49);
		
		JButton button_50 = new JButton("M11");
		button_50.setBounds(580, 639, 80, 50);
		contentPane.add(button_50);
		
		JButton button_51 = new JButton("M11");
		button_51.setBounds(580, 517, 80, 50);
		contentPane.add(button_51);
		
		JButton button_52 = new JButton("M11");
		button_52.setBounds(580, 578, 80, 50);
		contentPane.add(button_52);
		
		JButton button_53 = new JButton("M11");
		button_53.setBounds(580, 273, 80, 50);
		contentPane.add(button_53);
		
		JButton button_54 = new JButton("M11");
		button_54.setBounds(580, 334, 80, 50);
		contentPane.add(button_54);
		
		JButton button_55 = new JButton("M11");
		button_55.setBounds(580, 395, 80, 50);
		contentPane.add(button_55);
		
		JButton button_56 = new JButton("M11");
		button_56.setBounds(580, 456, 80, 50);
		contentPane.add(button_56);
		
		JButton button_57 = new JButton("M11");
		button_57.setBounds(580, 237, 80, 25);
		contentPane.add(button_57);
		
		JButton button_58 = new JButton("M11");
		button_58.setBounds(580, 201, 80, 25);
		contentPane.add(button_58);
		
		JButton button_59 = new JButton("M11");
		button_59.setBounds(670, 700, 80, 50);
		contentPane.add(button_59);
		
		JButton button_60 = new JButton("M11");
		button_60.setBounds(670, 639, 80, 50);
		contentPane.add(button_60);
		
		JButton button_61 = new JButton("M11");
		button_61.setBounds(670, 517, 80, 50);
		contentPane.add(button_61);
		
		JButton button_62 = new JButton("M11");
		button_62.setBounds(670, 578, 80, 50);
		contentPane.add(button_62);
		
		JButton button_63 = new JButton("M11");
		button_63.setBounds(670, 273, 80, 50);
		contentPane.add(button_63);
		
		JButton button_64 = new JButton("M11");
		button_64.setBounds(670, 334, 80, 50);
		contentPane.add(button_64);
		
		JButton button_65 = new JButton("M11");
		button_65.setBounds(670, 395, 80, 50);
		contentPane.add(button_65);
		
		JButton button_66 = new JButton("M11");
		button_66.setBounds(670, 456, 80, 50);
		contentPane.add(button_66);
		
		JButton button_67 = new JButton("M11");
		button_67.setBounds(670, 237, 80, 25);
		contentPane.add(button_67);
		
		JButton button_68 = new JButton("M11");
		button_68.setBounds(670, 201, 80, 25);
		contentPane.add(button_68);
		
		JButton button_69 = new JButton("M11");
		button_69.setBounds(760, 700, 80, 50);
		contentPane.add(button_69);
		
		JButton button_70 = new JButton("M11");
		button_70.setBounds(760, 639, 80, 50);
		contentPane.add(button_70);
		
		JButton button_71 = new JButton("M11");
		button_71.setBounds(760, 517, 80, 50);
		contentPane.add(button_71);
		
		JButton button_72 = new JButton("M11");
		button_72.setBounds(760, 578, 80, 50);
		contentPane.add(button_72);
		
		JButton button_73 = new JButton("M11");
		button_73.setBounds(760, 273, 80, 50);
		contentPane.add(button_73);
		
		JButton button_74 = new JButton("M11");
		button_74.setBounds(760, 334, 80, 50);
		contentPane.add(button_74);
		
		JButton button_75 = new JButton("M11");
		button_75.setBounds(760, 395, 80, 50);
		contentPane.add(button_75);
		
		JButton button_76 = new JButton("M11");
		button_76.setBounds(760, 456, 80, 50);
		contentPane.add(button_76);
		
		JButton button_77 = new JButton("M11");
		button_77.setBounds(760, 237, 80, 25);
		contentPane.add(button_77);
		
		JButton button_78 = new JButton("M11");
		button_78.setBounds(760, 201, 80, 25);
		contentPane.add(button_78);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(70, 273, 50, 477);
		contentPane.add(btnNewButton);
		
		JButton button_79 = new JButton("M11");
		button_79.setBounds(10, 700, 50, 50);
		contentPane.add(button_79);
		
		JButton button_80 = new JButton("M11");
		button_80.setBounds(10, 639, 50, 50);
		contentPane.add(button_80);
		
		JButton button_81 = new JButton("M11");
		button_81.setBounds(10, 578, 50, 50);
		contentPane.add(button_81);
		
		JButton button_82 = new JButton("M11");
		button_82.setBounds(10, 537, 50, 30);
		contentPane.add(button_82);
		
		JButton button_83 = new JButton("M11");
		button_83.setBounds(10, 496, 50, 30);
		contentPane.add(button_83);
		
		JButton button_84 = new JButton("M11");
		button_84.setBounds(10, 455, 50, 30);
		contentPane.add(button_84);
		
		JButton button_85 = new JButton("M11");
		button_85.setBounds(10, 355, 50, 30);
		contentPane.add(button_85);
		
		JButton button_86 = new JButton("M11");
		button_86.setBounds(10, 314, 50, 30);
		contentPane.add(button_86);
		
		JButton button_87 = new JButton("M11");
		button_87.setBounds(10, 273, 50, 30);
		contentPane.add(button_87);
		
		JButton button_88 = new JButton("M11");
		button_88.setBounds(10, 395, 50, 30);
		contentPane.add(button_88);
		
		JButton button_89 = new JButton("M11");
		button_89.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_89.setBounds(15, 210, 40, 40);
		contentPane.add(button_89);
		
		JButton button_90 = new JButton("M11");
		button_90.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_90.setBounds(71, 210, 40, 40);
		contentPane.add(button_90);
		
		JButton button_92 = new JButton("M11");
		button_92.setBounds(10, 148, 50, 30);
		contentPane.add(button_92);
		
		JButton button_91 = new JButton("M11");
		button_91.setBounds(10, 87, 50, 50);
		contentPane.add(button_91);
		
		JButton button_93 = new JButton("M11");
		button_93.setBounds(130, 87, 710, 91);
		contentPane.add(button_93);
		
		JButton button_94 = new JButton("M11");
		button_94.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_94.setBounds(154, 36, 40, 40);
		contentPane.add(button_94);
		
		JButton button_95 = new JButton("M11");
		button_95.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_95.setBounds(239, 36, 40, 40);
		contentPane.add(button_95);
		
		JButton button_96 = new JButton("M11");
		button_96.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_96.setBounds(328, 36, 40, 40);
		contentPane.add(button_96);
		
		JButton button_97 = new JButton("M11");
		button_97.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_97.setBounds(417, 36, 40, 40);
		contentPane.add(button_97);
		
		JButton button_98 = new JButton("M11");
		button_98.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_98.setBounds(684, 36, 40, 40);
		contentPane.add(button_98);
		
		JButton button_99 = new JButton("M11");
		button_99.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_99.setBounds(773, 36, 40, 40);
		contentPane.add(button_99);
		
		JButton button_100 = new JButton("M11");
		button_100.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_100.setBounds(595, 36, 40, 40);
		contentPane.add(button_100);
		
		JButton button_101 = new JButton("M11");
		button_101.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_101.setBounds(510, 36, 40, 40);
		contentPane.add(button_101);
		
		JButton button_102 = new JButton("M11");
		button_102.setBounds(860, 578, 50, 50);
		contentPane.add(button_102);
		
		JButton button_103 = new JButton("M11");
		button_103.setBounds(860, 639, 50, 50);
		contentPane.add(button_103);
		
		JButton button_104 = new JButton("M11");
		button_104.setBounds(860, 700, 50, 50);
		contentPane.add(button_104);
		
		JButton button_105 = new JButton("M11");
		button_105.setBounds(860, 395, 50, 50);
		contentPane.add(button_105);
		
		JButton button_106 = new JButton("M11");
		button_106.setBounds(860, 456, 50, 50);
		contentPane.add(button_106);
		
		JButton button_107 = new JButton("M11");
		button_107.setBounds(860, 517, 50, 50);
		contentPane.add(button_107);
		
		JButton button_108 = new JButton("M11");
		button_108.setBounds(860, 273, 50, 50);
		contentPane.add(button_108);
		
		JButton button_109 = new JButton("M11");
		button_109.setBounds(860, 334, 50, 50);
		contentPane.add(button_109);
		
		JButton button_110 = new JButton("M11");
		button_110.setBounds(860, 201, 50, 25);
		contentPane.add(button_110);
		
		JButton button_111 = new JButton("M11");
		button_111.setBounds(860, 237, 50, 25);
		contentPane.add(button_111);
		
		JButton button_112 = new JButton("M11");
		button_112.setBounds(928, 201, 50, 25);
		contentPane.add(button_112);
		
		JButton button_113 = new JButton("M11");
		button_113.setBounds(928, 237, 50, 25);
		contentPane.add(button_113);
		
		JButton button_114 = new JButton("M11");
		button_114.setBounds(988, 201, 50, 25);
		contentPane.add(button_114);
		
		JButton button_115 = new JButton("M11");
		button_115.setBounds(988, 237, 50, 25);
		contentPane.add(button_115);
		
		JButton button_116 = new JButton("M11");
		button_116.setBounds(928, 272, 50, 30);
		contentPane.add(button_116);
		
		JButton button_117 = new JButton("M11");
		button_117.setBounds(928, 313, 50, 30);
		contentPane.add(button_117);
		
		JButton button_118 = new JButton("M11");
		button_118.setBounds(928, 354, 50, 30);
		contentPane.add(button_118);
		
		JButton button_119 = new JButton("M11");
		button_119.setBounds(988, 273, 50, 30);
		contentPane.add(button_119);
		
		JButton button_120 = new JButton("M11");
		button_120.setBounds(988, 314, 50, 30);
		contentPane.add(button_120);
		
		JButton button_121 = new JButton("M11");
		button_121.setBounds(988, 355, 50, 30);
		contentPane.add(button_121);
		
		JButton button_122 = new JButton("M11");
		button_122.setBounds(928, 455, 50, 30);
		contentPane.add(button_122);
		
		JButton button_123 = new JButton("M11");
		button_123.setBounds(928, 496, 50, 30);
		contentPane.add(button_123);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.setMargin(new Insets(2, 0, 2, 0));
		btnSelect.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSelect.setBounds(928, 537, 50, 30);
		contentPane.add(btnSelect);
		
		JButton button_125 = new JButton("M11");
		button_125.setBounds(988, 455, 50, 30);
		contentPane.add(button_125);
		
		JButton button_126 = new JButton("M11");
		button_126.setBounds(988, 496, 50, 30);
		contentPane.add(button_126);
		
		JButton button_127 = new JButton("M11");
		button_127.setBounds(988, 537, 50, 30);
		contentPane.add(button_127);
		
		JButton button_128 = new JButton("M11");
		button_128.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_128.setBounds(861, 36, 40, 40);
		contentPane.add(button_128);
		
		JButton button_129 = new JButton("M11");
		button_129.setBounds(928, 65, 50, 30);
		contentPane.add(button_129);
		
		JButton button_130 = new JButton("M11");
		button_130.setBounds(988, 66, 50, 30);
		contentPane.add(button_130);
		
		JButton button_131 = new JButton("M11");
		button_131.setBounds(988, 107, 50, 30);
		contentPane.add(button_131);
		
		JButton button_132 = new JButton("M11");
		button_132.setBounds(988, 148, 50, 30);
		contentPane.add(button_132);
		
		JButton button_133 = new JButton("M11");
		button_133.setBounds(928, 147, 50, 30);
		contentPane.add(button_133);
		
		JButton button_134 = new JButton("M11");
		button_134.setBounds(928, 106, 50, 30);
		contentPane.add(button_134);
		
		JButton button_135 = new JButton("M11");
		button_135.setBounds(959, 694, 40, 40);
		contentPane.add(button_135);
		
		JButton button_136 = new JButton("M11");
		button_136.setBounds(959, 627, 40, 40);
		contentPane.add(button_136);
		
		JButton button_137 = new JButton("M11");
		button_137.setBounds(918, 661, 40, 40);
		contentPane.add(button_137);
		
		JButton button_138 = new JButton("M11");
		button_138.setBounds(1000, 661, 40, 40);
		contentPane.add(button_138);
		
		textField = new JTextField();
		textField.setBounds(1111, 74, 241, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblMatrixbutton = new JLabel("MatrixButton11");
		lblMatrixbutton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMatrixbutton.setBounds(1075, 42, 277, 21);
		contentPane.add(lblMatrixbutton);
		
		JLabel lblFn = new JLabel("Fn:");
		lblFn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFn.setBounds(1075, 74, 31, 21);
		contentPane.add(lblFn);
		
		JToggleButton tglbtnDeckA = new JToggleButton("A");
		tglbtnDeckA.setSize(new Dimension(35, 23));
		tglbtnDeckA.setMaximumSize(new Dimension(35, 23));
		tglbtnDeckA.setMinimumSize(new Dimension(35, 23));
		tglbtnDeckA.setPreferredSize(new Dimension(35, 23));
		tglbtnDeckA.setBounds(1075, 121, 60, 29);
		contentPane.add(tglbtnDeckA);
		
		JToggleButton tglbtnDeckB = new JToggleButton("B");
		tglbtnDeckB.setSize(new Dimension(35, 23));
		tglbtnDeckB.setMaximumSize(new Dimension(35, 23));
		tglbtnDeckB.setMinimumSize(new Dimension(35, 23));
		tglbtnDeckB.setPreferredSize(new Dimension(35, 23));
		tglbtnDeckB.setBounds(1145, 121, 60, 29);
		contentPane.add(tglbtnDeckB);
		
		JToggleButton tglbtnC = new JToggleButton("C");
		tglbtnC.setSize(new Dimension(35, 23));
		tglbtnC.setMaximumSize(new Dimension(35, 23));
		tglbtnC.setMinimumSize(new Dimension(35, 23));
		tglbtnC.setPreferredSize(new Dimension(35, 23));
		tglbtnC.setBounds(1215, 121, 60, 29);
		contentPane.add(tglbtnC);
		
		JToggleButton tglbtnD = new JToggleButton("D");
		tglbtnD.setSize(new Dimension(35, 23));
		tglbtnD.setMaximumSize(new Dimension(35, 23));
		tglbtnD.setMinimumSize(new Dimension(35, 23));
		tglbtnD.setPreferredSize(new Dimension(35, 23));
		tglbtnD.setBounds(1285, 121, 60, 29);
		contentPane.add(tglbtnD);
		
		JToggleButton tglbtnTrack = new JToggleButton("Track");
		tglbtnTrack.setSize(new Dimension(35, 23));
		tglbtnTrack.setPreferredSize(new Dimension(35, 23));
		tglbtnTrack.setMinimumSize(new Dimension(35, 23));
		tglbtnTrack.setMaximumSize(new Dimension(35, 23));
		tglbtnTrack.setBounds(1075, 164, 73, 29);
		contentPane.add(tglbtnTrack);
		
		JToggleButton tglbtnRemix = new JToggleButton("Remix");
		tglbtnRemix.setSize(new Dimension(35, 23));
		tglbtnRemix.setPreferredSize(new Dimension(35, 23));
		tglbtnRemix.setMinimumSize(new Dimension(35, 23));
		tglbtnRemix.setMaximumSize(new Dimension(35, 23));
		tglbtnRemix.setBounds(1155, 164, 73, 29);
		contentPane.add(tglbtnRemix);
		
		JToggleButton tglbtnStem = new JToggleButton("Stem");
		tglbtnStem.setSize(new Dimension(35, 23));
		tglbtnStem.setPreferredSize(new Dimension(35, 23));
		tglbtnStem.setMinimumSize(new Dimension(35, 23));
		tglbtnStem.setMaximumSize(new Dimension(35, 23));
		tglbtnStem.setBounds(1238, 164, 73, 29);
		contentPane.add(tglbtnStem);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(1075, 201, 277, 226);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Play", "Play Sync", "Cue", "Cup", "Sync Tap", "Sync On/Off", "Master", "Flux Mode On/Off", "Cue1 Set", "Cue2 Set", "Cue1 Delete", "Cue2 Delete", "Jog Coarse Backward", "Jog Fine Forward", "BeatJump Size Inc", "BeatJump Size Dec", "BeatJump Forward", "BeatJump Backward", "Loop On/Off", "Loop Size Select + Set"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
	}
}
