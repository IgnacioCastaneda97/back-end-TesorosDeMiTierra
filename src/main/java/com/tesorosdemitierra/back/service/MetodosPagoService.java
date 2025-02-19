package com.tesorosdemitierra.back.service;

import com.tesorosdemitierra.back.model.MetodosPago;
import com.tesorosdemitierra.back.repository.IMetodosPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetodosPagoService implements IMetodosPagoService{
    @Autowired
    private IMetodosPagoRepository metodosPagoRepository;

    @Override
    public List<MetodosPago> getMetodoPago() {
        List<MetodosPago>listaMetodos=metodosPagoRepository.findAll();
        return listaMetodos;
    }

    @Override
    public void saveMetodoPago(MetodosPago metodoPago) {
        metodosPagoRepository.save(metodoPago);
    }

    @Override
    public void deleteMetodoPago(long id) {
        metodosPagoRepository.deleteById(id);
    }

    @Override
    public MetodosPago findMetodoPago(long id) {

        MetodosPago metodosPago = metodosPagoRepository.findById(id).orElse(null);
        return metodosPago;
    }

    @Override
    public void updateMetodoPago(long id, MetodosPago metodoPagoActualizado) {
        MetodosPago metodosPago = metodosPagoRepository.findById(id).orElse(null);
        if (metodosPago!=null){
            // update de los datos de producto
            metodosPago.setTipo_pago(metodoPagoActualizado.getTipo_pago());

            // guardar el nuevo producto en bd
            metodosPagoRepository.save(metodosPago);
        }else {
            System.out.println("no se encontraron metodos de pago con el id "+ id);
        }
    }
}
