package ordinacija;

public class Pacijent {



		

		// Napisati klasu pacijent, pacijent ima jedinstveni identifikator koji se

		// zadaje

		// automatski prilikom kreiranja pacijenta

		// pacijent poseduje ime i prezime koje se moze zadati kasnije, get set

		// pacijent takodje poseduje broj knjizice tipa string koji se zadaje pri

		// kreiranju pacijenta samo get

		// pacijent se moze ispisati u formatu:

		// IME_PREZIME[ID:BRK]

		// KLASA ordinacija poseduje naziv ordinacije koji se zadaje prilikom kreiranja

		// i samo GET

		// ordinacija poseduje niz stolica ciji se broj zadaje prilikom kreiranja i na

		// njima sede pacijenti

		// moguce je dohvatiti broj stolica, moguce je postaviti pacijenta na stolicu

		// tako da se vrati indikator

		// da li je pacijent uspesno postavljen na stolicu (ako je prazna i ako postoji)

		// moguce je skloniti pacijenta sa stolice

		// pacijenta je moguce ispisati u formatu -IME_PREZIME[ID:BRK]

		// ordinaciju je moguce ispisati u formatu -NAZIV[BRSTOLICA:PACIJENTI]

		// napisati glavni program koji kreira nekoliko pacijenata kreira ordinaciju,

		// dodaje pacijenta na stolicu

		// i uklanja ih sa stolice

		public static int uid = 0;



		private int id;

		private String imeP;

		private String brojKnjizice;



		public Pacijent(String brojKnjizice) {

			this.id = ++uid;

			this.brojKnjizice = brojKnjizice;

			this.imeP = "";

		}



		public int getID() {

			return this.id;

		}



		public String getImeP() {

			return imeP;

		}



		public void setImeP(String imeP) {

			this.imeP = imeP;

		}



		public String getBrojKnjizice() {

			return brojKnjizice;

		}



		@Override

		public String toString() {

			return this.getImeP() + "[" + this.getID() + ":" + this.getBrojKnjizice() + "]";

		}



}