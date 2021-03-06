package net.java.springboot.controller;

import net.java.springboot.model.Nhanvien;
import net.java.springboot.service.NhanvienService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5500")
@RestController
@RequestMapping("/api/v1/")
public class NhanvienController {
	@Autowired
	private NhanvienService service;
	
	@GetMapping("/nhanvien")
	public List<Nhanvien> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/nhanvien/{id}")
	public ResponseEntity<Nhanvien> getById(@PathVariable String id) {
		return ResponseEntity.ok(service.getById(id));
	}
	
	@PostMapping("/nhanvien")
	public Nhanvien create(@RequestBody Nhanvien nv) {
		return service.create(nv);
	}
	
	@PutMapping("/nhanvien/{id}")
	public ResponseEntity<Nhanvien> update(@PathVariable String id, @RequestBody Nhanvien nv) {
		Nhanvien updated = service.update(id, nv);
		return ResponseEntity.ok(updated);
	}
}
