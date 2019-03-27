package parcela;

public abstract class Parcela {
	public static int uid = 0;

	private int id = ++uid;
	private double povrsina;

	public abstract char vrsta();

	public abstract double prinos(int godina);

	public Parcela(double povrsina) {
		super();
		this.povrsina = povrsina;
	}

	public int getId() {
		return id;
	}

	public double getPovrsina() {
		return povrsina;
	}

	@Override
	public String toString() {
		return vrsta() + "-" + id + "[" + povrsina + "]";
	}

}
