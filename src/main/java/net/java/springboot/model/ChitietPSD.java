package net.java.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Pattern;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "CHITIETPSD")
@IdClass(ChitietPSDId.class)
public class ChitietPSD implements Serializable {
	@Id
	@Column(name = "MAPSD")
	private int mapsd;

	@Id
	@Column(name = "MATB", nullable = false)
	private int matb;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	@Column(name = "NGAYLAY", nullable = false)
	private Date ngaylay;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	@Column(name = "NGAYTRA")
	private Date ngaytra;

	public ChitietPSD() {
		super();
	}
	public int getMapsd() {
		return mapsd;
	}
	public void setMapsd(int mapsd) {
		this.mapsd = mapsd;
	}
	public int getMatb() {
		return matb;
	}
	public void setMatb(int matb) {
		this.matb = matb;
	}

	public Date getNgaylay() {
		return ngaylay;
	}

	public void setNgaylay(Date ngaylay) {
		this.ngaylay = ngaylay;
	}

	public Date getNgaytra() {
		return ngaytra;
	}

	public void setNgaytra(Date ngaytra) {
		this.ngaytra = ngaytra;
	}

}
