package org.hospital.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medicine_Sold {

	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int msold_id;
	
	private String med_name;
	private int qty;
	private int amount;
	
	public int getMsold_id() {
		return msold_id;
	}
	public void setMsold_id(int msold_id) {
		this.msold_id = msold_id;
	}
	public String getMed_name() {
		return med_name;
	}
	public void setMed_name(String med_name) {
		this.med_name = med_name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
}
