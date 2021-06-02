package com.example.projetospring.controller;

import com.example.projetospring.model.Cliente;
import com.example.projetospring.service.ClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    private ClienteService clienteService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List findAll(){
        return clienteService.findAll();
    }

    @RequestMapping(value = "cliente", method = RequestMethod.POST)
    public Cliente Post(@Valid @RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }


}
