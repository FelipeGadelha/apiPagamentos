package br.com.portifolio.pagamentos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portifolio.pagamentos.Models.Cliente;

public interface IRepositoryCliente extends JpaRepository<Cliente, Long>{

}
