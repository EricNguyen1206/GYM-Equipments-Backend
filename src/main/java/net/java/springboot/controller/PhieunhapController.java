package net.java.springboot.controller;

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

import net.java.springboot.model.ChitietPN;
import net.java.springboot.model.Phieunhap;
import net.java.springboot.service.PhieunhapService;

@CrossOrigin(origins = "http://localhost:5500")
@RestController
@RequestMapping("/api/v1/")
public class PhieunhapController {
	@Autowired
	PhieunhapService service;
	
	@GetMapping("/phieunhap")
	public List<Phieunhap> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/phieunhap/{id}")
	public ResponseEntity<Phieunhap> getById(@PathVariable String id) {
		return ResponseEntity.ok(service.getById(id));
	}
	@PostMapping("/phieunhap")
	public Phieunhap create(@RequestBody Phieunhap pn) {
		return service.create(pn);
	}
}
