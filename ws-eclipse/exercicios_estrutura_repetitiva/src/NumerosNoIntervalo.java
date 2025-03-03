//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

import java.util.Scanner;

public class NumerosNoIntervalo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os números separados por 'Enter' ");
		System.out.println("E eu te direi quantos números estão dentro do intervalo de [10,20]");
		
		int qtdVezes = sc.nextInt(),
			  numero = 0,
				  in = 0,
				 out = 0;
		
		for(int i=0; i < qtdVezes; i++) {
			numero = sc.nextInt();
			
			if (numero >=10 && numero <= 20) 
				in++;
			else
				out++;
		}
		
		System.out.println("In = " + in);
		System.out.println("Out = " + out);
		
		sc.close();

	}

}
