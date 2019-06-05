package br.com.portifolio.pagamentos.enuns;

import java.util.Arrays;
import java.util.Optional;

public enum TipoPagamento {

	CREDITO("CREDITO"),
	BOLETO("BOLETO");
	
	private String codigo;
	
	private TipoPagamento(String codigo) {
		this.codigo = codigo;
	}
	
	public static Optional<TipoPagamento> from(String codigo){
		return Arrays.stream(TipoPagamento.values())
				.filter(tipo -> tipo.getCodigo().equals(codigo))
				.findFirst();
	}
	public String getCodigo() {
		return codigo;
	}
	
	
	
	
}
