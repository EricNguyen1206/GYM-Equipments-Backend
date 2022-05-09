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
	NhanvienRepository repository;
	
	boolean checkInArr(String [] arr, String testStr) {
		for(String i : arr) {
			if(i.equals(testStr)) return true;
		}
		return false;
	}
	
	public List<Nhanvien> getAll() {
		return repository.findAll();
	}
	
	public Nhanvien getById(String id) {
		Nhanvien nhanvien = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Không tìm thấy nhân viên có mã: " + id));
		return nhanvien;
	}
	
	public Nhanvien create(Nhanvien nv) throws IllegalArgumentException {
		Optional<Nhanvien> nhanvienFound = repository.findById(nv.getManv());
		
		if(nhanvienFound.isPresent()) {
			throw new IllegalArgumentException("Nhân viên đã tồn tại!");
		}
		
		if(repository.findByEmail(nv.getEmail()) != null) {
			throw new IllegalArgumentException("Email này đã được sử dụng!");
		}
		
		if(repository.findByPhone(nv.getPhone()) != null) {
			throw new IllegalArgumentException("Số điện thoại này đã được sử dụng!");
		}
		
		return repository.save(nv);
	}
	
	public Nhanvien update(String id, Nhanvien nhanvien) throws ResourceNotFoundException, IllegalArgumentException {
		Nhanvien nhanvienFound = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Không tìm thấy nhân viên có mã: " + id));
		if(nhanvien.getManv() != null && !id.equals(nhanvien.getManv())) {
			throw new IllegalArgumentException("Không được phép sửa mã nhân viên!");
		}
		if(!nhanvien.getHo().matches("[a-zA-Z\s]*") || !nhanvien.getTen().matches("[a-zA-Z]*") || !nhanvien.getPhone().matches("0[0-9]{9}")) {
			throw new IllegalArgumentException("Thông tin nhập vào không hợp lệ!");
		}
			
		nhanvienFound.setHo(nhanvien.getHo() != null ? nhanvien.getHo() : nhanvienFound.getHo());
		nhanvienFound.setTen(nhanvien.getTen() != null ? nhanvien.getTen() : nhanvienFound.getTen());
		nhanvienFound.setEmail(nhanvien.getEmail() != null ? nhanvien.getEmail() : nhanvienFound.getEmail());
		nhanvienFound.setPhone(nhanvien.getPhone() != null ? nhanvien.getPhone() : nhanvienFound.getPhone());
		repository.save(nhanvienFound);
		return nhanvienFound;
	}
}