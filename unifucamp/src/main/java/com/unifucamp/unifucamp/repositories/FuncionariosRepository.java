package com.unifucamp.unifucamp.repositories;

import com.unifucamp.unifucamp.models.Funcionarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionariosRepository extends JpaRepository<Funcionarios, String> {
    
}

