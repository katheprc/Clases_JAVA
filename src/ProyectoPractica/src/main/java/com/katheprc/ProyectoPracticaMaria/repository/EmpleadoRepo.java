package com.katheprc.ProyectoPracticaMaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.katheprc.ProyectoPracticaMaria.entity.Empleado;

@Repository
public interface EmpleadoRepo extends JpaRepository<Empleado, Integer>{

}
