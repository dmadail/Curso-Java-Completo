/*Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta conta bancária, mostrando o novo saldo. 
Um saque não pode ocorrer ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de saque da conta. 

Model.Entities - Conta
Model.Exception - BancoException
*/
package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Conta;
import model.exception.BancoException;

public class BancoOperacoes {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		try{
			
			System.out.println("Entre com os dados da Conta: ");
			
			System.out.print("Número: ");
			int numero = sc.nextInt();
						
			System.out.print("Titular: ");
			sc.nextLine();
			String titular = sc.nextLine();
			
			System.out.print("Saldo Inicial: ");
			double saldo = sc.nextDouble();
			
			System.out.print("Limite de Saque: ");
			double limiteSaque = sc.nextDouble();
			
			Conta conta = new Conta(numero,titular,saldo,limiteSaque);
			
			System.out.println();
			System.out.print("Entre com o valor a ser sacado: ");
			double valorSaque = sc.nextDouble();
			
			conta.saque(valorSaque);
			
			System.out.println();
			System.out.printf("Novo Saldo da Conta: %.2f", conta.getSaldo());
			
		}
		catch(BancoException e) {
			System.out.println("Erro de Saque: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Erro Inesperado");
		}
		
		sc.close();
	}
	
}
