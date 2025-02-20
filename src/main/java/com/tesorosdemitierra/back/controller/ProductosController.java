package com.tesorosdemitierra.back.controller;

import com.tesorosdemitierra.back.model.Productos;
import com.tesorosdemitierra.back.service.IProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductosController {
    @Autowired
    private IProductosService productosService;

    //EndPoint para trer todos los productos
    @GetMapping("/traer")
    public List<Productos> getCliente(){
        return productosService.getProduct();
    }

    //EndPoint para crear un producto
    @PostMapping("/crear")
    public String saveProducto(@RequestBody Productos producto){
        productosService.saveProduct(producto);
        return "El producto fue creado con exito";
    }

    //EndPoint para borrar un producto
    @DeleteMapping("/borrar/{id}")
    public String deleteProducto(@PathVariable Long id){
        productosService.deleteProduct(id);
        return "El producto fue eliminado";
    }

    //EdnPoint para editar un producto
    @PutMapping("/editar/{id}")
    public ResponseEntity<String> editarProducto(@PathVariable Long id, @RequestBody Productos productoActualizado){
        productosService.updateProduct(id,productoActualizado);
        return ResponseEntity.ok("Se actualizo correctamente");
    }
}
