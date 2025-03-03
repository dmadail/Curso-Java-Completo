/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Vamos verificar qual a altura das pessoas, a media da altura entre as mulheres e quantos homens foram informados ");
		
		System.out.print("Quantos pessoas vocês quer informar: ");
		int qtd = sc.nextInt();
		
		double altura[] = new double[qtd];
		char genero[] = new char[qtd];
		
		for (int i = 0; i < qtd; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			altura[i] = sc.nextDouble();
			
			System.out.printf("Genero da %da pessoa: ", i + 1);
			genero[i] = sc.next().charAt(0);
		}
		
		double menorAltura = altura[0];
		double maiorAltura = 0;
		double somaAlturaMulheres = 0;
		int qtdMulheres = 0;
		int qtdHomens = 0;
		
		for(int i = 0; i < qtd; i++) {
			if (genero[i] == 'F' || genero[i] == 'f') {
				somaAlturaMulheres += altura[i];
				qtdMulheres++;
			}
			else {
				qtdHomens++;
			}
			
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		
		System.out.println();
		System.out.printf("Menor altura = %.2f \n", menorAltura);
		System.out.printf("Maior altura = %.2f \n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f \n", somaAlturaMulheres / qtdMulheres);
		System.out.printf("Numero de homens = %d", qtdHomens);
		
		sc.close();

	}

}
