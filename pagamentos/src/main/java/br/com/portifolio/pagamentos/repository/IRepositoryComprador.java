package br.com.portifolio.pagamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portifolio.pagamentos.models.Comprador;

public interface IRepositoryComprador extends JpaRepository<Comprador, Long>{

	
	
}
