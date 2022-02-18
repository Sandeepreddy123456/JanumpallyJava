package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Register  {



	@Id
	private int id;
	private String userName;
	private String password;
	private String confirmPassword;
	private String email;
	//*******************************
//	private String oldPassword;
//	private String newPassword;
//	
//	public String getOldPassword() {
//		return oldPassword;
//	}
//	public void setOldPassword(String oldPassword) {
//		this.oldPassword = oldPassword;
//	}
//	public String getNewPassword() {
//		return newPassword;
//	}
//	public void setNewPassword(String newPassword) {
//		this.newPassword = newPassword;
//	}
	
	
	//*****************************************************************
	public Register() {
		
	}
	public Register(int id, String userName, String password, String confirmPassword, String Email,String oldPassword,String newPassword) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.email = Email;
//		this.oldPassword=oldPassword;
//		this.newPassword=newPassword;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String Email) {
		this.email = Email;
	}
	
	
	@Override
	public String toString() {
		return "Register [id=" + id + ", userName=" + userName + ", password=" + password + ", confirmPassword="
				+ confirmPassword + ", email=" + email 
				+ "]";
	}

	
	
	

}
