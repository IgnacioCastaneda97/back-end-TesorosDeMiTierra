package com.tesorosdemitierra.back.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id_cliente;
    private String nombre_completo;
    private String email;
    private String contrasena;
    private String telefono;

@OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
private List<Pedidos> pedidos;

    public Clientes() {
    }

    public Clientes(long id_cliente, String nombre_completo, String email, String contrasena, String telefono, List<Pedidos> pedidos) {
        this.id_cliente = id_cliente;
        this.nombre_completo = nombre_completo;
        this.email = email;
        this.contrasena = contrasena;
        this.telefono = telefono;
        this.pedidos = pedidos;
    }

    public long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Pedidos> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }
}

