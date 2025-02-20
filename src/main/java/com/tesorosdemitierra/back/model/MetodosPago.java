package com.tesorosdemitierra.back.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class MetodosPago {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id_metodo_pago;
    private String tipo_pago;

    @OneToMany(mappedBy = "metodo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pedidos> pedidos;

    public MetodosPago() {
    }

    public MetodosPago(long id_metodo_pago, String tipo_pago, List<Pedidos> pedidos) {
        this.id_metodo_pago = id_metodo_pago;
        this.tipo_pago = tipo_pago;
        this.pedidos = pedidos;
    }

    public long getId_metodo_pago() {
        return id_metodo_pago;
    }

    public void setId_metodo_pago(long id_metodo_pago) {
        this.id_metodo_pago = id_metodo_pago;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public List<Pedidos> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }
}
