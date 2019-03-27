package figura;

public class Figura {

	
	private double obim;
	private double povrsina;
	private String naziv;
	public double getObim() {
		return obim;
	}
	public void setObim(double obim) {
		this.obim = obim;
	}
	public double getPovrsina() {
		return povrsina;
	}
	
	public String ispis() {
	return this.naziv + "(O:" + this.obim + ", P:" + this.povrsina + ")";
}
	public void setPovrsina(double povrsina) {
		this.povrsina = povrsina;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Figura() {
	this.naziv = "";
	this.obim = 0;
	this.povrsina=0;
	}
	public Figura(double obim, double povrsina, String naziv) {
		
		this.obim = obim;
		this.povrsina = povrsina;
		this.naziv = naziv;
	}
	
	
	
}
