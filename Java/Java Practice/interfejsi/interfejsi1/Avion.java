package interfejsi1;

public class Avion implements IMoveable {

	public String eBroj;
	public double altitude, longitude;
	@Override
	public void printLocation() {
		// TODO Auto-generated method stub
System.out.println(this.toString());
	}

	@Override
	public void moveUp(double value) {

altitude+=value;

	}

	@Override
	public void moveDown(double value) {
		altitude-=value;

	}

	@Override
	public void moveLeft(double value) {
		longitude-=value;
	

	}

	@Override
	public void moveRight(double value) {
		longitude+=value;	}

	@Override
	public String toString() {
		return eBroj + "["+ altitude + "," + longitude + "]";
	}

}
