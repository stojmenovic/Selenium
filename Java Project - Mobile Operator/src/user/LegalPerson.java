package user;

import java.util.ArrayList;
import java.util.List;

public class LegalPerson {
	private int id;
	private String name;
	private List<PostpaidUser> users;

	public LegalPerson() {
		users = new ArrayList<>();
	}

	public LegalPerson(int id, String name) {
		this.id = id;
		this.name = name;
		users = new ArrayList<>();
	}

	public List<PostpaidUser> getUsers() {
		return users;
	}

	public void setUsers(List<PostpaidUser> users) {
		this.users = users;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof LegalPerson) {
			return this.id == ((LegalPerson) obj).id;
		}
		return false;
	}

	public boolean addUser(PostpaidUser user) {
		if (user.getTariffPackage().isBusiness()) {
			if (!users.contains(user)) {
				users.add(user);
				return true;
			}
		}
		return false;
	}

	public String generateBill() {
		String bill = "Legal person name: " + name + "\n";
		double total = 0;
		for (PostpaidUser user : users) {
			total += user.forPayment();
			bill = bill + "Number of users: " + users.size() + "\n";
			bill = bill + "Total: " + total;
			return bill;
		}
		return bill + "No users";
	}

}
