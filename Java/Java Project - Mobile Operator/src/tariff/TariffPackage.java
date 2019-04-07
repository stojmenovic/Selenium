package tariff;

public class TariffPackage {
	private double price;
	private int minutes;
	private int messages;
	private int MBs;
	private boolean business;
	
	public TariffPackage() {
	}
	
	public TariffPackage(double price, int minutes, int messages, int MBs, boolean business) {
		this.price = price;
		this.minutes = minutes;
		this.messages = messages;
		this.MBs = MBs;
		this.business = business;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getMessages() {
		return messages;
	}
	public void setMessages(int messages) {
		this.messages = messages;
	}
	public int getMBs() {
		return MBs;
	}
	public void setMBs(int mBs) {
		MBs = mBs;
	}
	public boolean isBusiness() {
		return business;
	}
	public void setBusiness(boolean business) {
		this.business = business;
	}
	
}
