package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto{
	
	LocalDate dataFabricacao;
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public ProdutoUsado() {
		
	}
	
	
	public ProdutoUsado(String nome, Double preco, LocalDate dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}


	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}


	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = LocalDate.parse(dataFabricacao,fmt1);
	}


	@Override
	public String tagPreco() {
		return nome 
			+ "(Usado), R$ " 
			+ String.format("%.2f", preco) 
			+ "(Data de Fabricação: "
			+ dataFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
			+ ")";
	}
	
	
	
	
}	
