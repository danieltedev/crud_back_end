package com.example.crud_back_end.resource;

import java.util.List;

import com.example.crud_back_end.model.Pessoa;
import com.example.crud_back_end.service.PessoaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaResource {
    
    @Autowired
    private PessoaService service;

    @GetMapping
    public List<Pessoa> listarTodos() {
        return this.service.listarTodos();
    }

    @PostMapping
    public Pessoa salvar(@RequestBody Pessoa pessoa) {
        return this.service.salvar(pessoa);
    }

    @PutMapping
    public Pessoa atualizar(@RequestBody Pessoa pessoa) {
        return this.service.salvar(pessoa);
    }

    @GetMapping("/{id}")
    public Pessoa buscarPorId(@PathVariable Long id) {
        return this.service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        this.service.deletar(id);
    }
}