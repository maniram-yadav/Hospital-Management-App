package org.hospital.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Patient_History implements Serializable{
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="emp_id")
	private Employees employees;
	
	
	@ManyToOne
	@JoinColumn(name="p_id")
	private PersonInfo patientInfo;

	
	
	public Patient_History() {
		super();
	}

	public Patient_History(Date date, Employees employees, PersonInfo patientInfo) {
		super();
		this.date = date;
		this.employees = employees;
		this.patientInfo = patientInfo;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Employees getEmployees() {
		return employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	public PersonInfo getPatientInfo() {
		return patientInfo;
	}

	public void setPatientInfo(PersonInfo patientInfo) {
		this.patientInfo = patientInfo;
	}

	
	
}
