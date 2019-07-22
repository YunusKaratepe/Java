package yonetimBS;

public class Makine {
	
	private String makineAdi;
	private boolean durum;
	
	public Makine(String makineAdi) {
		this.makineAdi = makineAdi;
		durum = false;
	}
	
	public void birimCalistir() {
		durum = true;
	}
	public void birimDurdur() {
		durum = false;
	}
	public String getMakineAdi() {
		return this.makineAdi;
	}
	public boolean getMakineDurumu() {
		return this.durum;
	}
	
	

}
