package com.irvingdevjava.agencia_autos.Repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irvingdevjava.agencia_autos.Entidades.Marca;


public interface MarcaRepository extends JpaRepository<Marca, Long>{

    Optional<Marca> findByNombre(String nombre);

}
