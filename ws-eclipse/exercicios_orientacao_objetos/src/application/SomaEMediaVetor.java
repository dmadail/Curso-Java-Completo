/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor 
*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaEMediaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Vamos calcular a soma e média de um conjunto de números ");
		
		System.out.print("Quantos números vocês quer informar: ");
		int qtd = sc.nextInt();
		
		double vet[] = new double[qtd];
		
		System.out.println("Digite os números separados por 'Enter': ");
		for (int i  =0; i < vet.length; i++) {
			vet[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("Valores ");
		double soma = 0;
		
		for (int i  =0; i < vet.length; i++) {
			System.out.print(vet[i] + "  ");
			soma += vet[i];
		}

		System.out.printf("\nSoma: %.2f\n", soma);
		System.out.printf("Média: %.2f", soma / vet.length);
		
		sc.close();
		
	}

}
