//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;

public class TempoDeJogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora1, hora2, tempo;
		
		System.out.println("Vou te dizer quanto tempo durou o jogo");
		System.out.println();
		System.out.println("Digite a hora inicial: ");
		hora1 = sc.nextInt();
		System.out.println("Digite a hora Final: ");
		hora2 = sc.nextInt();
		
		if( hora1 < hora2) {
			tempo = hora2 - hora1;
			
		}
		else {
			tempo = 24 - hora1 + hora2;
		}
		
		System.out.println("O jogo durou: " + tempo + " Hora(s)");
	}	
	

}
