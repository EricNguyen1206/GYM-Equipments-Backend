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
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String mapn;
	@Column(name = "MALTB")
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String maltb;
	@Column(name = "MAKV")
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String makv = "KHO1";
	@Column(name = "TINHTRANGTB")
	private int tinhtrangTb;
	
	public Thietbi() {
		super();
	}
	public Thietbi(@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String mapn,
			@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String maltb,
			@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String makv, int tinhtrangTb) {
		super();
		this.mapn = mapn;
		this.maltb = maltb;
		this.makv = makv;
		this.tinhtrangTb = tinhtrangTb;
	}

	public int getId() {
		return id;
	}
	public String getMapn() {
		return mapn;
	}
	public void setMapn(String mapn) {
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
	public int getTinhtrangTb() {
		return tinhtrangTb;
	}
	public void setTinhtrangTb(int tinhtrangTb) {
		this.tinhtrangTb = tinhtrangTb;
	}
	@Override
	public String toString() {
		return "Thietbi [id=" + id + ", mapn=" + mapn + ", maltb=" + maltb + ", makv=" + makv + ", tinhtrangTb="
				+ tinhtrangTb + "]";
	}
	
}
