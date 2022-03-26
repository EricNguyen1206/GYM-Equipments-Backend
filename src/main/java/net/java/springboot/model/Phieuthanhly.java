package net.java.springboot.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "PHIEUTHANHLY")
public class Phieuthanhly {
	@Id
	@Column(name = "MAPTL", length = 10)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String MAPTL;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	@Column(name = "NGAYTHANHLY")
	private Date NGAYTHANHLY;
	
	@OneToOne(targetEntity = Taikhoan.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_PHIEUTHANHLY_REFERENCE_TAIKHOAN", referencedColumnName = "USERNAME")
//	@Column(name = "MATK", length = 10, nullable = false)
//	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String MATK;

	public Phieuthanhly() {
		super();
	}

	public Phieuthanhly(@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String maptl, Date ngaythanhly,
			@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String matk) {
		super();
		MAPTL = maptl;
		NGAYTHANHLY = ngaythanhly;
		MATK = matk;
	}

	public String getMAPTL() {
		return MAPTL;
	}

	public void setMAPN(String maptl) {
		MAPTL = maptl;
	}

	public Date getNGAYTHANHLY() {
		return NGAYTHANHLY;
	}

	public void setNGAYTHANHLY(Date ngaythanhly) {
		NGAYTHANHLY = ngaythanhly;
	}

	public String getMATK() {
		return MATK;
	}

	public void setMATK(String matk) {
		MATK = matk;
	}

	@Override
	public String toString() {
		return "Phieuthanhly [MAPTL=" + MAPTL + ", NGAYTHANHLY=" + NGAYTHANHLY + ", MATK=" + MATK + ", getMAPTL()=" + getMAPTL()
				+ ", getNGAYTHANHLY()=" + getNGAYTHANHLY() + ", getMATK()=" + getMATK() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
