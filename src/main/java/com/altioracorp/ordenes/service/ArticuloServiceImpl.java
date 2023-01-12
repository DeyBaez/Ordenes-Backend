/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.altioracorp.ordenes.service;

import com.altioracorp.ordenes.exceptions.ResourceNotFoundException;
import com.altioracorp.ordenes.model.Articulo;
import com.altioracorp.ordenes.repository.ArticuloRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */
@Service
public class ArticuloServiceImpl implements ArticuloService{
    
    @Autowired
    private ArticuloRepository articuloRepository;
    
    @Override
    public List<Articulo> getAll(){
        return articuloRepository.findAll();
    }
    
    @Override
    public Optional<Articulo> getById(Long id){
        Articulo articulo = articuloRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(("No existe el articulo con el ID: ") + id));
        return Optional.of(articulo);
    }
    
    @Override
    public Articulo save(Articulo articulo){
        return articuloRepository.save(articulo);
    }
    
    @Override
    public void update(Articulo articulo){
        articuloRepository.findById(articulo.getId())
                .orElseThrow(() -> new ResourceNotFoundException(("No existe el articulo con el ID: ") + articulo.getId()));
        articuloRepository.save(articulo);
    }
    
    @Override
    public void delete(Long id){
        articuloRepository.deleteById(id);
    }
}
