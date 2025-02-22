package com.tesorosdemitierra.back.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id_pedido")
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_pedido;
    private Date fecha;
    private String direccion;
    private double total;
    private boolean envio;
    private String estado;


    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Clientes client;

    @ManyToOne
    @JoinColumn(name="metodo_pago_id")
    private MetodosPago metodo;

    @ManyToMany
    @JoinTable(
            name = "producto_pedido",
            joinColumns = @JoinColumn(name = "pedido_id"),
            inverseJoinColumns = @JoinColumn(name = "producto_id")
    )
    private List<Productos> productos;

    public Pedidos() {

    }

    public Pedidos(Long id_pedido, Date fecha, String direccion, double total, boolean envio, String estado, Clientes client, MetodosPago metodo, List<Productos> productos) {
        this.id_pedido = id_pedido;
        this.fecha = fecha;
        this.direccion = direccion;
        this.total = total;
        this.envio = envio;
        this.estado = estado;
        this.client = client;
        this.metodo = metodo;
        this.productos = productos;
    }

    public Long getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Long id_pedido) {
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

    public Clientes getClient() {
        return client;
    }

    public void setClient(Clientes client) {
        this.client = client;
    }

    public MetodosPago getMetodo() {
        return metodo;
    }

    public void setMetodo(MetodosPago metodo) {
        this.metodo = metodo;
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }
}
