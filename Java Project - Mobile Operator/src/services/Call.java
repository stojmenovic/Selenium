package services;

import user.User;

public class Call {
	private int duration;
	private User calledUser;
	
	public Call() {
	}
	
	public Call(int duration, User calledUser) {
		this.duration = duration;
		this.calledUser = calledUser;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public User getCalledUser() {
		return calledUser;
	}

	public void setCalledUser(User calledUser) {
		this.calledUser = calledUser;
	}
	
}
