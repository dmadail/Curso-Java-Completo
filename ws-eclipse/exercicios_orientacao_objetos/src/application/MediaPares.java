/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR" */

package application;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Vamos calcular a média dos números pares ");
		
		System.out.print("Quantos números vocês quer ler: ");
		int qtd = sc.nextInt();
		
		int vet[] = new int[qtd];
		
		System.out.println("Digite os números separados por 'Enter': ");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}
		
		System.out.println();
		double soma = 0;
		int qtdPares = 0;
		for (int i = 0; i < vet.length; i++) {
			if(vet[i] % 2 == 0) {
				soma += vet[i];
				qtdPares++;
			}
		}		
		
		if (soma != 0) {
			double media = soma / qtdPares;
			System.out.printf("MEDIA DOS PARES = %.1f", media);
		}
		else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		
		
		
		sc.close();

	}

}
