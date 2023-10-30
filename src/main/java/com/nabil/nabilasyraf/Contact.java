package com.nabil.nabilasyraf;

public class Contact {

	private int userId;
	private String name;
	private String email;
	private String msg;
	private String phone;
	
	
	
	public Contact(int userId, String name, String email, String msg, String phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.msg = msg;
		this.phone = phone;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
