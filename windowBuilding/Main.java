package windowBuilding;

import personelBS.Calisan;
import urunIslemeBS.MusteriIstek;
import yonetimBS.Yonetim;

public class Main {
	
	public static Yonetim y ;
	
	public static void main(String[] args) {
		
		y = new Yonetim();
		MusteriIstek m1 = new MusteriIstek("Yunus Karatepe", 10, "Mavi", "Medium", "Sweat");
		MusteriIstek m2 = new MusteriIstek("Alperen Semen", 5, "Ye�il", "Medium", "Ceket");
		MusteriIstek m3 = new MusteriIstek("�lker Bedir", 100, "Siyah", "Large", "Tshirt");
		MusteriIstek m4 = new MusteriIstek("H�srev Yumu�ak", 1000, "Mavi", "Medium", "Sweat");
		MusteriIstek m5 = new MusteriIstek("Ersel Mutlu", 45, "Sar�", "Medium", "Ceket");
		
		Calisan c1 = new Calisan("291", "Yunus Karatepe", 20, 2000, "Erkek", 2500);
		Calisan c2 = new Calisan("325", "Erkan Zengin", 41, 1980, "Erkek", 5500);
		Calisan c3 = new Calisan("747", "Osman Kolsuz", 55, 2010, "Erkek", 3500);
		Calisan c4 = new Calisan("533", "Ay�e Bi�er", 18, 2017, "Kad�n", 2500);
		Calisan c5 = new Calisan("210", "Bet�l Karsl�gil", 33, 2019, "Kad�n", 2500);
		
		
		y.MusteriIstekEkle(m1);
		y.MusteriIstekEkle(m2);
		y.MusteriIstekEkle(m3);
		y.MusteriIstekEkle(m4);
		y.MusteriIstekEkle(m5);
		y.calisanEkle(c1);
		y.calisanEkle(c2);
		y.calisanEkle(c3);
		y.calisanEkle(c4);
		y.calisanEkle(c5);
		
		GirisEkrani g = new GirisEkrani();
		g.getFrame().setVisible(true);
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
