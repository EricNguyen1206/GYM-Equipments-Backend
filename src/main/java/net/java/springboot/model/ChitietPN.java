package net.java.springboot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "CHITIETPN")
@IdClass(ChitietPNId.class)
public class ChitietPN implements Serializable {
	@Id
	@Column(name = "MAPN")
	private int mapn;

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

	@Override
	public String toString() {
		return "ChitietPN [mapn=" + mapn + ", maltb=" + maltb + ", soluong=" + soluong + ", gia=" + gia + "]";
	}
}
