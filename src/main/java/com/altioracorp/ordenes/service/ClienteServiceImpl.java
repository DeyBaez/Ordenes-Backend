/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.altioracorp.ordenes.service;

import com.altioracorp.ordenes.model.Cliente;
import com.altioracorp.ordenes.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    @Override
    public List<Cliente> getAll(){
        return clienteRepository.findAll();
    }
    
    @Override
    public Optional<Cliente> getByIdentificacion(String identidicacion){
        return clienteRepository.findById(identidicacion);
    }
    
    @Override
    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }
    
    @Override
    public void update(Cliente cliente){
        clienteRepository.save(cliente);
    }
    
    @Override
    public void delete(String identificacion){
        clienteRepository.deleteById(identificacion);
    }
    
}
