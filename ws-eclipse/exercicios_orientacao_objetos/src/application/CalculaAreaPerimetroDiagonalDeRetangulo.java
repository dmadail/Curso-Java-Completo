/* Calcula Área, Perimetro e Diagonal através da largura e altura de um retangulo
 * */
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class CalculaAreaPerimetroDiagonalDeRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com a largura e altura do seu retângulo: ");
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		System.out.printf("Área : %.2f%n", retangulo.area());
		System.out.printf("Perimetro: %.2f%n", retangulo.perimetro());
		System.out.printf("Diagonal: %.2f%n", retangulo.diagonal());
		
		sc.close();
	}

}
