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
	@Column(name = "MANV", length = 4, nullable = false)
	private String manv;
	
	@Column(name = "HO", length = 25, nullable = false)
	@Pattern(regexp = "[a-z0-9A-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễếệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ ]*", message = "Ho khong hop le!")
	private String ho;
	
	@Column(name = "TEN", length = 10, nullable = false)
	@Pattern(regexp = "[a-z0-9A-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễếệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ]*", message = "Ten khong hop le!")
	private String ten;
	
	// Gioi tinh = true = 1 = nam, Gioi tinh = false = 0 = nu
	@Column(name = "GIOITINH", nullable = false)
	private boolean gioitinh = true;

	@Column(name = "SDT", length = 10, nullable = false)
	@Pattern(regexp = "0[0-9]{9}", message = "So dien thoai khong hop le!")
	private String phone;

	@Column(name = "EMAIL", length = 50, nullable = false)
	@Email(message = "email khong hop le!")
	private String email;

	public Nhanvien() {
		super();
	}

	public Nhanvien(String manv, @Pattern(regexp = "[a-zA-Z]*", message = "Ho khong hop le!") String ho,
			@Pattern(regexp = "[a-zA-Z]*", message = "Ten khong hop le!") String ten, boolean gioitinh,
			@Pattern(regexp = "0[0-9]{9}", message = "So dien thoai khong hop le!") String phone,
			@Email(message = "email khong hop le!") String email) {
		super();
		this.manv = manv;
		this.ho = ho;
		this.ten = ten;
		this.gioitinh = gioitinh;
		this.phone = phone;
		this.email = email;
	}

	public String getManv() {
		return manv;
	}

	public void setManv(String manv) {
		this.manv = manv;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public boolean isGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
