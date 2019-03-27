package mar08;

public class Suma extends Parcela {

	private double povrsinaStabla;
	private double prinosPoStablu;
	private int periodSazrevanja;

	public Suma(double povrsina, double povrsinaStabla, double prinosPoStablu, int periodSazrevanja) {
		super(povrsina);
		this.povrsinaStabla = povrsinaStabla;
		this.prinosPoStablu = prinosPoStablu;
		this.periodSazrevanja = periodSazrevanja;
	}

	public char vrsta() {
		return 'S';

	}

	public double prinos(int godina) {
		return getPovrsina() / povrsinaStabla * prinosPoStablu * (godina * periodSazrevanja);

	}

	@Override
	public String toString() {
		return super.toString() + "Parcela:( " + povrsinaStabla + ", " + prinosPoStablu + ", " + periodSazrevanja + ")";

	}
}
