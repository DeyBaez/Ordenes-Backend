/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.altioracorp.ordenes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.altioracorp.ordenes.model.Orden;


/**
 *
 * @author USUARIO
 */
@Repository
public interface OrdenRepository extends JpaRepository<Orden, Long>{
    
}
