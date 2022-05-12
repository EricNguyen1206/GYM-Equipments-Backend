package net.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.springboot.model.Phieuthanhly;
@Repository
public interface PhieuthanhlyRepository extends JpaRepository<Phieuthanhly, String> {

}
