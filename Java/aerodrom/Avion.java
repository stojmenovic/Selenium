package aerodrom;

public abstract class Avion {
	private static int ukID = 0;
	private final int id = ++ukID;
	private double tezina;

	public Avion(double t) {
		tezina = t;
	}

	public int dohID() {
		return id;
	}

	public double dohTez() {
		return tezina;
	}

	public abstract char vrsta();

	public String toString() {
		return vrsta() + "_" + dohID() + "[" + dohTez() + "]";
	}
}
