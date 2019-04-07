package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import user.LegalPerson;
import user.PostpaidUser;
import user.PrepaidUser;
import user.User;

public class MobileOperator {
	private List<User> users;
	private List<LegalPerson> legalPersons;
	private double priceMinute;
	private double priceMessage;
	private double priceMB;
	public static final Comparator<LegalPerson> SORT_BY_SIZE = new Comparator<LegalPerson>() {
		@Override
		public int compare(LegalPerson arg0, LegalPerson arg1) {
			return arg0.getUsers().size() - arg1.getUsers().size();
		}
	};

	public MobileOperator() {
		users = new ArrayList<>();
		legalPersons = new ArrayList<>();
	}

	public MobileOperator(double priceMinute, double priceMessage, double priceMB) {
		this.priceMinute = priceMinute;
		this.priceMessage = priceMessage;
		this.priceMB = priceMB;
		users = new ArrayList<>();
		legalPersons = new ArrayList<>();
	}

	public String generateBills() {
		String bills = "";
		if (users.size() > 0) {
			bills += "Users:\n";
			for (User user : users) {
				if (user instanceof PostpaidUser) {
					bills += ((PostpaidUser) user).generateBill() + "\n";
				}
			}
		} else {
			bills += "No users\n";
		}
		if (legalPersons.size() > 0) {
			bills += "Legal persons:\n";
			for (LegalPerson legalPerson : legalPersons) {
				bills += legalPerson.generateBill() + "\n";
			}
		} else {
			bills += "No legal persons\n";
		}
		return bills;
	}

	public String displayLegalPersons() {
		if (legalPersons != null) {
			Collections.sort(legalPersons, SORT_BY_SIZE);
			String toDisplay = "";
			for (LegalPerson legalPerson : legalPersons) {
				toDisplay = toDisplay + legalPerson.getName() + ", number: " + legalPerson.getUsers().size() + "\n";
			}
			return toDisplay;
		} else {
			return "No legal persons";
		}
	}

	public boolean addUser(User user) {
		if (!users.contains(user)) {
			if (user instanceof PostpaidUser) {
				if (!(((PostpaidUser) user).getTariffPackage().isBusiness())) {
					users.add(user);
					user.setMobileOperator(this);
					return true;
				}
			} else if (user instanceof PrepaidUser) {
				users.add(user);
				user.setMobileOperator(this);
				return true;
			}
		}
		return false;
	}

	public boolean addLegalPerson(LegalPerson legalPerson) {
		if (!legalPersons.contains(legalPerson)) {
			legalPersons.add(legalPerson);
			return true;
		}
		return false;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<LegalPerson> getLegalPersons() {
		return legalPersons;
	}

	public void setLegalPersons(List<LegalPerson> legalPersons) {
		this.legalPersons = legalPersons;
	}

	public double getPriceMinute() {
		return priceMinute;
	}

	public void setPriceMinute(double priceMinute) {
		this.priceMinute = priceMinute;
	}

	public double getPriceMessage() {
		return priceMessage;
	}

	public void setPriceMessage(double priceMessage) {
		this.priceMessage = priceMessage;
	}

	public double getPriceMB() {
		return priceMB;
	}

	public void setPriceMB(double priceMB) {
		this.priceMB = priceMB;
	}

}
