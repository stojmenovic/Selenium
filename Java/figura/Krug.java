package figura;

public class Krug extends Figura{
	private double poluprecnik;

	public double getPoluprecnik() {
		return poluprecnik;
	}

	public void setPoluprecnik(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}

	public Krug(double poluprecnik) {
		super();
		this.poluprecnik = poluprecnik;
	}

	public Krug(double obim, double povrsina, String naziv, double poluprecnik) {
		super();
		this.poluprecnik=poluprecnik;
	}
}
