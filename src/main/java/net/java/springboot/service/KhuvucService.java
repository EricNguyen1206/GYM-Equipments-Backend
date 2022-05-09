package net.java.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.java.springboot.exception.ResourceNotFoundException;
import net.java.springboot.model.Khuvuc;
import net.java.springboot.model.Taikhoan;
import net.java.springboot.repository.KhuvucRepository;
import net.java.springboot.repository.TaikhoanRepository;

@Service
public class KhuvucService {
	@Autowired
	KhuvucRepository kvRepository;
	
	@Autowired
	TaikhoanRepository tkRepository;
	
	public List<Khuvuc> getAll() {
		return kvRepository.findAll();
	}
	
	public Khuvuc getById(String id) throws ResourceNotFoundException, IllegalArgumentException  {
		Khuvuc kvFound = kvRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Không tìm thấy Mã khu vực: " + id));
		return kvFound;
	}
	
	public Khuvuc create(Khuvuc kv) throws IllegalArgumentException {
		if(kv.getMakv() == null) {
			throw new IllegalArgumentException("Mã khu vực không được để trống!");
		}
		if(kv.getTenkv() == null) {
			throw new IllegalArgumentException("Tê khu vực không được để trống!");
		}
		if(kv.getMatk() != null) {
			kv.setMatk(null);
		}
		
		return kvRepository.save(kv);
	}
	
	public Khuvuc update(String id, Khuvuc kv) throws ResourceNotFoundException, IllegalArgumentException {
		Khuvuc kvFound = kvRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Không tìm thấy Mã khu vực: " + id));
		if(kv.getMakv() != null && !kvFound.getMakv().equals(kv.getMakv())) {
			throw new IllegalArgumentException("Không được phép sửa mã khu vực!");
		}
		if(kv.getMatk() != null) {
			try {
				Taikhoan taikhoanFound = tkRepository.findById(kv.getMatk())
						.orElseThrow(() -> new ResourceNotFoundException("Mã tài khoản không hợp lệ!"));
				Khuvuc res = kvRepository.bonhiemNhanvienGiamsat(taikhoanFound.getUsername(), id);
	        }
	        catch (Exception e){
	        	throw new IllegalArgumentException("Không thể bổ nhiệm nhân viên!" + e);
	        }
		}
		kvFound.setTenkv(kv.getTenkv()!=null ? kv.getTenkv() : kvFound.getTenkv());
		kvFound.setMatk(kv.getMatk()!=null ? kv.getMatk() : kvFound.getMatk());
		return kvRepository.save(kvFound);
	}
}
