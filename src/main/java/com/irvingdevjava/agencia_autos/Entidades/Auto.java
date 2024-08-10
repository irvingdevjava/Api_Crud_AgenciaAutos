package com.irvingdevjava.agencia_autos.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "El modelo del auto es obligatorio")
    private String modelo;

    @NotNull(message = "El año es obligatorio")
    private Integer anio;

    @ManyToOne
    @JoinColumn(name = "marca_id", nullable = false)
    @NotNull(message = "La marca es obligatoria")
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "agencia_id", nullable = false)
    @NotNull(message = "La agencia es obligatoria")
    private Agencia agencia;

    // Constructor sin args requerido por JPA
    public Auto() {}

    // Constructor con Builder
    public Auto(Long id, String modelo, Integer anio, Marca marca, Agencia agencia) {
        this.id = id;
        this.modelo = modelo;
        this.anio = anio;
        this.marca = marca;
        this.agencia = agencia;
    }

}
