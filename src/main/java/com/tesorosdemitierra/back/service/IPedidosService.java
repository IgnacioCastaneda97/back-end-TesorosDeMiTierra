package com.tesorosdemitierra.back.service;

import com.tesorosdemitierra.back.model.Clientes;
import com.tesorosdemitierra.back.model.Pedidos;

import java.util.List;

public interface IPedidosService {
    // metodo para traer o ver un pedido
    public List<Pedidos> getPedido();

    // metodo para guardar o dar de alta un pedido
    public void savePedido(Pedidos pedido);

    // metodo para borrar un pedido
    // recibe como parametro un ID
    public void deletePedido(Long id);


    //metodo para buscar un  pedido
    public Pedidos findPedido(Long id);

    // metodo para modificar un  pedido
    void updatePedido(Long id, Pedidos pedidoActualizado);
}
