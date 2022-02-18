package com.example.signin;

public class passwordEx {

     public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	private int id;
	private String oldPassword;
	private String newPassword;
	public passwordEx() {
		super();
		// TODO Auto-generated constructor stub
	}
	public passwordEx(String oldPassword, String newPassword,int id) {
		super();
		this.oldPassword = oldPassword;
		this.newPassword = newPassword;
		this.id=id;
	}
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
	@Override
	public String toString() {
		return "passwordEx [id=" + id + ", oldPassword=" + oldPassword + ", newPassword=" + newPassword + "]";
	}
	
	

}
