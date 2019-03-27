//Main.java 
package aerodrom;

public class Main {
	public static void main(String[] args) {
		Putnicki p1 = new Putnicki(300000), p2 = new Putnicki(250000, 425);
		Teretni t1 = new Teretni(200000), t2 = new Teretni(230000, 120000);
		Aerodrom a = new Aerodrom(10, 430000, 0.1);
		a.sleti(p1, 3);
		a.sleti(p2, 7);
		a.sleti(t1, 9);
		a.sleti(t2, 0);
		a.poleti(7);
		a.poleti(1);
		System.out.println(a);
		System.out.println(a.prihod());
	}
}