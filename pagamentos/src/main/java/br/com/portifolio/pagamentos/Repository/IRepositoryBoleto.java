package br.com.portifolio.pagamentos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portifolio.pagamentos.Models.Boleto;

public interface IRepositoryBoleto extends JpaRepository<Boleto, Long>{

	
}
