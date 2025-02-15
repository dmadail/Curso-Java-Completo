//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por definição, fatorial de 0 é 1

import java.util.Scanner;

public class DescobreFatorial {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("De qual número você quer saber o fatorial? ");
		
		int fatorial = sc.nextInt(),
				soma = 1;
		
		for(int i = 1; i <= fatorial; i++) {
			soma = soma * i;
		}
		
		System.out.println("Fatorial = " + soma);
		
		sc.close();

	}

}
