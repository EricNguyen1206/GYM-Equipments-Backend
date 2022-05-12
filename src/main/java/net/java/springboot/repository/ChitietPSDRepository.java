package net.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.springboot.model.ChitietPSD;
import net.java.springboot.model.ChitietPSDId;
@Repository
public interface ChitietPSDRepository extends JpaRepository<ChitietPSD, ChitietPSDId> {

}
