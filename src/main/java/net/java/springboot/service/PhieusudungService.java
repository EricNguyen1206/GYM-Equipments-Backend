package net.java.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.java.springboot.exception.ResourceNotFoundException;
import net.java.springboot.model.ChitietPSD;
import net.java.springboot.model.Phieusudung;
import net.java.springboot.model.Thietbi;
import net.java.springboot.repository.ChitietPSDRepository;
import net.java.springboot.repository.PhieusudungRepository;
import net.java.springboot.repository.TaikhoanRepository;
import net.java.springboot.repository.ThietbiRepository;

@Service
public class PhieusudungService {
	@Autowired
	PhieusudungRepository psdRepository;
	
	@Autowired
	ChitietPSDRepository chitietPsdRepository;
	
	@Autowired
	TaikhoanRepository tkRepository;
	
	@Autowired
	ThietbiRepository tbRepository;
	
	public List<Phieusudung> getAll() {
		return psdRepository.findAll();
	}
	
	public Phieusudung getById(int id) throws ResourceNotFoundException {
		Phieusudung psdFound = psdRepository.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Không tìm thấy Phiếu nhập có mã:"+id));
		return psdFound;
	}
	
	public String create(Phieusudung psd) throws ResourceNotFoundException, IllegalArgumentException {
		int id = psdRepository.taoPhieuthanhly(psd.getMatknv());
		List<ChitietPSD> chitietPsd = psd.getChitietPSD();
		for(int i=0; i<chitietPsd.size(); ++i) {
			chitietPsd.get(i).setMapsd(id);
			chitietPsdRepository.save(chitietPsd.get(i));
		}
		return "Tạo phiếu sử dụng thành công!";
	}
	
	public Phieusudung accept(int id) throws ResourceNotFoundException, IllegalArgumentException {
		Phieusudung psdFound = psdRepository.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Không tìm thấy Phiếu sử dụng có mã:"+id));
		
		Phieusudung res = psdRepository.duyetPhieusudung(id);
		return res;
	}
	
	public String rollbackEquipment(int mapsd, int matb) throws ResourceNotFoundException, IllegalArgumentException {
		Phieusudung psdFound = psdRepository.findById(mapsd)
				.orElseThrow(()-> new ResourceNotFoundException("Không tìm thấy Phiếu sử dụng có mã:" + mapsd));
		Thietbi tbFound = tbRepository.findById(matb)
				.orElseThrow(()-> new ResourceNotFoundException("Không tìm thấy Thiết bị có mã:" + matb));
		
		psdRepository.traThietbi(mapsd, matb);
		
		return "Đã trả thiết bị";
	}
}
