package com.example.signin;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
public class Signin {

	@Id
	private int id;
	private String email;
	private String password;
	
	Signin(){
		super();	
	}
	
	public Signin(int id, String Email, String password) {
		super();
		this.id = id;
		this.email = Email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String Email) {
		this.email = Email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Signin [id=" + id + ", email=" + email + ", password=" + password + "]";
	}

}
