package net.java.springboot.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.java.springboot.model.Khuvuc;
@Repository
public interface KhuvucRepository extends JpaRepository<Khuvuc, String>  {
	 @Query(value="exec bonhiemTaikhoanChoKhuvuc :matk, :makv", nativeQuery = true)
	 public Khuvuc bonhiemNhanvienGiamsat(@Param("matk") String matk, @Param("makv") String makv);
}