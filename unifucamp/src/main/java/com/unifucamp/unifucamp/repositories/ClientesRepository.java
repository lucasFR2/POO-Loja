package com.unifucamp.unifucamp.repositories;

import com.unifucamp.unifucamp.models.Clientes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, String> {
    
}

