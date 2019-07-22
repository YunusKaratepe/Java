package windowBuilding;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import yonetimBS.Makine;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MakineEklemeEkrani {

	private JFrame frame;
	private JTextField textField;


	public MakineEklemeEkrani() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Makinenin Ad\u0131 :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 120, 132, 20);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(156, 120, 214, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Makine Ekle");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Main.y.makineEkle(new Makine(textField.getText()));
				JOptionPane.showMessageDialog(null, "Makine Eklendi.");
			}
		});
		btnNewButton.setIcon(new ImageIcon(MakineEklemeEkrani.class.getResource("/images/icons8-sewing-machine-64.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(93, 192, 204, 81);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblMakineEkleme = new JLabel("Makine Ekleme");
		lblMakineEkleme.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMakineEkleme.setBounds(121, 13, 132, 20);
		frame.getContentPane().add(lblMakineEkleme);
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
}
