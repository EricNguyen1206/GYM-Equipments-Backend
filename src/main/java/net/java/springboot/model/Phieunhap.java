package net.java.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Pattern;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "PHIEUNHAP")
public class Phieunhap {
	@Id
	@Column(name = "MAPN", length = 5)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String mapn;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	@Column(name = "NGAYNHAP", nullable = false)
	private Date ngaynhap;

	@Column(name = "MATK", length = 20, nullable = false)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu nhap vao khong hop le")
	private String matk;
	
	public Phieunhap() {
		super();
	}
	public Phieunhap(@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le") String mapn, Date ngaynhap,
			@Pattern(regexp = "[a-zA-Z]*", message = "Ky tu nhap vao khong hop le") String matk) {
		super();
		this.mapn = mapn;
		this.ngaynhap = ngaynhap;
		this.matk = matk;
	}

	public String getMapn() {
		return mapn;
	}
	public void setMapn(String mapn) {
		this.mapn = mapn;
	}
	public Date getNgaynhap() {
		return ngaynhap;
	}
	public void setNgaynhap(Date ngaynhap) {
		this.ngaynhap = ngaynhap;
	}
	public String getMatk() {
		return matk;
	}
	public void setMatk(String matk) {
		this.matk = matk;
	}
}
