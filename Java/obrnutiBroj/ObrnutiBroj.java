package obrnutiBroj;

import java.util.Scanner;

public class ObrnutiBroj {

	public static void main(String[] args) {

		int broj, ostatak;
		int obrnutibroj = 0; // inicira se kao zbir sa pocetnom vrednoscu 0

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj kako bih ga procitao unazad: ");
		broj = sc.nextInt();

		while (broj != 0) { // pocinje petlja koja traje dok god broj nije 0
			ostatak = (broj % 10); // dobija se vrednost poslednje cifre // 135 - 5//13 - 3//0 - 1
			obrnutibroj = (obrnutibroj * 10 + ostatak); // pocinje sa kreiranjem obrnutog broja koristeci ostatak //
														// 0*10+5=5// 50+3=53//530+1=531
			broj = broj / 10; // uneti broj se skracuje za poslednju cifru dok traje petlja i dok ne dodje do
								// nule
		}
		System.out.println("Uneti broj citan unazad je: " + obrnutibroj); // ispisuje se obrnuti broj

	}

}
