package net.java.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.java.springboot.exception.ResourceNotFoundException;
import net.java.springboot.model.Thietbi;
import net.java.springboot.repository.ThietbiRepository;

@Service
public class ThietbiService {
	@Autowired
	ThietbiRepository repository;
	
	public List<Thietbi> getAll() {
		return repository.findAll();
	}
	
	public Thietbi getById(int id) {
		Thietbi tbFound = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Không tìm thấy thiết bị mã:"+id));
		return tbFound;
	}
	
	public Thietbi changeCondition(int id, int condition) throws ResourceNotFoundException {
		Thietbi tbFound = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Không tìm thấy thiết bị mã:"+id));
		tbFound.setTinhtrangTb(condition);
		repository.save(tbFound);
		return tbFound;
	}
}
