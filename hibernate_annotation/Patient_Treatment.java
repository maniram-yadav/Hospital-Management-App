package org.hospital.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Patient_Treatment {

	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="pid_fk")
	
	private PersonInfo patientInfo;
	
	private int amount_paid;
	
	private String description;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PersonInfo getPatientInfo() {
		return patientInfo;
	}
	public void setPatientInfo(PersonInfo patientInfo) {
		this.patientInfo = patientInfo;
	}
	public int getAmount_paid() {
		return amount_paid;
	}
	public void setAmount_paid(int amount_paid) {
		this.amount_paid = amount_paid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Patient_Treatment(PersonInfo patientInfo, int amount_paid, String description) {
		super();
		this.patientInfo = patientInfo;
		this.amount_paid = amount_paid;
		this.description = description;
	}
	public Patient_Treatment() {
		super();
	}
	
	
	
}
