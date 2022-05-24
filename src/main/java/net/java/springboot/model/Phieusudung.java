package net.java.springboot.model;

import java.util.ArrayList;
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
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "PHIEUSUDUNG")
public class Phieusudung {
	@Id
	@Column(name = "MAPSD")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mapsd;
	
	//Username Tai khoan nhan vien lay thiet bi
	@Column(name = "MATKNV", length = 20)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu nhap vao khong hop le")
	private String matknv;
	
	//Username Tai khoan thu kho duyet thiet bi
	@Column(name = "MATKTK", length = 20)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu nhap vao khong hop le")
	private String matktk;
	
	@OneToMany(targetEntity = ChitietPSD.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "MAPSD", referencedColumnName = "MAPSD")
	List<ChitietPSD> chitietPSD = new ArrayList<>();
	
	public Phieusudung() {
		super();
	}

	public int getMapsd() {
		return mapsd;
	}

	public void setMapsd(int mapsd) {
		this.mapsd = mapsd;
	}

	public String getMatknv() {
		return matknv;
	}

	public void setMatknv(String matknv) {
		this.matknv = matknv;
	}

	public String getMatktk() {
		return matktk;
	}

	public void setMatktk(String matktk) {
		this.matktk = matktk;
	}

	public List<ChitietPSD> getChitietPSD() {
		return chitietPSD;
	}

	public void setChitietPSD(List<ChitietPSD> chitietPSD) {
		this.chitietPSD = chitietPSD;
	}
}
