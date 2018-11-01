package org.hospital.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employees implements Serializable{

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int eid;
	@Column(name="E_Name",length=50)
	private String txtname;
	@Column(name="E_Salary")
	private int txtsalary;
	@Column(name="Sex",length=6)
	private String  radsex;
	@Column(name="Email",unique=true)
	private String txtemail;
	@Column(name="Contact",length=10)
	private String txtcontact;
	@Column(name="Address")
	private String txtaddress;
	@Column(name="City")
	private String  txtcity;
	@Column(name="State")
	private String txtstate;
	@Column(name="Country")
	private String  txtcountry;
	@Column(name="Pincode",length=6)
	private int txtpincode;
	
	
	public Employees() {
		super();
	}
	
	
	
	public Employees(String txtname, int txtsalary, String radsex, String txtemail, String txtcontact,
			String txtaddress, String txtcity, String txtstate, String txtcountry, int txtpincode) {
		super();
		this.txtname = txtname;
		this.txtsalary = txtsalary;
		this.radsex = radsex;
		this.txtemail = txtemail;
		this.txtcontact = txtcontact;
		this.txtaddress = txtaddress;
		this.txtcity = txtcity;
		this.txtstate = txtstate;
		this.txtcountry = txtcountry;
		this.txtpincode = txtpincode;
	}



	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getTxtemail() {
		return txtemail;
	}

	public void setTxtemail(String txtemail) {
		this.txtemail = txtemail;
	}

	public String getTxtcontact() {
		return txtcontact;
	}

	public void setTxtcontact(String txtcontact) {
		this.txtcontact = txtcontact;
	}

	public String getTxtname() {
		return txtname;
	}
	public void setTxtname(String txtname) {
		this.txtname = txtname;
	}
	public int getTxtsalary() {
		return txtsalary;
	}
	public void setTxtsalary(int txtsalary) {
		this.txtsalary = txtsalary;
	}
	public String getRadsex() {
		return radsex;
	}
	public void setRadsex(String radsex) {
		this.radsex = radsex;
	}
	public String getTxtaddress() {
		return txtaddress;
	}
	public void setTxtaddress(String txtaddress) {
		this.txtaddress = txtaddress;
	}
	public String getTxtcity() {
		return txtcity;
	}
	public void setTxtcity(String txtcity) {
		this.txtcity = txtcity;
	}
	public String getTxtstate() {
		return txtstate;
	}
	public void setTxtstate(String txtstate) {
		this.txtstate = txtstate;
	}
	public String getTxtcountry() {
		return txtcountry;
	}
	public void setTxtcountry(String txtcountry) {
		this.txtcountry = txtcountry;
	}
	public int getTxtpincode() {
		return txtpincode;
	}
	public void setTxtpincode(int txtpincode) {
		this.txtpincode = txtpincode;
	}
	
	
	
}
