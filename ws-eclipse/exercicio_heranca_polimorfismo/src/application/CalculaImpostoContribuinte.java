package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;


public class CalculaImpostoContribuinte {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> contribuintes = new ArrayList<>();
		
		System.out.print("Entre com o Número de Contribuintes: ");
		int qtdContribuintes = sc.nextInt();
		
		for (int i = 1; i <= qtdContribuintes; i++) {
			System.out.println("Contribuinte #" + i + ":");
			
			System.out.print("Pessoa Física ou Jurídica (PF/PJ)? ");
			String tipoContribuinte = sc.next();
			
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Renda Anual: ");
			double rendaAnual = sc.nextDouble();
			
			if (tipoContribuinte.equalsIgnoreCase("PF")) {
				
				System.out.print("Gastos com Saúde: ");
				double gastosSaude = sc.nextDouble();
				
				contribuintes.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
				
			}
			if (tipoContribuinte.equalsIgnoreCase("PJ")) {
				
				System.out.print("Número Funcionários: ");
				int numFuncionarios = sc.nextInt();
				
				contribuintes.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
				
			}
			
		}
		
		System.out.println();
		System.out.println("Imposto Pago");
		
		double somaTotalImpostoPago = 0.00;
		for(Contribuinte contribuinte : contribuintes) {
			
			System.out.println(contribuinte);
			somaTotalImpostoPago += contribuinte.calculaImposto();
		}
		
		System.out.println();
		System.out.printf("Total Imposto: %.2f", somaTotalImpostoPago );
		
	}

}
