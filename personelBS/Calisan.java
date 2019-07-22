package personelBS;

public class Calisan {
	

	private final String tcNo;
	private String name;
	private int yas;
	private int baslangicYili;
	private String cinsiyet; // e / k
	private double maas;
	
	public Calisan(String tcNo, String name, int yas, int baslangicYili, String cinsiyet, double maas) {
		
		this.tcNo = tcNo;
		this.name = name;
		this.yas = yas;
		this.baslangicYili = baslangicYili;
		this.cinsiyet = cinsiyet;	
		this.maas = maas;
	}
	
	public String getTcNo() {
		return this.tcNo;
	}

	public String getName() {
		return name;
	}

	public int getYas() {
		return yas;
	}

	public int getBaslangicYili() {
		return baslangicYili;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}
	
	public double getMaas() {
		return this.maas;
	}
	
	public void zamYap(double oran) {
		this.maas += this.maas * oran;
	}
	
	
	

}
