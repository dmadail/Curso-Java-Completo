package model.entities;

import model.exception.BancoException;


public class Conta {
	
	private Integer numero;
	private String titular;
	private double saldo;
	private Double limiteSaque;
	
	public Conta() {
		
	}
	
	public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.limiteSaque = limiteSaque;
		
		deposito(saldo);
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public void deposito(Double valor) {
		this.saldo += valor;
	}
	
	public void saque(Double valor) {
		validaSaque(valor);
		this.saldo -= valor;
	}
	
	public void validaSaque(Double valor) {
		if(valor > limiteSaque) {
			throw new BancoException("O valor excede o limite de saque");
		}
		
		if (valor > saldo) {
			throw new BancoException("Saldo Insuficiente");
		}
	}	
	
	
}
