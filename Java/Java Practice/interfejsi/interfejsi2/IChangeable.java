package interfejsi2;

public interface IChangeable {
/*Napisati interfejs IChangeable koji ima metodu tipa void bez
argumenata changeState(), printState();
Napisati klasu Uredjaj koja implementira interfejs IChangeable
tako sto metoda changeState() menja ukljucenost/iskljucenost uredjaja
metoda printState() ispisuje status uredjaja.
Napisati klasu Animal koja implementira interfejs IChangeable
tako sto metoda changeState() menja status da li je zivotinja gladna 
ili ne.  printState() ispisuje da li je zivotinja gladna ili ne
*/
	
	public void printState();
	public void changeState(Boolean value);
	
	
}
