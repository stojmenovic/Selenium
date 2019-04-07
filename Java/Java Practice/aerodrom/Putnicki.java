//Putnicki.java 
package aerodrom;

public class Putnicki extends Avion {
	private static final double tezPutnika = 80;
	private static final double tezPrtljaga = 30;
	private int kapacitet;

	public Putnicki(double t, int n) {
		super(t);
		kapacitet = n;
	}

	public Putnicki(double t) {
		this(t, 400);
	}

	
	@Override
	public char vrsta() {
		return 'P';
	}

	@Override
	public double dohTez() {
		return super.dohTez() + kapacitet * (tezPutnika + tezPrtljaga);
	}
}
