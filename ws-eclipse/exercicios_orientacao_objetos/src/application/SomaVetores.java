/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado. */

package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Vamos somar 2 vetores e criar um terceiro com o resultado da soma ");
		
		System.out.print("Quantos números vocês quer ter em cada vetor: ");
		int qtd = sc.nextInt();
		
		int vet1[] = new int[qtd];
		int vet2[] = new int[qtd];
		
		System.out.println("Digite os valores do vetor A separados por 'Enter': ");
		for (int i = 0; i < vet1.length; i++) {
			vet1[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B separados por 'Enter': ");
		for (int i = 0; i < vet2.length; i++) {
			vet2[i] = sc.nextInt();
		}
		
		int vetResult[] = new int[qtd];
		for (int i = 0; i < qtd; i++) {
			vetResult[i] = vet1[i] + vet2[i];
		}
		
			
		System.out.println();
		System.out.println("VETOR RESULTANTE: ");
		
		for (int i = 0; i < vetResult.length; i++) {
			System.out.println(vetResult[i]);
		}
		
		sc.close();

	}

}
