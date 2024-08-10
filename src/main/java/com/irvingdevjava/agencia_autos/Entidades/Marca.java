package com.irvingdevjava.agencia_autos.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "El nombre de la marca es obligatorio")
    @Size(max = 50, message = "El nombre de la marca no puede exceder los 50 caracteres")
    private String nombre;

    // Constructor sin args requerido por JPA
    public Marca() {}

    // Constructor con Builder
    public Marca(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
