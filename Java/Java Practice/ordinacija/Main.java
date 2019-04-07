package ordinacija;

public class Main {

	public static void main(String[] args) {



		Ordinacija o1 = new Ordinacija("Zubic Majstor", 3);

		Pacijent p1 = new Pacijent("01");

		Pacijent p2 = new Pacijent("02");

		Pacijent p3 = new Pacijent("03");

		p1.setImeP("Mile");

		p2.setImeP("Boban");

		p3.setImeP("Stefan");

		if (o1.postaviPacijenta(p1, 0)) {

			System.out.println("Pacijent 1 postavljen");

		}

		if (o1.postaviPacijenta(p2, 0)) {

			System.out.println("Pacijent 2 postavlje");

		} else

			System.out.println("Pacijent 2 nije postavljen");

		if (o1.postaviPacijenta(p3, 2)) {

			System.out.println("Pacijent 3 postavlje");

		} else

			System.out.println("Pacijent 3 nije postavljen");

		System.out.println(o1);

		o1.skloniPacijenta(0);

		o1.skloniPacijenta(3);

		System.out.println(o1);

	}



}

