package figura;

import zadatak2.Figura;

public class Trougao extends Figura{

	private int a;
	private int b;
	private int c;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public Trougao() {
		super();
		
		
	}
	public Trougao(double obim, double povrsina, String naziv, int a, int b, int c) {
		super(obim, povrsina, naziv);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	
}
