package com.example.projetospring.service;

import com.example.projetospring.model.Cliente;
import com.example.projetospring.model.Veiculo;
import com.example.projetospring.repositories.ClienteRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepositories repositories;

    public List<Cliente> findAll (){
       return repositories.findAll();
    }
    public Cliente save(Cliente cliente){
        Cliente cliente = new Cliente();
        return repositories.save(cliente);
    }

}
