package com.maro;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.Window.Type;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
public class FirstApp extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnsum;
	private JButton btnminus;
	private JButton btnmultiply;
	private JButton btndiv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstApp frame = new FirstApp();
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
	public FirstApp() {
		setType(Type.UTILITY);
		setFont(new Font("Dialog", Font.PLAIN, 15));
		setBackground(Color.WHITE);
		setForeground(Color.YELLOW);
		setTitle("Calculator app");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 492);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(UIManager.getColor("Button.select"));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{68, 61, 14, 74, 67, 0};
		gbl_contentPane.rowHeights = new int[]{29, 26, 26, 16, 29, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		btnsum = new JButton("+");
		btnsum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String num1=txt1.getText();
			String num2=txt2.getText();
			try {
			int result= Integer.parseInt(num1)+Integer.parseInt(num2);
			
			JOptionPane.showMessageDialog(null,"Result "+ result);
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"Just integer numbers");

			}
			}
		});
		
		JLabel lblNewLabel = new JLabel("Enter two numbers");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblNewLabel.setBackground(UIManager.getColor("Button.select"));
		lblNewLabel.setForeground(Color.BLACK);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number1");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
	
	
		txt1 = new JTextField();
		GridBagConstraints gbc_txt1 = new GridBagConstraints();
		gbc_txt1.anchor = GridBagConstraints.NORTH;
		gbc_txt1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt1.insets = new Insets(0, 0, 5, 5);
		gbc_txt1.gridwidth = 2;
		gbc_txt1.gridx = 2;
		gbc_txt1.gridy = 1;
		contentPane.add(txt1, gbc_txt1);
		txt1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Number2");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 2;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		GridBagConstraints gbc_txt2 = new GridBagConstraints();
		gbc_txt2.anchor = GridBagConstraints.NORTH;
		gbc_txt2.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt2.insets = new Insets(0, 0, 5, 5);
		gbc_txt2.gridwidth = 2;
		gbc_txt2.gridx = 2;
		gbc_txt2.gridy = 2;
		contentPane.add(txt2, gbc_txt2);
		
		lblNewLabel_3 = new JLabel("Select an action");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridwidth = 3;
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 3;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		btnsum.setForeground(Color.RED);
		btnsum.setBackground(Color.BLACK);
		GridBagConstraints gbc_btnsum = new GridBagConstraints();
		gbc_btnsum.anchor = GridBagConstraints.NORTH;
		gbc_btnsum.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnsum.insets = new Insets(0, 0, 0, 5);
		gbc_btnsum.gridx = 0;
		gbc_btnsum.gridy = 4;
		contentPane.add(btnsum, gbc_btnsum);
		
		btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1=txt1.getText();
				String num2=txt2.getText();
				try {
				double result= Double.parseDouble(num1)/Double.parseDouble(num2);
				
				JOptionPane.showMessageDialog(null,"Result "+ result);
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"Just integer numbers");

			}}
		});
		
		btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1=txt1.getText();
				String num2=txt2.getText();
				try {
				int result= Integer.parseInt(num1)-Integer.parseInt(num2);
				
				JOptionPane.showMessageDialog(null,"Result "+ result);
			}
			catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"Just integer numbers");

			}}
		});
		btnminus.setForeground(Color.RED);
		btnminus.setBackground(Color.RED);
		GridBagConstraints gbc_btnminus = new GridBagConstraints();
		gbc_btnminus.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnminus.insets = new Insets(0, 0, 0, 5);
		gbc_btnminus.gridwidth = 2;
		gbc_btnminus.gridx = 1;
		gbc_btnminus.gridy = 4;
		contentPane.add(btnminus, gbc_btnminus);
		
		btnmultiply = new JButton("*");
		btnmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1=txt1.getText();
				String num2=txt2.getText();
				try {
				int result= Integer.parseInt(num1)*Integer.parseInt(num2);
				
				JOptionPane.showMessageDialog(null,"Result "+ result);
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"Just integer numbers");

			}
				}
		});
		btnmultiply.setForeground(Color.RED);
		btnmultiply.setBackground(Color.RED);
		GridBagConstraints gbc_btnmultiply = new GridBagConstraints();
		gbc_btnmultiply.anchor = GridBagConstraints.NORTH;
		gbc_btnmultiply.insets = new Insets(0, 0, 0, 5);
		gbc_btnmultiply.gridx = 3;
		gbc_btnmultiply.gridy = 4;
		contentPane.add(btnmultiply, gbc_btnmultiply);
		btndiv.setForeground(Color.RED);
		btndiv.setBackground(Color.RED);
		GridBagConstraints gbc_btndiv = new GridBagConstraints();
		gbc_btndiv.anchor = GridBagConstraints.NORTH;
		gbc_btndiv.fill = GridBagConstraints.HORIZONTAL;
		gbc_btndiv.gridx = 4;
		gbc_btndiv.gridy = 4;
		contentPane.add(btndiv, gbc_btndiv);
	}
}
