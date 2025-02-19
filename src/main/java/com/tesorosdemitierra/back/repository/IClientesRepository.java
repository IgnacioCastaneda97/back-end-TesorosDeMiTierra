package com.tesorosdemitierra.back.repository;

import com.tesorosdemitierra.back.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientesRepository extends JpaRepository<Clientes,Long> {


}
