package com.cine.cine.db;

import java.util.Date;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Funcion {
        @Id
        private Long identificador;
        @NotNull
        private Salas sala;
        @NotNull
        private Peliculas pelicula;
        @NotEmpty
        @FutureOrPresent
        private Date fecha;
        @NotNull
        @PositiveOrZero
        private Long numeroReservas;
}
