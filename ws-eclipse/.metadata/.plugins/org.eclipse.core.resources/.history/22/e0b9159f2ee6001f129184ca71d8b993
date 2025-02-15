package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o valor do Dolar: ");
		double dolar = sc.nextDouble();
		
		System.out.print("Quantos Dólares você quer comprar: ");
		double qtdDolar = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Você precisa de %.2f em reais", CurrencyConverter.calculaDolar(dolar,qtdDolar));

	}

}
