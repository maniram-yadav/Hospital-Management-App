package org.hospital.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notices {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int notice_id;
	
	@Column(name="Description")
	private String description;
	
	private Date date;

	private  boolean enableStatus;

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isEnableStatus() {
		return enableStatus;
	}

	public void setEnableStatus(boolean enableStatus) {
		this.enableStatus = enableStatus;
	}

	public int getNotice_id() {
		return notice_id;
	}

	public void setNotice_id(int notice_id) {
		this.notice_id = notice_id;
	}

	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Notices(String description, Date date) {
		super();
		description = description;
		this.date = date;
	}

	public Notices() {
		super();
	}
     
	
		
}
