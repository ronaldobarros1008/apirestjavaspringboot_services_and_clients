package io.github.ronadobarros.clientes.model.repository;

import io.github.ronadobarros.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
