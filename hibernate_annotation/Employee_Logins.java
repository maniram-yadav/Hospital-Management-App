package org.hospital.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee_Logins {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int elogin_id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="emp_id_fk",unique=true)
	private Employees employees;
	
	private String userid;
	private String password;

	private String position;

	public int getElogin_id() {
		return elogin_id;
	}
	public void setElogin_id(int elogin_id) {
		this.elogin_id = elogin_id;
	}
	public Employees getEmployees() {
		return employees;
	}
	public void setEmployees(Employees employees) {
		this.employees = employees;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Employee_Logins(Employees employees, String userid, String password, String position) {
		super();
		this.employees = employees;
		this.userid = userid;
		this.password = password;
		this.position = position;
	}
	public Employee_Logins() {
		super();
	}
	
	
}
