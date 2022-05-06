package net.java.springboot.service;

import java.util.List;
import java.util.Optional;

import net.java.springboot.model.Taikhoan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.java.springboot.repository.TaikhoanRepository;

@Service
public class TaikhoanService {
	@Autowired
	private TaikhoanRepository taikhoanRepository;
	
	public List<Taikhoan> getAllTaikhoan() {
		return taikhoanRepository.findAll();
	}
	
	public Taikhoan getTaikhoanByUsername(String username) {
		Taikhoan taikhoanFound = taikhoanRepository.getById(username);
		return taikhoanFound;
	}
	
	public Taikhoan createTaikhoan(Taikhoan tk) {
		return taikhoanRepository.save(tk);
	}
	
	public Optional<Taikhoan> Register(Taikhoan taikhoan) {
		return taikhoanRepository.findById(taikhoan.getUsername());
	}
}
