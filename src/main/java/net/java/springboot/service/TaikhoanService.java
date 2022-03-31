package net.java.springboot.service;

import java.util.List;

import net.java.springboot.model.Taikhoan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import net.java.springboot.exception.ResourceNotFoundException;
import net.java.springboot.model.Taikhoan;
import net.java.springboot.repository.TaikhoanRepository;

@Service
public class TaikhoanService {
	@Autowired
	private TaikhoanRepository taikhoanRepository;
	
	private List<Taikhoan> getAllTaikhoan() {
		return taikhoanRepository.findAll();
	}
	
	private Taikhoan getTaikhoanByUsername(String username) {
		Taikhoan taikhoanFound = taikhoanRepository.getById(username);
		return taikhoanFound;
	}
	
//	private ResponseEntity Login(Taikhoan taikhoan) {
//		
//	}
}
