package com.bilgeadam.marathon1.soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KareCevreHesaplamaFormu {

	private JFrame frame;
	private JTextField txtKenar;
	private JLabel lblSonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KareCevreHesaplamaFormu window = new KareCevreHesaplamaFormu();
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
	public KareCevreHesaplamaFormu() {
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
		
		JLabel lblNewLabel = new JLabel("Kenar Uzunluğu :");
		lblNewLabel.setBounds(63, 49, 112, 19);
		frame.getContentPane().add(lblNewLabel);
		
		txtKenar = new JTextField();
		txtKenar.setBounds(185, 45, 146, 28);
		frame.getContentPane().add(txtKenar);
		txtKenar.setColumns(10);
		
		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HesaplamaYontemleri hy = new HesaplamaYontemleri();
				lblSonuc.setText(hy.kareCevre(Double.valueOf(txtKenar.getText().toString())));
			}
		});
		btnHesapla.setBounds(211, 107, 108, 28);
		frame.getContentPane().add(btnHesapla);
		
		lblSonuc = new JLabel("Sonuç :");
		lblSonuc.setBounds(63, 177, 296, 19);
		frame.getContentPane().add(lblSonuc);
	}

}
