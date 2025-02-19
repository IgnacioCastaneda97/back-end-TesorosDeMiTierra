package com.tesorosdemitierra.back.repository;

import com.tesorosdemitierra.back.model.MetodosPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMetodosPagoRepository extends JpaRepository<MetodosPago,Long> {
}
