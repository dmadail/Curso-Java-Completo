/*Fazer um programa para ler dois números inteiros M e N, depois ler uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conformeexemplo.*/

package application;

import java.util.Scanner;

public class MatrizPosicaoAoRedor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite de que tamanho vai ser a sua Matriz (Linha Coluna)");
		int linha = sc.nextInt();
		int coluna = sc.nextInt();
		int[][] mat = new int[linha][coluna];
		
		for (int i=0; i<mat.length; i++) {
			System.out.printf("Digite os números da %dº linha\n", i + 1);
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Digite de um número que esta na matriz que eu te direi quais os números que estão ao redor dele");
		int numero = sc.nextInt();
		
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == numero) {
					System.out.printf("Posição: %d,%d \n", i,j);
					if (j != 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					
					if (i != 0) {
						System.out.println("Em Cima: " + mat[i-1][j]);
					}
					
					if(j < mat[i].length - 1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					
					if(i < mat.length - 1) {
						System.out.println("Embaixo: " + mat[i+1][j]);
					}								
					
				}
			}
			System.out.println();
			
			sc.close();
		}

	}

}
