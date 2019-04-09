package user;

import java.util.ArrayList;
import java.util.List;

import main.MobileOperator;
import services.Call;
import services.InternetSession;
import services.Message;

public abstract class User {
	private int id;
	private MobileOperator mobileOperator;
	private List<Call> calls;
	private List<Message> messages;
	private List<InternetSession> internetSessions;
	
	public User() {
		calls = new ArrayList<>();
		messages = new ArrayList<>();
		internetSessions = new ArrayList<>();
	}
	
	public User(int id) {
		this.id = id;
		calls = new ArrayList<>();
		messages = new ArrayList<>();
		internetSessions = new ArrayList<>();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MobileOperator getMobileOperator() {
		return mobileOperator;
	}

	public void setMobileOperator(MobileOperator mobileOperator) {
		this.mobileOperator = mobileOperator;
	}

	public List<Call> getCalls() {
		return calls;
	}

	public void setCalls(List<Call> calls) {
		this.calls = calls;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public List<InternetSession> getInternetSessions() {
		return internetSessions;
	}

	public void setInternetSessions(List<InternetSession> internetSessions) {
		this.internetSessions = internetSessions;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof User) {
			if (this.id == ((User)obj).getId()) {
				return true;
			}
		}
		return false;
	}

	public abstract boolean makeCall(User user, int minutes);
	public abstract boolean sendMessage(User user, String messageText);
	public abstract boolean surfOnInternet(String url, int MB);
}
