package com.user.DAOImpl;
 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import javax.print.DocFlavor.STRING;

import com.user.Controller.UserIModule;
import com.user.Dao.UserInfoDAO;

 

public class UserInfoDaoImpl implements UserInfoDAO {

	public List<UserIModule> getUserInformation(String userInfo) {
	
		try {
			
		UserIModule user = new UserIModule();

		user.setUserName("Suaysh");
		user.setUserAddress("Pune");
		user.setUserContact(8888044);
		user.setUserSalary(70000);
		user.setUserEligibleForSalry(true);
		
		List<UserIModule> list = new ArrayList<UserIModule>();
		list.add(user);

		ListIterator<UserIModule> ltr = list.listIterator();
		 		
		
		while (ltr.hasNext()) {
		
			System.out.println("Employee List :"+ltr.next());
			

		}
		
				
		
	 	
		return list;

		} catch (Exception e) {

			System.out.println(e);
		}
		return null;

		
		}

	
	 

}
