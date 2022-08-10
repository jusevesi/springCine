package com.cine.cine.db.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cine.cine.db.Peliculas;

public interface PeliculasRepositorio extends MongoRepository<Peliculas,Long>{
    
}
