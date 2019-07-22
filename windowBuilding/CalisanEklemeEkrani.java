package windowBuilding;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import personelBS.Calisan;

public class CalisanEklemeEkrani {

	private JFrame frame;
	private JTextField adField;
	private JTextField tcField;
	private JTextField yasField;
	private JTextField yilField;
	private JTextField maasField;

	public CalisanEklemeEkrani() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame("CalisanEklemeEkrani");
		frame.getContentPane().setBackground(new Color(0, 206, 209));
		frame.setSize(400, 600);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblrenciEkle = new JLabel("\u00C7al\u0131\u015Fan Ekle");
		lblrenciEkle.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblrenciEkle.setBounds(111, 13, 148, 29);
		frame.getContentPane().add(lblrenciEkle);
		
		JLabel lblalannAd = new JLabel("\u00C7al\u0131\u015Fan\u0131n Ad\u0131 :");
		lblalannAd.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblalannAd.setBounds(12, 100, 127, 22);
		frame.getContentPane().add(lblalannAd);
		
		JLabel lblalannTcno = new JLabel("\u00C7al\u0131\u015Fan\u0131n TcNo :");
		lblalannTcno.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblalannTcno.setBounds(12, 160, 145, 22);
		frame.getContentPane().add(lblalannTcno);
		
		JLabel lblalannYa = new JLabel("\u00C7al\u0131\u015Fan\u0131n Ya\u015F\u0131 :");
		lblalannYa.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblalannYa.setBounds(12, 220, 145, 22);
		frame.getContentPane().add(lblalannYa);
		
		JLabel lblalannBalamaYl = new JLabel("\u00C7al\u0131\u015Fan\u0131n Ba\u015Flama Y\u0131l\u0131 :");
		lblalannBalamaYl.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblalannBalamaYl.setBounds(12, 280, 207, 22);
		frame.getContentPane().add(lblalannBalamaYl);
		
		JLabel lblalannCinsiyeti = new JLabel("\u00C7al\u0131\u015Fan\u0131n Cinsiyeti :");
		lblalannCinsiyeti.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblalannCinsiyeti.setBounds(12, 340, 175, 22);
		frame.getContentPane().add(lblalannCinsiyeti);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(200, 338, 60, 27);
		frame.getContentPane().add(menuBar);
		
		JMenu cinsiyetSeciniz = new JMenu("Se\u00E7iniz");
		menuBar.add(cinsiyetSeciniz);
		
		JMenuItem erkekSecim = new JMenuItem("Erkek");
		erkekSecim.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				cinsiyetSeciniz.setText("Erkek");
			}
		});
		cinsiyetSeciniz.add(erkekSecim);
		
		JMenuItem kadinSecim = new JMenuItem("Kad\u0131n");
		kadinSecim.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				cinsiyetSeciniz.setText("Kadin");
			}
		});
		cinsiyetSeciniz.add(kadinSecim);
		
		adField = new JTextField();
		adField.setBounds(177, 102, 193, 22);
		frame.getContentPane().add(adField);
		adField.setColumns(10);
		
		tcField = new JTextField();
		tcField.setColumns(10);
		tcField.setBounds(177, 162, 193, 22);
		frame.getContentPane().add(tcField);
		
		yasField = new JTextField();
		yasField.setColumns(10);
		yasField.setBounds(177, 222, 193, 22);
		frame.getContentPane().add(yasField);
		
		yilField = new JTextField();
		yilField.setColumns(10);
		yilField.setBounds(243, 282, 127, 22);
		frame.getContentPane().add(yilField);
		
		JButton btnalanEkle = new JButton("\u00C7al\u0131\u015Fan Ekle");
		btnalanEkle.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			boolean ayniTc = false;
				for(Calisan c : Main.y.getCalisanlar()) {
						if(c.getTcNo().equals(tcField.getText()))
							ayniTc = true;
					}
				if( (!cinsiyetSeciniz.getText().equals("Seçiniz") )) {
					
				if(ayniTc) {
					JOptionPane.showMessageDialog(null, "Ayný Tcli Çalýþan Zaten Mevcut");
				}
				else if( !(adField.getText().equals("") || yasField.getText().equals("") || yilField.getText().equals("") || tcField.getText().equals("") ) ) {
						Main.y.calisanEkle(new Calisan(tcField.getText(), adField.getText(), Integer.parseInt(yasField.getText()), Integer.parseInt(yilField.getText()) , cinsiyetSeciniz.getText(), Double.parseDouble(maasField.getText())));
						JOptionPane.showMessageDialog(null, "Çalýþan Sisteme Baþarýyla Eklendi.");
					}else {
						JOptionPane.showMessageDialog(null, "Hicbir Kismi Bos Birakmayiniz.");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Cinsiyet Secmediniz.");
				}
				
				
			}
		});
		btnalanEkle.setIcon(new ImageIcon(CalisanEklemeEkrani.class.getResource("/images/icons8-plus-26.png")));
		btnalanEkle.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnalanEkle.setBounds(99, 461, 198, 35);
		frame.getContentPane().add(btnalanEkle);
		
		JLabel maasLabel = new JLabel("\u00C7al\u0131\u015Fan\u0131n Maa\u015F\u0131 :");
		maasLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		maasLabel.setBounds(12, 400, 175, 22);
		frame.getContentPane().add(maasLabel);
		
		maasField = new JTextField();
		maasField.setColumns(10);
		maasField.setBounds(177, 402, 193, 22);
		frame.getContentPane().add(maasField);
	}
	
	
	
	
	
	public JFrame getFrame() {
		return this.frame;
	}
}
