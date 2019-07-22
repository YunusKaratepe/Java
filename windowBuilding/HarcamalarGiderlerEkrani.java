package windowBuilding;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HarcamalarGiderlerEkrani {

	private JFrame frame;
	private JTextField textField;

	
	public HarcamalarGiderlerEkrani() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame("HarcamalarGiderlerEkrani");
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(143, 188, 143));
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblHarcamalarVeGiderler = new JLabel("Harcamalar ve Giderler");
		lblHarcamalarVeGiderler.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHarcamalarVeGiderler.setBounds(120, 13, 209, 27);
		frame.getContentPane().add(lblHarcamalarVeGiderler);
		
		JLabel lblMaasGiderleri = new JLabel("Maas Giderleri :");
		lblMaasGiderleri.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMaasGiderleri.setBounds(12, 160, 119, 19);
		frame.getContentPane().add(lblMaasGiderleri);
		
		JLabel lblalanSays = new JLabel("\u00C7al\u0131\u015Fan Say\u0131s\u0131 :");
		lblalanSays.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblalanSays.setBounds(240, 160, 119, 19);
		frame.getContentPane().add(lblalanSays);
		
		JLabel calisanSayisi = new JLabel("0");
		calisanSayisi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		calisanSayisi.setBounds(371, 160, 99, 19);
		calisanSayisi.setText(Integer.toString(Main.y.getCalisanlar().size()));
		frame.getContentPane().add(calisanSayisi);
		
		JLabel maasGideri = new JLabel("0");
		maasGideri.setFont(new Font("Tahoma", Font.PLAIN, 13));
		maasGideri.setBounds(143, 160, 99, 19);
		maasGideri.setText(Double.toString(Main.y.muhasebeHesap().getAylikMaasGideri()));
		frame.getContentPane().add(maasGideri);
		
		JLabel lblSigortaGideri = new JLabel("Sigorta Gideri :");
		lblSigortaGideri.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSigortaGideri.setBounds(12, 220, 119, 19);
		frame.getContentPane().add(lblSigortaGideri);
		
		textField = new JTextField();
		textField.setBounds(164, 220, 152, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel netKazanc = new JLabel("0");
		JButton btnNewButton = new JButton("Onayla");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Main.y.getMuhasebe().setAylikSigortaGideri(Double.parseDouble(textField.getText()));
				netKazanc.setText(Double.toString(Main.y.muhasebeHesap().aylikNetKazancHesapla()));
			}
		});
		btnNewButton.setBounds(355, 220, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblVergiGideri = new JLabel("Vergi Gideri (%20) :");
		lblVergiGideri.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblVergiGideri.setBounds(12, 280, 162, 19);
		frame.getContentPane().add(lblVergiGideri);
		
		JLabel vergiGideri = new JLabel("0");
		vergiGideri.setFont(new Font("Tahoma", Font.PLAIN, 13));
		vergiGideri.setBounds(211, 280, 130, 19);
		vergiGideri.setText(Double.toString(Main.y.muhasebeHesap().getAylikVergiGideri()));
		frame.getContentPane().add(vergiGideri);
		
		JLabel lblAtlyeGideri = new JLabel("At\u00F6lye Gideri :");
		lblAtlyeGideri.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAtlyeGideri.setBounds(12, 340, 162, 19);
		frame.getContentPane().add(lblAtlyeGideri);
		
		JLabel atolyeGideri = new JLabel("0");
		atolyeGideri.setFont(new Font("Tahoma", Font.PLAIN, 13));
		atolyeGideri.setBounds(211, 340, 130, 19);
		atolyeGideri.setText(Double.toString(Main.y.muhasebeHesap().getAylikAtolyeGideri()));
		frame.getContentPane().add(atolyeGideri);
		
		JLabel lblNetKazanc = new JLabel("Net Kazanc :");
		lblNetKazanc.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNetKazanc.setBounds(107, 400, 93, 19);
		frame.getContentPane().add(lblNetKazanc);
		
		
		netKazanc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		netKazanc.setBounds(229, 400, 169, 19);
		netKazanc.setText(Double.toString(Main.y.muhasebeHesap().aylikNetKazancHesapla()));
		frame.getContentPane().add(netKazanc);
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
}
