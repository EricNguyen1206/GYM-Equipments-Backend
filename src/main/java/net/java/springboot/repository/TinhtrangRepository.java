package net.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.springboot.model.TinhtrangTB;
@Repository
public interface TinhtrangRepository extends JpaRepository<TinhtrangTB, String> {
}
