package finansalBS;

public class Muhasebe {
	
	//G�DERLER..
	private double aylikMaasGideri;
	private double aylikSigortaGideri;
	private double aylikVergiGideri;
	private double aylikAtolyeGideri;	
	
	// GEL�RLER..
	private double aylikGelir;
	
	// NET KAZANC (K�R)..
		private double aylikNetKazanc;
	
	
	public double getAylikMaasGideri() {
		return aylikMaasGideri;
	}

	public double getAylikSigortaGideri() {
		return aylikSigortaGideri;
	}

	public double getAylikVergiGideri() {
		return aylikVergiGideri;
	}

	public double getAylikAtolyeGideri() {
		return aylikAtolyeGideri;
	}

	public double getAylikGelir() {
		return aylikGelir;
	}

	public double getAylikNetKazanc() {
		return aylikNetKazanc;
	}

	public void setAylikMaasGideri(double aylikMaasGideri) {
		this.aylikMaasGideri = aylikMaasGideri;
	}

	public void setAylikSigortaGideri(double aylikSigortaGideri) {
		this.aylikSigortaGideri = aylikSigortaGideri;
	}

	public void setAylikVergiGideri(double aylikVergiGideri) {
		this.aylikVergiGideri = aylikVergiGideri;
	}

	public void setAylikAtolyeGideri(double aylikAtolyeGideri) {
		this.aylikAtolyeGideri = aylikAtolyeGideri;
	}

	public void setAylikGelir(double aylikGelir) {
		this.aylikGelir += aylikGelir;
		
	}
	
	public double aylikNetKazancHesapla() {
		aylikNetKazanc = aylikGelir - aylikMaasGideri - aylikSigortaGideri - aylikVergiGideri - aylikAtolyeGideri;
		return aylikNetKazanc;
	}

	

	
	
	public Muhasebe() {
		
	}
	
}
