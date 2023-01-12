/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.altioracorp.ordenes.controller;

import com.altioracorp.ordenes.model.Orden;
import com.altioracorp.ordenes.service.OrdenServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author USUARIO
 */
@RestController
@RequestMapping("/api/v1/ordenes")
@CrossOrigin(origins = "http://localhost:4200")
public class OrdenController {
    
    @Autowired
    private OrdenServiceImpl ordenService;

    @GetMapping("/getAll")
    public List<Orden> getAll() {
        return ordenService.getAll();
    }
    
    @PostMapping("/save")
    public Orden save(@RequestBody Orden orden) {
        return ordenService.save(orden);
    }
}
