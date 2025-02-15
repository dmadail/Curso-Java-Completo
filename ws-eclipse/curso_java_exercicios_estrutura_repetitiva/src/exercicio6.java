//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//peso 5.

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite primeiro quantos números você calcular de casos de teste. ");
		System.out.println("Depois 3 conjuntos de números com 1 casa decimal separados por 'Enter' ");
		System.out.println("Ao final iremos retornar a média ponderada para cada caso de teste.");
		
		int qtdVezes = sc.nextInt();
		double media = 0;
		
		for(int cont=0; cont < qtdVezes; cont++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			media = ((a * 2) + (b * 3) + (c * 5)) / 10;
			
			System.out.printf("Média: %.1f%n", media);
			
		}
		
		sc.close();

	}

}
