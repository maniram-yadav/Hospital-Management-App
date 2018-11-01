package org.hospital.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class NurseAllotments implements Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int allot_id;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="room_id_fk")
	
	private Rooms rooms;
	
	
	private Date date;


	public int getAllot_id() {
		return allot_id;
	}


	public void setAllot_id(int allot_id) {
		this.allot_id = allot_id;
	}


	public Rooms getRooms() {
		return rooms;
	}


	public void setRooms(Rooms rooms) {
		this.rooms = rooms;
	}


	public Date getDate() {
		return date;
	}
	


	public void setDate(Date date) {
		this.date = date;
	}


	public NurseAllotments(Rooms rooms, Date date) {
		super();
		this.rooms = rooms;
		this.date = date;
	}


	public NurseAllotments() {
		super();
	}

	
	
	
}
