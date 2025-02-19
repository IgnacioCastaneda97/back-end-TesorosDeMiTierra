package com.tesorosdemitierra.back.service;

import com.tesorosdemitierra.back.model.Clientes;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IClientesService {


    // metodo para traer o ver Clientes
    public List<Clientes> getClient();

    // metodo para guardar o dar de alta Clientes
    public void saveClient(Clientes cliente);

    // metodo para borrar un Cliente
    // recibe como parametro un ID
    public void deleteClient(long id);


    //metodo para buscar un Clientes
    public Clientes findClient(long id);

    // metodo para modificar un Clientes
    void updateClient(long id, Clientes clienteActualizado);
}

