package interfejsi2;

public class Main {

	public static void main(String[] args) {
		
		
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		Uredjaj u1 = new Uredjaj();
		Uredjaj u2 = new Uredjaj();
		
		IChangeable[] niz = new IChangeable[] {a1,u1,a2,u2};
		for(int i=0;i<niz.length; i++) {
			niz[i].printState();
		}
	
		u2.changeState(null);
		System.out.println("");
		for(int i=0;i<niz.length; i++) {
			niz[i].printState();}
	}

}
