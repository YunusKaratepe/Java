package windowBuilding;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;

import urunIslemeBS.MusteriIstek;

public class SiparisListesiEkrani {

	private JFrame frame;

	
	public SiparisListesiEkrani() { 
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame("SiparisListesiEkrani");
		frame.getContentPane().setBackground(new Color(222, 184, 135));
		frame.setSize(400, 600);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMteriListesi = new JLabel("M\u00FC\u015Fteri Listesi");
		lblMteriListesi.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMteriListesi.setBounds(119, 13, 129, 22);
		frame.getContentPane().add(lblMteriListesi);
		
		JList list = new JList();
		list.setBounds(12, 56, 358, 473);
		frame.getContentPane().add(list);
		DefaultListModel dlm = new DefaultListModel();
		dlm.add(0, "Müþteri TcNo   -   Adet   -   Sipariþ Türü   -   Beden   -   Renk");
		int i = 1;
		for(MusteriIstek m : Main.y.getMusteriIstekler()) {
			dlm.add(i, m.getTcNo() + "   -   " + m.getAdet() + "   -   " + m.getUrunCesit() + "   -   " + m.getBeden() + "   -   " + m.getRenk());
			i++;
		}
		
		list.setModel(dlm);
		
	
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
	
	
	

}
