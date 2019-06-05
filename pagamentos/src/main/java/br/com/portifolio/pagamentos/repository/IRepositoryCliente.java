package br.com.portifolio.pagamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portifolio.pagamentos.models.Cliente;

public interface IRepositoryCliente extends JpaRepository<Cliente, Long>{

}
