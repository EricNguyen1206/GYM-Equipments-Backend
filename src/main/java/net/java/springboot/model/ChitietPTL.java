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
@Table(name = "CHITIETPTL")
@IdClass(ChitietPTLId.class)
public class ChitietPTL implements Serializable {
	@Id
	@Column(name = "MAPTL")
	private int maptl;
	
	@Id
	@Column(name = "MATB", nullable = false)
	private int matb;

	@Column(name = "GIA", nullable = false)
	private double gia;

	public ChitietPTL() {
		super();
	}
	public int getMaptl() {
		return maptl;
	}
	public void setMaptl(int maptl) {
		this.maptl = maptl;
	}
	public int getMatb() {
		return matb;
	}

	public void setMatb(int matb) {
		this.matb = matb;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}
	
}
