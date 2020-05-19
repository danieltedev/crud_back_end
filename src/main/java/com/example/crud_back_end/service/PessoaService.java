package com.example.crud_back_end.service;

import java.util.List;

import com.example.crud_back_end.model.Pessoa;
import com.example.crud_back_end.repository.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public Pessoa salvar(Pessoa pessoa) {
        return this.repository.save(pessoa);
    }

    public List<Pessoa> listarTodos() {
        return this.repository.findAll();
    }

    public Pessoa buscarPorId(Long id) {
        return this.repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        this.repository.deleteById(id);
    }
    
}