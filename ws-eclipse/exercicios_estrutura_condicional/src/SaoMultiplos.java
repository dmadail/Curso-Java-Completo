//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.

import java.util.Scanner;

public class SaoMultiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double v1, v2, conta;
		
		System.out.println("Vou te dizer se os 2 valores informados são multiplos ou não.");
		System.out.println();
		System.out.println("Digite 2 valores sepadores por 'ENTER': ");
		v1 = sc.nextDouble();
		v2 = sc.nextDouble();
		
		if (v1 < v2) {
			conta = v2 % v1;
			
		}
		else {
			conta = v1 % v2;
		}
		
		if (conta == 0) {
			System.out.println("São multiplos");
		}
		else {
			System.out.println("Não são multiplos");
		}

		
//		if (A % B == 0 || B % A == 0) {
//			System.out.println("Sao Multiplos");
//		}
//		else {
//			System.out.println("Nao sao Multiplos");
//		}
	}

}
