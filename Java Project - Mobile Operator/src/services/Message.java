package services;

import user.User;

public class Message {
	private String text;
	private User messagedUser;
	
	public Message() {
	}

	public Message(String text, User messagedUser) {
		this.text = text;
		this.messagedUser = messagedUser;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public User getMessagedUser() {
		return messagedUser;
	}

	public void setMessagedUser(User messagedUser) {
		this.messagedUser = messagedUser;
	}
	
}
