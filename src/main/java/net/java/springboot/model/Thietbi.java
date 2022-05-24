package net.java.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "THIETBI")
public class Thietbi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "MAPN")
	private int mapn;
	@Column(name = "MALTB")
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String maltb;
	@Column(name = "MAKV")
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String makv = "KHO1";
	@Column(name = "TINHTRANGTB")
	private String tinhtrangTb;
	
	public Thietbi() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMapn() {
		return mapn;
	}
	public void setMapn(int mapn) {
		this.mapn = mapn;
	}
	public String getMaltb() {
		return maltb;
	}
	public void setMaltb(String maltb) {
		this.maltb = maltb;
	}
	public String getMakv() {
		return makv;
	}
	public void setMakv(String makv) {
		this.makv = makv;
	}
	public String getTinhtrangTb() {
		return tinhtrangTb;
	}
	public void setTinhtrangTb(String tinhtrangTb) {
		this.tinhtrangTb = tinhtrangTb;
	}
}
