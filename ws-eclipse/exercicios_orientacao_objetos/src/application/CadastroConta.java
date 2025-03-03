package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class CadastroConta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos criar a sua Conta Bancária ");
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Número Conta: ");
		int nroConta = sc.nextInt();
		
		Banco contaBanco;
		
		System.out.print("Você quer fazer um Depósito Inicial? (S/N)");
		char depInicial = sc.next().charAt(0);
		if (depInicial == 'S' || depInicial == 's') {
			System.out.print("Qual o Saldo Inicial: ");
			double saldo = sc.nextDouble();
			
			contaBanco = new Banco(nome,nroConta,saldo);
		}
		else {
			contaBanco = new Banco(nome,nroConta);
		}
		
		System.out.println("Conta Bancaria:");
		System.out.println(contaBanco);
		
		System.out.println();
		
		System.out.print("Entre com o Depósito: ");
		contaBanco.depositaSaldo(sc.nextDouble());
		System.out.println("Atualização da Conta:");
		System.out.println(contaBanco);
		System.out.println();
		
		System.out.print("Entre com o Saque: ");
		contaBanco.saqueSaldo(sc.nextDouble());
		System.out.println("Atualização da Conta:");
		System.out.println(contaBanco);
		
		sc.close();
	}

}
