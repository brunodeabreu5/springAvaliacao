package com.example.projetospring.service;

import com.example.projetospring.model.Cliente;
import com.example.projetospring.model.Veiculo;
import com.example.projetospring.repositories.VeiculoRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {
    @Autowired
    private VeiculoRepositories repositories;

    public List<Veiculo> findAll (){
        return repositories.findAll();
    }

}
