package org.hospital.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

	@Id
	private String depart_id;
	private String description;
	public String getDepart_id() {
		return depart_id;
	}
	public void setDepart_id(String depart_id) {
		this.depart_id = depart_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Department(String depart_id, String description) {
		super();
		this.depart_id = depart_id;
		this.description = description;
	}
	public Department() {
		super();
	}
	

}
