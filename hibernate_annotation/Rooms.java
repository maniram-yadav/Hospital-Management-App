package org.hospital.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rooms implements Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Room_Id")
	private int room_id;
	@Column(name="Room_Type")
	private String sltroomtype;
	@Column(name="Room_Charge")
	private int  txtcharge;
	
	
	
	public Rooms() {
		super();
	}
	public Rooms(String sltroomtype, int txtcharge) {
		super();
		this.sltroomtype = sltroomtype;
		this.txtcharge = txtcharge;
	}
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public String getSltroomtype() {
		return sltroomtype;
	}
	
	public void setSltroomtype(String sltroomtype) {
		this.sltroomtype = sltroomtype;
	}
	public int getTxtcharge() {
		return txtcharge;
	}
	public void setTxtcharge(int txtcharge) {
		this.txtcharge = txtcharge;
	}
	

}
