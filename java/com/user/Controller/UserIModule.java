package com.user.Controller;

import java.util.List;

public class UserIModule  {

	String UserName;
	
	String UserAddress;
	int UserContact;
	int UserSalary;
	boolean UserEligibleForSalry;
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserAddress() {
		return UserAddress;
	}
	public void setUserAddress(String userAddress) {
		UserAddress = userAddress;
	}
	public int getUserContact() {
		return UserContact;
	}
	public void setUserContact(int userContact) {
		UserContact = userContact;
	}
	public int getUserSalary() {
		return UserSalary;
	}
	public void setUserSalary(int userSalary) {
		UserSalary = userSalary;
	}
	public boolean isUserEligibleForSalry() {
		return UserEligibleForSalry;
	}
	public void setUserEligibleForSalry(boolean userEligibleForSalry) {
		UserEligibleForSalry = userEligibleForSalry;
	}
	@Override
	public String toString() {
		return "UserIModule [UserName=" + UserName + ", UserAddress=" + UserAddress + ", UserContact=" + UserContact
				+ ", UserSalary=" + UserSalary + ", UserEligibleForSalry=" + UserEligibleForSalry + "]";
	}
	
	
}
