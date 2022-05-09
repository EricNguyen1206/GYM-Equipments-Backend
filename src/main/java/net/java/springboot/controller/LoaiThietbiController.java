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

import net.java.springboot.model.LoaiThietbi;
import net.java.springboot.service.LoaiThietbiService;

@CrossOrigin(origins = "http://localhost:5500")
@RestController
@RequestMapping("/api/v1/")
public class LoaiThietbiController {
	@Autowired
	LoaiThietbiService service;
	
	@GetMapping("/loaithietbi")
	public List<LoaiThietbi> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/loaithietbi/{id}")
	public LoaiThietbi getById(@PathVariable String id) {
		return service.getById(id);
	}
	
	@PostMapping("/loaithietbi")
	public LoaiThietbi create(@RequestBody LoaiThietbi ltb) {
		return service.create(ltb);
	}
	
	@PutMapping("/loaithietbi/{id}")
	public ResponseEntity<LoaiThietbi> update(@PathVariable String id, @RequestBody LoaiThietbi ltb) {
		LoaiThietbi updated = service.update(id, ltb);
		return ResponseEntity.ok(updated);
	}
}
