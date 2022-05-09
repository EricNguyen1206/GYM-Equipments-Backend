package net.java.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.java.springboot.model.TinhtrangTB;
import net.java.springboot.repository.TinhtrangRepository;
@Service
public class TinhtrangTBService {
	@Autowired
	TinhtrangRepository tinhtrangRepository;
	
	public List<TinhtrangTB> getAllTinhtrang() {
		return tinhtrangRepository.findAll();
	}
	public TinhtrangTB creteTinhtrang(TinhtrangTB tinhtrang) {
		System.out.print(tinhtrang.toString());
		return tinhtrangRepository.save(tinhtrang);
	}
}
