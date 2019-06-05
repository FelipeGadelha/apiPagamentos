package br.com.portifolio.pagamentos.endpoint;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portifolio.pagamentos.models.Pagamento;
import br.com.portifolio.pagamentos.service.ServicePagamento;

@RestController
@RequestMapping(value = "/api")
public class PagamentoEndpont {
	
	@Autowired
	private ServicePagamento servicePagamento;
	
	
	@GetMapping("/pagamentos")
	public List<?> listaPagamentos(){
		return servicePagamento.findAll();
	}
	
	@RequestMapping()
	@GetMapping("/pagamento/{id}")
	public Optional<?> pagamentoUnico(@PathVariable(value="id") long id){
		return servicePagamento.findById(id);
	}

	@PostMapping("/pagamento")
	public void salvar(@RequestBody Pagamento pagamento) {
		 servicePagamento.save(pagamento);
	}
	
	
	@DeleteMapping("/pagamento/{id}")
	public void deletaPagamento(@PathVariable(value = "id") long id ) {
		servicePagamento.deleteById(id);
	}
	@PutMapping("/pagamento")
	public Pagamento atualizaPagamento(@RequestBody Pagamento pagamento) {
		return servicePagamento.update(pagamento);
	}
	
	
}
