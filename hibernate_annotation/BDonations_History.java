package org.hospital.beans;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BDonations_History {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="B_Group")
	private String Blood_group;
	@Column(name="Date")
	private Date date;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Person_Id")
	private PersonInfo personInfo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBlood_group() {
		return Blood_group;
	}

	public void setBlood_group(String blood_group) {
		Blood_group = blood_group;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

	public BDonations_History(String blood_group, Date date, PersonInfo personInfo) {
		super();
		Blood_group = blood_group;
		this.date = date;
		this.personInfo = personInfo;
	}

	public BDonations_History() {
		super();
	}

	
	
	
}
