package windowBuilding;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import personelBS.Calisan;
import yonetimBS.AradiginizCalisanBulunamadiException;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalisanAramaEkrani {

	private JFrame frame;
	private JTextField tcText;

	public CalisanAramaEkrani() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame("CalisanAramaEkrani");
		frame.setSize(400, 600);
		frame.getContentPane().setBackground(new Color(0, 206, 209));
		frame.getContentPane().setLayout(null);
		
		JLabel lblalanArama = new JLabel("\u00C7al\u0131\u015Fan Ara");
		lblalanArama.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblalanArama.setBounds(118, 13, 132, 29);
		frame.getContentPane().add(lblalanArama);
		
		JLabel tcLabel1 = new JLabel("\u00C7al\u0131\u015Fan\u0131n TcNo :");
		tcLabel1.setFont(new Font("Tahoma", Font.BOLD, 18));
		tcLabel1.setBounds(12, 119, 145, 22);
		frame.getContentPane().add(tcLabel1);
		
		tcText = new JTextField();
		tcText.setColumns(10);
		tcText.setBounds(190, 121, 180, 22);
		frame.getContentPane().add(tcText);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(12, 225, 358, 315);
		panel.setVisible(false);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBulundu = new JLabel("Bulundu!");
		lblBulundu.setBounds(136, 13, 82, 22);
		lblBulundu.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblBulundu);
		
		JLabel label = new JLabel("\u00C7al\u0131\u015Fan\u0131n Ad\u0131 :");
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(12, 50, 127, 22);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u00C7al\u0131\u015Fan\u0131n TcNo :");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(12, 90, 145, 22);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\u00C7al\u0131\u015Fan\u0131n Ya\u015F\u0131 :");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_2.setBounds(12, 130, 145, 22);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("\u00C7al\u0131\u015Fan\u0131n Ba\u015Flama Y\u0131l\u0131 :");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setBounds(11, 170, 207, 22);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("\u00C7al\u0131\u015Fan\u0131n Cinsiyeti :");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_4.setBounds(12, 210, 175, 22);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("\u00C7al\u0131\u015Fan\u0131n Maa\u015F\u0131 :");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_5.setBounds(12, 250, 175, 22);
		panel.add(label_5);
		
		JLabel adLabel = new JLabel("");
		adLabel.setFont(new Font("Tahoma", Font.ITALIC, 14));
		adLabel.setBounds(211, 50, 135, 22);
		panel.add(adLabel);
		
		JLabel tcLabel = new JLabel("");
		tcLabel.setFont(new Font("Tahoma", Font.ITALIC, 14));
		tcLabel.setBounds(211, 90, 135, 22);
		panel.add(tcLabel);
		
		JLabel yasLabel = new JLabel("");
		yasLabel.setFont(new Font("Tahoma", Font.ITALIC, 14));
		yasLabel.setBounds(211, 135, 135, 22);
		panel.add(yasLabel);
		
		JLabel yilLabel = new JLabel("");
		yilLabel.setFont(new Font("Tahoma", Font.ITALIC, 14));
		yilLabel.setBounds(230, 170, 116, 22);
		panel.add(yilLabel);
		
		JLabel cinsLabel = new JLabel("");
		cinsLabel.setFont(new Font("Tahoma", Font.ITALIC, 14));
		cinsLabel.setBounds(211, 210, 135, 22);
		panel.add(cinsLabel);
		
		JLabel maasLabel = new JLabel("");
		maasLabel.setFont(new Font("Tahoma", Font.ITALIC, 14));
		maasLabel.setBounds(211, 250, 135, 22);
		panel.add(maasLabel);
		frame.setLocationRelativeTo(null);
		
		
		JButton btnalanAra = new JButton("\u00C7al\u0131\u015Fan Ara");
		btnalanAra.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				try {
					Calisan c = Main.y.calisanBul(tcText.getText());
					adLabel.setText(c.getName());
					yilLabel.setText(Integer.toString(c.getBaslangicYili()));
					yasLabel.setText(Integer.toString(c.getYas()));
					cinsLabel.setText(c.getCinsiyet());
					tcLabel.setText(c.getTcNo());
					maasLabel.setText(Double.toString(c.getMaas()));
					panel.setVisible(true);
				} catch (AradiginizCalisanBulunamadiException e1) {
					panel.setVisible(false);
					JOptionPane.showMessageDialog(null, "Aradiginiz Calisan Bulunamadi");
					e1.printStackTrace();
				}
				
			}
		});
		btnalanAra.setIcon(new ImageIcon(CalisanAramaEkrani.class.getResource("/images/icons8-google-web-search-26.png")));
		btnalanAra.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnalanAra.setBounds(98, 167, 188, 36);
		frame.getContentPane().add(btnalanAra);
		
		
	}

	
	public JFrame getFrame() {
		return this.frame;
	}
	
	
	
	
	
	
	
}
