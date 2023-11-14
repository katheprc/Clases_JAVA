package com.katheprc.TP1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.katheprc.TP1.entity.Profesor;
import com.katheprc.TP1.repository.ProfesorRepository;

@Service
public class ProfesorService {

	@Autowired
	ProfesorRepository pRepo;

	public List<Profesor> listar() {
		List<Profesor> listaProfesores = pRepo.findAll();

		return listaProfesores;
	}

}
