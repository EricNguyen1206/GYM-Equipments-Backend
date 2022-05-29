package net.java.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "KHUVUC")
public class Khuvuc {
	@Id
	@Column(name = "MAKV", length = 4, nullable = false)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String makv;
	
	@Column(name = "TENKV", length = 20, nullable = false)
	@Pattern(regexp = "[a-z0-9A-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễếệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ ]*"
	, message = "Tên khu vực không hợp lệ!")
	private String tenkv;
	
	@Column(name = "MATK", length = 20)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String matk;
	
	// Constructor
	public Khuvuc() {
		super();
	}

	public Khuvuc(@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String makv,
			@Pattern(regexp = "[a-zA-Z ]*", message = "Ten khu vuc khong hop le") String tenkv,
			@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String matk) {
		super();
		this.makv = makv;
		this.tenkv = tenkv;
		this.matk = matk;
	}

	public String getMakv() {
		return makv;
	}

	public void setMakv(String makv) {
		this.makv = makv;
	}

	public String getTenkv() {
		return tenkv;
	}

	public void setTenkv(String tenkv) {
		this.tenkv = tenkv;
	}

	public String getMatk() {
		return matk;
	}

	public void setMatk(String matk) {
		this.matk = matk;
	}

	
}
