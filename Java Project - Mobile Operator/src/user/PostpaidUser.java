package user;

import java.util.ArrayList;
import java.util.List;

import services.Call;
import services.InternetSession;
import services.Message;
import tariff.TariffExtras;
import tariff.TariffPackage;

public class PostpaidUser extends User {
	private TariffPackage tariffPackage;
	private double balance;
	List<TariffExtras> tariffExtras;

	public PostpaidUser() {
		super();
		tariffExtras = new ArrayList<>();
	}
	
	public PostpaidUser(int id, TariffPackage tariffPackage) {
		super(id);
		this.tariffPackage = tariffPackage;
		tariffExtras = new ArrayList<>();
	}

	@Override
	public boolean makeCall(User user, int minutes) {
		if (user != this) {
			if (tariffPackage.getMinutes() >= minutes) {
				getCalls().add(new Call(minutes, user));
				tariffPackage.setMinutes(tariffPackage.getMinutes() - minutes);
				System.out.println("Deducted from package");
			} else {
				getCalls().add(new Call(minutes, user));
				minutes -= tariffPackage.getMinutes();
				tariffPackage.setMinutes(0);
				balance += minutes * getMobileOperator().getPriceMinute();
				System.out.println("Charged extra");
			}
		}
		return true;
	}

	@Override
	public boolean sendMessage(User user, String messageText) {
		if (user != this) {
			if (tariffExtras.contains(new TariffExtras(0, TariffExtras.MESSAGES))) {
				getMessages().add(new Message(messageText, user));
			} else if (tariffPackage.getMessages() > 0) {
				getMessages().add(new Message(messageText, user));
				tariffPackage.setMessages(tariffPackage.getMessages() - 1);
				System.out.println("Deducted from package");
			} else {
				getMessages().add(new Message(messageText, user));
				balance += getMobileOperator().getPriceMessage();
				System.out.println("Charged extra");
			}
		}
		return true;
	}

	@Override
	public boolean surfOnInternet(String url, int MB) {
		if (tariffExtras.contains(new TariffExtras(0, TariffExtras.INTERNET))) {
			getInternetSessions().add(new InternetSession(MB, url));
		} else if (tariffPackage.getMBs() > 0) {
			getInternetSessions().add(new InternetSession(MB, url));
			tariffPackage.setMBs(tariffPackage.getMBs() - MB);
			System.out.println("Deducted from package");
		} else {
			getInternetSessions().add(new InternetSession(MB, url));
			balance += getMobileOperator().getPriceMB();
			System.out.println("Charged extra");
		}
		return false;
	}

	public TariffPackage getTariffPackage() {
		return tariffPackage;
	}

	public void setTariffPackage(TariffPackage tariffPackage) {
		this.tariffPackage = tariffPackage;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<TariffExtras> getAdditions() {
		return tariffExtras;
	}

	public void setAdditions(List<TariffExtras> additions) {
		this.tariffExtras = additions;
	}

	public boolean addTariffAddition(TariffExtras tariffAddition) {
		if (tariffExtras == null) {
			tariffExtras = new ArrayList<TariffExtras>();
		}
		if (!tariffExtras.contains(tariffAddition)) {
			tariffExtras.add(tariffAddition);
			return true;
		}
		return false;
	}

	public double forPayment() {
		double total = getTariffPackage().getPrice() + balance;
		if (tariffExtras != null) {
			for (TariffExtras tariffAddition : tariffExtras) {
				total += tariffAddition.getPrice();
			}
		}
		return total;
	}

	public String generateBill() {
		String bill = "User id: " + getId() + "\nPackage basic price: " + getTariffPackage().getPrice() + "\n";
		double price = 0;
		if (tariffExtras != null) {
			for (TariffExtras tariffAddition : tariffExtras) {
				price += tariffAddition.getPrice();
			}
		}
		bill += "Tariff additions: " + price + "\n";
		bill += "Package breach: " + balance + "\n";
		bill += "Total: " + forPayment();
		return bill;
	}

}
