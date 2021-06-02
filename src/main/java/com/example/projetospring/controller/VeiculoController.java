package com.example.projetospring.controller;


import com.example.projetospring.model.Cliente;
import com.example.projetospring.model.Veiculo;

import com.example.projetospring.service.VeiculoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("veiculo")
public class VeiculoController {

    private VeiculoService veiculoService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    List findAll(){return veiculoService.findAll();}

    @RequestMapping(value = "veiculo", method = RequestMethod.POST)
    public Veiculo Post(@Valid @RequestBody Veiculo veiculo){
        return veiculoService.save(veiculo);
    }
}
