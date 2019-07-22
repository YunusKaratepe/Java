package windowBuilding;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;

import yonetimBS.Makine;

public class MakineListesiEkrani {

	private JFrame frame;

	
	public MakineListesiEkrani() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setSize(400, 600);
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Makine Listesi");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(125, 13, 127, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JList list = new JList();
		list.setBounds(12, 75, 358, 442);
		DefaultListModel dlm = new DefaultListModel();
		dlm.add(0, "Makinenin Adý          -          Makinenin Durumu");
		int i = 1;
		for(Makine m : Main.y.getMakineler()) {
			dlm.add(i, m.getMakineAdi() + "          -          " + m.getMakineDurumu());
			i++;
		}
		list.setModel(dlm);
		frame.getContentPane().add(list);
		frame.setLocationRelativeTo(null);
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
}
