/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.altioracorp.ordenes.service;

import com.altioracorp.ordenes.exceptions.ResourceNotStock;
import com.altioracorp.ordenes.model.Articulo;
import com.altioracorp.ordenes.model.Orden;
import com.altioracorp.ordenes.model.Cliente;
import com.altioracorp.ordenes.model.OrdenDetalle;
import com.altioracorp.ordenes.repository.ArticuloRepository;
import com.altioracorp.ordenes.repository.OrdenRepository;
import java.util.ArrayList;
import java.util.List;
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
            int auxStock;
            OrdenDetalle detalle = new OrdenDetalle(d.getNombre(), d.getCantidad(), d.getPrecioUnitario(), d.getTotal(), orden, d.getIdProduct());
            detalles.add(detalle);
            Articulo articulo = articuloRepository.findById(d.getIdProduct()).get();
            auxStock = articulo.getStock()- d.getCantidad();
            if(auxStock < 0){
                throw new ResourceNotStock(("No existen productos disponibles"));
            }else{
                articulo.setStock(articulo.getStock()- d.getCantidad());
                articuloRepository.save(articulo);
            }
        }
        Cliente cliente = orden.getCliente();
        orden.setCliente(cliente);
        orden.setOrdenDetalles(detalles);
        return ordenRepository.save(orden);
    }
}
