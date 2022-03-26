package net.java.springboot.model;

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

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "CHITIETPSD")
public class ChitietPSD implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@OneToOne(targetEntity = Phieusudung.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_CHITIETPSD_REFERENCE_PHIEUSUDUNG", referencedColumnName = "MAPSD")
//	@Column(name = "MAPN", length = 10, nullable = false)
//	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String MAPSD;
	
	@Id
	@OneToOne(targetEntity = Thietbi.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_CHITIETPSD_REFERENCE_THIETBI", referencedColumnName = "MATB")
//	@Column(name = "MATB", length = 10, nullable = false)
//	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String MATB;

	@Column(name = "SOLUONG", nullable = false)
	private int SOLUONG;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	@Column(name = "NGAYLAY")
	private Date NGAYLAY;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	@Column(name = "NGAYTRA")
	private Date NGAYTRA;

	public ChitietPSD() {
		super();
	}

	public ChitietPSD(@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String mapsd,
			@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String mATB, int sOLUONG, Date nGAYLAY,
			Date nGAYTRA) {
		super();
		MAPSD = mapsd;
		MATB = mATB;
		SOLUONG = sOLUONG;
		NGAYLAY = nGAYLAY;
		NGAYTRA = nGAYTRA;
	}

	public String getMAPN() {
		return MAPSD;
	}

	public void setMAPN(String mapsd) {
		MAPSD = mapsd;
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

	public Date getNGAYLAY() {
		return NGAYLAY;
	}

	public void setNGAYLAY(Date nGAYLAY) {
		NGAYLAY = nGAYLAY;
	}

	public Date getNGAYTRA() {
		return NGAYTRA;
	}

	public void setNGAYTRA(Date nGAYTRA) {
		NGAYTRA = nGAYTRA;
	}

	@Override
	public String toString() {
		return "ChitietPSD [MAPSD=" + MAPSD + ", MATB=" + MATB + ", SOLUONG=" + SOLUONG + ", NGAYLAY=" + NGAYLAY
				+ ", NGAYTRA=" + NGAYTRA + "]";
	}
}
