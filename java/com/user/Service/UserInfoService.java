package com.user.Service;

import java.util.List;

import com.user.Controller.UserIModule;
import com.user.DAOImpl.UserInfoDaoImpl;

public class UserInfoService {

	UserInfoService user;
	
	
	public String getUserDetails(String userInfo){

	 	UserInfoDaoImpl userDao = new UserInfoDaoImpl();
	
		userDao.getUserInformation(userInfo);
		
		return  userInfo;
		
	}
	
	
}
