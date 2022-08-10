package com.cine.cine.db;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Salas {

    @Id
    private Long numeroSala;
    @NotNull
    @Positive
    private Integer capacidad;
    @NotNull
    @Positive
    private Long idCine;
    
}
