package com.platzimarket.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "clientes")

public class Cliente {
    @Id
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer celular;
    private String direccion;
    @Column(name = "correo_electronico")
    private String correoElectronico;


    @OneToMany (mappedBy = "cliente")
    private List<Compra> compra;

    //set and get
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
