package br.com.portifolio.pagamentos.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.portifolio.pagamentos.IService.IService;
import br.com.portifolio.pagamentos.Models.Cliente;
import br.com.portifolio.pagamentos.Repository.IRepositoryCliente;

@Service
public class ServiceCliente implements IService<Object> {

	@Autowired
	private IRepositoryCliente clienteRepository;

	@Override
	public List<?> findAll() {

		return clienteRepository.findAll();
	}

	@Override
	public Optional<?> findById(Long id) {

		return clienteRepository.findById(id);
	}

	@Override
	public Cliente save(Object entity) {
		if (entity != null) {
			return clienteRepository.save((Cliente) entity);
		}
		return null;
	}

	//teste git
	@Override
	public Cliente update(Object entity) {

		return clienteRepository.save((Cliente) entity);
	}

	@Override
	public void deleteById(Long id) {
			
		clienteRepository.deleteById(id);
	}

}
