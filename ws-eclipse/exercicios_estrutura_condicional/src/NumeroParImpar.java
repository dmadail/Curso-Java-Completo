//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Scanner;

public class NumeroParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor;
		
		System.out.println("Vou te dizer se o valor é par ou impar");
		System.out.println();
		System.out.println("Digite o valor: ");
		valor = sc.nextDouble();
		
		if (valor % 2 == 0 ) {
			System.out.println("Par");
		}
		else {
			System.out.println("Ímpar");
		}

	}

}
