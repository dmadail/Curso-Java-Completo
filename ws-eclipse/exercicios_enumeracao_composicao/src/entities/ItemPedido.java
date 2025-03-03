package entities;

public class ItemPedido {
	private Integer quantidade;
	private Double preco;
	
	Produto produto;
	
	public ItemPedido() {
		
	}

	public ItemPedido(Integer quantidade, Double preco, String nome) {
		this.quantidade = quantidade;
		this.preco = preco;
		produto = new Produto(nome, preco);
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public double subTotal() {
		return quantidade * preco;
	}
	
	public String toString() {
		
		return produto.getNome().toUpperCase()
			+ ", R$"
			+ String.format("%.2f", preco) 
			+ ", Quantidade: "
			+ quantidade
			+ ", Subtotal: R$"
			+ String.format("%.2f", subTotal());
	}
	
}
