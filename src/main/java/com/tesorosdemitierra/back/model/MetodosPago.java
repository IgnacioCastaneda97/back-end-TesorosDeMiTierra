package com.tesorosdemitierra.back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MetodosPago {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id_metodo_pago;
    private String tipo_pago;

    public MetodosPago() {
    }

    public MetodosPago(long id_metodo_pago, String tipo_pago) {
        this.id_metodo_pago = id_metodo_pago;
        this.tipo_pago = tipo_pago;
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
}
