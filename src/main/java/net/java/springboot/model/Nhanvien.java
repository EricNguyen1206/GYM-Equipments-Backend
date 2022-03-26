package net.java.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "NHANVIEN")
public class Nhanvien {
	@Id
	@Column(name = "MANV", length = 10, nullable = false)
	private String MANV;
	
	@Column(name = "HO", length = 25, nullable = false)
	@Pattern(regexp = "[a-zA-Z]*", message = "FirstName is not valid")
	private String HO;
	
	@Column(name = "TEN", length = 10, nullable = false)
	@Pattern(regexp = "[a-zA-Z]*", message = "FirstName is not valid")
	private String TEN;
	
	@Column(name = "GIOITINH", nullable = false)
	private int GIOITINH;

	@Column(name = "SDT", length = 10, nullable = false)
	@Pattern(regexp = "0[0-9]{9}", message = "Phone is not valid")
	private String SDT;

	@Column(name = "EMAIL", length = 50, nullable = true)
	@Email(message = "Email is not valid")
	private String EMAIL;

	public Nhanvien() {
		super();
	}

	public Nhanvien(String mANV, @Pattern(regexp = "[a-zA-Z]*", message = "FirstName is not valid") String hO,
			@Pattern(regexp = "[a-zA-Z]*", message = "FirstName is not valid") String tEN, int gIOITINH,
			@Pattern(regexp = "0[0-9]{9}", message = "Phone is not valid") String sDT,
			@Email(message = "Email is not valid") String eMAIL) {
		super();
		MANV = mANV;
		HO = hO;
		TEN = tEN;
		GIOITINH = gIOITINH;
		SDT = sDT;
		EMAIL = eMAIL;
	}

	public String getMANV() {
		return MANV;
	}

	public void setMANV(String mANV) {
		MANV = mANV;
	}

	public String getHO() {
		return HO;
	}

	public void setHO(String hO) {
		HO = hO;
	}

	public String getTEN() {
		return TEN;
	}

	public void setTEN(String tEN) {
		TEN = tEN;
	}

	public int getGIOITINH() {
		return GIOITINH;
	}

	public void setGIOITINH(int gIOITINH) {
		GIOITINH = gIOITINH;
	}

	public String getSDT() {
		return SDT;
	}

	public void setSDT(String sDT) {
		SDT = sDT;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	@Override
	public String toString() {
		return "Nhanvien [MANV=" + MANV + ", HO=" + HO + ", TEN=" + TEN + ", GIOITINH=" + GIOITINH + ", SDT=" + SDT
				+ ", EMAIL=" + EMAIL + ", getMANV()=" + getMANV() + ", getHO()=" + getHO() + ", getTEN()=" + getTEN()
				+ ", getGIOITINH()=" + getGIOITINH() + ", getSDT()=" + getSDT() + ", getEMAIL()=" + getEMAIL()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
