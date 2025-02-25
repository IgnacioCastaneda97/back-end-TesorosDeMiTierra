package com.tesorosdemitierra.back.repository;

import com.tesorosdemitierra.back.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IClientesRepository extends JpaRepository<Clientes,Long> {
    Clientes findByEmail(String email);


}
