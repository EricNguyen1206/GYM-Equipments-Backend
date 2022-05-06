package net.java.springboot.service;

import net.java.springboot.model.Nhanvien;
import net.java.springboot.exception.ResourceNotFoundException;
import net.java.springboot.repository.NhanvienRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NhanvienService {
	@Autowired
	NhanvienRepository nhanvienRepository;
	
	boolean checkInArr(String [] arr, String testStr) {
		for(String i : arr) {
			if(i.equals(testStr)) return true;
		}
		return false;
	}
	
	public List<Nhanvien> getAllNhanvien() {
		return nhanvienRepository.findAll();
	}
	
	public Nhanvien getNhanvienById(String id) {
		Nhanvien nhanvien = nhanvienRepository.findById(id)
		.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));
		return nhanvien;
	}
	
	public Nhanvien createNhanvien(Nhanvien nhanvien) throws IllegalArgumentException {
		Optional<Nhanvien> nhanvienFound = nhanvienRepository.findById(nhanvien.getManv());
		
		if(nhanvienFound.isPresent()) {
			throw new IllegalArgumentException("Nhan vien da ton tai!");
		}
		
		if(nhanvienRepository.findByEmail(nhanvien.getEmail()) != null) {
			throw new IllegalArgumentException("Email nay da duoc su dung!");
		}
		
		if(nhanvienRepository.findByPhone(nhanvien.getPhone()) != null) {
			throw new IllegalArgumentException("So dien thoai nay da duoc su dung!");
		}
		
		return nhanvienRepository.save(nhanvien);
	}
}