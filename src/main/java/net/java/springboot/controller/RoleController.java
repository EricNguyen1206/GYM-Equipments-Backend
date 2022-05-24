package net.java.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.java.springboot.model.Roles;
import net.java.springboot.service.RoleService;

@CrossOrigin(origins = "http://localhost:5500")
@RestController
@RequestMapping("/api/v1/")
public class RoleController {
	@Autowired
	RoleService roleService;
	
	//Get all Role
	@GetMapping("/roles")
	public List<Roles> getAllChucvu() {
		return roleService.getAllRole();
	}
	
	//Get Role by ID
	@GetMapping("/roles/{id}")
	public ResponseEntity<Roles> getChucvuByRoleId(@PathVariable String id) {
		return ResponseEntity.ok(roleService.getRoleById(id));
	}
	
	//Create Role
	@PostMapping("/roles")
	public Roles createRole(@RequestBody Roles role) {
		return roleService.createRole(role);
	}
}
