package net.java.springboot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "CHITIETPTL")
public class ChitietPTL implements Serializable {
	@Id
	@Column(name = "MAPTL", length = 5)
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "Ky tu khong hop le")
	private String maptl;
	
	@Id
	@Column(name = "MATB", nullable = false)
	private int matb;

	@Column(name = "GIA", nullable = false)
	private double gia;

	public ChitietPTL() {
		super();
	}
}
