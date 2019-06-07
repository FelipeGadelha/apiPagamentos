package br.com.portifolio.pagamentos.Models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
@DiscriminatorValue(value = "BOLETO")
@PrimaryKeyJoinColumn(name = "id")
public class Boleto extends Pagamento{

	private static final long serialVersionUID = 1L;

//	public Boleto(BigDecimal valor, Comprador comprador) {
//		super(valor, TipoPagamento.BOLETO, comprador);
//	}
//	
//	public Boleto() {
//		
//	}
	
	
}























