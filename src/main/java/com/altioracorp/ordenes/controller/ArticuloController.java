/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.altioracorp.ordenes.controller;

import com.altioracorp.ordenes.model.Articulo;
import com.altioracorp.ordenes.service.ArticuloServiceImpl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author USUARIO
 */
@RestController
@RequestMapping("/api/v1/articulos")
@CrossOrigin(origins = "http://localhost:4200")
public class ArticuloController {
    
    @Autowired
    private ArticuloServiceImpl articuloService;

    @GetMapping("/getAll")
    public List<Articulo> getAll() {
        return articuloService.getAll();
    }
    
    @PostMapping("/save")
    public Articulo save(@RequestBody Articulo articulo) {
        return articuloService.save(articulo);
    }
    
    @PutMapping("/update")
    public void update(@RequestBody Articulo articulo) {
        articuloService.update(articulo);
    }
    
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        articuloService.delete(id);
    }
    
    @GetMapping("/getById/{id}")
    public Optional<Articulo> getById(@PathVariable Long id) {
        return articuloService.getById(id);
    }

}
