/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class ValoresNegativosVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Vamos verificar quais são os números negativos ");
		
		System.out.print("Quantos números vocês quer ler: ");
		int qtd = sc.nextInt();
		
		int vet[] = new int[qtd];
		
		System.out.println("Digite os números separados por 'Enter': ");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Números Negativos ");
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}		
		
		sc.close();
	}

}
