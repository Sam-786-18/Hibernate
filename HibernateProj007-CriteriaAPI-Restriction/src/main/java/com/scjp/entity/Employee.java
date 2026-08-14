package com.scjp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee {
	
	/*
	 * @GeneratedValue(strategy = GenerationType.AUTO,generator = "empId_seq")//sequence is created 
	 * 
	 * 
	 * @SequenceGenerator(name="empId_seq",sequenceName = "empId_seq",initialValue =
	 * 1, allocationSize = 1)
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//1,2,3,4,and sequence is not created
	private Long empId;
	@Column(name = "name")
	private String ename;
	@Column(name = "job")
	private String job;
	@Column(name = "sal")
	private Double salary;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", job=" + job + ", salary=" + salary + "]";
	}

}
