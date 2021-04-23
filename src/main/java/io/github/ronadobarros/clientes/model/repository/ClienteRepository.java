package io.github.ronadobarros.clientes.model.repository;

import io.github.ronadobarros.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
