package com.irvingdevjava.agencia_autos.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irvingdevjava.agencia_autos.Entidades.Agencia;

public interface AgenciaRepository extends JpaRepository<Agencia, Long>{
    Agencia findByNombre(String nombre);
}
