package br.com.portifolio.pagamentos.models;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue(value = "CREDITO")
@PrimaryKeyJoinColumn(name = "id")
public class Credito extends Pagamento {

	private static final long serialVersionUID = 1L;

	private String nomeDoTitular;

	private String numeroDoCartao;

	@Temporal(TemporalType.DATE)
	private Date dataDeVencimentoDoCartao;

	private String cartaoCVV;

//	public Credito(BigDecimal valor, String nomeDoTitular, String numeroDoCartao, Date dataDeVencimentoDoCartao,
//			String cartaoCVV) {
//		super(valor, TipoPagamento.CREDITO);
//		this.nomeDoTitular = nomeDoTitular;
//		this.numeroDoCartao = numeroDoCartao;
//		this.dataDeVencimentoDoCartao = dataDeVencimentoDoCartao;
//		this.cartaoCVV = cartaoCVV;
//
//	}
//
//	public Credito() {
//
//	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}

	public String getNumeroDoCartao() {
		return numeroDoCartao;
	}

	public void setNumeroDoCartao(String numeroDoCartao) {
		this.numeroDoCartao = numeroDoCartao;
	}

	public Date getDataDeVencimentoDoCartao() {
		return dataDeVencimentoDoCartao;
	}

	public void setDataDeVencimentoDoCartao(Date dataDeVencimentoDoCartao) {
		this.dataDeVencimentoDoCartao = dataDeVencimentoDoCartao;
	}

	public String getCartaoCVV() {
		return cartaoCVV;
	}

	public void setCartaoCVV(String cartaoCVV) {
		this.cartaoCVV = cartaoCVV;
	}

	
	
	

}
