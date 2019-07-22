package windowBuilding;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import urunIslemeBS.MusteriIstek;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;

public class BekleyeniIslemeAlEkrani {

	private JFrame frame;
	private int i;

	
	public BekleyeniIslemeAlEkrani() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame("BekleyeniIslemeAlEkrani");
		frame.setBounds(200, 200, 1000, 600);
		frame.getContentPane().setBackground(new Color(222, 184, 135));
		frame.getContentPane().setLayout(null);
		
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(529, 63, 358, 477);
		frame.getContentPane().add(list);
		DefaultListModel dlm = new DefaultListModel();
		DefaultListModel dlm2 = new DefaultListModel();
		dlm.add(0, "Müþteri TcNo   -   Adet   -   Sipariþ Türü   -   Beden   -   Renk");
		i = 1;
		HashMap<Integer, MusteriIstek> map = new HashMap<>();
		for(MusteriIstek m : Main.y.getMusteriIstekler()) {
			map.put(i, m);
			dlm.add(i, m.getTcNo() + "   -   " + m.getAdet() + "   -   " + m.getUrunCesit() + "   -   " + m.getBeden() + "   -   " + m.getRenk());
			i++;
		}
		
		list.setModel(dlm);
		
		JButton btnSeilenleriIle = new JButton("Se\u00E7ileni \u0130\u015Fle");
		btnSeilenleriIle.setIcon(new ImageIcon(BekleyeniIslemeAlEkrani.class.getResource("/images/icons8-cut-filled-50.png")));
		btnSeilenleriIle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int x = list.getSelectedIndex();
				if(Main.y.getMakineler().isEmpty())
					JOptionPane.showMessageDialog(null, "Ýþlem yapmak için önce makine ekleyiniz.");
				else if(x != 0 &&  x != -1) {
					Main.y.UrunIslemeAl(map.get(x));
					dlm.removeElementAt(x);
					JOptionPane.showMessageDialog(null, "Bekleyen sipariþ iþleme alýndý.");
					map.clear();
					dlm.clear();
					i = 1;
					dlm.add(0, "Müþteri TcNo   -   Adet   -   Sipariþ Türü   -   Beden   -   Renk");
					for(MusteriIstek m : Main.y.getMusteriIstekler()) {
						map.put(i, m);
						dlm.add(i, m.getTcNo() + "   -   " + m.getAdet() + "   -   " + m.getUrunCesit() + "   -   " + m.getBeden() + "   -   " + m.getRenk());
						i++;
					}
				}else {
					JOptionPane.showMessageDialog(null, "Geçerli bir sipariþ deðil.");
				}
				/*if(x != -1) {
					list.remove(x);
				}*/
				
				
				//list.clearSelection();
				
			}
		});
		btnSeilenleriIle.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSeilenleriIle.setBounds(123, 350, 231, 51);
		frame.getContentPane().add(btnSeilenleriIle);
		
		JLabel lblSeilenleriIle = new JLabel("Bekleyen Sipari\u015Fler\r\n");
		lblSeilenleriIle.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSeilenleriIle.setBounds(622, 28, 172, 22);
		frame.getContentPane().add(lblSeilenleriIle);
		
		JLabel lblNewLabel = new JLabel("*Bekleyen Sipari\u015Flerden Se\u00E7ip \u0130\u015Fleyin.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(93, 229, 296, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSipariIleme = new JLabel("Sipari\u015F \u0130\u015Fleme");
		lblSipariIleme.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSipariIleme.setBounds(174, 28, 127, 22);
		frame.getContentPane().add(lblSipariIleme);
		
		
	}
	
	public JFrame getFrame() {
		return this.frame;
	}

}
