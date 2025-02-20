package com.tesorosdemitierra.back.controller;

import com.tesorosdemitierra.back.model.MetodosPago;
import com.tesorosdemitierra.back.service.IMetodosPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/metodosDePago")

public class MetodosPagoController {
    @Autowired
    private IMetodosPagoService metodosPagoService;

    //EndPoint para trer todos los métodos de pago
    @GetMapping("/traer")
    public List<MetodosPago> getMetodosPago(){
        return metodosPagoService.getMetodoPago();
    }

    //EndPoint para crear un metodo de pago
    @PostMapping("/crear")
    public String saveMetodosPago(@RequestBody MetodosPago metodosPago){
        metodosPagoService.saveMetodoPago(metodosPago);
        return "La reserva fue creada con exito";
    }

    //EndPoint para borrar un metodo de pago
    @DeleteMapping("/borrar/{id}")
    public String deleteMetodosPago(@PathVariable Long id){
        metodosPagoService.deleteMetodoPago(id);
        return "El metodo de pago fue eliminado";
    }

    //EdnPoint para editar un metodo de pago
    @PutMapping("/editar/{id}")
    public ResponseEntity<String> updateMetodoPago(@PathVariable Long id, @RequestBody MetodosPago metodoPagoActualizado) {
        metodosPagoService.updateMetodoPago(id, metodoPagoActualizado);
        return ResponseEntity.ok("Se actualizo correctamente");
    }
}
