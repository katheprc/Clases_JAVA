package com.katheprc.TP1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.katheprc.TP1.entity.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {

	@Query("SELECT p FROM Profesor p")
	public List<Profesor> encontrarTodos();
		
}
