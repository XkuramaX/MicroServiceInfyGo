package com.infygouser.rest.objs;

public class LoginForm {
	private String id;
	private String password;
	public LoginForm() {
		
	}
	public LoginForm(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setId(String id) {
		this.id = id;
	}
}
