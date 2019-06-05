package br.com.portifolio.pagamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portifolio.pagamentos.models.Boleto;

public interface IRepositoryBoleto extends JpaRepository<Boleto, Long>{

	
}
