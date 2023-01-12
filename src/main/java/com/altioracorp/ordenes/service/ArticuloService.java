/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.altioracorp.ordenes.service;

import com.altioracorp.ordenes.model.Articulo;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author USUARIO
 */
public interface ArticuloService {
    
    public List<Articulo> getAll();
    public Optional<Articulo> getById(Long id);
    public Articulo save(Articulo articulo);
    public void update(Articulo articulo);
    public void delete(Long id);
}
