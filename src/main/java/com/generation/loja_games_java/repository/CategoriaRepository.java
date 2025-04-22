package com.generation.loja_games_java.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.loja_games_java.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    public List<Categoria> findByNomeContainingIgnoreCase(@Param("nome") String nome);    
}
