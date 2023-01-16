/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.altioracorp.ordenes.service;

import com.altioracorp.ordenes.dto.ClienteDto;
import com.altioracorp.ordenes.mapper.ClienteMapper;
import com.altioracorp.ordenes.model.Cliente;
import com.altioracorp.ordenes.repository.ClienteRepository;
import com.altioracorp.ordenes.repository.OrdenRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private OrdenRepository ordenRepository;

    @Autowired
    private ClienteMapper clienteMapper;

    @Override
    public Optional<Cliente> getByIdentificacion(String identidicacion) {
        return clienteRepository.findById(identidicacion);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void update(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public void delete(String identificacion) {
        clienteRepository.deleteById(identificacion);
    }

    @Override
    public List<ClienteDto> getAll() {

        List<Cliente> clientes = clienteRepository.findAll();
        return clientes.stream().map(c -> clienteMapper.map(c)).collect(Collectors.toList());

    }

}
