package net.java.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.java.springboot.exception.ResourceNotFoundException;
import net.java.springboot.model.ChitietPTL;
import net.java.springboot.model.Phieuthanhly;
import net.java.springboot.repository.ChitietPTLRepository;
import net.java.springboot.repository.PhieuthanhlyRepository;

@Service
public class PhieuthanhlyService {
	@Autowired
	PhieuthanhlyRepository ptlRepository;
	
	@Autowired
	ChitietPTLRepository chitietPtlRepository;
	
	public List<Phieuthanhly> getAll() {
		return ptlRepository.findAll();
	}
	
	public Phieuthanhly getById(String id) throws ResourceNotFoundException {
		Phieuthanhly ptlFound = ptlRepository.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Không tìm thấy Phiếu nhập có mã:"+id));
		return ptlFound;
	}
	
	public Phieuthanhly create(Phieuthanhly ptl) throws ResourceNotFoundException, IllegalArgumentException {
		Optional<Phieuthanhly> ptlFound = ptlRepository.findById(ptl.getMaptl());
		if(ptlFound.isPresent()) {
			throw new IllegalArgumentException("Mã phiếu nhập này đã tồn tại");
		}
//		SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
//		Date date = new Date();
		Phieuthanhly res = ptlRepository.save(ptl);
		List<ChitietPTL> chitietPtl = ptl.getChitietPTL();
		for(int i=0; i<chitietPtl.size(); ++i) {
			chitietPtlRepository.save(chitietPtl.get(i));
		}
		return res;
	}
}
