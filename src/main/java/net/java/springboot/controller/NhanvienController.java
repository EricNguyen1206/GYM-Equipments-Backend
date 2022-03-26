package net.java.springboot.controller;

import net.java.springboot.model.Nhanvien;
import net.java.springboot.repository.NhanvienRepository;
import net.java.springboot.service.NhanvienService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/api/v1/")
public class NhanvienController {
	@Autowired
	private NhanvienRepository nhanvienService;
	
	// Get all Nhanvien
	@GetMapping("/nhanvien")
	public List<Nhanvien> getAllNhanvien() {
		return nhanvienService.findAll();
	}
	
//	// Get Nhanvien by MaNV
//	@GetMapping("/nhanvien/{MaNV}")
//	public ResponseEntity<Nhanvien> getNhanvienByMaNV(@PathVariable String MaNV) {
//		return ResponseEntity.ok(nhanvienService.getNhanvienById(MaNV));
//	}
//	
//	
//	// Add Nhanvien to repository
//	@PostMapping("/nhanvien")
//	public Nhanvien createNhanvien(@Validated @RequestBody Nhanvien nhanvien) {
//		return nhanvienService.createNhanvien(nhanvien);
//	}
	
	
}
