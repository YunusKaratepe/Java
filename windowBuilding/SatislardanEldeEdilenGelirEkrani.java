package windowBuilding;
import urunIslemeBS.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class SatislardanEldeEdilenGelirEkrani {

	private JFrame frame;

	
	public SatislardanEldeEdilenGelirEkrani() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame("SatislardanEldeEdilenGelirEkrani");
		frame.getContentPane().setBackground(new Color(143, 188, 143));
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSatlardanEldeEdilen = new JLabel("Sat\u0131\u015Flardan Elde Edilen Gelirler");
		lblSatlardanEldeEdilen.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSatlardanEldeEdilen.setBounds(70, 13, 234, 16);
		frame.getContentPane().add(lblSatlardanEldeEdilen);
		
		JLabel lblSattanEldeEdilen = new JLabel("Sat\u0131lan Adet    -    Kazand\u0131rd\u0131\u011F\u0131");
		lblSattanEldeEdilen.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSattanEldeEdilen.setBounds(123, 85, 247, 24);
		frame.getContentPane().add(lblSattanEldeEdilen);
		
		JLabel lblTshirt = new JLabel("Tshirt :");
		lblTshirt.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTshirt.setBounds(60, 140, 63, 16);
		frame.getContentPane().add(lblTshirt);
		
		JLabel lblSweat = new JLabel("Sweat :");
		lblSweat.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSweat.setBounds(60, 180, 63, 16);
		frame.getContentPane().add(lblSweat);
		
		JLabel lblCeket = new JLabel("Ceket :");
		lblCeket.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCeket.setBounds(60, 220, 53, 16);
		frame.getContentPane().add(lblCeket);
		
		JLabel tshirtAdet = new JLabel("");
		tshirtAdet.setFont(new Font("Tahoma", Font.BOLD, 15));
		tshirtAdet.setBounds(140, 140, 63, 16);
		tshirtAdet.setText(Integer.toString(CikanUrun.tshirtCounter));
		frame.getContentPane().add(tshirtAdet);
		
		JLabel sweatAdet = new JLabel("");
		sweatAdet.setFont(new Font("Tahoma", Font.BOLD, 15));
		sweatAdet.setBounds(140, 180, 63, 16);
		sweatAdet.setText(Integer.toString(CikanUrun.sweatCounter));
		frame.getContentPane().add(sweatAdet);
		
		JLabel ceketAdet = new JLabel("");
		ceketAdet.setFont(new Font("Tahoma", Font.BOLD, 15));
		ceketAdet.setBounds(140, 220, 63, 16);
		ceketAdet.setText(Integer.toString(CikanUrun.ceketCounter));
		frame.getContentPane().add(ceketAdet);
		
		JLabel tshirtPara = new JLabel("");
		tshirtPara.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tshirtPara.setBounds(260, 140, 63, 16);
		tshirtPara.setText(Integer.toString(CikanUrun.tshirtCounter * 15));
		frame.getContentPane().add(tshirtPara);
		
		JLabel sweatPara = new JLabel("");
		sweatPara.setFont(new Font("Tahoma", Font.PLAIN, 13));
		sweatPara.setBounds(260, 180, 63, 16);
		sweatPara.setText(Integer.toString(CikanUrun.sweatCounter * 25));
		frame.getContentPane().add(sweatPara);
		
		JLabel ceketPara = new JLabel("");
		ceketPara.setFont(new Font("Tahoma", Font.PLAIN, 13));
		ceketPara.setBounds(260, 220, 63, 16);
		ceketPara.setText(Integer.toString(CikanUrun.ceketCounter * 35));
		frame.getContentPane().add(ceketPara);
		
		JLabel lblTl = new JLabel("TL");
		lblTl.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTl.setBounds(335, 140, 18, 16);
		frame.getContentPane().add(lblTl);
		
		JLabel label = new JLabel("TL");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(335, 181, 18, 16);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("TL");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(335, 221, 18, 16);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("TL");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(335, 293, 18, 16);
		frame.getContentPane().add(label_2);
		
		JLabel totalPara = new JLabel("0");
		totalPara.setFont(new Font("Tahoma", Font.PLAIN, 13));
		totalPara.setBounds(237, 294, 97, 16);
		totalPara.setText(Double.toString(Main.y.getMuhasebe().getAylikGelir()));
		frame.getContentPane().add(totalPara);
		
		JLabel lblTotaldeKazanlanPara = new JLabel("Totalde Kazan\u0131lan Para :");
		lblTotaldeKazanlanPara.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotaldeKazanlanPara.setBounds(60, 294, 165, 16);
		frame.getContentPane().add(lblTotaldeKazanlanPara);
		
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
}
