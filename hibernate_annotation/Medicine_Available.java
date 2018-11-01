package org.hospital.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medicine_Available implements Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	
	
	private int m_id;
	
	@Column(name="name")
	private String txtmname;
	
	@Column(name="price")
	private  int price;
	
	@Column(name="qty")
	private int qty;
	
	@Column(name="Type")
	private String txttype; // Type of medicine i.e capsules , Syrup , bandage etc.
		
	
	public  Medicine_Available() {
		super();
	}


	public Medicine_Available(String txtmname, int price, int qty, String txttype) {
		super();
		this.txtmname = txtmname;
		this.price = price;
		this.qty = qty;
		this.txttype = txttype;
	}


	public int getM_id() {
		return m_id;
	}


	public void setM_id(int m_id) {
		this.m_id = m_id;
	}


	public String getTxtmname() {
		return txtmname;
	}


	public void setTxtmname(String txtmname) {
		this.txtmname = txtmname;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public String getTxttype() {
		return txttype;
	}


	public void setTxttype(String txttype) {
		this.txttype = txttype;
	}
}
