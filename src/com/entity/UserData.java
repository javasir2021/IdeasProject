package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity (name="USERDATA_ENTITY")
@Table (name="USER_TESTCYCLES")
public class UserData {
	@Id
	@GeneratedValue 
	int rowId;
	String userName;
	public int getRowId() {
		return rowId;
	}

	public void setRowId(int rowId) {
		this.rowId = rowId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public TestCycle getTestcycle() {
		return testcycle;
	}

	public void setTestcycle(TestCycle testcycle) {
		this.testcycle = testcycle;
	}

	String status;
	
	@OneToOne
	TestCycle testcycle;
}
