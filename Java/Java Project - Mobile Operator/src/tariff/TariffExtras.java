package tariff;

public class TariffExtras {
	private double price;
	private int type;
	public static final int MESSAGES = 1;
	public static final int INTERNET = 2;

	public TariffExtras() {
	}

	public TariffExtras(double price, int type) {
		this.price = price;
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof TariffExtras) {
			if (this.type == ((TariffExtras) obj).getType()) {
				return true;
			}
		}
		return false;
	}
}
