/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/

import java.util.Locale;
import java.util.Scanner;

public class CalculaAreasTrianguloCirculoTrapezioQuadradoRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double v1, v2, v3;
		double areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		System.out.println("Vamos calcular o da Área de um Triângulo Retângulo, Área de um Círculo, Área de um Trapézio, Área de um Quadrado,"
				+ "Área de um Retângulo");
		System.out.println("Atráves de 3 números que você pode digitar dando 'ENTER' para separá-los");
		v1 = sc.nextDouble();
		v2 = sc.nextDouble();
		v3 = sc.nextDouble();
		
		areaTrianguloRetangulo = (v1 * v3) / 2.0;
		areaCirculo = (3.14159 * (Math.pow(v3, 2.0)));
		areaTrapezio = ((v1 + v2) * v3) / 2;
		areaQuadrado = Math.pow(v2, 2.0);
		areaRetangulo = v1 * v2;
		
		System.out.printf("Triangulo : %.3f%n",areaTrianguloRetangulo);
		System.out.printf("Circulo: %.3f%n", areaCirculo);
		System.out.printf("Trapézio: %.3f%n", areaTrapezio);
		System.out.printf("Quadrado: %.3f%n", areaQuadrado);
		System.out.printf("Retangulo: %.3f%n", areaRetangulo);
		
				
		

	}

}
