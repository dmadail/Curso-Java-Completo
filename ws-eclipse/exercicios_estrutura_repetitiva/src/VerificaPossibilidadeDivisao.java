//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

import java.util.Scanner;

public class VerificaPossibilidadeDivisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite primeiro quantos números você quer saber se é possivel dividir.");
		System.out.println("E depois os números separados por 'Enter' ");
		System.out.println("Ao final iremos retornar se o valor é passivel de divisão.");
		
		int qtdVezes = sc.nextInt();
		
		
		for(int i=0; i < qtdVezes; i++) {
			int par1 = sc.nextInt();
			int par2 = sc.nextInt();
			
			if (par2 == 0)
				System.out.println("Divisão Impossível");
			else {
				double divisao = (double) par1 / par2;
				System.out.println("Divisão = " + divisao);
			}		
		}
	
		
		
		sc.close();

	}

}
