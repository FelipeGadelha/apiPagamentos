package br.com.portifolio.pagamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portifolio.pagamentos.models.Credito;

public interface IRepositoryCredito extends JpaRepository<Credito, Long>{

}
