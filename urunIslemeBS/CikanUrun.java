package urunIslemeBS;

public class CikanUrun {
	
	private String urunCesit; //   0 : tshirt 	  // 	    1 : sweat     	// 		2 : ceket 
	private String beden;
	private double fiyat;
	private String renk;
	private String tcNo;
	private int adet;
	public static int tshirtCounter = 0;
	public static int sweatCounter = 0;
	public static int ceketCounter = 0;
	
	public CikanUrun(String urunCesit, String beden, String renk, String tcNo, int adet) {
		
		this.adet = adet;
		this.urunCesit = urunCesit;
		this.beden = beden;
		this.renk = renk;
		this.tcNo = tcNo;
		
		fiyatBelirle();
	}
	
	public void fiyatBelirle() {

		if(urunCesit.equals("Tshirt")) {
			fiyat = adet * 15;
			tshirtCounter += adet;
		}else if(urunCesit.equals("Sweat")) {
			fiyat = adet * 25;
			sweatCounter += adet;
		}else {// Ceket
			fiyat = adet * 35;
			ceketCounter += adet;
		}
		
		
	}

	public String getUrunCesit() {
		return urunCesit;
	}

	public String getBeden() {
		return beden;
	}

	public double getFiyat() {
		return fiyat;
	}

	public String getRenk() {
		return renk;
	}

	public String getTcNo() {
		return tcNo;
	}

	public int getAdet() {
		return adet;
	}
	
	
	
	
	
	
}
