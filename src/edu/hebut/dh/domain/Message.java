package edu.hebut.dh.domain;

import java.io.Serializable;

public class Message implements Serializable {
	private String id;
	private String content;
	private java.util.Date time;
	private User user;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public java.util.Date getTime() {
		return time;
	}
	public void setTime(java.util.Date time) {
		this.time = time;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", content=" + content + ", time=" + time
				+ ", user=" + user + "]";
	}
	
}
