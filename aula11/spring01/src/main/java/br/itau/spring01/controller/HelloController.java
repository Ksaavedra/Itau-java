package br.itau.spring01.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // informa que esta classe é um Controller do tipo REST
@CrossOrigin("*") // aceita requisições de outros domínios
@RequestMapping("/hello") // nome do recurso que será acionado
public class HelloController {

    @GetMapping // a requisição será do tipo GET 
    public String olaMundo() {
        return "Olá Mundo!";
    }
    
}

