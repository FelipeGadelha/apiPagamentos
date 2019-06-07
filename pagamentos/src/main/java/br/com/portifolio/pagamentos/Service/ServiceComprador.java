package br.com.portifolio.pagamentos.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.portifolio.pagamentos.IService.IService;
import br.com.portifolio.pagamentos.Models.Comprador;
import br.com.portifolio.pagamentos.Repository.IRepositoryComprador;

@Service
public class ServiceComprador implements IService<Object>{

	
	@Autowired
	private IRepositoryComprador compradorRepository;
	
	
	@Override
	public List<?> findAll() {
		
		return compradorRepository.findAll();
	}
	@Override
	public Optional<?> findById(Long id) {
		
		return compradorRepository.findById(id);
	}
	@Override
	public Comprador save(Object entity) {
		if(entity != null) {
			compradorRepository.save((Comprador) entity);
		}
		return null;
	}
	@Override
	public Comprador update(Object entity) {
		
		return compradorRepository.save((Comprador) entity);
	}
	@Override
	public void deleteById(Long id) {
		
		compradorRepository.deleteById(id);
	}
	


	

	
//	@Override
//	public List<Comprador> findAll() {
//		
//		return compradorRepository.findAll();
//	}
//
//	@Override
//	public Optional<Comprador> findById(Long id) {
//		
//		return compradorRepository.findById(id);
//	}
//
//	@Override
//	public Comprador save(Comprador comprador) {
//		if(comprador != null) {
//			compradorRepository.save(comprador);
//		}
//		return null;
//	}
//
//	@Override
//	public Comprador update(Comprador comprador) {
//		
//		return compradorRepository.save(comprador);
//	}
//
//	@Override
//	public void deleteById(Long id) {
//		
//		compradorRepository.deleteById(id);
//	}
//	

}
