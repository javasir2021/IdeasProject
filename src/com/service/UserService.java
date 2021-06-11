package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.dao.UserData_TestCyclesDao;
import com.entity.TestCycle;
import com.entity.UserData;


@Service
public class UserService {
	
	@Autowired
	UserDao userdao;
	
	@Transactional
  public void addUser(UserData userdata) {
		
		userdao.addUser(userdata);
		
	}

	
	@Transactional
	public List<UserData> getUsers()
	{
		return userdao.getAllUsers();
		
		
	}
	
	@Transactional
	public List<String> getUserNames()
	{
		return userdao.getAllUserNames();
			
	}
	
	@Transactional
	public boolean deleteUser(Integer uId) {
		System.out.println(" User service "+uId);
		boolean deleted=userdao.deleteUser(uId);
		return deleted;
	}
	
	
}
