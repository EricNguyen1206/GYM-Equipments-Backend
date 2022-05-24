package net.java.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@Column(name = "MAPTL")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maptl;
	
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

	public int getMaptl() {
		return maptl;
	}

	public void setMaptl(int maptl) {
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
