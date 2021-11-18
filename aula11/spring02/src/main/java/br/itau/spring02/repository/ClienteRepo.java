package br.itau.spring02.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.itau.spring02.model.Cliente;

// CRUD = Create, Read, Update, Delete

@Repository
public interface ClienteRepo extends CrudRepository <Cliente, Integer> {

    public Cliente findByEmail(String email);
} 