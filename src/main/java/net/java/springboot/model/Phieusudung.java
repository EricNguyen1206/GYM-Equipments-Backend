package net.java.springboot.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "PHIEUSUDUNG")
public class Phieusudung {
	@Id
	@Column(name = "MAPSD", length = 10)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String MAPSD;
	
	@OneToOne(targetEntity = Taikhoan.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_PHIEUSUDUNG_REFERENCE_TAIKHOAN_NHANVIEN", referencedColumnName = "USERNAME")
//	@Column(name = "MATK", length = 10, nullable = false)
//	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String MATKNV;
	
	@OneToOne(targetEntity = Taikhoan.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_PHIEUSUDUNG_REFERENCE_TAIKHOAN_THUKHO", referencedColumnName = "USERNAME")
//	@Column(name = "MATKTK", length = 10, nullable = false)
//	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String MATKTK;
	
	public Phieusudung() {
		super();
	}

	public Phieusudung(@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String mAPSD,
			@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String matknv,
			@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String matktk) {
		super();
		MAPSD = mAPSD;
		MATKNV = matknv;
		MATKTK = matktk;
	}

	public String getMAPSD() {
		return MAPSD;
	}

	public void setMAPSD(String mAPSD) {
		MAPSD = mAPSD;
	}

	public String getMATKNV() {
		return MATKNV;
	}

	public void setMATKNV(String matknv) {
		MATKNV = matknv;
	}

	public String getMATKTK() {
		return MATKTK;
	}

	public void setMATKTK(String matktk) {
		MATKTK = matktk;
	}

	@Override
	public String toString() {
		return "Phieusudung [MAPSD=" + MAPSD + ", MATKNV=" + MATKNV + ", MATKTK=" + MATKTK + "]";
	}
}
