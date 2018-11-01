package org.hospital.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee_Salary {
	
	
	@Id
	@OneToOne
	@JoinColumn(name="Emp_Id")
	private Employees employees;
	
	private int salary;

	public Employees getEmployees() {
		return employees;
	}

	
	public Employee_Salary() {
		super();
	}


	public Employee_Salary(Employees employees, int salary) {
		super();
		this.employees = employees;
		this.salary = salary;
	}


	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	

}
