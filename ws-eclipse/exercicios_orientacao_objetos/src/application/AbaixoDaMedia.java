/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.  */

package application;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Vamos qual a media dos números informados e quais são os números que estão abaixo da média ");
		
		System.out.print("Quantos números vocês quer ler: ");
		int qtd = sc.nextInt();
		
		double vet[] = new double[qtd];
		double media = 0;
		
		System.out.println("Digite os números separados por 'Enter': ");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextDouble();
			media += vet[i];
		}
		
		System.out.println();
		media = media / qtd;
		System.out.printf("MEDIA DO VETOR = %.3f \n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] <= media) {
				System.out.println(vet[i]);
			}
		}	
		
		
		
		sc.close();
	}

}
