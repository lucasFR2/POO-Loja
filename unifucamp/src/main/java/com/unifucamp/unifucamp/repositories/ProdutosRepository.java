package com.unifucamp.unifucamp.repositories;

import com.unifucamp.unifucamp.models.Produtos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Integer> {
    
}

