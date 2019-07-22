package windowBuilding;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class GelirGiderKontrolEkrani {

	private JFrame frame;

	
	public GelirGiderKontrolEkrani() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame("GelirGiderKontrolEkrani");
		frame.setSize(900, 500);
		frame.getContentPane().setBackground(new Color(143, 188, 143));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gelirler");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(150, 100, 61, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblGiderler = new JLabel("Giderler");
		lblGiderler.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGiderler.setBounds(650, 100, 66, 20);
		frame.getContentPane().add(lblGiderler);
		
		JLabel lblGelirGider = new JLabel("Gelir - Gider Kontrol\u00FC");
		lblGelirGider.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGelirGider.setBounds(346, 13, 198, 20);
		frame.getContentPane().add(lblGelirGider);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(12, 133, 367, 262);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Sat\u0131\u015F Geliri :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(12, 80, 93, 19);
		panel.add(lblNewLabel_1);
		
		JLabel lblToplamGelir = new JLabel("Toplam Gelir :");
		lblToplamGelir.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblToplamGelir.setBounds(12, 226, 104, 19);
		panel.add(lblToplamGelir);
		
		JLabel toplamGelir = new JLabel("0");
		toplamGelir.setFont(new Font("Tahoma", Font.PLAIN, 13));
		toplamGelir.setBounds(140, 226, 215, 19);
		toplamGelir.setText(Double.toString(Main.y.muhasebeHesap().getAylikGelir()));
		panel.add(toplamGelir);
		
		JLabel satisGeliri = new JLabel("0");
		satisGeliri.setFont(new Font("Tahoma", Font.PLAIN, 13));
		satisGeliri.setBounds(140, 80, 215, 19);
		satisGeliri.setText(Double.toString(Main.y.muhasebeHesap().getAylikGelir()));
		panel.add(satisGeliri);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(128, 0, 81, 71);
		panel.add(label_1);
		label_1.setIcon(new ImageIcon(GelirGiderKontrolEkrani.class.getResource("/images/icons8-low-price-80.png")));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(503, 133, 367, 262);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblVergiGideri = new JLabel("Maas Gideri :");
		lblVergiGideri.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblVergiGideri.setBounds(12, 80, 108, 19);
		panel_1.add(lblVergiGideri);
		
		JLabel lblSigortaGideri = new JLabel("Sigorta Gideri :");
		lblSigortaGideri.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSigortaGideri.setBounds(12, 112, 122, 19);
		panel_1.add(lblSigortaGideri);
		
		JLabel lblVergiGideri_1 = new JLabel("Vergi Gideri :");
		lblVergiGideri_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblVergiGideri_1.setBounds(12, 144, 108, 19);
		panel_1.add(lblVergiGideri_1);
		
		JLabel lblAtlyeGideri = new JLabel("At\u00F6lye Gideri :");
		lblAtlyeGideri.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAtlyeGideri.setBounds(12, 176, 108, 19);
		panel_1.add(lblAtlyeGideri);
		
		JLabel lblToplamGider = new JLabel("Toplam Gider :");
		lblToplamGider.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblToplamGider.setBounds(12, 230, 108, 19);
		panel_1.add(lblToplamGider);
		
		JLabel toplamGider = new JLabel("0");
		toplamGider.setFont(new Font("Tahoma", Font.PLAIN, 13));
		toplamGider.setBounds(151, 230, 204, 19);
		toplamGider.setText(Double.toString((Main.y.muhasebeHesap().getAylikAtolyeGideri() + Main.y.muhasebeHesap().getAylikMaasGideri() + Main.y.muhasebeHesap().getAylikSigortaGideri() + Main.y.muhasebeHesap().getAylikVergiGideri())));
		panel_1.add(toplamGider);
		
		JLabel atolyeGideri = new JLabel("0");
		atolyeGideri.setFont(new Font("Tahoma", Font.PLAIN, 13));
		atolyeGideri.setBounds(151, 176, 204, 19);
		atolyeGideri.setText(Double.toString(Main.y.muhasebeHesap().getAylikAtolyeGideri()));
		panel_1.add(atolyeGideri);
		
		JLabel vergiGideri = new JLabel("0");
		vergiGideri.setFont(new Font("Tahoma", Font.PLAIN, 13));
		vergiGideri.setBounds(151, 144, 204, 19);
		vergiGideri.setText(Double.toString(Main.y.muhasebeHesap().getAylikVergiGideri()));
		panel_1.add(vergiGideri);
		
		JLabel sigortaGideri = new JLabel("0");
		sigortaGideri.setFont(new Font("Tahoma", Font.PLAIN, 13));
		sigortaGideri.setBounds(151, 112, 204, 19);
		sigortaGideri.setText(Double.toString(Main.y.muhasebeHesap().getAylikSigortaGideri()));
		panel_1.add(sigortaGideri);
		
		JLabel maasGideri = new JLabel("0");
		maasGideri.setFont(new Font("Tahoma", Font.PLAIN, 13));
		maasGideri.setBounds(151, 80, 204, 19);
		maasGideri.setText(Double.toString(Main.y.muhasebeHesap().getAylikMaasGideri()));
		panel_1.add(maasGideri);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(135, 0, 81, 71);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(GelirGiderKontrolEkrani.class.getResource("/images/icons8-tax-80.png")));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(217, 408, 466, 32);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNetKazanc = new JLabel("Net Kazanc :");
		lblNetKazanc.setBounds(12, 5, 104, 19);
		lblNetKazanc.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_2.add(lblNetKazanc);
		
		JLabel netKazanc = new JLabel("0");
		netKazanc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		netKazanc.setBounds(155, 6, 299, 19);
		netKazanc.setText(Double.toString(Main.y.muhasebeHesap().aylikNetKazancHesapla()));
		panel_2.add(netKazanc);
		frame.setLocationRelativeTo(null);
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
}
