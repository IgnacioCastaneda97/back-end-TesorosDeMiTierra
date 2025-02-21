package com.tesorosdemitierra.back.service;

import com.tesorosdemitierra.back.model.Clientes;
import com.tesorosdemitierra.back.model.MetodosPago;

import java.util.List;

public interface IMetodosPagoService {

    // metodo para traer o ver metodo de pago
    public List<MetodosPago> getMetodoPago();

    // metodo para guardar o dar de alta metodos de pago
    public void saveMetodoPago(MetodosPago metodoPago);

    // metodo para borrar un metodo de pago
    // recibe como parametro un ID
    public void deleteMetodoPago(Long id);


    //metodo para buscar un Metodo de Pago
    public MetodosPago findMetodoPago(Long id);

    // metodo para modificar un Metodo de Pago
    void updateMetodoPago(Long id, MetodosPago metodoPagoActualizado);

}
