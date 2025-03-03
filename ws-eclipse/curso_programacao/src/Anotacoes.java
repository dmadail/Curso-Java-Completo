import java.util.Locale;
import java.util.Scanner;

public class Anotacoes {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //Define a localição do codigo, no caso definiu para padrão americano de casa decimal
//	    Sequencial 1º = * / %
//      2º = + - 
//		int conta1 = 2 * 6 / 3;
//		int conta2 = 3 + 2 * 4;
//		int conta3 = (3 + 2) * 4;
//		int conta4 = 60 / (3 + 2) * 4;
//		int conta5 = 60 / ((3 + 2 ) * 4);
//		int conta6 = 14 % 3;
//		int conta7 = 19 % 5;
//
//		System.out.println(conta1);
//		System.out.println(conta2);
//		System.out.println(conta3);
//		System.out.println(conta4);
//		System.out.println(conta5);
//		System.out.println(conta6);
//		System.out.println(conta7);

//		----------------------------------------------------------------------------------------------------------------------
//		double x = 10.35784;
//		System.out.printf("%.2f%n", x);
//		System.out.printf("%.4f%n", x); 
//		
//		System.out.printf("%.4f%n", x); 
//		
//		System.out.println("RESULTADO = " + x + " Metros"); //Exemplo de Concatenação
//		
//		System.out.printf("RESULTADO = %.2f metros%n", x); //Concatenação com printf

//		----------------------------------------------------------------------------------------------------------------------
//		String nome = "Maria";
//		int idade = 31;
//		double renda = 4000.0;
//		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); //Concatenação com mais de uma variavel usando printf

//		----------------------------------------------------------------------------------------------------------------------
//		int a,b,c;
//		a = 5;
//		b = 2;
//		double resultado = (double) a / b; // Faz o casting que é nada mais que forçar a divisão a ser um número double
//		c = (int) resultado; // Faz o casting sem se importar com as casas decimais.
//		
//		System.out.println(c);
//		System.out.println(resultado);

//		----------------------------------------------------------------------------------------------------------------------

//		double preco = 34.5;
//		double desconto;
//		if (preco < 20.0) {
//			desconto = preco * 0.1;
//		} else {
//			desconto = preco * 0.05;
//		}
		
		
//		double preco = 34.5;
//		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
//		
//		System.out.println(desconto);
		
//		----------------------------------------------------------------------------------------------------------------------
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Para calular, digite os números separados por 'Enter'. ");
//		System.out.println("Quando digitado 0 será somado os números enviados e retornará o valor somado.");
//		
//		int x = sc.nextInt(),
//			soma = 0;
//		
//		while( x != 0 ) {
//			soma += x;
//			x = sc.nextInt();
//		}
//		
//		System.out.println("Soma = " + soma);
		
//		sc.close();
		
//		----------------------------------------------------------------------------------------------------------------------
		
//		Operadores Bitwise - Compara bit a bit
//		int n1 = 89;
//		int n2 = 60;
//		System.out.println(n1 & n2);
//		System.out.println(n1 | n2);
//		System.out.println(n1 ^ n2);
//		
		
//		----------------------------------------------------------------------------------------------------------------------

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
