package org.hospital.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Patient_Room  implements Serializable{

	@Id @GeneratedValue (strategy=GenerationType.AUTO)
	@Column(name="booking_id")
	
	private int id;
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="P_Id")
	private PersonInfo patientInfo;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="room_id")
	private Rooms rooms;
	
	
	
	
	public Patient_Room() {
		super();
	}
	public Patient_Room(Date date, PersonInfo patientInfo, Rooms rooms) {
		super();
		this.date = date;
		this.patientInfo = patientInfo;
		this.rooms = rooms;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public PersonInfo getPatientInfo() {
		return patientInfo;
	}
	public void setPatientInfo(PersonInfo patientInfo) {
		this.patientInfo = patientInfo;
	}
	public Rooms getRooms() {
		return rooms;
	}
	public void setRooms(Rooms rooms) {
		this.rooms = rooms;
	}
	
	
	
}
