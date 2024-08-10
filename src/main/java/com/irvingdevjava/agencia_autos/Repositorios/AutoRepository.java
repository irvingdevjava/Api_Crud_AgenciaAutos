package com.irvingdevjava.agencia_autos.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irvingdevjava.agencia_autos.Entidades.Auto;

public interface AutoRepository extends JpaRepository<Auto, Long>{
    List<Auto> findByModelo(String modelo);
    List<Auto> findByAnio(int anio);
    List<Auto> findByMarca(String marca);
    List<Auto> findByAgencia(int agencia);

}
