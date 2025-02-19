package com.tesorosdemitierra.back.repository;

import com.tesorosdemitierra.back.model.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPedidosRepository extends JpaRepository<Pedidos,Long> {
}
