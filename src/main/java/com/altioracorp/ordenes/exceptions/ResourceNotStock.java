/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.altioracorp.ordenes.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author USUARIO
 */
@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class ResourceNotStock extends RuntimeException {
        public ResourceNotStock(String mensaje) {
		super(mensaje);
	}
}
