package org.hospital.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PersonInfo implements Serializable{
	

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	@Column(name="P_Name",length=50)
	private String txtname;
	@Column(name="Sex",length=6)
	private String  radsex;
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
	
	
	
	public PersonInfo() {
		super();
	}
	public PersonInfo(String txtname, String radsex, String txtcontact, String txtaddress, String txtcity,
			String txtstate, String txtcountry, int txtpincode) {
		super();
		this.txtname = txtname;
		this.radsex = radsex;
		this.txtcontact = txtcontact;
		this.txtaddress = txtaddress;
		this.txtcity = txtcity;
		this.txtstate = txtstate;
		this.txtcountry = txtcountry;
		this.txtpincode = txtpincode;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getTxtname() {
		return txtname;
	}
	public void setTxtname(String txtname) {
		this.txtname = txtname;
	}
	public String getRadsex() {
		return radsex;
	}
	public void setRadsex(String radsex) {
		this.radsex = radsex;
	}
	public String getTxtcontact() {
		return txtcontact;
	}
	
	public void setTxtcontact(String txtcontact) {
		this.txtcontact = txtcontact;
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
