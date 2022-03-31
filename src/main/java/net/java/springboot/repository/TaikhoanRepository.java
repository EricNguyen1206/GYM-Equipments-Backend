package net.java.springboot.repository;

import net.java.springboot.model.Taikhoan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaikhoanRepository extends JpaRepository<Taikhoan, String> {

}
