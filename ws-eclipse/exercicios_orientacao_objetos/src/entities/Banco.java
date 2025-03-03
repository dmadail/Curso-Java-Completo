package entities;

public class Banco {
	
	private String nome;
	private int nroConta;
	private double saldo;
	
	public Banco(String nome, int nroConta, double saldo) {
		this.nome = nome;
		this.nroConta = nroConta;
		depositaSaldo(saldo);
	}

	public Banco(String nome, int nroConta) {
		this.nome = nome;
		this.nroConta = nroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNroConta() {
		return nroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositaSaldo(double valor) {
		this.saldo += valor;
	}
	
	public void saqueSaldo(double valor) {
		this.saldo -= valor + 5.00;
	}
	
	public String toString() {
		return "Conta: " 
			+ nroConta
			+ ", Nome: "
			+ nome
			+ ", Saldo: "
			+ String.format("%.2f", saldo);
	}
	

}
