package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity (name="TESTCYCLE_ENTITY")
@Table (name="TESTCYCLE_DETAILS")
public class TestCycle {
     @Id
	int cycleId;
	String cycleName;
	String product;
	public int getCycleId() {
		return cycleId;
	}
	public void setCycleId(int cycleId) {
		this.cycleId = cycleId;
	}
	public String getCycleName() {
		return cycleName;
	}
	public void setCycleName(String cycleName) {
		this.cycleName = cycleName;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}    
	
}
