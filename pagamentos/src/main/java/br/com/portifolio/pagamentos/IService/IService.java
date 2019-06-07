package br.com.portifolio.pagamentos.IService;

import java.util.List;

public interface IService<T> {

	List<?> findAll();

	T findById(Long id);

	T save(T entity);

	T update(T entity);

	void deleteById(Long id);

	




	

	
}
