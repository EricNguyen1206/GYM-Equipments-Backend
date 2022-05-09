package net.java.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.java.springboot.model.TinhtrangTB;
import net.java.springboot.service.TinhtrangTBService;

@CrossOrigin(origins = "http://localhost:5500")
@RestController
@RequestMapping("/api/v1/")
public class TinhtrangController {
	@Autowired
	TinhtrangTBService tinhtrangservice;
	
	@GetMapping("/tinhtrang")
	public List<TinhtrangTB> getAllTinhtrang() {
		return tinhtrangservice.getAllTinhtrang();
	}
	
	@PostMapping("/tinhtrang")
	public TinhtrangTB createTinhtrang(@RequestBody TinhtrangTB tinhtrang) {
		return tinhtrangservice.creteTinhtrang(tinhtrang);
	}
}
