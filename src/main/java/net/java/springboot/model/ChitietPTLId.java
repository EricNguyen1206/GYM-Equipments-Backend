package net.java.springboot.model;

import java.io.Serializable;
import java.util.Objects;

public class ChitietPTLId implements Serializable  {
	private String maptl;
	private int matb;
	
	public ChitietPTLId() {
		super();
	}
	public ChitietPTLId(String maptl, int matb) {
		super();
		this.maptl = maptl;
		this.matb = matb;
	}
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChitietPTLId chitietPTLId = (ChitietPTLId) o;
        return maptl.equals(chitietPTLId.getMaptl()) &&
        		matb == chitietPTLId.getMatb();
    }
	
	public String getMaptl() {
		return maptl;
	}
	public int getMatb() {
		return matb;
	}
	@Override
    public int hashCode() {
        return Objects.hash(maptl, matb);
    }
}
