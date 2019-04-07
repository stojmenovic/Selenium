package interfejsi1;

public class Tacka implements IMoveable{
	public double x,y;
	

	@Override
	public void printLocation() {
System.out.println(this.toString());
		
	}

	@Override
	public String toString() {
		return "Tacka [x=" + x + ", y=" + y + "]";
	}

	@Override
	public void moveUp(double value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveDown(double value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveLeft(double value) {
		x-=value;
		
	}

	@Override
	public void moveRight(double value) {
		x+=value;
		
	}

}
