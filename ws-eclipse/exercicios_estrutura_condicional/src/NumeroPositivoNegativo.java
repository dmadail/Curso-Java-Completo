//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
import java.util.Scanner;

public class NumeroPositivoNegativo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double valor;
		
		System.out.println("Vou te dizer se o valor é negativo ou não");
		System.out.println();
		System.out.println("Digite o valor: ");
		valor = sc.nextDouble();
		
		if (valor < 0 ) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Positivo");
		}
		
		sc.close();
	}

}
