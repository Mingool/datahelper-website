package edu.hebut.dh.domain;

import java.io.Serializable;
import java.util.Date;

public class UserDB implements Serializable {
	private String id;
	private String name;
	private String username;
	private String password;
	private Date time;
	private User userinfo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public User getUserinfo() {
		return userinfo;
	}
	public void setUserinfo(User userinfo) {
		this.userinfo = userinfo;
	}
	@Override
	public String toString() {
		return "UserDB [id=" + id + ", name=" + name + ", username=" + username
				+ ", password=" + password + ", time=" + time + ", userinfo="
				+ userinfo + "]";
	}
	
	
}
