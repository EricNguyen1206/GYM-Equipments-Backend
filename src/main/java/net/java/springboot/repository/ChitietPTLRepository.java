package net.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.springboot.model.ChitietPTL;
import net.java.springboot.model.ChitietPTLId;
@Repository
public interface ChitietPTLRepository extends JpaRepository<ChitietPTL, ChitietPTLId> {

}
