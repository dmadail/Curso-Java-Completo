package entities;

public class ContaPoupanca extends ContaBancaria{
	
	private Double rendimento;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String titular, Double saldo, Double rendimento) {
		super(numero, titular, saldo);
		this.rendimento = rendimento;
	}

	public Double getRendimento() {
		return rendimento;
	}

	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}
	
	public void saldoAtualizado() {
		saldo += saldo * rendimento;
	}
	
	@Override
	public void saque(double valor) {
		saldo -= valor;
	}
	
}
