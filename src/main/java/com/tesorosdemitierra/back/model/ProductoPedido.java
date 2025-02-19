package com.tesorosdemitierra.back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductoPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id_productoPedido;
    private int cantidad;
    private long pedido_id;
    private long producto_id;

    public ProductoPedido() {
    }

    public ProductoPedido(long id_productoPedido, int cantidad, long pedido_id, long producto_id) {
        this.id_productoPedido = id_productoPedido;
        this.cantidad = cantidad;
        this.pedido_id = pedido_id;
        this.producto_id = producto_id;
    }

    public long getId_productoPedido() {
        return id_productoPedido;
    }

    public void setId_productoPedido(long id_productoPedido) {
        this.id_productoPedido = id_productoPedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public long getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(long pedido_id) {
        this.pedido_id = pedido_id;
    }

    public long getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(long producto_id) {
        this.producto_id = producto_id;
    }
}
