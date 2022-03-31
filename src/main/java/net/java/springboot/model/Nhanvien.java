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
	
	// Gioi tinh = true = 1 = nam, Gioi tinh = false = 0 = nu
	@Column(name = "GIOITINH", nullable = false)
	private boolean GIOITINH = true;

	@Column(name = "Phone", length = 10, nullable = false)
	@Pattern(regexp = "0[0-9]{9}", message = "So dien thoai khong hop le")
	private String phone;

	@Column(name = "email", length = 50, nullable = false)
	@Email(message = "email is not valid")
	private String email;

	public Nhanvien() {
		super();
	}

	public Nhanvien(String mANV, @Pattern(regexp = "[a-zA-Z]*", message = "FirstName is not valid") String hO,
			@Pattern(regexp = "[a-zA-Z]*", message = "FirstName is not valid") String tEN, boolean gIOITINH,
			@Pattern(regexp = "0[0-9]{9}", message = "Phone is not valid") String Phone,
			@Email(message = "email is not valid") String email) {
		super();
		MANV = mANV;
		HO = hO;
		TEN = tEN;
		GIOITINH = gIOITINH;
		this.phone = Phone;
		this.email = email;
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

	public boolean getGIOITINH() {
		return GIOITINH;
	}

	public void setGIOITINH(boolean gIOITINH) {
		GIOITINH = gIOITINH;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String Phone) {
		this.phone = Phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Nhanvien [MANV=" + MANV + ", HO=" + HO + ", TEN=" + TEN + ", GIOITINH=" + GIOITINH + ", Phone=" + phone
				+ ", email=" + email + ", getMANV()=" + getMANV() + ", getHO()=" + getHO() + ", getTEN()=" + getTEN()
				+ ", getGIOITINH()=" + getGIOITINH() + ", getPhone()=" + getPhone() + ", getEmail()=" + getEmail()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
