﻿package com.java.swing.horoscope;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JList;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;

import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.alee.laf.WebLookAndFeel;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.synth.SynthSpinnerUI;
import javax.swing.event.ChangeEvent;

public class Interfacelayer {

	private JFrame frmHoroscope;
	private JTextField dateTextField_1;
	private JTextField dateTextField_2;
	Chooser ser_1 = Chooser.getInstance();
	Chooser ser_2 = Chooser.getInstance();
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfacelayer window = new Interfacelayer();
					window.frmHoroscope.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfacelayer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHoroscope = new JFrame();
		frmHoroscope.setTitle("Horoscope");
		frmHoroscope.setBounds(100, 100, 1000, 550);
		frmHoroscope.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHoroscope.setResizable(false);
		
		//菜单栏
		JMenuBar menuBar = new JMenuBar();
		frmHoroscope.setJMenuBar(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("\u65B0\u5EFA");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("\u4E3B\u9898");
		menuBar.add(mnNewMenu_2);
		
		JRadioButtonMenuItem menuItem_1 = new JRadioButtonMenuItem("Metal 风格");
		menuItem_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==1) {
				String lookAndFeel = UIManager.getSystemLookAndFeelClassName();
				try {
					UIManager.setLookAndFeel(lookAndFeel);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}}
			}
		});
		mnNewMenu_2.add(menuItem_1);
		
		JRadioButtonMenuItem menuItem_2 = new JRadioButtonMenuItem("Nimbus 风格");
		mnNewMenu_2.add(menuItem_2);
		
		JRadioButtonMenuItem menuItem_3 = new JRadioButtonMenuItem("Windows 风格");
		mnNewMenu_2.add(menuItem_3);
		
		JRadioButtonMenuItem menuItem_4 = new JRadioButtonMenuItem("Motif 风格");
		mnNewMenu_2.add(menuItem_4);
		frmHoroscope.getContentPane().setLayout(new BoxLayout(frmHoroscope.getContentPane(), BoxLayout.X_AXIS));
		
		ButtonGroup groupMenu=new ButtonGroup();
		groupMenu.add(menuItem_1);
		groupMenu.add(menuItem_2);
		groupMenu.add(menuItem_3);
		groupMenu.add(menuItem_4);
		
//		ActionListener themeListener = e -> {
//			try {
//				switch(e.getActionCommand()) {
//				case "Metal 风格":
//					String lookAndFeel = UIManager.getSystemLookAndFeelClassName();
//					UIManager.setLookAndFeel(lookAndFeel);
//					break;
//				case "Nimbus 风格":
//					break;
//				case "Windows 风格":
//					break;
//				case "Motif 风格":
//					break;
//				}
//				
//			}catch(Exception ee){
//				ee.printStackTrace();
//			}
//		};
//		
//		menuItem_1.addActionListener(themeListener);
//		menuItem_2.addActionListener(themeListener);
//		menuItem_3.addActionListener(themeListener);
//		menuItem_4.addActionListener(themeListener);
		
		
		//分割面板
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_1.setDividerSize(5);
		splitPane_1.setDividerLocation(400);
		frmHoroscope.getContentPane().add(splitPane_1);
		
		JSplitPane splitPane_2 = new JSplitPane();
		splitPane_2.setDividerSize(5);
		splitPane_2.setDividerLocation(480);
		splitPane_1.setLeftComponent(splitPane_2);
		splitPane_2.setEnabled(false);
		
		JPanel leftPanel = new JPanel();
		splitPane_2.setLeftComponent(leftPanel);
		leftPanel.setLayout(null);
		
		JRadioButton maleRdBtn_1 = new JRadioButton("\u7537");
		maleRdBtn_1.setFont(new Font("微软雅黑", Font.BOLD, 15));
		maleRdBtn_1.setBounds(134, 10, 100, 35);
		leftPanel.add(maleRdBtn_1);
		
		JRadioButton femaleRdBtn_2 = new JRadioButton("\u5973");
		femaleRdBtn_2.setFont(new Font("微软雅黑", Font.BOLD, 15));
		femaleRdBtn_2.setBounds(230, 10, 100, 35);
		leftPanel.add(femaleRdBtn_2);
		
		ButtonGroup group_1=new ButtonGroup();
        	group_1.add(maleRdBtn_1);
        	group_1.add(femaleRdBtn_2);
        
        	JLabel label_1 = new JLabel("\u8BF7\u9009\u62E9\u6027\u522B\uFF1A");
        	label_1.setFont(new Font("微软雅黑", Font.BOLD, 15));
        	label_1.setBounds(10, 10, 100, 35);
        	leftPanel.add(label_1);
        
        	JLabel lblNewLabel = new JLabel("\u8BF7\u9009\u62E9\u51FA\u751F\u5E74\u6708\u65E5\uFF1A");
        	lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 15));
        	lblNewLabel.setBounds(10, 51, 150, 35);
        	leftPanel.add(lblNewLabel);
        
        
        	dateTextField_1 = new JTextField();
        	dateTextField_1.setBounds(158, 55, 200, 30);
        	dateTextField_1.setText("xxxx-xx-xx");
        	ser_1.register(dateTextField_1);
        	leftPanel.add(dateTextField_1);
   
		
		JPanel rightPanel = new JPanel();
		splitPane_2.setRightComponent(rightPanel);
		rightPanel.setLayout(null);
		
		JRadioButton maleRdBtn_2 = new JRadioButton("\u7537");
		maleRdBtn_2.setFont(new Font("微软雅黑", Font.BOLD, 15));
		maleRdBtn_2.setBounds(134, 10, 100, 35);
		rightPanel.add(maleRdBtn_2);
		
		JRadioButton radioButton_1 = new JRadioButton("\u5973");
		radioButton_1.setFont(new Font("微软雅黑", Font.BOLD, 15));
		radioButton_1.setBounds(230, 10, 100, 35);
		rightPanel.add(radioButton_1);
		
		ButtonGroup group_2=new ButtonGroup();
        	group_2.add(maleRdBtn_1);
        	group_2.add(femaleRdBtn_2);
		
		JLabel labelRight = new JLabel("\u8BF7\u9009\u62E9\u6027\u522B\uFF1A");
		labelRight.setFont(new Font("微软雅黑", Font.BOLD, 15));
		labelRight.setBounds(10, 10, 100, 35);
		rightPanel.add(labelRight);
		
		JLabel label_2 = new JLabel("\u8BF7\u9009\u62E9\u51FA\u751F\u5E74\u6708\u65E5\uFF1A");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 15));
		label_2.setBounds(10, 51, 150, 35);
		rightPanel.add(label_2);
		
		dateTextField_2 = new JTextField();
		dateTextField_2.setText("xxxx-xx-xx");
		dateTextField_2.setBounds(158, 55, 200, 30);
		ser_2.register(dateTextField_2);
		rightPanel.add(dateTextField_2);
		
		JPanel downPanel = new JPanel();
		splitPane_1.setRightComponent(downPanel);
		downPanel.setLayout(null);
		
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
