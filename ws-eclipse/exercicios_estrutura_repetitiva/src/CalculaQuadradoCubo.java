//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//exemplo.

import java.util.Scanner;

public class CalculaQuadradoCubo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantas linhas você quer saber o quadrado e o cubo, do nº da linha correspondente.");
		
		int linhas = sc.nextInt();
		System.out.println("Linha | Quadrado | Cubo");
		for(int i=1; i <= linhas; i++) {
			int quadrado = (int) Math.pow(i, 2);
			int cubo = (int) Math.pow(i, 3);
			System.out.printf("  %d   |     %2d   |  %d %n",i,quadrado,cubo);
		}
		
		
		
		sc.close();


	}

}
