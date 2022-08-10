package com.cine.cine.db;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Peliculas {
    @Id
    private Long codigo;
    @NotNull
    @NotEmpty
    private String titulo;
    @NotNull
    @Positive
    private Long duracionMinutos;
}
