package com.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.UserDao;
import com.entity.TestCycle;
import com.entity.UserData;
import com.service.TestCycleService;
import com.service.UserData_TestCycleService;
import com.service.UserService;



@Controller
public class ideasController {
	
	@Autowired
	TestCycleService testcycleservice; 
	@Autowired
	UserData_TestCycleService user_tc_service; 
	
	@Autowired
	UserService userservice;
	
	
	
		
	@RequestMapping(value="/tc2")
	public ModelAndView personPage() {
		return new ModelAndView("TestCycleForm", "testcycle", new TestCycle());
	}
	
	
	@RequestMapping(value="/")
	public String layout() {
		return "layout";
	}
	
	
	@RequestMapping(value="/tc")  
    private ModelAndView selectTag() {  
        ModelAndView mav = new ModelAndView("TestCycleForm");   //view name in jsp  
          
        Map<String,String > productsList = new HashMap<String,String>();  
        productsList.put("crm", "CRM");  
        productsList.put("scm", "SCM");  
        productsList.put("wms", "WMS");  
          
        mav.addObject("products11", productsList);  
        mav.addObject("testcycle11", new TestCycle());  
          
        return mav;  
    }  
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addTestCycle(@ModelAttribute(value="testcycle11") TestCycle testcycle11, BindingResult result) 
	{
		System.out.println("TestCycle:-  " +testcycle11.getCycleName());
		boolean saved=testcycleservice.addTestCycle(testcycle11);
		System.out.println("Data in Service class :" + testcycle11.getCycleName());
		ModelAndView mav = new ModelAndView("TestCycleForm");
		mav.addObject("save", saved);
		
		return mav;
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String getTestCycles(ModelMap mp)
	{
		//System.out.println("TestCycles in Controller "+ testcycleservice.getTestCycles().);
		List<TestCycle> tcs=testcycleservice.getTestCycles();
		           
		for (int i=0; i<tcs.size(); i++){
			TestCycle testcycle = (TestCycle) tcs.get(i);
			   System.out.println("ID "+testcycle.getCycleId()+" :: "+"Cycle Name "+testcycle.getCycleName()+" ::  "+"Product "+testcycle.getProduct());
			}
		
		mp.addAttribute("testcycleList", testcycleservice.getTestCycles());
		
		return "TestcyclesList";
	}
	
	
	@RequestMapping("/Assign_to_User/{cycleId}")
	public ModelAndView AssignUser(@PathVariable("cycleId") Integer cycleId )
	{
		ModelAndView mav = new ModelAndView("UserDataForm");
			         
		
		List<String> users=userservice.getUserNames();
		
		mav.addObject("usersList", users);
		
        mav.addObject("testcycleId", cycleId);
      
        mav.addObject("userdata", new UserData());
        
        return mav;
		
	}
	
	
	
	@RequestMapping(value = "/Assign_to_User/addUser", method = RequestMethod.POST)
	public String addTestCycleToUser(@ModelAttribute(value="userdata") UserData userdata, BindingResult result) 
	{
		System.out.println("TestCycle to User:  " +userdata.getTestcycle().getCycleId());
		System.out.println("User Name:  " +userdata.getUserName());
		
		user_tc_service.addUser_TestCycle(userdata);
		
		return "testjsp";
	}
	
	
	@RequestMapping(value="/userform")  
    private ModelAndView UserForm() {  
     
		ModelAndView mav = new ModelAndView("UserForm");   //view name in jsp  
    
		mav.addObject("userdata", new UserData());  
        return mav;  
    }
	
	
	@RequestMapping(value = "/addUserOnly", method = RequestMethod.POST)
	public String addUser(@ModelAttribute(value="userdata") UserData userdata, BindingResult result) 
	{
		
		userservice.addUser(userdata);
		
		return "testjsp";
	}
	
	
	@RequestMapping(value = "/userslist", method = RequestMethod.GET)
	public String getUserDetails(ModelMap mp)
	{
			
		mp.addAttribute("UsersList", userservice.getUsers());
		
		return "users_list";
	}
	
	
	@RequestMapping("/delete/{tcId}")
	public ModelAndView deleteTestCycle(@PathVariable("tcId") Integer tcId)
	{
		boolean deleted=testcycleservice.deleteTestCycles(tcId);
		
		ModelAndView mav = new ModelAndView("delete");
		mav.addObject("deleted", deleted);
		
		return mav;
		
	}
	
	@RequestMapping("/deleteUser/{uId}")
	public ModelAndView deleteUserData(@PathVariable("uId") Integer uId)
	{
		System.out.println(" User Controller "+uId);
		
		boolean deleted=userservice.deleteUser(uId);
		
		ModelAndView mav = new ModelAndView("delete");
		mav.addObject("deleted", deleted);
		
		return mav;
		
	}
	
	
	@RequestMapping("/updateUser/{uId}")
	public ModelAndView UpdateUserData(@PathVariable("uId") Integer uId)
	{
		System.out.println(" User Controller "+uId);
		
		
		//boolean updated=userservice.deleteUser(uId);
		
		ModelAndView mav = new ModelAndView("update");
		//mav.addObject("updated", updated);
		
		return mav;
		
	}
	
	
}
