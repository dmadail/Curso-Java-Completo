/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha. */

package application;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Vamos descobrir quem é o mais velho ");
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int qtd = sc.nextInt();
		
		String nome[] = new String[qtd];
		int idade[] = new int[qtd];
		
		for (int i = 0; i < qtd; i++) {
			System.out.printf("Dados %da pessoa: \n", i+1 );
			sc.nextLine();
			System.out.print("Nome: " );
			nome[i] = sc.nextLine();
			System.out.print("Idade: " );
			idade[i] = sc.nextInt();
		}
		
		int maisVelho = 0;
		String nomeMaisVelho = "";
		
		for (int i = 0; i < qtd; i++) {
			if(idade[i] > maisVelho) {
				maisVelho = idade[i];
				nomeMaisVelho = nome[i];
			}
		}
		
		System.out.println();
		System.out.printf("PESSOA MAIS VELHA: %s \n", nomeMaisVelho);
		
		sc.close();

	}

}
