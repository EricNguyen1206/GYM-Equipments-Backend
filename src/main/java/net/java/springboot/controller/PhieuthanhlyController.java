package net.java.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.java.springboot.model.Phieuthanhly;
import net.java.springboot.service.PhieuthanhlyService;

@CrossOrigin("http://localhost:5500")
@RestController
@RequestMapping("/api/v1/")
public class PhieuthanhlyController {
	@Autowired
	PhieuthanhlyService service;
	
	@GetMapping("/phieuthanhly")
	public List<Phieuthanhly> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/phieuthanhly/{id}")
	public Phieuthanhly getById(@PathVariable String id) {
		return service.getById(id);
	}
	
	@PostMapping("/phieuthanhly")
	public Phieuthanhly create(@RequestBody Phieuthanhly psd) {
		return service.create(psd);
	}
}
