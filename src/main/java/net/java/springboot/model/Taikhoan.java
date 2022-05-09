package net.java.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "TAIKHOAN")
public class Taikhoan {
	@Id
	@Column(name = "USERNAME", length = 20, nullable = false)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu nhap vao khong hop le")
	private String username;

	@Column(name = "MATKHAU", length = 20, nullable = false)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu nhap vao khong hop le")
	private String matkhau;
	
	@Column(name = "TRANGTHAI", nullable = false)
	private boolean trangthai = true;

	@Column(name = "MANV", length = 4, nullable = false)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu nhap vao khong hop le")
	private String manv;
	
	@Column(name = "MAKV", length = 4)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu nhap vao khong hop le")
	private String makv;
	
	@Column(name = "IDROLE", nullable = false)
	private int idrole = 3;

	public Taikhoan() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMatkhau() {
		return matkhau;
	}

	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public boolean getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(boolean trangthai) {
		this.trangthai = trangthai;
	}

	public String getManv() {
		return manv;
	}

	public void setManv(String manv) {
		this.manv = manv;
	}

	public String getMakv() {
		return makv;
	}

	public void setMakv(String makv) {
		this.makv = makv;
	}

	public int getIdrole() {
		return idrole;
	}

	public void setIdrole(int idrole) {
		this.idrole = idrole;
	}

	@Override
	public String toString() {
		return "Taikhoan [username=" + username + ", matkhau=" + matkhau + ", trangthai=" + trangthai + ", manv=" + manv
				+ ", makv=" + makv + ", idrole=" + idrole + "]";
	}

}
