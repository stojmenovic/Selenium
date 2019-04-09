//Aerodrom.java
package aerodrom;

public class Aerodrom {
	private Avion[] mesta;
	private double maxTez;

	private double jedCena;

	public Aerodrom(int n, double t, double c) {
		mesta = new Avion[n];
		maxTez = t;
		jedCena = c;
	}

	public boolean sleti(Avion a, int i) {
		if (a.dohTez() > maxTez)
			return false;
		if (i < 0 || i >= mesta.length)
			return false;
		if (mesta[i] != null)
			return false;
		mesta[i] = a;
		return true;
	}

	public boolean poleti(int i) {
		if (i < 0 || i >= mesta.length)
			return false;
		if (mesta[i] == null)
			return false;
		mesta[i] = null;
		return true;
	}

	public double prihod() {
		double prihod = 0;
		for (int i = 0; i < mesta.length; i++)
			if (mesta[i] != null)
				prihod += mesta[i].dohTez() * jedCena;
		return prihod;
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < mesta.length; i++)
			str.append((mesta[i] != null) ? mesta[i] : "<<prazno>>").append('\n');
		return str.toString();
	}
}