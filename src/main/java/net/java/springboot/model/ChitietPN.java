package net.java.springboot.model;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "CHITIETPN")
public class ChitietPN  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@OneToOne(targetEntity = Phieunhap.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_CHITIETPN_REFERENCE_PHIEUNHAP", referencedColumnName = "MAPN")
//	@Column(name = "MAPN", length = 10, nullable = false)
//	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String MAPN;
	
	@Id
	@OneToOne(targetEntity = Thietbi.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_CHITIETPN_REFERENCE_THIETBI", referencedColumnName = "MATB")
//	@Column(name = "MATB", length = 10, nullable = false)
//	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String MATB;

	@Column(name = "SOLUONG", nullable = false)
	private int SOLUONG;

	@Column(name = "GIA", nullable = false)
	private double GIA;

	public ChitietPN() {
		super();
	}

	public ChitietPN(@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String mAPN,
			@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String mATB, int sOLUONG, double gIA) {
		super();
		MAPN = mAPN;
		MATB = mATB;
		SOLUONG = sOLUONG;
		GIA = gIA;
	}

	public String getMAPN() {
		return MAPN;
	}

	public void setMAPN(String mAPN) {
		MAPN = mAPN;
	}

	public String getMATB() {
		return MATB;
	}

	public void setMATB(String mATB) {
		MATB = mATB;
	}

	public int getSOLUONG() {
		return SOLUONG;
	}

	public void setSOLUONG(int sOLUONG) {
		SOLUONG = sOLUONG;
	}

	public double getGIA() {
		return GIA;
	}

	public void setGIA(double gIA) {
		GIA = gIA;
	}


	@Override
	public String toString() {
		return "ChitietPN [MAPN=" + MAPN + ", MATB=" + MATB + ", SOLUONG=" + SOLUONG + ", GIA="
				+ GIA + "]";
	}
}
