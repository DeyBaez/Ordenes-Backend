/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.altioracorp.ordenes.service;

import com.altioracorp.ordenes.model.Articulo;
import com.altioracorp.ordenes.model.Orden;
import com.altioracorp.ordenes.model.OrdenDetalle;
import com.altioracorp.ordenes.repository.ArticuloRepository;
import com.altioracorp.ordenes.repository.OrdenRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */
@Service
public class OrdenServiceImpl implements OrdenService{
    
    @Autowired
    private OrdenRepository ordenRepository;
    
    @Autowired
    private ArticuloRepository articuloRepository;
    
    @Override
    public List<Orden> getAll(){
        return ordenRepository.findAll();
    }
 
    @Override
    public Orden save(Orden orden){
        List<OrdenDetalle> detalles = new ArrayList<>();
        for(OrdenDetalle d : orden.getOrdenDetalles()){
            OrdenDetalle detalle = new OrdenDetalle(d.getNombre(), d.getCantidad(), d.getPrecioUnitario(), d.getTotal(), orden, d.getIdProduct());
            detalles.add(detalle);
            Articulo articulo = articuloRepository.findById(d.getIdProduct()).get();
            articulo.setStock(articulo.getStock()- d.getCantidad());
            articuloRepository.save(articulo);
        }
        orden.setOrdenDetalles(detalles);
        return ordenRepository.save(orden);
    }
}
