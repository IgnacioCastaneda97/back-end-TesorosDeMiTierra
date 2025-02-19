package com.tesorosdemitierra.back.service;

import com.tesorosdemitierra.back.model.ProductoPedido;
import com.tesorosdemitierra.back.repository.IProductoPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoPedidoService implements IProductoPedidoService {
    @Autowired
    private IProductoPedidoRepository productoPedidoRepository;

    @Override
    public List<ProductoPedido> getProductoPedido() {
        List<ProductoPedido>listaProductoPedido = productoPedidoRepository.findAll();
        return listaProductoPedido;
    }

    @Override
    public void saveProductoPedido(ProductoPedido productoPedido) {
        productoPedidoRepository.save(productoPedido);
    }

    @Override
    public void deleteProductoPedido(long id) {
        productoPedidoRepository.deleteById(id);
    }

    @Override
    public ProductoPedido findProductoPedido(long id) {
        ProductoPedido productoPedido = productoPedidoRepository.findById(id).orElse(null);
        return productoPedido;
    }

    @Override
    public void updateProductoPedido(long id, ProductoPedido productoPedidoActualizado) {
        ProductoPedido productoPedido = productoPedidoRepository.findById(id).orElse(null);
        if (productoPedido!=null){
            productoPedido.setCantidad(productoPedidoActualizado.getCantidad());

            productoPedidoRepository.save(productoPedido);
        }else {
            System.out.println("No se escontraron registros con ese id "+id);
        }

    }
}
