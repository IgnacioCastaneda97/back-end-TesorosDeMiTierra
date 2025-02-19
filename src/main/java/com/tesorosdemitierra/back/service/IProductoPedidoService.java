package com.tesorosdemitierra.back.service;

import com.tesorosdemitierra.back.model.Pedidos;
import com.tesorosdemitierra.back.model.ProductoPedido;

import java.util.List;

public interface IProductoPedidoService {

    // metodo para traer o ver productos por cada pedido
    public List<ProductoPedido> getProductoPedido();

    // metodo para guardar o dar de alta un productos por cada pedido
    public void saveProductoPedido(ProductoPedido productoPedido);

    // metodo para borrar productos por cada pedido
    // recibe como parametro un ID
    public void deleteProductoPedido(long id);


    //metodo para buscar productos por cada pedido
    public ProductoPedido findProductoPedido(long id);

    // metodo para modificar productos por cada pedido
    void updateProductoPedido(long id, ProductoPedido productoPedidoActualizado);
}
