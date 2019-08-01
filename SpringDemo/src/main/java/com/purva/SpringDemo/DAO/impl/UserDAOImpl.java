package com.purva.SpringDemo.DAO.impl;

import java.util.ArrayList;
import java.util.List;

import com.purva.SpringDemo.DAO.UserDAO;

import USER.USER1;

public class UserDAOImpl implements UserDAO {
           
 private List<USER1> userList=new ArrayList<USER1>();
         
	public void adduser(USER1 user) {
		// TODO Auto-generated method stub
		userList.add(user);
		
		

	}

	public List<USER1> getAllUSER1() {
		// TODO Auto-generated method stub
		return userList;
	}

}
