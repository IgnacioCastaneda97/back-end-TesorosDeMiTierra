package com.tesorosdemitierra.back.repository;

import com.tesorosdemitierra.back.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductosRepository extends JpaRepository<Productos,Long> {
}
