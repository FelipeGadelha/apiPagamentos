package br.com.portifolio.pagamentos.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Comprador implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String email;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "comprador", fetch = FetchType.LAZY)
	private List<Pagamento> pagamentos;
	
	public Comprador() {
		
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void addPagamento(Pagamento pagamento) {
		if(pagamentos==null)
			pagamentos = new ArrayList<Pagamento>();
		pagamentos.add(pagamento);
	}
	
	
	
	

}
