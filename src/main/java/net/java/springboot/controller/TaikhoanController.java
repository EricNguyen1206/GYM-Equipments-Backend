package net.java.springboot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5502")
@RestController
@RequestMapping("/api/v1/")
public class TaikhoanController {
	
}
