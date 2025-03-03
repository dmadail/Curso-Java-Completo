/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Vamos calcular a altura média das pessoas informadas, e qual o percentual de menores de 16 anos. ");
		
		System.out.print("Quantos pessoas vocês quer ler: ");
		int qtd = sc.nextInt();
		
		String nome[] = new String[qtd];
		int idade[] = new int[qtd];
		double altura[] = new double[qtd];
		
		for (int i = 0; i < qtd; i++) {
			System.out.printf("Dados %da pessoa: \n", i+1 );
			sc.nextLine();
			System.out.print("Nome: " );
			nome[i] = sc.nextLine();
			System.out.print("Idade: " );
			idade[i] = sc.nextInt();
			System.out.print("Altura: " );
			altura[i] = sc.nextDouble();
		}
		
		double somaAltura = 0.00;
		double qtdMenor = 0.0;
		String nomeMenores = "";
		
		for (int i = 0; i < qtd; i++) {
			somaAltura += altura[i];
			if(idade[i] < 16) {
				qtdMenor++;
				nomeMenores += nome[i] + "\n";
			}
		}
		
		double percentMenor = qtdMenor * 100 / qtd;
		double mediaAltura = somaAltura / qtd;
		
		System.out.println();
		System.out.printf("Altura média: %.2f \n", mediaAltura);
		System.out.printf("Pessoas com menos de 16 anos: %.2f%% \n", percentMenor);
		
		if(nomeMenores != "")
			System.out.println(nomeMenores);
		
		sc.close();
	}

}
