package com.bilgeadam.marathon1.soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DaireCevreHesaplamaFormu {

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
					DaireCevreHesaplamaFormu window = new DaireCevreHesaplamaFormu();
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
	public DaireCevreHesaplamaFormu() {
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
		lblNewLabel.setBounds(53, 40, 125, 21);
		frame.getContentPane().add(lblNewLabel);
		
		txtYaricap = new JTextField();
		txtYaricap.setBounds(167, 38, 156, 26);
		frame.getContentPane().add(txtYaricap);
		txtYaricap.setColumns(10);
		
		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HesaplamaYontemleri hy = new HesaplamaYontemleri();
				lblSonuc.setText(hy.daireCevre(Double.valueOf(txtYaricap.getText().toString())));
				
			}
		});
		btnHesapla.setBounds(193, 98, 107, 34);
		frame.getContentPane().add(btnHesapla);
		
		lblSonuc = new JLabel("Sonuç : ");
		lblSonuc.setBounds(53, 162, 270, 21);
		frame.getContentPane().add(lblSonuc);
	}

}
