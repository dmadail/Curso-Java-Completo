/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159*/

import java.util.Locale;
import java.util.Scanner;

public class AreaCirculoAtravesRaio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		double area, raio,pi = 3.14159;
		
		
		System.out.println("Vamos calcular a área de um círculo");
		System.out.println();
		System.out.println("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		area = pi * (Math.pow(raio, 2));
		System.out.println();
		System.out.printf("Área = %.4f", area);
		

	}

}
