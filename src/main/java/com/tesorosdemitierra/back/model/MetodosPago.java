package com.tesorosdemitierra.back.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.List;

@Entity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id_metodo_pago")
public class MetodosPago {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_metodo_pago;
    private String tipo_pago;

    @OneToMany(mappedBy = "metodo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pedidos> pedidos;

    public MetodosPago() {
    }

    public MetodosPago(Long id_metodo_pago, String tipo_pago, List<Pedidos> pedidos) {
        this.id_metodo_pago = id_metodo_pago;
        this.tipo_pago = tipo_pago;
        this.pedidos = pedidos;
    }

    public Long getId_metodo_pago() {
        return id_metodo_pago;
    }

    public void setId_metodo_pago(Long id_metodo_pago) {
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
