package net.java.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROLES")
public class Roles {
	@Id
	@Column(name = "id", length = 3, nullable = false)
	private String id;

	@Column(name = "name", unique = true, length = 20)
	private String name;
	
	public Roles() {
		super();
	}
	public Roles(String name) {
		super();
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public String getRole() {
		return name;
	}
	public void setRole(String role) {
		this.name = role;
	}
	@Override
	public String toString() {
		return "Roles [id=" + id + ", name=" + name + "]";
	}
}
