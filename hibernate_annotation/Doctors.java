package org.hospital.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Doctors {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int doc_id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Doctor_Id",unique=true)
	private Employees employees;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="department_id")
	private Department department;
	
	
	
	public int getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	public Employees getEmployees() {
		return employees;
	}
	public void setEmployees(Employees employees) {
		this.employees = employees;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Doctors(Employees employees, Department department) {
		super();
		this.employees = employees;
		this.department = department;
	}
	public Doctors() {
		super();
	}
	
	
}
