package com.tap.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	private int cid;
	private String name;
	private int salary;
	private String role;
    
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public Customer(int cid, String name, int salary, String role) {
		super();
		this.cid = cid;
		this.name = name;
		this.salary = salary;
		this.role = role;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", salary=" + salary + ", role=" + role + "]";
	}
	
	
}
