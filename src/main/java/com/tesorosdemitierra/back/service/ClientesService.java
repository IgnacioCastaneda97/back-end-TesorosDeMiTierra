package com.tesorosdemitierra.back.service;


import com.tesorosdemitierra.back.model.Clientes;
import com.tesorosdemitierra.back.repository.IClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ClientesService implements IClientesService{
    @Autowired
    private IClientesRepository clientesRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Clientes registerCliente(Clientes cliente){
        Clientes clienteLogin = new Clientes();
        clienteLogin.setEmail(cliente.getEmail());
        clienteLogin.setContrasena(passwordEncoder.encode(cliente.getContrasena()));
        return clientesRepository.save(clienteLogin);
    }
    // Métdo de carga de usuario implementado desde UserDetailsService
    public UserDetails findByUserEmail(String email) throws UsernameNotFoundException {
        Clientes cliente = clientesRepository.findByUserEmail(email);
        if (cliente == null) {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }
        return new org.springframework.security.core.userdetails.User(cliente.getEmail(), cliente.getContrasena(), new ArrayList<>());
    }

    @Override
    public List<Clientes> getClient() {
        List<Clientes>listaClientes=clientesRepository.findAll();
        return listaClientes;
    }

    @Override
    public void saveClient(Clientes cliente) {
        clientesRepository.save(cliente);
    }

    @Override
    public void deleteClient(Long id) {
        clientesRepository.deleteById(id);
    }

    @Override
    public Clientes findClient(Long id) {
        Clientes cliente = clientesRepository.findById(id).orElse(null);
        return cliente;
    }

    @Override
    public void updateClient(Long id, Clientes clienteActualizado) {
        Clientes cliente = clientesRepository.findById(id).orElse(null);
        if (cliente!=null){
            cliente.setNombre_completo(clienteActualizado.getNombre_completo());
            cliente.setEmail(clienteActualizado.getEmail());
            cliente.setTelefono(clienteActualizado.getTelefono());
            cliente.setContrasena(clienteActualizado.getContrasena());
            // guardar el nuevo producto en bd
            clientesRepository.save(cliente);
        }else {
            System.out.println("no se encontro cliente con id "+id);
        }

    }
}
