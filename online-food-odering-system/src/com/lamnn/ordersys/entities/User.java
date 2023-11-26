package com.lamnn.ordersys.entities;

public class User {
	private String name;
	private String email;
	private String password;
	private String constactInfo;
	
	public User(String name, String email, String password, String constactInfo) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.constactInfo = constactInfo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConstactInfo() {
		return constactInfo;
	}
	public void setConstactInfo(String constactInfo) {
		this.constactInfo = constactInfo;
	}
	
	public void register() {
		
	}
	
	public void login() {
		
	}
	
	public void updateProfile() {
		
	}
	
	public void placeOrder() {
	
	}
	
	public void makePayment() {
		
	}
}
