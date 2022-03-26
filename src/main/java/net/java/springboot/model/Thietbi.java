package net.java.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "THIETBI")
public class Thietbi {
	@Id
	@Column(name = "MATB", length = 10, nullable = false)
	private String maTb;
	
	@Column(name = "TENTB", length = 20, nullable = false)
	private String tenTb;
	
	@Column(name = "TONGSOLUON", nullable = false)
	private int tongSoLuong;
	
	@Column(name = "CHITIET", length = 100, nullable = false)
	private String chiTiet;
	
	// Default Constructor
	public Thietbi() {
		super();
	}
	
	// Default Constructor
	public Thietbi(String maTb, String tenTb, int tongSoLuong, String chiTiet) {
		super();
		this.maTb = maTb;
		this.tenTb = tenTb;
		this.tongSoLuong = tongSoLuong;
		this.chiTiet = chiTiet;
	}

	public Thietbi(Thietbi tb) {
		super();
		this.maTb = tb.getMaTb();
		this.tenTb = tb.getTenTb();
		this.tongSoLuong = tb.getTongSoLuong();
		this.chiTiet = tb.getChiTiet();
	}

	public String getMaTb() {
		return maTb;
	}
	public void setMaTb(String maTb) {
		this.maTb = maTb;
	}
	public String getTenTb() {
		return tenTb;
	}
	public void setTenTb(String tenTb) {
		this.tenTb = tenTb;
	}
	public int getTongSoLuong() {
		return tongSoLuong;
	}
	public void setTongSoLuong(int tongSoLuong) {
		this.tongSoLuong = tongSoLuong;
	}
	public String getChiTiet() {
		return chiTiet;
	}
	public void setChiTiet(String chiTiet) {
		this.chiTiet = chiTiet;
	}
	@Override
	public String toString() {
		return "Thietbi [maTb=" + maTb + ", tenTb=" + tenTb + ", tongSoLuong=" + tongSoLuong + ", chiTiet=" + chiTiet
				+ ", getMaTb()=" + getMaTb() + ", getTenTb()=" + getTenTb() + ", getTongSoLuong()=" + getTongSoLuong()
				+ ", getChiTiet()=" + getChiTiet() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
