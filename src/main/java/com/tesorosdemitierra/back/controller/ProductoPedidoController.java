package com.tesorosdemitierra.back.controller;


import com.tesorosdemitierra.back.model.ProductoPedido;

import com.tesorosdemitierra.back.service.IProductoPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productoPedidos")
public class ProductoPedidoController {


    @Autowired
    private IProductoPedidoService productoPedidoService;

    //EndPoint para trer todos los Producto-pedido
    @GetMapping("/traer")
    public List<ProductoPedido> getProductoPedido(){
        return productoPedidoService.getProductoPedido();
    }

    //EndPoint para crear un Producto
    @PostMapping("/crear")
    public String saveProductoPedidos(@RequestBody ProductoPedido productoPedidos){
        productoPedidoService.saveProductoPedido(productoPedidos);
        return "El producto-pedido fue creado  con exito";
    }

    //EndPoint para borrar un Producto pedido
    @DeleteMapping("/borrar/{id}")
    public String deleteProductoPedido(@PathVariable Long id){
        productoPedidoService.deleteProductoPedido(id);
        return "El Producto pedido fue eliminado";
    }

    //EdnPoint para editar un Producto pedido
    @PutMapping("/editar/{id}")
    public ResponseEntity<String> editarProductoPedido(@PathVariable Long id, @RequestBody ProductoPedido productoPedidoActualizado){
        productoPedidoService.updateProductoPedido(id, productoPedidoActualizado);
        return ResponseEntity.ok("Se actualizo correctamente el producto-pedido");
    }

}
