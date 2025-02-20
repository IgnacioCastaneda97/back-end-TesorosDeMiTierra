package com.tesorosdemitierra.back.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id_Producto;
    private String nombre;
    private String descripcion;
    private Double precio;
    private String region;
    private int stock;
    private String imagen;

    @ManyToMany(mappedBy = "productos")
    private List<Pedidos> pedidos;

    public Productos() {
    }

    public Productos(long id_Producto, String nombre, String descripcion, Double precio, String region, int stock, String imagen, List<Pedidos> pedidos) {
        this.id_Producto = id_Producto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.region = region;
        this.stock = stock;
        this.imagen = imagen;
        this.pedidos = pedidos;
    }

    public long getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(long id_Producto) {
        this.id_Producto = id_Producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<Pedidos> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }
}
