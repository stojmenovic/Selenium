package nizovi;

import java.util.Scanner;

public class Zadatak2 {
	public static void main(String[] args) {
		// napisati dve metode
		// prva metoda vraca zbir elemenata na parnim pozicijama
		// druga metoda vraca proizvod elemenata na neparnim pozicijama
		// 1, 2, 3 -----> Zbir: 4 Proizvod: 2
		ucitajNiz(niz);
		System.out.println(zbirParnih);
		System.out.println (proizvodNeparnih(niz));
	}

public static int zbirParnih(int[] niz) {
	int sum=0;
	for(int i=0;i<niz.length;i++) {
		if(i%2==0)
			sum+=niz[i];

				         
	}
	return sum;
}

public static int proizvodNeparnih(int[] niz) {
	int proizvod=1;
	for(int i=0;i<niz.length;i++) {
		if(i%2!=0)
		proizvod*=niz[i];
			}
	return proizvod;
}
public static void ucitajNiz(int[] niz) {
	System.out.println("Unesi duzinu niza");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	niz[]=new int[n];
	for(int i=0;i<n;i++);
		System.out.println("Unesi element na poziciji " + i);

}}