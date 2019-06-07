package br.com.portifolio.pagamentos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portifolio.pagamentos.Models.Pagamento;

public interface IRepositoryPagamento extends JpaRepository<Pagamento, Long>{ 
	
	
}
