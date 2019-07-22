package windowBuilding;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;

import urunIslemeBS.CikanUrun;

public class HazirlanmisUrunlerEkrani {

	private JFrame frame;

	
	public HazirlanmisUrunlerEkrani() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("HazirlanmisUrunlerEkrani");
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.setSize(400, 600);
		frame.getContentPane().setBackground(new Color(222, 184, 135));
		frame.getContentPane().setLayout(null);
		
		JLabel lblHazirlanmirnler = new JLabel("Hazirlanmi\u015F \u00DCr\u00FCnler");
		lblHazirlanmirnler.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHazirlanmirnler.setBounds(98, 13, 180, 22);
		frame.getContentPane().add(lblHazirlanmirnler);
		
		JList list = new JList();
		list.setBounds(12, 63, 358, 477);
		frame.getContentPane().add(list);
		frame.setLocationRelativeTo(null);
		
		DefaultListModel dlm = new DefaultListModel();
		
		dlm.add(0, "Müþteri TcNo  -  Adet  -  Sipariþ Türü  -  Beden  -  Renk  -  Fiyat");	
		int i = 1;
		for(CikanUrun c : Main.y.getCikanUrunler()) {
			dlm.add(i, c.getTcNo() + "  -  " + c.getAdet() + "  -  " + c.getUrunCesit() + "  -  " + c.getBeden() + "  -  " + c.getRenk() + "  -  " + c.getFiyat());
			i++;
		}
		list.setModel(dlm);
		
		
		
	}
	
	JFrame getFrame() {
		return this.frame;
	}
}
