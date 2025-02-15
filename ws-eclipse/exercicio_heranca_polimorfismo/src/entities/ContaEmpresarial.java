package entities;

public class ContaEmpresarial extends ContaBancaria{
	
	private Double limiteEmprestimo;
	
	public ContaEmpresarial() {
		super();
	}

	public ContaEmpresarial(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLoanLimit() {
		return limiteEmprestimo;
	}

	public void setLoanLimit(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void emprestimo(double valor) {
		if (valor <= limiteEmprestimo) {
			saldo += valor - 10.0;
		}
	}
	
	@Override
	public void saque(double valor) {
		super.saque(valor);
		saldo -= 2.0;
	}
}
