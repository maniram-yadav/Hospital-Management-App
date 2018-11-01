package org.hospital.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Blood_Available {
	
	@Id
	private int id;
	
	private String B_Group;
	
	@Column(name="Packet")
	private int available;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getB_Group() {
		return B_Group;
	}
	public void setB_Group(String b_Group) {
		B_Group = b_Group;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	
	public Blood_Available(int id, String b_Group, int available) {
		super();
		this.id = id;
		B_Group = b_Group;
		this.available = available;
	}
	public Blood_Available() {
		super();
	}

	
}
