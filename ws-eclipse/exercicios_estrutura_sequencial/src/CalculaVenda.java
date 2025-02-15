/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

import java.util.Locale;
import java.util.Scanner;

public class CalculaVenda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2;
		int qtd1, qtd2;
		double valor1, valor2, soma;
		
		System.out.println("Vamos calcular o valor da sua compra");
		System.out.println();
		System.out.println("Digite o codigo da primeira peça: ");
		cod1 = sc.nextInt();
		System.out.println("Digite a quantidade da primeira peça:");
		qtd1 = sc.nextInt();
		System.out.println("Digite o valor da primeira peça: ");
		valor1 = sc.nextDouble();
		System.out.println();
		System.out.println("Digite o codigo da segunda peça: ");
		cod2 = sc.nextInt();
		System.out.println("Digite a quantidade da segunda peça:");
		qtd2 = sc.nextInt();
		System.out.println("Digite o valor da segunda peça: ");
		valor2 = sc.nextDouble();
		
		soma = ((valor1 * qtd1) + (valor2 * qtd2));
		
		System.out.println();
		System.out.printf("As Peças %d e %d, ficaram no valor total: %.2f", cod1, cod2, soma);
		
		sc.close();

	}

}
