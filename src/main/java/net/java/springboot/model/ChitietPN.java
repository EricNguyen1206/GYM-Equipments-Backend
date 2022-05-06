package net.java.springboot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "CHITIETPN")
public class ChitietPN implements Serializable {
	@Id
	@Column(name = "MAPN", length = 5)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String mapn;

	@Id
	@Column(name = "MALTB", length = 5)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String maltb;

	@Column(name = "SOLUONG", nullable = false)
	private int soluong;

	@Column(name = "GIA", nullable = false)
	private double gia;

	public ChitietPN() {
		super();
	}

	public ChitietPN(@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String mapn,
			@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String maltb, int soluong, double gia) {
		super();
		this.mapn = mapn;
		this.maltb = maltb;
		this.soluong = soluong;
		this.gia = gia;
	}

	public String getMapn() {
		return mapn;
	}

	public void setMapn(String mapn) {
		this.mapn = mapn;
	}

	public String getMatb() {
		return maltb;
	}

	public void setMatb(String matb) {
		this.maltb = matb;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}
}
