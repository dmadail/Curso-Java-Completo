/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis). */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com os Dados do Aluno para verificar se ele foi aprovado.");
		System.out.println("Obs.: A média é 6.0");
		
		System.out.print("Quantos números vocês quer ler: ");
		int qtd = sc.nextInt();
		
		String nome[] = new String[qtd];
		double nota1[] = new double[qtd];
		double nota2[] = new double[qtd];
		
		for (int i = 0; i < qtd; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno, separados por 'Enter': \n", i+1);
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");	
		for (int i = 0; i < qtd; i++) {
			double media = (nota1[i] + nota2[i]) / 2;
			
			if (media >= 6.0) {
				System.out.println(nome[i]);
			}
		}
				
		
		sc.close();
	}
}
