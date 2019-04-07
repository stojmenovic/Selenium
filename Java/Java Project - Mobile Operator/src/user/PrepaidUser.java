package user;

import services.Call;
import services.InternetSession;
import services.Message;

public class PrepaidUser extends User {
	private double credit;

	public PrepaidUser() {
		super();
	}

	public PrepaidUser(int id, double credit) {
		super(id);
		this.credit = credit;
	}

	@Override
	public boolean makeCall(User user, int minutes) {
		if (user != this) {
			if ((minutes * getMobileOperator().getPriceMinute()) <= credit) {
				getCalls().add(new Call(minutes, user));
				credit -= minutes * getMobileOperator().getPriceMinute();
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean sendMessage(User user, String messageText) {
		if (user != this) {
			if ((getMobileOperator().getPriceMessage()) <= credit) {
				getMessages().add(new Message(messageText, user));
				credit -= getMobileOperator().getPriceMessage();
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean surfOnInternet(String url, int MB) {
		if ((getMobileOperator().getPriceMB()) <= credit) {
			getInternetSessions().add(new InternetSession(MB, url));
			credit -= getMobileOperator().getPriceMB();
			return true;
		}
		return false;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

}
