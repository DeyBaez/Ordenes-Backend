/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.altioracorp.ordenes.service;

import com.altioracorp.ordenes.model.OrdenDetalle;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface OrdenDetalleService {
    
    public List<OrdenDetalle> getAll();
    public OrdenDetalle save(OrdenDetalle ordenDetalle);
}
