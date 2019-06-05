package br.com.portifolio.pagamentos.service;


import java.util.List;
import java.util.Optional;

public interface IService<T> {

	List<?> findAll();

	Optional<?> findById(Long id);

	T save(Object entity);

	T update(Object entity);

	void deleteById(Long id);

	




	

	
}
