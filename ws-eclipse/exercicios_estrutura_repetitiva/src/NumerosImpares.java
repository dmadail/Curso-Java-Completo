//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//X, se for o caso.

import java.util.Scanner;

public class NumerosImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Você quer saber quais são os números impares até que número de 0 a 1000");
		
		int numero = sc.nextInt();
		
		for(int cont = 0; cont < numero; cont++) {
			if (cont % 2 != 0)
				System.out.println(cont);
		}
		
		sc.close();
	}

}
