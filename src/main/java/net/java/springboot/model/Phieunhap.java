package net.java.springboot.model;

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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "PHIEUNHAP")
public class Phieunhap {
	@Id
	@Column(name = "MAPN")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mapn;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	@Column(name = "NGAYNHAP", nullable = false)
	private Date ngaynhap;

	@Column(name = "MATK", length = 20, nullable = false)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu nhap vao khong hop le")
	private String matk;
	
	@OneToMany(targetEntity = ChitietPN.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "MAPN", referencedColumnName = "MAPN")
	List<ChitietPN> chitietPN = new ArrayList<>();
	
	public Phieunhap() {
		super();
	}

	public int getMapn() {
		return mapn;
	}

	public void setMapn(int mapn) {
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

	public List<ChitietPN> getChitietPN() {
		return chitietPN;
	}

	public void setChitietPN(List<ChitietPN> chitietPN) {
		this.chitietPN = chitietPN;
	}
}
