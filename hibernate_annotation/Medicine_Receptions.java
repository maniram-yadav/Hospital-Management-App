package org.hospital.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Medicine_Receptions implements Serializable {

	
	@Id  @GeneratedValue(strategy=GenerationType.AUTO)
	private int receipt_id;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="madicine_sold")
	private List<Medicine_Sold> medicine_Sold;
	
	
     @ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name="pid")
     private PersonInfo patientInfo;
     
     @Temporal(TemporalType.TIME.TIMESTAMP)
     private Date date;
     
     private int bill_amount;

	public int getReceipt_id() {
		return receipt_id;
	}

	public void setReceipt_id(int receipt_id) {
		this.receipt_id = receipt_id;
	}

	public PersonInfo getPatientInfo() {
		return patientInfo;
	}

	public List<Medicine_Sold> getMedicine_Sold() {
		return medicine_Sold;
	}

	public void setMedicine_Sold(List<Medicine_Sold> medicine_Sold) {
		this.medicine_Sold = medicine_Sold;
	}

	public int getBill_amount() {
		return bill_amount;
	}

	public void setBill_amount(int bill_amount) {
		this.bill_amount = bill_amount;
	}

	public void setPatientInfo(PersonInfo patientInfo) {
		this.patientInfo = patientInfo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Medicine_Receptions(List<Medicine_Sold> medicine_Sold, PersonInfo patientInfo, Date date) {
		super();
		this.medicine_Sold = medicine_Sold;
		this.patientInfo = patientInfo;
		this.date = date;
	}

	public Medicine_Receptions() {
		super();
	}

     
     
}
