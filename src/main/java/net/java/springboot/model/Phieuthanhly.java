package net.java.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu nhap vao khong hop le")
	private String matk;
	
	@OneToMany(targetEntity = ChitietPTL.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "MAPTL", referencedColumnName = "MAPTL")
	List<ChitietPTL> chitietPTL = new ArrayList<>();

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
	public String getMaptl() {
		return maptl;
	}
	public void setMaptl(String maptl) {
		this.maptl = maptl;
	}
	public Date getNgaythanhly() {
		return ngaythanhly;
	}
	public void setNgaythanhly(Date ngaythanhly) {
		this.ngaythanhly = ngaythanhly;
	}
	public String getMatk() {
		return matk;
	}
	public void setMatk(String matk) {
		this.matk = matk;
	}
	public List<ChitietPTL> getChitietPTL() {
		return chitietPTL;
	}
	public void setChitietPTL(List<ChitietPTL> chitietPTL) {
		this.chitietPTL = chitietPTL;
	}
}
