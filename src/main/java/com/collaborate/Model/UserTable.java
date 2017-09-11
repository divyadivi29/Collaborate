package com.collaborate.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="UserTable_details")
public class UserTable {
    @Id
    private int UserTableId;
	private String FirstName,LastName,Password,EmailID,Role,Status,IsOnline;
	public int getUserTableId() {
		return UserTableId;
	}
	public void setUserTableId(int userTableId) {
		UserTableId = userTableId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getIsOnline() {
		return IsOnline;
	}
	public void setIsOnline(String isOnline) {
		IsOnline = isOnline;
	}
	
    

}
 