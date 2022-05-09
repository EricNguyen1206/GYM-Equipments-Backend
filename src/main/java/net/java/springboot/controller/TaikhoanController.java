package net.java.springboot.controller;

import java.util.List;
import java.util.Optional;

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

import net.java.springboot.model.Taikhoan;
import net.java.springboot.service.TaikhoanService;

@CrossOrigin(origins = "http://localhost:5500")
@RestController
@RequestMapping("/api/v1/")
public class TaikhoanController {
	@Autowired
	TaikhoanService service;
	
	@GetMapping("/taikhoan")
	public List<Taikhoan> getAllTaikhoan() {
		return service.getAll();
	}
	
	@GetMapping("/taikhoan/{username}")
	public Taikhoan getTaiKhoanByUsername(@PathVariable String username) {
		return service.getByUsername(username);
	}
	
	@PostMapping("/taikhoan")
	public Taikhoan createTaikhoan(@RequestBody Taikhoan tk) {
		return service.create(tk);
	}
	
	@PostMapping("/register")
	public Optional<Taikhoan> register(@RequestBody Taikhoan tk) {
		return service.register(tk);
	}
	
	@PutMapping("/taikhoan/{id}")
	public ResponseEntity<Taikhoan> update(@PathVariable String id, @RequestBody Taikhoan tk) {
		Taikhoan taikhoanUpdated = service.update(id, tk);
		return ResponseEntity.ok(taikhoanUpdated);
	}
	
}
