package net.java.springboot.repository;

import net.java.springboot.model.Thietbi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThietbiRepository extends JpaRepository<Thietbi, Long> {
	//findByTenThietbi
}
