package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.excption.PasswordErrorException;
import com.excption.UserNotFoundException;

public class UserManager {
    public void login(String username,String password)  
    {  
           if(!"admin".equals(username))  
           {  
                  throw new UserNotFoundException();  
           }  
             
           if(!"admin".equals(password))  
           {  
                  throw new PasswordErrorException();  
           }  
    }

	public static UserManager getInstance() {
		// TODO Auto-generated method stub
		UserManager userManager = new UserManager();
		return userManager;
	}  
	
	public List<?> findAllUserList() {
		// TODO Auto-generated method stub
		List<?> list = new ArrayList<>();
		return list;
	}
	
	
	public void deleteUsers(String[] userIdList) {
		// TODO Auto-generated method stub
		System.out.println("delete a user success!");
	}
	
	public void addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("add a user success!");
	}
	
	public void modifyUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("modify a user success!");
	}
	
	public User findUserById(String id) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setId("1001");
		user.setCreateDate(new Date());
		return user;
	}
	
}
