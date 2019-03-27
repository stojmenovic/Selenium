package mar08;

public class Main {

	public static void main(String[] args) {
		int brGodina = 3;
		double ukupanPrinos = 0;

		Suma s1 = new Suma(200, 130, 250, 2);
		Suma s2 = new Suma(88, 4, 3, 3);

		Njiva n1 = new Njiva(55, 5);
		Njiva n2 = new Njiva(77, 6);

		Parcela p[] = new Parcela[] { s1, s2, n1, n2 };
		for (int i = 0; i < p.length; i++) {
			ukupanPrinos += p[i].prinos(brGodina);
		}

		System.out.println("Prinos za izabrani period ovih parcela je: " + " \n");
		System.out.println(s1.prinos(3));
		System.out.println(s2.prinos(3));
		System.out.println(n1.prinos(3));
		System.out.println(n2.prinos(3));
		
		System.out.println("\n");
		
		System.out.println("Ukupan prinos za " + brGodina + " godine je: " + ukupanPrinos);

	}

}

/*Parcela[] parcela = new Parcela[4];
Parcela n1 = new Njiva(800,4);
parcela[0]=n1;

Parcela n2 = new Njiva(900,5);
parcela[1]=n2;

Parcela s1 = new Suma(800,4, 2, 2);
parcela[2]=s1;

Parcela s2 = new Suma(900,5, 3, 3);
parcela[3]=s2;

for (int i = 0; i < parcela.length; i++) {
			if(parcela[i] == null)
			continue;
			System.out.println("Ukupan prinos  " + (i+1) + ". parcele u toku 3 godine je: " + parcela[i].prinos(3));}
			
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s1);
		System.out.printlns2);

*/

