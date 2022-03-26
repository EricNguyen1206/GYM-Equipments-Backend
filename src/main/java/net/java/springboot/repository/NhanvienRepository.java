package net.java.springboot.repository;

import net.java.springboot.model.Nhanvien;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanvienRepository extends JpaRepository<Nhanvien, String>{
	//find with email
	//Nhanvien findByEmail(String email);
	//find with phone number
	//Nhanvien findByPhone(String phone);
}
