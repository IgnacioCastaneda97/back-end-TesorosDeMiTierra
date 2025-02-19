package com.tesorosdemitierra.back.service;

import com.tesorosdemitierra.back.model.Productos;
import com.tesorosdemitierra.back.repository.IPedidosRepository;
import com.tesorosdemitierra.back.repository.IProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosService implements IProductosService{
    @Autowired
    private IProductosRepository productosRepository;

    @Override
    public List<Productos> getProduct() {
     List<Productos>listaProductos=productosRepository.findAll();
        return listaProductos;
    }

    @Override
    public void saveProduct(Productos producto) {
        productosRepository.save(producto);
    }

    @Override
    public void deleteProduct(long id) {
        productosRepository.deleteById(id);
    }

    @Override
    public Productos findProduct(long id) {
        Productos productos = productosRepository.findById(id).orElse(null);
        return productos;
    }

    @Override
    public void updateProduct(long id, Productos productoActualizado) {
        Productos productos = productosRepository.findById(id).orElse(null);
        if (productos!=null){
            productos.setNombre(productoActualizado.getNombre());
            productos.setDescripcion(productoActualizado.getDescripcion());
            productos.setImagen(productoActualizado.getImagen());
            productos.setPrecio(productoActualizado.getPrecio());
            productos.setRegion(productoActualizado.getRegion());
            productos.setStock(productoActualizado.getStock());
            productosRepository.save(productos);
        }else {
            System.out.println("no se encontraron productos relacionados con el id "+id);
        }
    }
}
