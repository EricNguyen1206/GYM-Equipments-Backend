package net.java.springboot.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "PHIEUTHANHLY")
public class Phieuthanhly {
	@Id
	@Column(name = "MAPTL", length = 5)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String maptl;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	@Column(name = "NGAYTHANHLY")
	private Date ngaythanhly;
	
	@Column(name = "MATK", length = 20)
	@Pattern(regexp = "[a-zA-Z]*", message = "Ky tu nhap vao khong hop le")
	private String matk;

	public Phieuthanhly() {
		super();
	}
	public Phieuthanhly(@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String maptl,
			Date ngaythanhly, @Pattern(regexp = "[a-zA-Z]*", message = "Ky tu nhap vao khong hop le") String matk) {
		super();
		this.maptl = maptl;
		this.ngaythanhly = ngaythanhly;
		this.matk = matk;
	}
	
}
