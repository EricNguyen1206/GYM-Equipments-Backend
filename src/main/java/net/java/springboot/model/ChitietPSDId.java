package net.java.springboot.model;

import java.io.Serializable;
import java.util.Objects;

public class ChitietPSDId implements Serializable {
	private String mapsd;
	private int matb;
	
	public String getMapsd() {
		return mapsd;
	}
	public int getMatb() {
		return matb;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChitietPSDId chitietPSDId = (ChitietPSDId) o;
        return mapsd.equals(chitietPSDId.getMapsd()) &&
        		matb == chitietPSDId.getMatb();
    }
	
	@Override
    public int hashCode() {
        return Objects.hash(mapsd, matb);
    }
}
