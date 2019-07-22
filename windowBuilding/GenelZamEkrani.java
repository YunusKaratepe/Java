package windowBuilding;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class GenelZamEkrani {

	private JFrame frame;
	private JTextField oranText;


	public GenelZamEkrani() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame("GenelZamEkrani");
		frame.getContentPane().setBackground(new Color(255, 160, 122));
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblYaplacakZamGiriniz = new JLabel("Yap\u0131lacak Zam\u0131 Giriniz (%) :");
		lblYaplacakZamGiriniz.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblYaplacakZamGiriniz.setBounds(12, 141, 245, 39);
		frame.getContentPane().add(lblYaplacakZamGiriniz);
		
		oranText = new JTextField();
		oranText.setHorizontalAlignment(SwingConstants.RIGHT);
		oranText.setFont(new Font("Tahoma", Font.BOLD, 16));
		oranText.setBounds(252, 148, 95, 25);
		frame.getContentPane().add(oranText);
		oranText.setColumns(10);
		
		JLabel label = new JLabel("%");
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(349, 152, 21, 16);
		frame.getContentPane().add(label);
		
		JButton btnOnayla = new JButton("Onayla");
		btnOnayla.setIcon(new ImageIcon(GenelZamEkrani.class.getResource("/images/icons8-checked-48.png")));
		btnOnayla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.y.genelZam(Double.parseDouble(oranText.getText()) / 100);
			}
		});
		btnOnayla.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnOnayla.setBounds(115, 225, 160, 46);
		frame.getContentPane().add(btnOnayla);
		
		JLabel lblNewLabel = new JLabel("Genel Zam");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(127, 13, 127, 39);
		frame.getContentPane().add(lblNewLabel);
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
	

}
