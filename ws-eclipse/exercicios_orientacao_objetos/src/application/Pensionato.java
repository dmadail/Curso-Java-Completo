package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pensao;

public class Pensionato {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Vamos Alugar Quartos na Pensão ");
		
		System.out.print("Quantos quartos vocês quer alugar? ");
		int qtd = sc.nextInt();
		
		Pensao[] quartos = new Pensao[10];
		
		
		for (int i = 1; i <= qtd; i++) {
			System.out.printf("%dº Pessoa: \n", i);
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			
			quartos[quarto] = new Pensao(nome,email,quarto);
		}
		
		System.out.println();
		for(int i = 1; i < quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.println("Quarto: " + i + ", " + quartos[i]);
			}
		}
		
		sc.close();

	}

}
