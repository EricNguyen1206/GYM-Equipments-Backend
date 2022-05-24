package net.java.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.java.springboot.exception.ResourceNotFoundException;
import net.java.springboot.model.ChitietPN;
import net.java.springboot.model.Phieunhap;
import net.java.springboot.repository.ChitietPNRepository;
import net.java.springboot.repository.PhieunhapRepository;

@Service
public class PhieunhapService {
	@Autowired
	PhieunhapRepository repository;
	
	@Autowired
	ChitietPNRepository chitietPnrepository;
	
	public List<Phieunhap> getAll() {
		return repository.findAll();
	}
	
	public Phieunhap getById(int id) throws ResourceNotFoundException {
		Phieunhap pnFound = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Không tìm thấy phiếu nhập có mã: " + id));
		return pnFound;
	}
	
	public String create(Phieunhap pn) throws IllegalArgumentException {
		Optional<Phieunhap> pnFound = repository.findById(pn.getMapn());
		if(pnFound.isPresent()) {
			throw new IllegalArgumentException("Mã phiếu nhập này đã tồn tại");
		}
		int id = repository.taoPhieunhap();
		List<ChitietPN> chitietPn = pn.getChitietPN();
		for(int i=0; i<chitietPn.size(); ++i) {
			chitietPn.get(i).setMapn(id);
			chitietPnrepository.save(chitietPn.get(i));
		}
		return "Tạo phiếu nhập thành công!";
	}
}
