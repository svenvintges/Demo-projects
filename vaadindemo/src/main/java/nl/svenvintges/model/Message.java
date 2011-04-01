package nl.svenvintges.model;

import java.util.Date;

public class Message {

	
	private Date registeredOn;
	private String content;
	private String summary;
	private String handledByUser;

	public Date getRegisteredOn() {
		return registeredOn;
	}
	public void setRegisteredOn(Date registeredOn) {
		this.registeredOn = registeredOn;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getHandledByUser() {
		return handledByUser;
	}
	public void setHandledByUser(String handledByUser) {
		this.handledByUser = handledByUser;
	}


}
