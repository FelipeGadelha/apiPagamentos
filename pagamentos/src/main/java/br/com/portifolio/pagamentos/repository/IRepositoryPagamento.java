package br.com.portifolio.pagamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portifolio.pagamentos.models.Pagamento;

public interface IRepositoryPagamento extends JpaRepository<Pagamento, Long>{ 
	
	
}
