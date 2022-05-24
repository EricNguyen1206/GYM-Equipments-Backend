package net.java.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.java.springboot.model.Roles;
import net.java.springboot.repository.RoleRepository;

@Service
public class RoleService {
	@Autowired
	RoleRepository roleRepository;
	
	public List<Roles> getAllRole() {
		return roleRepository.findAll();
	}
	
	public Roles getRoleById(String Id) {
		return roleRepository.getById(Id);
	}
	
	public Roles createRole(Roles role) {
		return roleRepository.save(role);
	}
}
