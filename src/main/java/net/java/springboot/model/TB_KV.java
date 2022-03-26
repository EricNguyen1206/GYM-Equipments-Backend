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
@Table(name = "TB_KV")
public class TB_KV implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@OneToOne(targetEntity = Khuvuc.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_TBKV_REFERENCE_THIETBI", referencedColumnName = "MAKV")
//	@Column(name = "MAKV", length = 10, nullable = false)
//	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String MAKV;
	
	@Id
	@OneToOne(targetEntity = Thietbi.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_TBKV_REFERENCE_KHUVUC", referencedColumnName = "MATB")
//	@Column(name = "MATB", length = 10, nullable = false)
//	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String MATB;

	@Column(name = "SOLUONG", nullable = false)
	private int SOLUONG;

	public TB_KV() {
		super();
	}

	public TB_KV(@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String mAKV,
			@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String mATB, int sOLUONG) {
		super();
		MAKV = mAKV;
		MATB = mATB;
		SOLUONG = sOLUONG;
	}

	public String getMAKV() {
		return MAKV;
	}

	public void setMAKV(String mAKV) {
		MAKV = mAKV;
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

	@Override
	public String toString() {
		return "TB_KV [MAKV=" + MAKV + ", MATB=" + MATB + ", SOLUONG=" + SOLUONG + "]";
	}
}
