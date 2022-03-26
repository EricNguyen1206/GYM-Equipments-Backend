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

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "PHIEUNHAP")
public class Phieunhap {
	@Id
	@Column(name = "MAPN", length = 10)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String MAPN;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	@Column(name = "NGAYNHAP")
	private Date NGAYNHAP;
	

	@OneToOne(targetEntity = Taikhoan.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_PHIEUNHAP_REFERENCE_TAIKHOAN", referencedColumnName = "USERNAME")
//	@Column(name = "MATK", length = 10, nullable = false)
//	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String MATK;

	public Phieunhap() {
		super();
	}

	public Phieunhap(@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String mAPN, Date nGAYNHAP,
			@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String matk) {
		super();
		MAPN = mAPN;
		NGAYNHAP = nGAYNHAP;
		MATK = matk;
	}

	public String getMAPN() {
		return MAPN;
	}

	public void setMAPN(String mAPN) {
		MAPN = mAPN;
	}

	public Date getNGAYNHAP() {
		return NGAYNHAP;
	}

	public void setNGAYNHAP(Date nGAYNHAP) {
		NGAYNHAP = nGAYNHAP;
	}

	public String getMATK() {
		return MATK;
	}

	public void setMATK(String matk) {
		MATK = matk;
	}

	@Override
	public String toString() {
		return "Phieunhap [MAPN=" + MAPN + ", NGAYNHAP=" + NGAYNHAP + ", MATK=" + MATK +"]";
	}
}
