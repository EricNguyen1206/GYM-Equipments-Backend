package net.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.springboot.model.Roles;

@Repository
public interface RoleRepository extends JpaRepository<Roles, Integer> {
	//find with Chucvu's name
	//Role findByName(String name);
}
