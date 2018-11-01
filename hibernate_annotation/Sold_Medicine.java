package org.hospital.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Sold_Medicine implements Serializable {

	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int sold_med_id;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="reception_id")
	private Medicine_Receptions reception_id;
	@Column(name="name")
	private String txtmname;
	
	@Column(name="price")
	private  int price;
	
	@Column(name="qty")
	private int qty;
	
	
	@Column(name="amount")
	private int amount;


	public int getSold_med_id() {
		return sold_med_id;
	}


	public void setSold_med_id(int sold_med_id) {
		this.sold_med_id = sold_med_id;
	}


	public Medicine_Receptions getReception_id() {
		return reception_id;
	}


	public void setReception_id(Medicine_Receptions reception_id) {
		this.reception_id = reception_id;
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


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public Sold_Medicine(Medicine_Receptions reception_id, String txtmname, int price, int qty, int amount) {
		super();
		this.reception_id = reception_id;
		this.txtmname = txtmname;
		this.price = price;
		this.qty = qty;
		this.amount = amount;
	}

	public Sold_Medicine() {
		super();
	}
	

	
}
