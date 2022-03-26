package net.java.springboot.service;

import net.java.springboot.model.Nhanvien;
import net.java.springboot.exception.ResourceNotFoundException;
import net.java.springboot.repository.NhanvienRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


public class NhanvienService {
	@Autowired
	private NhanvienRepository nhanvienRepository;
	
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
		.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));;
		return nhanvien;
	}
	
//	public Nhanvien createNhanvien(Nhanvien nhanvien) throws IllegalArgumentException {
//		if(nhanvien.getGIOITINH()!=0 && nhanvien.getGIOITINH()!=1) {
//			throw new IllegalArgumentException("Gioi tinh khong hop le!");
//		}
//		Optional<Nhanvien> nhanvienFound = nhanvienRepository.findById(nhanvien.getMANV());
//		
//		if(nhanvienFound.isPresent()) {
//			throw new IllegalArgumentException("Nhan vien da ton tai!");
//		}
//		
//		if(nhanvienRepository.findByEmail(nhanvien.getEMAIL()) != null) {
//			throw new IllegalArgumentException("Email nay da duoc su dung!");
//		}
//		
//		if(nhanvienRepository.findByPhone(nhanvien.getSDT()) != null) {
//			throw new IllegalArgumentException("Phone nay da duoc su dung!");
//		}
//		
//		return nhanvienRepository.save(nhanvien);
//	}
}
