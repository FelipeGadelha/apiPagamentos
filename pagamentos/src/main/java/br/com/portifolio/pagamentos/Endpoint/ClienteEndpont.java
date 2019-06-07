package br.com.portifolio.pagamentos.Endpoint;

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

import br.com.portifolio.pagamentos.Models.Cliente;
import br.com.portifolio.pagamentos.Service.ServiceCliente;

@RestController
@RequestMapping(value = "/api")
public class ClienteEndpont {
	
	@Autowired
	private ServiceCliente serviceCliente;
	
	
	@GetMapping("/clientes")
	public List<?> listaClientes(){
		return serviceCliente.findAll();
	}
	
	@GetMapping("/cliente/{id}")
	public Optional<?> clienteUnico(@PathVariable(value="id") long id){
		return serviceCliente.findById(id);
	}
	@PostMapping("/cliente")
	public void salvar(@RequestBody Cliente cliente) {
		serviceCliente.save(cliente);
	}
	@DeleteMapping("/cliente/{id}")
	public void deletaCliente(@PathVariable(value = "id") long id ) {
		serviceCliente.deleteById(id);
	}
	@PutMapping("/cliente")
	public Cliente atualizaCliente(@RequestBody Cliente cliente) {
		return serviceCliente.update(cliente);
	}
	
}
