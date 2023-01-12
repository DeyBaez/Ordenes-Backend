/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.altioracorp.ordenes.service;

import com.altioracorp.ordenes.model.OrdenDetalle;
import com.altioracorp.ordenes.repository.OrdenDetalleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */
@Service
public class OrdenDetalleServiceImpl implements OrdenDetalleService{
    
    @Autowired
    private OrdenDetalleRepository ordenDetalleRepository;
    
    @Override
    public List<OrdenDetalle> getAll(){
        return ordenDetalleRepository.findAll();
    }
 
    @Override
    public OrdenDetalle save(OrdenDetalle ordenDetalle){
        return ordenDetalleRepository.save(ordenDetalle);
    }
}
