package com.lti.core.entities;

import javax.persistence.*;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity(name="Admin")
@Table(name="ADMINREG")
public class Admin {
	@Id
	@Column(name="ADMIN_ID")
	private int adminId;
	@Column(name="PHONE_NUM")
	private long phoneNum;
	@Column(name="PASSWORD")
	private String pass;
	@Column(name="EMAIL")
	private String email;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="COMPANY_NAME")
	private String company_name;
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getcompany_name() {
		return company_name;
	}
	public void setcompany_name(String company_name) {
		this.company_name = company_name;
	}
	
	
	
	public Admin() {
		System.out.println("object created");
	}
	
	public Admin(int adminId, long phoneNum, String pass, String email, String firstName, String lastName,
			String company_name) {
		super();
		this.adminId = adminId;
		this.phoneNum = phoneNum;
		this.pass = pass;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.company_name = company_name;
	}
	@Override
	public String toString() {
		return "AdminEntity [adminId=" + adminId + ", phoneNum=" + phoneNum + ", pass=" + pass + ", email=" + email
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", company_name=" + company_name + "]";
	}
	
	
}
