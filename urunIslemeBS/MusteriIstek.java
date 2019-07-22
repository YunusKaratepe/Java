package urunIslemeBS;

import java.awt.Color;


public class MusteriIstek { 
	
	private int adet;
	private String renk;
	private String tcNo;
	private String beden;
	private String urunCesit;
	
	
	public MusteriIstek(String tcNo, int adet, String renk, String beden, String urunCesit) {
		
		this.tcNo = tcNo;
		this.beden = beden;
		this.adet = adet;
		this.renk = renk;		
		this.urunCesit = urunCesit;
	}


	public int getAdet() {
		return adet;
	}


	public String getRenk() {
		return renk;
	}


	public String getTcNo() {
		return tcNo;
	}


	public String getBeden() {
		return beden;
	}


	public String getUrunCesit() {
		return urunCesit;
	}
	
	

}
