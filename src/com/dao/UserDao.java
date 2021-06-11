package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.TestCycle;
import com.entity.UserData;

@Repository
public class UserDao {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Autowired
	UserData userdata;
	
	public void addUser(UserData u) {
		
			
		try{
		this.sessionFactory.getCurrentSession().save(u);
			}
		catch(Exception e)
		{
			System.out.println("Exception While saving data in DB: "+e);
		}
	}
	
	
	public List<UserData> getAllUsers() {
		
		return this.sessionFactory.getCurrentSession().createQuery("from USERDATA_ENTITY").list();
		
	}
	
	
    public List<String> getAllUserNames() {
		
		return this.sessionFactory.getCurrentSession().createQuery("select userName from USERDATA_ENTITY").list();
		
	}
    
    
    public boolean deleteUser(Integer uId) {
    	
    	UserData userdata = (UserData) sessionFactory.getCurrentSession().load(UserData.class, uId);
        if (null != userdata) {
        	this.sessionFactory.getCurrentSession().delete(userdata);
        	return true;
        }
        
	     return false;
	}
	
  /* public boolean UpdateUser(Integer uId, UserData u) {
    	
    	UserData userdata = (UserData) sessionFactory.getCurrentSession().load(UserData.class, uId);
                userdata.setUserName(u.guserName);
                userdata.setStatus(status);
                userdata.setTestcycle(testcycle);
                
                
        	this.sessionFactory.getCurrentSession().delete(userdata);
        	return true;
        }
        
	     return false;
	}
    */
    
}
