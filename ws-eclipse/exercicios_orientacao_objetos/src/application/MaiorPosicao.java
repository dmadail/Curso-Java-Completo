/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero). */
package application;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Vamos saber qual é o maior número digitado, e a sua posição no vetor ");
		
		System.out.print("Quantos números vocês quer digitar: ");
		int qtd = sc.nextInt();
		
		double vet[] = new double[qtd];
		
		System.out.println("Digite os números separados por 'Enter': ");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextDouble();
		}
		
		int posicao = 0;
		double maiorValor = vet[0];
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > maiorValor) {
				maiorValor = vet[i];
				posicao = i;
			}
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f \n", maiorValor);
		System.out.printf("POSICAO DO MAIOR VALOR = %d", posicao);
		
		sc.close();
	}

}
