package net.java.springboot.service;

import java.util.List;
import java.util.Optional;

import net.java.springboot.exception.ResourceNotFoundException;
import net.java.springboot.model.Taikhoan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.java.springboot.repository.TaikhoanRepository;

@Service
public class TaikhoanService {
	@Autowired
	private TaikhoanRepository taikhoanRepository;
	
	public List<Taikhoan> getAll() {
		return taikhoanRepository.findAll();
	}
	
	public Taikhoan getByUsername(String username) throws ResourceNotFoundException {
		Taikhoan taikhoanFound = taikhoanRepository.findById(username)
				.orElseThrow(() -> new ResourceNotFoundException("Không tìm thấy nhân viên với username: " + username));
		return taikhoanFound;
	}
	
	public Taikhoan create(Taikhoan tk) {
		return taikhoanRepository.save(tk);
	}
	
	public Optional<Taikhoan> register(Taikhoan taikhoan) {
		return taikhoanRepository.findById(taikhoan.getUsername());
	}
	
	public Taikhoan update(String id, Taikhoan newTaikhoan) {
		System.out.println(newTaikhoan.toString());
		Taikhoan taikhoanFound = taikhoanRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Lỗi: Không tìm thấy tài khoản với mã: "+ id));

		if(newTaikhoan.getUsername() != null && !id.equals(newTaikhoan.getUsername())) {
			throw new IllegalArgumentException("Lỗi: Không chỉnh sửa mã tài khoản!");
		}
		if(!taikhoanFound.getManv().equals(newTaikhoan.getManv())) {
			throw new IllegalArgumentException("Lỗi: Không thay đổi nhân viên sở hữu tài khoản!");
		}
		taikhoanFound.setIdrole(newTaikhoan.getIdrole() != null ? newTaikhoan.getIdrole() : taikhoanFound.getIdrole());
		taikhoanFound.setMakv(newTaikhoan.getMakv() != null ? newTaikhoan.getMakv() : taikhoanFound.getMakv());
		taikhoanFound.setMatkhau(newTaikhoan.getMatkhau() != null ? newTaikhoan.getMatkhau() : taikhoanFound.getMatkhau());
		taikhoanFound.setTrangthai(newTaikhoan.getTrangthai());
		taikhoanRepository.save(taikhoanFound);
		return taikhoanFound;
	}
}
