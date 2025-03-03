/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/
import java.util.Scanner;

public class DescobreQuadranteValido {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x,y;
		
		System.out.println("Vou te dizer em qual quadrante o valor se encontra");
		System.out.println();
		System.out.println("Digite o valor x: ");
		x = sc.nextDouble();
		System.out.println("Digite o valor y: ");
		y = sc.nextDouble();
		
		while (x != 0 && y != 0 ) {
			if(x > 0 && y > 0) {
				System.out.println("Q1");
			}
			else if(x < 0  && y > 0) {
				System.out.println("Q2");
			}
			else if(x < 0 && y < 0) {
				System.out.println("Q3");
			}
			else {
				System.out.println("Q4");
			}
			
			System.out.println("Digite o valor x: ");
			x = sc.nextDouble();
			System.out.println("Digite o valor y: ");
			y = sc.nextDouble();
		}
		
		sc.close();

	}
	
}
