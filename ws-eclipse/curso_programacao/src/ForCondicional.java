import java.util.Scanner;

public class ForCondicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite primeiro quantos números você quer somar. E depois os números separados por 'Enter' ");
		System.out.println("Ao final iremos retornar o valor somado.");
		
		int qtdVezes = sc.nextInt(),
			soma = 0,
			x = 0;
		
		for(int i=0; i < qtdVezes; i++) {
			x = sc.nextInt();
			soma += x;
		}
		
		System.out.println("Soma = " + soma);
		
		sc.close();

	}

}
