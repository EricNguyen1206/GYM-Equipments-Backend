package net.java.springboot.service;

import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
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
	
	public Phieunhap getById(String id) throws ResourceNotFoundException {
		Phieunhap pnFound = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Không tìm thấy phiếu nhập có mã: " + id));
		return pnFound;
	}
	
	public Phieunhap create(Phieunhap pn) throws IllegalArgumentException {
		Optional<Phieunhap> pnFound = repository.findById(pn.getMapn());
		if(pnFound.isPresent()) {
			throw new IllegalArgumentException("Mã phiếu nhập này đã tồn tại");
		}
//		SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
//		Date date = new Date();
		Phieunhap res = repository.save(pn);
		List<ChitietPN> chitietPn = pn.getChitietPN();
		for(int i=0; i<chitietPn.size(); ++i) {
			chitietPnrepository.save(chitietPn.get(i));
		}
		return res;
	}
}
