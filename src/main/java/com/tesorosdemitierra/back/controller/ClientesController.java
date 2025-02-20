package com.tesorosdemitierra.back.controller;

import com.tesorosdemitierra.back.model.Clientes;
import com.tesorosdemitierra.back.service.IClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private IClientesService clientesService;

    //EndPoint para trer todas las clientes
    @GetMapping("/traer")
    public List<Clientes> getCliente(){
        return clientesService.getClient();
    }

    //EndPoint para crear una cliente
    @PostMapping("/crear")
    public String saveCliente(@RequestBody Clientes cliente){
        clientesService.saveClient(cliente);
        return "El Cliente fue creado con exito";
    }

    //EndPoint para borrar un Cliente
    @DeleteMapping("/borrar/{id}")
    public String deleteCliente(@PathVariable Long id){
        clientesService.deleteClient(id);
        return "El cliente fue eliminado";
    }
    //EdnPoint para editar un Cliente
    @PutMapping("/editar/{id}")
    public ResponseEntity<String> editarCliente(@PathVariable Long id, @RequestBody Clientes clienteActualizado){
        clientesService.updateClient(id,clienteActualizado);
        return ResponseEntity.ok("Se actualizo correctamente");
    }
}
