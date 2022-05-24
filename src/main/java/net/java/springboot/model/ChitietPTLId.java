package net.java.springboot.model;

import java.io.Serializable;
import java.util.Objects;

public class ChitietPTLId implements Serializable  {
	private int maptl;
	private int matb;
	
	public ChitietPTLId() {
		super();
	}
	public ChitietPTLId(int maptl, int matb) {
		super();
		this.maptl = maptl;
		this.matb = matb;
	}
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChitietPTLId chitietPTLId = (ChitietPTLId) o;
        return maptl==chitietPTLId.getMaptl() &&
        		matb == chitietPTLId.getMatb();
    }
	
	public int getMaptl() {
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
