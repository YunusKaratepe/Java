package windowBuilding;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GirisEkrani {

	private JFrame frame;
	public static String admin;
	

	
	public GirisEkrani() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("Dikiþ Atölyesi Yönetim Sistemi");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(60, 179, 113));
		panel.setBounds(12, 25, 758, 527);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("Giris Ekrani");
		lblLogin.setBounds(274, 43, 185, 49);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 32));
		panel.add(lblLogin);
		
		JLabel lblKullancAd = new JLabel("Kullan\u0131c\u0131 Ad\u0131 : ");
		lblKullancAd.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblKullancAd.setBounds(151, 182, 129, 22);
		panel.add(lblKullancAd);
		
		JLabel lblifre = new JLabel("\u015Eifre : ");
		lblifre.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblifre.setBounds(199, 259, 83, 22);
		panel.add(lblifre);
		
		JTextArea kullaniciAdiText = new JTextArea();
		kullaniciAdiText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		kullaniciAdiText.setBounds(295, 182, 292, 22);
		panel.add(kullaniciAdiText);
		
		JTextArea sifreText = new JTextArea();
		sifreText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sifreText.setBounds(294, 259, 292, 22);
		panel.add(sifreText);
		
		JButton btnGiris = new JButton("Giris");
		btnGiris.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				if(kullaniciAdiText.getText().equals("admin") && sifreText.getText().equals("123")) {
					admin = kullaniciAdiText.getText();
					JOptionPane.showMessageDialog(null, "Giris Basarili");
					frame.dispose();
					AnaEkran a = new AnaEkran();
					a.getFrame().setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Kullanici Adi veya Sifre Hatali");
				}
				
			}
		});
		btnGiris.setHorizontalAlignment(SwingConstants.LEFT);
		btnGiris.setIcon(new ImageIcon(GirisEkrani.class.getResource("/images/icons8-enter-48.png")));
		btnGiris.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnGiris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnGiris.setBounds(458, 331, 129, 49);
		panel.add(btnGiris);
		
		JButton btnIptal = new JButton("\u0130ptal");
		btnIptal.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				kullaniciAdiText.setText("");
				sifreText.setText("");
			}
		});
		btnIptal.setIcon(new ImageIcon(GirisEkrani.class.getResource("/images/icons8-cancel-40.png")));
		btnIptal.setHorizontalAlignment(SwingConstants.LEFT);
		btnIptal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnIptal.setBounds(295, 331, 129, 49);
		panel.add(btnIptal);
	}
	
	JFrame getFrame() {
		return this.frame;
	}
	
}
