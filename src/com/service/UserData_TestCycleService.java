package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserData_TestCyclesDao;
import com.entity.UserData;


@Service
public class UserData_TestCycleService {

	@Autowired
	UserData_TestCyclesDao user_tc_dao;
	
	@Transactional
  public void addUser_TestCycle(UserData userdata) {
		
	user_tc_dao.addUser_TestCycle(userdata);
		
		
	}
	
}
