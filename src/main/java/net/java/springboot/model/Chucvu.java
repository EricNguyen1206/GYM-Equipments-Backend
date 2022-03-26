package net.java.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CHUCVU")
public class Chucvu {
	@Id
	@Column(name = "IDROLE")
	private int IDROLE;
	private String ROLETITLE;
	
	public int getIDROLE() {
		return IDROLE;
	}
	public void setIDROLE(int id) {
		IDROLE = id;
	}
	public String getROLETITLE() {
		return ROLETITLE;
	}
	public void setROLETITLE(String title) {
		ROLETITLE = title;
	}
	@Override
	public String toString() {
		return "Role [IDROLE=" + IDROLE + ", ROLETITLE=" + ROLETITLE + ", getIDROLE()=" + getIDROLE()
				+ ", getROLETITLE()=" + getROLETITLE() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
