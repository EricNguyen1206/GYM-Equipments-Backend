package net.java.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "LOAITHIETBI")
public class LoaiThietbi {
	@Id
	@Column(name = "MALTB", length = 5, nullable = false)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String maltb;
	
	@Column(name = "TENTB", length = 20, nullable = false)
	@Pattern(regexp = "[a-zA-Z0-9\s]*", message = "Ky tu khong hop le")
	private String tentb;
	
	@Column(name = "CHITIET", length = 100, nullable = false)
	private String chitiet;

	public String getMatb() {
		return maltb;
	}

	public void setMatb(String maltb) {
		this.maltb = maltb;
	}

	public String getTentb() {
		return tentb;
	}

	public void setTentb(String tentb) {
		this.tentb = tentb;
	}

	public String getChitiet() {
		return chitiet;
	}

	public void setChitiet(String chitiet) {
		this.chitiet = chitiet;
	}
}
