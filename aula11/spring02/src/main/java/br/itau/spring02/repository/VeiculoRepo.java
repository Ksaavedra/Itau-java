package br.itau.spring02.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.itau.spring02.model.Veiculo;

@Repository
public interface VeiculoRepo extends CrudRepository <Veiculo, Integer> {

    public List<Veiculo> findByAnoFabricacaoGreaterThanEqual(int anoFabricacao);
} 