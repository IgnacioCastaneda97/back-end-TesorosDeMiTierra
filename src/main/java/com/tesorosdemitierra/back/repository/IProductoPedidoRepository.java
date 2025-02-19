package com.tesorosdemitierra.back.repository;

import com.tesorosdemitierra.back.model.ProductoPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoPedidoRepository extends JpaRepository<ProductoPedido,Long> {
}
