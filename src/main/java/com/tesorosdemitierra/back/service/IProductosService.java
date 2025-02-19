package com.tesorosdemitierra.back.service;

import com.tesorosdemitierra.back.model.Productos;

import java.util.List;

public interface IProductosService {

    // metodo para traer o leer productos
    public List<Productos> getProduct();

    // metodo para guardar o dar de alta productos
    public void saveProduct(Productos producto);

    // metodo para borrar un producto
// recibe como parametro un ID
    public void deleteProduct(long id);

    //metodo para buscar un producto
    public Productos findProduct(long id);

    // metodo para modificar un producto
    void updateProduct(long id, Productos productoActualizado);

}
