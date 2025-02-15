/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/

import java.util.Locale;
import java.util.Scanner;

public class CalculaSalario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		double valorHora,numHoras,salario;
		
		System.out.println("Vamos fazer a conta do seu salário");
		System.out.println();
		System.out.println("Digite o seu número interno: ");
		numero = sc.nextInt();
		System.out.println("Digite quantas horas você trabalhou esse mês: ");
		numHoras = sc.nextDouble();
		System.out.println("Digite qual é o seu valor Hora: ");
		valorHora = sc.nextDouble();
		
		salario = valorHora * numHoras;
		
		System.out.println();
		System.out.printf("Funcionário de número: %d %nSalário: U$ %.2f ", numero,salario);
		
		sc.close();
	}

}
