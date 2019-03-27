package interfejsi2;

public class Uredjaj implements IChangeable {

	public Boolean state=false;
	
	@Override
	public void printState() {
		if(state)System.out.println("Ukljucen!");
		System.out.println("Iskljucen");

	}

	@Override
	public void changeState(Boolean value) {
		/*if(oNOff) {state=false);
else state=true;*/
		state=!state;
	}

	@Override
	public String toString() {
		return "Uredjaj [state=" + state + "]";
	}

}
