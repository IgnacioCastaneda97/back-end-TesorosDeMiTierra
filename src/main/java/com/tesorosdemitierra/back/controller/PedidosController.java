package com.tesorosdemitierra.back.controller;

import com.tesorosdemitierra.back.model.Pedidos;
import com.tesorosdemitierra.back.service.IPedidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {

    @Autowired
    private IPedidosService pedidosService;

    //EndPoint para trer todos los pedidos
    @GetMapping("/traer")
    public List<Pedidos> getPedidos(){
        return pedidosService.getPedido();
    }

    //EndPoint para crear un pedidos
    @PostMapping("/crear")
    public String savePedidos(@RequestBody Pedidos pedidos){
        pedidosService.savePedido(pedidos);
        return "El producto fue creado con exito";
    }

    //EndPoint para borrar un pedido
    @DeleteMapping("/borrar/{id}")
    public String deletePedido(@PathVariable Long id){
        pedidosService.deletePedido(id);
        return "El pedido fue eliminado";
    }

    //EdnPoint para editar un pedido
    @PutMapping("/editar/{id}")
    public ResponseEntity<String> editarPedido(@PathVariable Long id, @RequestBody Pedidos pedidoActualizado){
        pedidosService.updatePedido(id, pedidoActualizado);
        return ResponseEntity.ok("Se actualizo correctamente");
    }

}
