/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/
import java.util.Scanner;

public class SomaDoisValores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a,b,soma;
		
		System.out.println("Vamos fazer uma conta simples de soma");
		System.out.println();
		System.out.println("Digite o primeiro valor: ");
		a = sc.nextDouble();
		System.out.println("Digite o segundo valor:");
		b = sc.nextDouble();
		System.out.println();
		
		soma = a + b;
		System.out.println("SOMA = " + soma);
		

	}

}
