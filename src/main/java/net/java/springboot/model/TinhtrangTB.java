package net.java.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TINHTRANGTB")
public class TinhtrangTB {
	@Id
	@Column(name = "id", length = 3, nullable = false)
	private String id;
	@Column(name = "tinhtrang", length = 20, nullable = false)
	private String tinhtrang;
	public TinhtrangTB() {
		super();
	}
	public TinhtrangTB(String tinhtrang) {
		super();
		this.tinhtrang = tinhtrang;
	}
	public TinhtrangTB(TinhtrangTB tinhtrang) {
		super();
		this.tinhtrang = tinhtrang.getTinhtrang();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTinhtrang() {
		return tinhtrang;
	}
	public void setTinhtrang(String tinhtrang) {
		this.tinhtrang = tinhtrang;
	}
	@Override
	public String toString() {
		return "TinhtrangTB [id=" + id + ", tinhtrang=" + tinhtrang + "]";
	}
	
}
