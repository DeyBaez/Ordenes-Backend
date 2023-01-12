package com.altioracorp.ordenes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altioracorp.ordenes.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {

}
