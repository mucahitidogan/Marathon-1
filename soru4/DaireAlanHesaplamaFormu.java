package com.bilgeadam.marathon1.soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DaireAlanHesaplamaFormu {

	private JFrame frame;
	private JTextField txtYaricap;
	private JLabel lblSonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DaireAlanHesaplamaFormu window = new DaireAlanHesaplamaFormu();
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
	public DaireAlanHesaplamaFormu() {
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
		
		JLabel lblNewLabel = new JLabel("Yarıçap Uzunluğu :");
		lblNewLabel.setBounds(49, 41, 118, 21);
		frame.getContentPane().add(lblNewLabel);
		
		txtYaricap = new JTextField();
		txtYaricap.setBounds(177, 40, 173, 24);
		frame.getContentPane().add(txtYaricap);
		txtYaricap.setColumns(10);
		
		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HesaplamaYontemleri hy = new HesaplamaYontemleri();
				lblSonuc.setText(hy.daireAlan(Double.valueOf(txtYaricap.getText().toString())));
			}
		});
		btnHesapla.setBounds(214, 103, 102, 35);
		frame.getContentPane().add(btnHesapla);
		
		lblSonuc = new JLabel("Sonuç :");
		lblSonuc.setBounds(49, 171, 301, 21);
		frame.getContentPane().add(lblSonuc);
	}

}
