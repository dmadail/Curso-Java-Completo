//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.

import java.util.Scanner;

public class SomarContaAPagar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codItem, qtdItem;
		double valorItem;
		
		System.out.println("Vou te dizer se o valor da sua conta");
		System.out.println();
		System.out.println("Digite o codigo do item: ");
		codItem = sc.nextInt();
		System.out.println("Digite o quantidade do item: ");
		qtdItem = sc.nextInt();
		
		if(codItem == 1) {
			valorItem = qtdItem * 4.00;
		}
		else if(codItem == 2) {
			valorItem = qtdItem * 4.5;
		}
		else if(codItem == 3) {
			valorItem = qtdItem * 5.0;
		}
		else if(codItem == 4) {
			valorItem = qtdItem * 2.0;
		}
		else {
			valorItem = qtdItem * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f", valorItem);
		
		sc.close();
	}

}
