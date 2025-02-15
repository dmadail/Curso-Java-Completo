/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/

import java.util.Scanner;

public class ValidaSenha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int senha;
		
		System.out.println("Quero ver você descobrir uma senha de 4 digitos que possui somete o número 2 e o 0 como opções");
		System.out.println();
		System.out.println("Para cada tentativa digite o número e eu te direi se esta correto ou não.");
		
		senha = sc.nextInt();
		while(senha != 2002) {
			System.out.println("Senha inválida. Tente novamente");
			senha = sc.nextInt();			
		}
		
		System.out.println("Acesso permitido.");
	}

}
