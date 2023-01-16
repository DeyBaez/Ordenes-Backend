/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.altioracorp.ordenes.mapper;

import com.altioracorp.ordenes.dto.ClienteDto;
import com.altioracorp.ordenes.model.Cliente;
import com.altioracorp.ordenes.repository.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */
@Service
public class ClienteMapper {
    
    @Autowired
    OrdenRepository ordenRepository;
    
    public ClienteDto map(Cliente cliente){
        return ClienteDto.builder().apellido(cliente.getApellido()).identificacion(cliente.getIdentificacion())
                .nombre(cliente.getNombre()).cantidadOrdenes(ordenRepository.countByClienteIdentificacion(cliente.getIdentificacion()))
                .build();
    }
    
}
