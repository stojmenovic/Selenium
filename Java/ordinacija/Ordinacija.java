package ordinacija;

public class Ordinacija {

	// KLASA ordinacija poseduje naziv ordinacije koji se zadaje prilikom kreiranja

	// i samo GET

	// ordinacija poseduje niz stolica ciji se broj zadaje prilikom kreiranja i na

	// njima sede pacijenti

	// moguce je dohvatiti broj stolica, moguce je postaviti pacijenta na stolicu

	// tako da se vrati indikator

	// da li je pacijent uspesno postavljen na stolicu (ako je prazna i ako postoji)

	// moguce je skloniti pacijenta sa stolice

	// pacijenta je moguce ispisati u formatu -

	// ordinaciju je moguce ispisati u formatu - NAZIV[BRSTOLICA:PACIJENTI]

	// napisati glavni program koji kreira nekoliko pacijenata kreira ordinaciju,

	// dodaje pacijenta na stolicu

	// i uklanja ih sa stolice



	private String naziv;

	private Pacijent[] stolice;



	public Ordinacija(String naziv, int k) {

		this.naziv = naziv;

		this.stolice = new Pacijent[k];

	}



	public String getNaziv() {

		return this.naziv;

	}



	public int getBrojStolica() {

		return this.stolice.length;

	}



	public boolean postaviPacijenta(Pacijent p, int i) {

		if (i >= this.stolice.length || i < 0)

			return false;

		if (stolice[i] != null)

			return false;

		for (int j = 0; j < stolice.length; j++) {

			if (stolice[j] != null) {

				if (stolice[j] == p) {

					stolice[j] = null;

					return false;

				}

			}

		}

		stolice[i] = p;

		return true;

	}



	public void skloniPacijenta(int i) {

		if (i >= this.stolice.length || i < 0)

			return;

		if (stolice[i] == null)

			return;

		stolice[i] = null;

	}



	public void skloniPacijenta(Pacijent p) {

		for (int i = 0; i < stolice.length; i++) {

			if (stolice[i] != null) {

				if (stolice[i] == p) {

					stolice[i] = null;

					return;

				}

			}

		}

	}



	@Override

	public String toString() {

		StringBuilder sb=new StringBuilder(this.getNaziv());

		sb.append("[");

		sb.append(this.getBrojStolica());

		sb.append(":");

		for (int i=0;i<stolice.length;i++) {

			if(stolice[i]!=null)sb.append(stolice[i]);

		}

		sb.append("]");

		return sb.toString();

		

		

	}

	

}