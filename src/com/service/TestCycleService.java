package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.TestCycleDao;
import com.entity.TestCycle;



@Service
public class TestCycleService {

	@Autowired
	private TestCycleDao testcycledao; 
	
	
	public TestCycleDao getTestcycledao() {
		return testcycledao;
	}


	public void setTestcycledao(TestCycleDao testcycledao) {
		this.testcycledao = testcycledao;
	}

	@Transactional
	public boolean addTestCycle(TestCycle testcycle) {
	  boolean saved= testcycledao.addTestCycle(testcycle);
		return saved;
	}
	
	@Transactional
	public List<TestCycle> getTestCycles()
	{
		return testcycledao.getAllTestCycles();
		
	}
	
	
	@Transactional
	public boolean deleteTestCycles(Integer tcId) {
		boolean deleted=testcycledao.deleteTestCycle(tcId);
		return deleted;
	}
	
}
