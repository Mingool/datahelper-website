package edu.hebut.dh.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	private String id;
	private String username;
	private String password;
	private String nickname;
	private String email;
	private String telephone;
	private Date time;
	private String token;
	private UserDB userdb;
	
	
	public UserDB getUserdb() {
		return userdb;
	}
	public void setUserdb(UserDB userdb) {
		this.userdb = userdb;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", nickname=" + nickname + ", email=" + email
				+ ", telephone=" + telephone + ", time=" + time + ", token="
				+ token + ", userdb=" + userdb + "]";
	}
	
	
}
