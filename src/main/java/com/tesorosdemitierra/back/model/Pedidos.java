package com.tesorosdemitierra.back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id_pedido;
    private Date fecha;
    private String direccion;
    private double total;
    private boolean envio;
    private String estado;
    private long cliente_id;
    private long producto_id;
    private long metodo_pago_id;

    public Pedidos() {

    }

    public Pedidos(long id_pedido, Date fecha, String direccion, double total, boolean envio, String estado, long cliente_id, long producto_id, long metodo_pago_id) {
        this.id_pedido = id_pedido;
        this.fecha = fecha;
        this.direccion = direccion;
        this.total = total;
        this.envio = envio;
        this.estado = estado;
        this.cliente_id = cliente_id;
        this.producto_id = producto_id;
        this.metodo_pago_id = metodo_pago_id;
    }

    public long getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(long id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isEnvio() {
        return envio;
    }

    public void setEnvio(boolean envio) {
        this.envio = envio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public long getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(long cliente_id) {
        this.cliente_id = cliente_id;
    }

    public long getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(long producto_id) {
        this.producto_id = producto_id;
    }

    public long getMetodo_pago_id() {
        return metodo_pago_id;
    }

    public void setMetodo_pago_id(long metodo_pago_id) {
        this.metodo_pago_id = metodo_pago_id;
    }
}
