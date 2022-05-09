package net.java.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TINHTRANGTB")
public class TinhtrangTB {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
