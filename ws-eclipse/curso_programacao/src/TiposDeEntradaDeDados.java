import java.util.Scanner;

public class TiposDeEntradaDeDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String x;
//		x = sc.next();
//		System.out.println("Você digitou: " + x);
//		
//		int y ;
//		y = sc.nextInt();
//		System.out.println("Você digitou: " + y);
//		
//		double xy;
//		xy = sc.nextDouble();
//		System.out.printf("Você digitou: %.2f%n", xy);
//		
//		char c;
//		c = sc.next().charAt(0);
//		System.out.println("Você digitou: " + c);
		
		String nome;
		String amorDaVida;
		int tempo;
		double notaCurso;
		String observacao;
		
//		sc.nextLine();
		System.out.println("Digite o seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Digite a nome do amor da sua vida: ");
		amorDaVida = sc.nextLine();
		
		System.out.println("Digite a quantos anos estão juntos: " );
		tempo = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Digite uma mensagem para ela: ");
		observacao = sc.nextLine();
		
		
		System.out.printf("%n%n %s e %s, estão juntos há %d anos.Para ele, ela é o amor da sua vida, e ele gostaria de dizer isso para ela "
				+ "%n'%s' %n", nome, amorDaVida, tempo, observacao);
		
		
		sc.close();

	}

}
