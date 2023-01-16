/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.altioracorp.ordenes.dto;

import lombok.Builder;
import lombok.Data;

/**
 *
 * @author USUARIO
 */
@Data
@Builder
public class ClienteDto {
    
    private String identificacion;
    private String nombre;
    private String apellido;
    private long cantidadOrdenes;
}
