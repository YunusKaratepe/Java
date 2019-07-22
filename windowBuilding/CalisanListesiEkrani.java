package windowBuilding;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JTextPane;

import personelBS.Calisan;

import javax.swing.JList;

public class CalisanListesiEkrani {

	private JFrame frame;

	
	public CalisanListesiEkrani() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("CalisanListesiEkrani");
		frame.getContentPane().setBackground(new Color(152, 251, 152));
		frame.setSize(400, 600);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u00C7al\u0131\u015Fan Listesi");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(112, 13, 126, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JList list = new JList();
		list.setBounds(12, 60, 358, 420);
		frame.getContentPane().add(list);
		
		DefaultListModel<String> dlm = new DefaultListModel();
		dlm.add(0, "Ýsim       -       TC No       -       Maas");
		int i = 1;
		for(Calisan c : Main.y.getCalisanlar()) {
			dlm.add(i, c.getName() + "       -       " + c.getTcNo() + "       -       " + Double.toString(c.getMaas()));
			i++;
		}
		list.setModel(dlm);
		
		
	}

	public JFrame getFrame() {
		return this.frame;
	}
}
