package nizovi;

import java.util.Scanner;

public class Zadatak1A {

	public static void main(String[] args) {

		// Napisati metodu koja prime niz celih brojeva i ceo broj.

		// Metoda vraca indikator da li se taj broj nalazi u nizu

		Scanner sc = new Scanner(System.in);

		int n, br;

		System.out.println("Unesi broj elemenata: ");

		n = sc.nextInt();

		int[] niz = new int[n];

		ucitaj(niz);

		System.out.println("Unesi broj: ");

		br = sc.nextInt();

		if (nadjiE(niz, br)) {

			System.out.println("Element je nadjen!");

		} else {

			System.out.println("Element nije nadjen!");

		}

	}

	public static boolean nadjiE(int[] niz, int br) {

		for (int i = 0; i < niz.length; i++) {

			if (niz[i] == br)

				return true;

		}

		return false;

	}

	public static void ucitaj(int[] niz) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesi " + niz.length + " elemenata: ");

		for (int i = 0; i < niz.length; i++) {

			niz[i] = sc.nextInt();

		}

	}

}