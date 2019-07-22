package windowBuilding;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

import yonetimBS.AradiginizCalisanBulunamadiException;

public class CalisanCikarmaEkrani {

	private JFrame frame;
	private JTextField tcText;

	

	public CalisanCikarmaEkrani() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame("CalisanCikarmaEkrani");
		frame.getContentPane().setBackground(new Color(0, 206, 209));
		frame.getContentPane().setLayout(null);
		
		JLabel lblalankar = new JLabel("\u00C7al\u0131\u015Fan \u00C7\u0131kar");
		lblalankar.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblalankar.setBounds(104, 13, 158, 50);
		frame.getContentPane().add(lblalankar);
		
		JLabel lblalannTcno = new JLabel("\u00C7al\u0131\u015Fan\u0131n TcNo :");
		lblalannTcno.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblalannTcno.setBounds(12, 147, 145, 22);
		frame.getContentPane().add(lblalannTcno);
		
		tcText = new JTextField();
		tcText.setBounds(190, 147, 180, 22);
		frame.getContentPane().add(tcText);
		tcText.setColumns(10);
		
		JButton btnalankar = new JButton("\u00C7al\u0131\u015Fan \u00C7\u0131kar");
		btnalankar.setIcon(new ImageIcon(CalisanCikarmaEkrani.class.getResource("/images/icons8-cancel-24.png")));
		btnalankar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnalankar.setBounds(92, 210, 188, 36);
		frame.getContentPane().add(btnalankar);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 274, 358, 266);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblalannAd = new JLabel("\u00C7al\u0131\u015Fan\u0131n Ad\u0131 :");
		lblalannAd.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblalannAd.setBounds(12, 52, 106, 19);
		panel.add(lblalannAd);
		
		JLabel lblalannYa = new JLabel("\u00C7al\u0131\u015Fan\u0131n Ya\u015F\u0131 :");
		lblalannYa.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblalannYa.setBounds(12, 115, 121, 19);
		panel.add(lblalannYa);
		
		JLabel lblalannBalamaYl = new JLabel("\u00C7al\u0131\u015Fan\u0131n Ba\u015Flama Y\u0131l\u0131 :");
		lblalannBalamaYl.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblalannBalamaYl.setBounds(12, 180, 175, 19);
		panel.add(lblalannBalamaYl);
		
		JLabel adLabel = new JLabel("");
		adLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		adLabel.setBounds(195, 52, 151, 19);
		panel.add(adLabel);
		
		JLabel yasLabel = new JLabel("");
		yasLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		yasLabel.setBounds(195, 115, 151, 19);
		panel.add(yasLabel);
		
		JLabel yilLabel = new JLabel("");
		yilLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		yilLabel.setBounds(199, 180, 147, 19);
		panel.add(yilLabel);
		
		JLabel lblkarlacakalan = new JLabel("\u00C7\u0131kar\u0131lacak \u00C7al\u0131\u015Fan");
		lblkarlacakalan.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblkarlacakalan.setBounds(105, 13, 144, 19);
		panel.add(lblkarlacakalan);
		
		btnalankar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				try {
					adLabel.setText(Main.y.calisanBul(tcText.getText()).getName());
					yasLabel.setText(Integer.toString(Main.y.calisanBul(tcText.getText()).getYas()));
					yilLabel.setText(Integer.toString(Main.y.calisanBul(tcText.getText()).getBaslangicYili()));
				} catch (HeadlessException e1) {
					e1.printStackTrace();
				} catch (AradiginizCalisanBulunamadiException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				panel.setVisible(true);
			}
		});
		
		
		frame.setSize(400, 600);
		frame.setLocationRelativeTo(null);
		
		
		
		
		JButton btnkar = new JButton("\u00C7\u0131kar");
		btnkar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Main.y.calisanCikar(tcText.getText());
					JOptionPane.showMessageDialog(null, "Çalýþan baþarýyla sistemden çýkarýldý.");
				} catch (AradiginizCalisanBulunamadiException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnkar.setIcon(new ImageIcon(CalisanCikarmaEkrani.class.getResource("/images/icons8-cancel-24.png")));
		btnkar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnkar.setBounds(48, 225, 117, 28);
		panel.add(btnkar);
		
		JButton btnVazge = new JButton("Vazge\u00E7");
		btnVazge.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel.setVisible(false);
			}
		});
		btnVazge.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVazge.setBounds(185, 225, 117, 28);
		panel.add(btnVazge);
		panel.setVisible(false);
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
}
