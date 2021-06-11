package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.TestCycle;



@Repository
public class TestCycleDao  {

	@Autowired
    private SessionFactory sessionFactory;
	
	public boolean addTestCycle(TestCycle testcycle) {
		
		System.out.println("TestCycle  in DAO classes1: "+testcycle.getCycleName());
		
		try{
		this.sessionFactory.getCurrentSession().save(testcycle);
		return true;
		
		}
		catch(Exception e)
		{
			System.out.println("Exception While saving data in DB: "+e);
			return false;
		}
	}
	
	
	
	public List<TestCycle> getAllTestCycles() {
		System.out.println("OK in DAO");
		return this.sessionFactory.getCurrentSession().createQuery("from TESTCYCLE_ENTITY").list();
		
	}
	
	
	
	
	public boolean deleteTestCycle(Integer tcId) {
		TestCycle testcycle = (TestCycle) sessionFactory.getCurrentSession().load(TestCycle.class, tcId);
        if (null != testcycle) {
        	this.sessionFactory.getCurrentSession().delete(testcycle);
        	return true;
        }
        
	     return false;
	}
	
	

}