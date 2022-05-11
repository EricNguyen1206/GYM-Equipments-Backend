package net.java.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.java.springboot.model.Thietbi;
import net.java.springboot.service.ThietbiService;

@CrossOrigin(origins = "http://localhost:5500")
@RestController
@RequestMapping("/api/v1/")
public class ThietbiController {
	@Autowired
	ThietbiService service;
	
	@GetMapping("/thietbi")
	public List<Thietbi> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/thietbi/{id}")
	public Thietbi getById(@PathVariable int id) {
		return service.getById(id);
	}
	
	@PutMapping("/thietbi/{id}")
	public ResponseEntity<Thietbi> update(@PathVariable int id, @RequestBody int condition) {
		Thietbi res = service.changeCondition(id, condition);
		return ResponseEntity.ok(res);
	}
}
