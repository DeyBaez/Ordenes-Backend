package com.altioracorp.ordenes.controller;

import com.altioracorp.ordenes.dto.ClienteDto;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altioracorp.ordenes.model.Cliente;
import com.altioracorp.ordenes.service.ClienteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/clientes")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteService;

    @GetMapping("/getAll")
    public List<ClienteDto> getAll() {
        return clienteService.getAll();
    }
    
    @PostMapping("/save")
    public Cliente save(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }
    
    
}
