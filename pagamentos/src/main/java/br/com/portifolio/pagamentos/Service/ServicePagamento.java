package br.com.portifolio.pagamentos.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.portifolio.pagamentos.IService.IService;
import br.com.portifolio.pagamentos.Models.Pagamento;
import br.com.portifolio.pagamentos.Repository.IRepositoryBoleto;
import br.com.portifolio.pagamentos.Repository.IRepositoryCredito;
import br.com.portifolio.pagamentos.Repository.IRepositoryPagamento;

@Service
public class ServicePagamento implements IService<Object> {

	@Autowired
	private IRepositoryPagamento iRepositoryPagamento;
	@Autowired
	private IRepositoryBoleto iRepositoryBoleto;
	@Autowired
	private IRepositoryCredito iRepositoryCredito;

	@Override
	public List<?> findAll() {

		return iRepositoryPagamento.findAll();
	}

	@Override
	public Optional<?> findById(Long id) {

		return iRepositoryPagamento.findById(id);
	}

	@Override
	public Pagamento save(Object entity) {
		//
		return null;
	}

	@Override
	public Pagamento update(Object entity) {

		return iRepositoryPagamento.save((Pagamento) entity);
	}

	@Override
	public void deleteById(Long id) {

		iRepositoryPagamento.deleteById(id);
	}

//	if((entity).getTipoPagamento() == TipoPagamento.BOLETO) {
//	return iRepositoryBoleto.save((Boleto) entity);
//}else if(((Pagamento) entity).getTipoPagamento() == TipoPagamento.CREDITO){
//	return iRepositoryCredito.save((Credito) entity);
//}

}
