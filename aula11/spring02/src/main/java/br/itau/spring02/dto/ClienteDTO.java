package br.itau.spring02.dto;

import br.itau.spring02.model.Cliente;

public class ClienteDTO {
    private String nome;
    private String email;

    public ClienteDTO(Cliente cliente) {
        nome = cliente.getNome();
        email = cliente.getEmail();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
} 