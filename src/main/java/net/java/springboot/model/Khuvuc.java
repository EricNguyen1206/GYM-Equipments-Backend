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
@Table(name = "KHUVUC")
public class Khuvuc {
	@Id
	@Column(name = "MAKV", length = 10, nullable = false)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String MAKV;
	
	@Column(name = "TENKV", length = 20, nullable = false)
	@Pattern(regexp = "[a-zA-Z ]*", message = "Ten khu vuc khong hop le")
	private String TENKV;
	
	@OneToOne(targetEntity = Taikhoan.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_KHUVUC_REFERENCE_TAIKHOAN", referencedColumnName = "USERNAME")
//	@Column(name = "MANV", length = 10, nullable = false)
//	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String MATK;
	//Default Constructor
	public Khuvuc() {
		super();
	}
	//Constructor
	public Khuvuc(String makv, String tenkv, String matk) {
		super();
		MAKV = makv;
		TENKV = tenkv;
		MATK = matk;
	}

	public String getMAKV() {
		return MAKV;
	}

	public void setMAKV(String mAKV) {
		MAKV = mAKV;
	}

	public String getTENKV() {
		return TENKV;
	}

	public void setTENKV(String tENKV) {
		TENKV = tENKV;
	}

	public String getMATK() {
		return MATK;
	}

	public void setMANV(String matk) {
		MATK = matk;
	}
	@Override
	public String toString() {
		return "Khuvuc [MAKV=" + MAKV + ", TENKV=" + TENKV + ", MATK=" + MATK + "]";
	}
}
