package net.java.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.java.springboot.model.Phieusudung;
import net.java.springboot.model.Thietbi;
import net.java.springboot.service.PhieusudungService;

@CrossOrigin("http://localhost:5500")
@RestController
@RequestMapping("/api/v1/")
public class PhieusudungController {
	@Autowired
	PhieusudungService service;
	
	@GetMapping("/phieusudung")
	public List<Phieusudung> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/phieusudung/{id}")
	public Phieusudung getById(@PathVariable String id) {
		return service.getById(id);
	}
	
	@PostMapping("/phieusudung")
	public Phieusudung create(@RequestBody Phieusudung psd) {
		return service.create(psd);
	}
	
	@PostMapping("/phieusudung/{id}")
	public Phieusudung accept(@PathVariable String id) {
		return service.accept(id);
	}
	
	@PutMapping("/phieusudung/{id}")
	public ResponseEntity<String> rollbackEquipment(@PathVariable String id, @RequestBody Thietbi tb) {
		String res =  service.rollbackEquipment(id, tb.getId());
		System.out.println("Check response: " + res);
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
}
