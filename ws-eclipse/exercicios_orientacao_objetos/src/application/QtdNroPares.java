/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares. 
*/
package application;

import java.util.Locale;
import java.util.Scanner;

public class QtdNroPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Vamos verificar quais são os números pares ");
		
		System.out.print("Quantos números vocês quer ler: ");
		int qtd = sc.nextInt();
		
		int vet[] = new int[qtd];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Números Pares ");
		
		int contPares = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
				contPares++;
			}
		}
		
		System.out.println("\n\nQUANTIDADE DE PARES = " + contPares);
		
		
		sc.close();

	}

}
