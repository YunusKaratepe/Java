package windowBuilding;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;




public class AnaEkran {

	private JFrame frame;

	
	
	public AnaEkran() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame("Dikiþ Atölyesi Yönetim Sistemi");
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 794, 26);
		frame.getContentPane().add(menuBar);
		
		JMenu calisanIslemleri = new JMenu("\u00C7al\u0131\u015Fan \u0130\u015Flemleri");
		menuBar.add(calisanIslemleri);
		
		JMenuItem calisanEkle = new JMenuItem("\u00C7al\u0131\u015Fan Ekle");
		calisanEkle.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				CalisanEklemeEkrani cEkle = new CalisanEklemeEkrani();
				cEkle.getFrame().setVisible(true);
			}
		});
		calisanIslemleri.add(calisanEkle);
		
		JMenuItem calisanCikar = new JMenuItem("\u00C7al\u0131\u015Fan \u00C7\u0131kar");
		calisanCikar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				CalisanCikarmaEkrani cCikar = new CalisanCikarmaEkrani();
				cCikar.getFrame().setVisible(true);
			}
		});
		calisanIslemleri.add(calisanCikar);
		
		JMenuItem calisanAra = new JMenuItem("\u00C7al\u0131\u015Fan Ara");
		calisanAra.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				CalisanAramaEkrani cAra = new CalisanAramaEkrani();
				cAra.getFrame().setVisible(true);
			}
		});
		calisanIslemleri.add(calisanAra);
		
		JMenuItem calisanListesi = new JMenuItem("\u00C7al\u0131\u015Fan Listesi");
		calisanListesi.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				CalisanListesiEkrani cListe = new CalisanListesiEkrani();
				cListe.getFrame().setVisible(true);
			}
		});
		calisanIslemleri.add(calisanListesi);
		
		JMenuItem genelZamYap = new JMenuItem("Genel Zam Yap");
		genelZamYap.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				GenelZamEkrani genelZam = new GenelZamEkrani();
				genelZam.getFrame().setVisible(true);
			}
		});
		calisanIslemleri.add(genelZamYap);
		
		JMenu urunIslemleri = new JMenu("\u00DCr\u00FCn \u0130\u015Flemleri");
		menuBar.add(urunIslemleri);
		
		JMenuItem bekleyenSiparisler = new JMenuItem("Bekleyen Sipari\u015Fler");
		bekleyenSiparisler.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				SiparisListesiEkrani siparisList = new SiparisListesiEkrani();
				siparisList.getFrame().setVisible(true);
			}
		});
		urunIslemleri.add(bekleyenSiparisler);
		
		JMenuItem hazirlanmýsUrunler = new JMenuItem("Haz\u0131rlanm\u0131\u015F \u00DCr\u00FCnler");
		hazirlanmýsUrunler.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				HazirlanmisUrunlerEkrani hazirUrun= new HazirlanmisUrunlerEkrani();
				hazirUrun.getFrame().setVisible(true);
			}
		});
		urunIslemleri.add(hazirlanmýsUrunler);
		
		JMenuItem bekleyeniIslemeAl = new JMenuItem("Bekleyeni \u0130\u015Fleme Al");
		bekleyeniIslemeAl.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				BekleyeniIslemeAlEkrani islemeAl = new BekleyeniIslemeAlEkrani();
				islemeAl.getFrame().setVisible(true);
			}
		});
		urunIslemleri.add(bekleyeniIslemeAl);
		
		JMenu finansalIslemler = new JMenu("Finansal \u0130\u015Flemler");
		menuBar.add(finansalIslemler);
		
		JMenuItem satislardanEldeEdilenGelir = new JMenuItem("Sat\u0131\u015Flardan Elde Edilen Gelir");
		satislardanEldeEdilenGelir.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				SatislardanEldeEdilenGelirEkrani satisGelir = new SatislardanEldeEdilenGelirEkrani();
				satisGelir.getFrame().setVisible(true);
			}
		});
		finansalIslemler.add(satislardanEldeEdilenGelir);
		
		JMenuItem harcamalarGiderler = new JMenuItem("Harcamalar - Giderler");
		harcamalarGiderler.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				HarcamalarGiderlerEkrani giderEkran = new HarcamalarGiderlerEkrani();
				giderEkran.getFrame().setVisible(true);
			}
		});
		finansalIslemler.add(harcamalarGiderler);
		
		JMenuItem geliGiderKontrolu = new JMenuItem("Gelir - Gider Kontrol\u00FC");
		geliGiderKontrolu.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				GelirGiderKontrolEkrani kontrol = new GelirGiderKontrolEkrani();
				kontrol.getFrame().setVisible(true);
			}
		});
		finansalIslemler.add(geliGiderKontrolu);
		
		JMenu mnNewMenu = new JMenu("Makine \u0130\u015Flemleri");
		menuBar.add(mnNewMenu);
		
		JMenuItem mnýtmNewMenuItem = new JMenuItem("Makine Ekle");
		mnýtmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				MakineEklemeEkrani makEkle = new MakineEklemeEkrani();
				makEkle.getFrame().setVisible(true);
			}
		});
		mnNewMenu.add(mnýtmNewMenuItem);
		
		JMenuItem mnýtmMakinekar = new JMenuItem("Makine \u00C7\u0131kar");
		mnýtmMakinekar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				MakineCikarmaEkrani makCikar = new MakineCikarmaEkrani();
				makCikar.getFrame().setVisible(true);
			}
		});
		mnNewMenu.add(mnýtmMakinekar);
		
		JMenuItem mnýtmMakineListesi = new JMenuItem("Makine Listesi");
		mnýtmMakineListesi.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				MakineListesiEkrani makListe = new MakineListesiEkrani();
				makListe.getFrame().setVisible(true);
			}
		});
		mnNewMenu.add(mnýtmMakineListesi);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(SystemColor.activeCaptionBorder);
		panel.setBounds(0, 26, 794, 539);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(AnaEkran.class.getResource("/images/icons8-analyze-96.png")));
		lblNewLabel.setBounds(65, 132, 102, 137);
		panel.add(lblNewLabel);
		
		JLabel lblHosgeldiniz = new JLabel("Hosgeldiniz <"+ GirisEkrani.admin + ">");
		lblHosgeldiniz.setBounds(228, 173, 423, 45);
		panel.add(lblHosgeldiniz);
		lblHosgeldiniz.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JLabel lblAnaEkran = new JLabel("Ana Ekran");
		lblAnaEkran.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnaEkran.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblAnaEkran.setBounds(229, 39, 320, 83);
		panel.add(lblAnaEkran);
		
		
		
		
	}
	
	
	public JFrame getFrame() {
		return this.frame;
	}
}
