//Teretni.java 
package aerodrom;

public class Teretni extends Avion {
	private double nosivost;

	public Teretni(double t, double n) {
		super(t);
		nosivost = n;
	}

	public Teretni(double t) {
		this(t, 40000);
	}

	@Override
	public char vrsta() {
		return 'T';
	}

	@Override
	public double dohTez() {
		return super.dohTez() + nosivost;
	}
}
