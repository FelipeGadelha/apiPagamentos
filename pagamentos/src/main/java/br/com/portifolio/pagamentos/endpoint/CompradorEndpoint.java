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

import br.com.portifolio.pagamentos.models.Comprador;
import br.com.portifolio.pagamentos.service.ServiceComprador;

@RestController
@RequestMapping(value = "/api")
public class CompradorEndpoint {

	@Autowired
	private ServiceComprador serviceComprador;
	
	
	@GetMapping("/compradores")
	public List<?> listaCompradores(){
		return serviceComprador.findAll();
	}
	
	@GetMapping("/comprador/{id}")
	public Optional<?> CompradorUnico(@PathVariable(value="id") long id){
		return serviceComprador.findById(id);
	}
	@PostMapping("/comprador")
	public void salvar(@RequestBody Comprador comprador) {
		serviceComprador.save(comprador);
	}
	@DeleteMapping("/comprador/{id}")
	public void deletaComprador(@PathVariable(value = "id") long id ) {
		serviceComprador.deleteById(id);
	}
	@PutMapping("/comprador")
	public Comprador atualizaComprador(@RequestBody Comprador comprador) {
		return serviceComprador.update(comprador);
	}
	
	
	
}
