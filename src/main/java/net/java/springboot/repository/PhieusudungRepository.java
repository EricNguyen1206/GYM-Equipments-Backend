package net.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.java.springboot.model.Phieusudung;
import net.java.springboot.model.Thietbi;
@Repository
public interface PhieusudungRepository extends JpaRepository<Phieusudung, Integer> {
	@Query(value="exec themPhieusudung :matknv", nativeQuery = true)
	 public int taoPhieuthanhly(@Param("matknv") String matknv);
	
	 @Query(value="exec duyetPhieusudung :mapsd", nativeQuery = true)
	 public Phieusudung duyetPhieusudung(@Param("mapsd") int mapsd);
	 
	 @Query(value="exec traThietbi :mapsd, :matb", nativeQuery = true)
	 public Thietbi traThietbi(@Param("mapsd") int mapsd, @Param("matb") int matb);
}
