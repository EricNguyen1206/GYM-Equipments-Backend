package net.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.springboot.model.ChitietPN;
import net.java.springboot.model.ChitietPNId;

@Repository
public interface ChitietPNRepository extends JpaRepository<ChitietPN, ChitietPNId> {

}
