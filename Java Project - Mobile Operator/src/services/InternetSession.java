package services;

public class InternetSession {
	private int MBs;
	private String url;
	
	public InternetSession() {
	}

	public InternetSession(int mBs, String url) {
		MBs = mBs;
		this.url = url;
	}

	public int getMBs() {
		return MBs;
	}

	public void setMBs(int mBs) {
		MBs = mBs;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
