package com.example.crud_back_end.repository;

import com.example.crud_back_end.model.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * PessoaRepository
 */
@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
}