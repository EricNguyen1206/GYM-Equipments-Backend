package net.java.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.java.springboot.exception.ResourceNotFoundException;
import net.java.springboot.model.LoaiThietbi;
import net.java.springboot.repository.LoaiThietbiRepository;

@Service
public class LoaiThietbiService {
	@Autowired
	LoaiThietbiRepository repository;
	
	public List<LoaiThietbi> getAll() {
		return repository.findAll();
	}
	
	public LoaiThietbi getById(String id) throws ResourceNotFoundException {
		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Không tìm thấy Loại thiết bị có mã:"+id));
	}
	
	public LoaiThietbi create(LoaiThietbi ltb) throws IllegalArgumentException {
		if(ltb.getMatb() == null || ltb.getTentb() == null) {
			throw new IllegalArgumentException("Thông tin thiết bị không được để trống!");
		}
		Optional<LoaiThietbi> ltbFound = repository.findById(ltb.getMatb());
		if(ltbFound.isPresent()) {
			throw new IllegalArgumentException("Mã loại thiết bị này đã được sử dụng!");
		}
		return repository.save(ltb);
	}
	
	public LoaiThietbi update(String id, LoaiThietbi ltb) throws ResourceNotFoundException, IllegalArgumentException {
		LoaiThietbi ltbFound = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Không tìm thấy loại thiết bị có mã:"+id));
		
		ltbFound.setTentb(ltb.getTentb()==null?ltb.getTentb():ltbFound.getTentb());
		ltbFound.setChitiet(ltb.getChitiet()==null?ltb.getChitiet():ltbFound.getChitiet());
		return repository.save(ltbFound);
	}
}
