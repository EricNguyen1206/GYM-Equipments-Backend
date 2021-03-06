package net.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.java.springboot.model.Phieunhap;

@Repository
public interface PhieunhapRepository extends JpaRepository<Phieunhap, Integer> {
	@Query(value="exec themPhieunhap", nativeQuery = true)
	 public int taoPhieunhap();
}
