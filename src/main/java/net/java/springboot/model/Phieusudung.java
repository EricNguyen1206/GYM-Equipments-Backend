package net.java.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "PHIEUSUDUNG")
public class Phieusudung {
	@Id
	@Column(name = "MAPSD", length = 5)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String mapsd;
	
	//Username Tai khoan nhan vien lay thiet bi
	@Column(name = "MATKNV", length = 20)
	@Pattern(regexp = "[a-zA-Z]*", message = "Ky tu nhap vao khong hop le")
	private String matknv;
	
	//Username Tai khoan thu kho duyet thiet bi
	@Column(name = "MATKTK", length = 20)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu nhap vao khong hop le")
	private String matktk;
	
	public Phieusudung() {
		super();
	}
	public Phieusudung(@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String mapsd,
			@Pattern(regexp = "[a-zA-Z]*", message = "Ky tu nhap vao khong hop le") String matknv,
			@Pattern(regexp = "[a-zA-Z]*", message = "Ky tu nhap vao khong hop le") String matktk) {
		super();
		this.mapsd = mapsd;
		this.matknv = matknv;
		this.matktk = matktk;
	}
}
