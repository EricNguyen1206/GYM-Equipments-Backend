package net.java.springboot.model;

import java.io.Serializable;
import java.util.Objects;

public class ChitietPNId implements Serializable {
	private String mapn;
	private String maltb;
	public ChitietPNId() {
		super();
	}
	public ChitietPNId(String mapn, String maltb) {
		super();
		this.mapn = mapn;
		this.maltb = maltb;
	}
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChitietPNId chitietPNId = (ChitietPNId) o;
        return mapn.equals(chitietPNId.getMapn()) &&
        		maltb.equals(chitietPNId.getMaltb());
    }
	public String getMapn() {
		return mapn;
	}
	public String getMaltb() {
		return maltb;
	}
	@Override
    public int hashCode() {
        return Objects.hash(mapn, maltb);
    }
}
