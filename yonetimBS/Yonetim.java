package yonetimBS;

import java.util.ArrayList;

import finansalBS.Muhasebe;
import urunIslemeBS.*;

import personelBS.Calisan;

public class Yonetim {

	private ArrayList<Calisan> calisanlar; // el ile eklenebilir (program üzerinden)
	private ArrayList<MusteriIstek> musteriIstekler; // databaseden alýnacak
	private ArrayList<CikanUrun> cikanUrunler; // musteriIstekler ine göre oluþacak.
	private ArrayList<Makine> makineler;
	private Muhasebe mh;
	
	public Yonetim() {
		
		this.calisanlar = new ArrayList<Calisan>();
		this.musteriIstekler = new ArrayList<MusteriIstek>();
		this.cikanUrunler = new ArrayList<CikanUrun>();
		this.makineler = new ArrayList<Makine>();
		this.mh = new Muhasebe();
	}
	
	public void calisanEkle (Calisan c) {
		this.calisanlar.add(c);
		this.mh.setAylikMaasGideri(mh.getAylikMaasGideri()+ c.getMaas());
	}
	
	public void calisanCikar(String tcNo) throws AradiginizCalisanBulunamadiException {
		this.mh.setAylikMaasGideri(mh.getAylikMaasGideri() - calisanBul(tcNo).getMaas());
		this.calisanlar.remove(calisanBul(tcNo));
	}
	
	public Calisan calisanBul(String tcNo) throws AradiginizCalisanBulunamadiException {
		
		for(Calisan c : calisanlar) 
			if(c.getTcNo().equals(tcNo)) 
				return c;
			throw new AradiginizCalisanBulunamadiException("Aradiginiz calisan sistemde bulunamadi.");
	}

	public ArrayList<Calisan> getCalisanlar() {
		return calisanlar;
	}
	
	public void genelZam(double oran) {
		for(Calisan c : calisanlar) {
			c.zamYap(oran);
		}
		this.mh.setAylikMaasGideri(mh.getAylikMaasGideri()*oran + mh.getAylikMaasGideri());
	}
	
	public ArrayList<MusteriIstek> getMusteriIstekler(){
		return musteriIstekler;
	}
	
	public ArrayList<CikanUrun> getCikanUrunler(){
		return cikanUrunler;
	}
	
	public ArrayList<Makine> getMakineler(){
		return makineler;
	}
	
	public void UrunIslemeAl(MusteriIstek m) {
		CikanUrun c = new CikanUrun(m.getUrunCesit(), m.getBeden(), m.getRenk(), m.getTcNo(), m.getAdet());
		this.cikanUrunler.add(c);
		this.musteriIstekler.remove(m);
		mh.setAylikGelir(c.getFiyat());
	}
	
	public void MusteriIstekEkle(MusteriIstek m) {
		musteriIstekler.add(m);
	}
	
	public Muhasebe getMuhasebe() {
		return this.mh;
	}
	
	public Muhasebe muhasebeHesap() {
		
		mh.setAylikVergiGideri(mh.getAylikGelir() / 5);
		return this.mh;
	}
	public void makineEkle(Makine m) {
		this.mh.setAylikAtolyeGideri(mh.getAylikAtolyeGideri() + 100);
		m.birimCalistir();
		this.makineler.add(m);
	}
	public void makineCikar(String makineAdi) throws MakineBulunamadiException {
		for(Makine m : makineler) {
			if(m.getMakineAdi().equals(makineAdi)) {
				mh.setAylikAtolyeGideri(mh.getAylikAtolyeGideri() - 100);
				makineler.remove(m);
				return;
			}
		}
		throw new MakineBulunamadiException("Makine Bulunamadi");
	}


}
	