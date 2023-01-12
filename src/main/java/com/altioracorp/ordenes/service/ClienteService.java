/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.altioracorp.ordenes.service;

import com.altioracorp.ordenes.model.Cliente;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author USUARIO
 */
public interface ClienteService {
    
    public List<Cliente> getAll();
    public Optional<Cliente> getByIdentificacion(String identidicacion);
    public Cliente save(Cliente cliente);
    public void update(Cliente cliente);
    public void delete(String identificacion);
    
}
