package interfejsi2;

public class Animal implements IChangeable {
public boolean state=false;

	@Override
	public void printState() {
		if(state) {
			System.out.println("Gladna!");
			System.out.println("Nije gladna!");
		}

	}

	@Override
	public void changeState(Boolean value) {
		state=!state;
	}

}
