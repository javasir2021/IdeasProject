package com.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.entity.UserData;


@Repository
public class UserData_TestCyclesDao {

	
	@Autowired
    private SessionFactory sessionFactory;
	
	public void addUser_TestCycle(UserData userdata) {
		
		
		
		try{
		this.sessionFactory.getCurrentSession().save(userdata);
		
		}
		catch(Exception e)
		{
			System.out.println("Exception While saving data in DB: "+e);
		}
	}
	
	
}
