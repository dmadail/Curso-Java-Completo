import java.util.Scanner;

public class WhileCondicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Para calular, digite os números separados por 'Enter'. ");
		System.out.println("Quando digitado 0 será somado os números enviados e retornará o valor somado.");
		
		int x = sc.nextInt(),
			soma = 0;
		
		while( x != 0 ) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println("Soma = " + soma);

	}

}
