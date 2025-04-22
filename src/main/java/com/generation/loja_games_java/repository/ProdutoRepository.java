package com.generation.loja_games_java.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.loja_games_java.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    public List<Produto> findByNomeContainingIgnoreCase(@Param("nome") String nome);
}
