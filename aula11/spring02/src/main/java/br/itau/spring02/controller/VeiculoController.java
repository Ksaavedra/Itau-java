package br.itau.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.spring02.model.Veiculo;
import br.itau.spring02.repository.VeiculoRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoRepo repo;

    @GetMapping
    public List<Veiculo> listarTodos() {
        return (List<Veiculo>) repo.findAll();
    }

    @GetMapping("/ano/{anoInicial}")
    public List<Veiculo> listarPorAno(@PathVariable int anoInicial) {
       return repo.findByAnoFabricacaoGreaterThanEqual(anoInicial);
    }
} 