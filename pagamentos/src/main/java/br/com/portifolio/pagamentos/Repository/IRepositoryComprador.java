package br.com.portifolio.pagamentos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portifolio.pagamentos.Models.Comprador;

public interface IRepositoryComprador extends JpaRepository<Comprador, Long>{

	
	
}
