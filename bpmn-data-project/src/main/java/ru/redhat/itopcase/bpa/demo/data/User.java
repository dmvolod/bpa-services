package ru.redhat.itopcase.bpa.demo.data;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 8078075631125769223L;
	
	private String userId;
	private String userName;
	
	public User() {
	}
	
	public User(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
