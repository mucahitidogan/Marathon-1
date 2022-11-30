package com.bilgeadam.marathon1.soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DikdortgenAlanHesaplamaFormu {

	private JFrame frame;
	private JTextField txtKenar1;
	private JTextField txtKenar2;
	private JLabel lblSonuc;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DikdortgenAlanHesaplamaFormu window = new DikdortgenAlanHesaplamaFormu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DikdortgenAlanHesaplamaFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1. Kenar Uzunluğu :");
		lblNewLabel.setBounds(60, 38, 111, 19);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2. Kenar Uzunluğu :");
		lblNewLabel_1.setBounds(60, 84, 111, 19);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtKenar1 = new JTextField();
		txtKenar1.setBounds(181, 35, 162, 26);
		frame.getContentPane().add(txtKenar1);
		txtKenar1.setColumns(10);
		
		txtKenar2 = new JTextField();
		txtKenar2.setBounds(181, 81, 162, 26);
		frame.getContentPane().add(txtKenar2);
		txtKenar2.setColumns(10);
		
		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HesaplamaYontemleri hy = new HesaplamaYontemleri();
				lblSonuc.setText(hy.dikdortgenAlan(Double.valueOf(txtKenar1.getText().toString()),Double.valueOf(txtKenar2.getText().toString())));
				
			}
		});
		btnHesapla.setBounds(208, 133, 111, 33);
		frame.getContentPane().add(btnHesapla);
		
		lblSonuc = new JLabel("Sonuç :");
		lblSonuc.setBounds(60, 197, 275, 26);
		frame.getContentPane().add(lblSonuc);
	}

}
