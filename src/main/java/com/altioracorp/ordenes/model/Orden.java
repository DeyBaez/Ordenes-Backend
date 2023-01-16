package com.altioracorp.ordenes.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orden")
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Column(name = "nombreCliente", nullable = false)
    private String nombreCliente;

    @OneToMany(mappedBy = "orden",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<OrdenDetalle> ordenDetalles;
    
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Cliente cliente;
    
    public Orden() {
    }

    public Orden(Long id, Date fecha, String nombreCliente, List<OrdenDetalle> ordenDetalles, Cliente cliente) {
        this.id = id;
        this.fecha = fecha;
        this.nombreCliente = nombreCliente;
        this.ordenDetalles = ordenDetalles;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public List<OrdenDetalle> getOrdenDetalles() {
        return ordenDetalles;
    }

    public void setOrdenDetalles(List<OrdenDetalle> ordenDetalles) {
        this.ordenDetalles = ordenDetalles;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    

}
