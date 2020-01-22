package com.user.Dao;

import java.util.List;

import com.user.Controller.UserIModule;

public interface UserInfoDAO {

	
	public List<UserIModule> getUserInformation(String userInfo);
	
}
