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

import net.java.springboot.model.Khuvuc;
import net.java.springboot.service.KhuvucService;

@CrossOrigin(origins = "http://localhost:5500")
@RestController
@RequestMapping("/api/v1/")
public class KhuvucController {
	@Autowired
	KhuvucService service;
	
	@GetMapping("/khuvuc")
	public List<Khuvuc> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/khuvuc/{id}")
	public Khuvuc getById(@PathVariable String id) {
		return service.getById(id);
	}
	
	@PostMapping("/khuvuc")
	public Khuvuc create(@RequestBody Khuvuc kv) {
		return service.create(kv);
	}
	
	@PutMapping("/khuvuc/{id}")
	public ResponseEntity<Khuvuc> update(@PathVariable String id, @RequestBody Khuvuc kv) {
		Khuvuc res = service.update(id, kv);
		return ResponseEntity.ok(res);
	}
}
