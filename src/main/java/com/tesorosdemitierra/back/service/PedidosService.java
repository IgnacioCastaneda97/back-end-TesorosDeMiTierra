package com.tesorosdemitierra.back.service;

import com.tesorosdemitierra.back.model.Pedidos;
import com.tesorosdemitierra.back.repository.IPedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PedidosService implements IPedidosService{
    @Autowired
    private IPedidosRepository pedidosRepository;


    @Override
    public List<Pedidos> getPedido() {
        List<Pedidos> listaPedidos = pedidosRepository.findAll();
        return listaPedidos;
    }

    @Override
    public void savePedido(Pedidos pedido) {
        pedidosRepository.save(pedido);
    }

    @Override
    public void deletePedido(long id) {
        pedidosRepository.deleteById(id);
    }

    @Override
    public Pedidos findPedido(long id) {
       Pedidos pedido = pedidosRepository.findById(id).orElse(null);
        return pedido;
    }

    @Override
    public void updatePedido(long id, Pedidos pedidoActualizado) {
        // busque pedido por id
        Pedidos pedido = pedidosRepository.findById(id).orElse(null);
            if (pedido!=null){
                pedido.setDireccion(pedidoActualizado.getDireccion());
                pedido.setEnvio(pedidoActualizado.isEnvio());
                pedido.setEstado(pedidoActualizado.getEstado());
                pedido.setFecha(pedidoActualizado.getFecha());
                pedido.setTotal(pedidoActualizado.getTotal());
                // guardar actualizaciones
                pedidosRepository.save(pedido);
            }else {
                System.out.println("no se encontraron pedidos con el id "+id);
            }

    }
}
