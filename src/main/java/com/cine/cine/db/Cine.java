package com.cine.cine.db;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cine {
    @Id
    private Long cine;
    @NotNull
    @NotEmpty
    private String nombre;
    
}
