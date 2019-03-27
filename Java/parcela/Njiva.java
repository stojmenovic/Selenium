package parcela;

public class Njiva extends Parcela {

	private double prinosPoM;

	public char vrsta() {
		return 'N';
	}

	public double prinos(int godina) {
		return getPovrsina() * prinosPoM;
	}

	public Njiva(double povrsina, double prinosPoM) {
		super(povrsina);
		this.prinosPoM = prinosPoM;
	}

	public void setPrinosPoM(double prinosPoM) {
		this.prinosPoM = prinosPoM;
	}

	@Override
	public String toString() {
		return super.toString() + ":" + prinosPoM;
	}

}
