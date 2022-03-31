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
@Table(name = "TAIKHOAN")
public class Taikhoan {
	@Id
	@Column(name = "USERNAME", length = 10, nullable = false)
	@Pattern(regexp = "[a-zA-Z]*", message = "Ky tu nhap vao khong hop le")
	private String USERNAME;

	@Column(name = "MATKHAU", length = 25, nullable = false)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu nhap vao khong hop le")
	private String MATKHAU;
	
	@Column(name = "TRANGTHAI", nullable = false)
	private boolean TRANGTHAI = true;

	@OneToOne(targetEntity = Nhanvien.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "TK_NV", referencedColumnName = "MANV")
	private String MANV;
	
	@OneToOne(targetEntity = Chucvu.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "IDROLE", referencedColumnName = "IDROLE")
//	@Column(name = "IDROLE", length = 10, nullable = false)
	private int IDROLE;

	public Taikhoan() {
		super();
	}

	public Taikhoan(@Pattern(regexp = "[a-zA-Z]*", message = "Ky tu nhap vao khong hop le") String username,
			@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu nhap vao khong hop le") String matkhau,
			@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu nhap vao khong hop le") String manv, int idrole) {
		super();
		USERNAME = username;
		MATKHAU = matkhau;
		MANV = manv;
		IDROLE = idrole;
	}

	public String getUSERNAME() {
		return USERNAME;
	}

	public void setUSERNAME(String username) {
		USERNAME = username;
	}

	public String getMATKHAU() {
		return MATKHAU;
	}

	public void setMATKHAU(String matkhau) {
		MATKHAU = matkhau;
	}

	public String getMANV() {
		return MANV;
	}

	public void setMANV(String manv) {
		MANV = manv;
	}

	public int getIDROLE() {
		return IDROLE;
	}

	public void setIDROLE(int idrole) {
		IDROLE = idrole;
	}

	public boolean isTRANGTHAI() {
		return TRANGTHAI;
	}

	public void setTRANGTHAI(boolean tRANGTHAI) {
		TRANGTHAI = tRANGTHAI;
	}

	@Override
	public String toString() {
		return "Taikhoan [USERNAME=" + USERNAME + ", MATKHAU=" + MATKHAU + ", TRANGTHAI=" + TRANGTHAI + ", MANV=" + MANV
				+ ", IDROLE=" + IDROLE + "]";
	}
}
